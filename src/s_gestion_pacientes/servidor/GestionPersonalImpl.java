package s_gestion_pacientes.servidor;

import cliente.AdminCllbckImpl;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import org.omg.CORBA.BooleanHolder;
import org.omg.CosNaming.NamingContextExt;

import s_gestion_pacientes.sop_corba.GestionPersonalPackage.credencialDTO;
import s_gestion_pacientes.sop_corba.GestionPersonalOperations;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.DatosSesionDTO;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.InfoSesionDTO;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.PacienteDTO;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.ValorarPacienteDTO;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.personalDTO;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.personalDTOHolder;
import s_gestion_pacientes.sop_corba.AdminCllbckint;

import s_seguimiento_pacientes.sop_corba.GestionNotificaciones;
import s_seguimiento_pacientes.sop_corba.GestionNotificacionesHelper;
import s_seguimiento_pacientes.sop_corba.GestionNotificacionesPackage.notificacionDTO;

public class GestionPersonalImpl implements GestionPersonalOperations {

    // Atributos
    private ArrayList<personalDTO> personal;
    private ArrayList<PacienteDTO> paciente;
    private ArrayList<ValorarPacienteDTO> valorarPaciente;
    private ArrayList<AdminCllbckint> lstAdminCallback;
    GestionNotificaciones objReferenciaRemota;
    private ArrayList<DatosSesionDTO> listaDatosSesion;
    private int contador = 0;    
    
    
    // Atributos del administrador
    String admNombre = "Administrador";
    String admtTipoID = "CC";
    int admID = 0;
    String admOcup = "Admin";
    String admUser = "Admin";
    String admPsw = "12345";
    personalDTO admin = new personalDTO(admtTipoID, admID, admNombre, admOcup, admUser, admUser, admNombre);

    public GestionPersonalImpl() {
        personal = new ArrayList<personalDTO>();
        objReferenciaRemota = null;
        personal.add(admin);
        this.lstAdminCallback = new ArrayList<AdminCllbckint>();
        this.paciente = new ArrayList<PacienteDTO>();
        this.valorarPaciente = new ArrayList<ValorarPacienteDTO>();
        this.listaDatosSesion = new ArrayList<DatosSesionDTO>();
    }

    @Override
    public boolean abrirSesion(credencialDTO objCredencial) {
        System.out.println("***En abrirSesion()...");
        boolean resultado = false;
        personalDTO varPersonal = null;
        for (int i = 0; i < personal.size(); i++) {
            if (objCredencial.usuario.equals(personal.get(i).usuario)
                    && objCredencial.clave.equals(personal.get(i).clave)
                    && objCredencial.id == personal.get(i).id) {
                resultado = true;
                varPersonal = personal.get(i);
                break;
            }
        }
        if (varPersonal != null) {
            String nombreCompleto = varPersonal.nombreCompleto;
            String ocupacion = varPersonal.ocupacion;
            switch (ocupacion) {
                case "Admin":
                    System.out.println("Admin ingreso al Sistema");
                    break;
                case "Recepcionista":
                    System.out.println("La Recepcionista " + nombreCompleto + " ingreso al Sistema");
                    break;
                case "Fisioterapeuta":
                    System.out.println("El Fisioterapeuta " + nombreCompleto + " ingreso al Sistema");
                    System.out.println("Enviando notificacion()...");
                    notificacionDTO varNotificacion = new notificacionDTO();
                    varNotificacion.nombreCompleto = nombreCompleto;
                    varNotificacion.ocupacion = ocupacion;
                    objReferenciaRemota.enviarNotificacion(varNotificacion);
                    break;
                case "Medico":
                    System.out.println("El Medico " + nombreCompleto + " ingreso al Sistema");
                    break;
                case "Psicologa":
                    System.out.println("El Psicologa " + nombreCompleto + " ingreso al Sistema");
                    break;
            }
        }
        return resultado;
    }

    @Override
    public void registrarPersonal(personalDTO objPersonal, BooleanHolder res) {
        System.out.println("*** En registrarPersonal()...");
        res.value = false;
        if (personal.size() < 6) {
            if (personal.add(objPersonal)) {
                res.value = true;
                System.out.println("El personal " + objPersonal.nombreCompleto + " y ocupación " + objPersonal.ocupacion
                        + " fue registrado con exito");
            }
        } else {
            System.out.println("Personal No registrado, se alcanzó la cantidad máxima de personas a registrar.");
        }
    }

    @Override
    public boolean consultarPersonal(int id, personalDTOHolder objPersonal) {
        System.out.println("*** En consultarPersonal()...");
        boolean resultado = false;
        try {
            objPersonal.value = null;
            if (!personal.isEmpty()) {
                for (int i = 0; i < personal.size(); i++) {
                    if (personal.get(i).id == id) {
                        objPersonal.value = personal.get(i);
                        resultado = true;
                        System.out.println("*** Se encontró al usuario con id " + personal.get(i).id);
                        break;
                    }
                }
            } else {
                System.out.println("No hay personal registrado en el sistema");
            }
        } catch (Exception e) {
            System.out.println("NO se pudo recuperar la consulta");
        }
        return resultado;
    }

    public int buscarCredencial(credencialDTO objCredencial) {
        int resultado = -1;

        for (int i = 0; i < this.personal.size(); i++) {
            if ((objCredencial.usuario.equals(personal.get(i).usuario)
                    && (objCredencial.clave).equals(personal.get(i).clave))) {
                resultado = i;
                break;
            }
        }
        return resultado;
    }

    public int buscarPacientes(int id) {
        int resultado = -1;
        for (int i = 0; i < this.paciente.size(); i++) {
            if (this.paciente.get(i).id == id) {
                resultado = i;
                break;
            }
        }
        return resultado;
    }

    public int buscarPersonal(int id) {
        int resultado = -1;
        for (int i = 0; i < this.personal.size(); i++) {
            if (this.personal.get(i).id == id) {
                resultado = i;
                break;
            }
        }
        return resultado;
    }

    public void consultarReferenciaRemota(NamingContextExt nce, String servicio) {
        // GestionNotificaciones ref;
        try {
            this.objReferenciaRemota = GestionNotificacionesHelper.narrow(nce.resolve_str(servicio));
            System.out.println("Obtenido el manejador sobre el servidor de objetos: " + objReferenciaRemota);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    @Override
    public void registrarCallback(AdminCllbckint objAdmin) {
        System.out.println("Invocando Registrar Callback");
        lstAdminCallback.add(objAdmin);
    }

    @Override
    public boolean valorarPaciente(ValorarPacienteDTO objValorarPaciente) {
        boolean bandera = false;
        bandera = objReferenciaRemota.guardarValoracionPaciente(objValorarPaciente);
        if (bandera == true) {
            System.out.println("Valoracion ingresada con exito");
            return true;
        } else {
            System.out.println("Error al ingresar la valoración");
            return false;
        }
    }

    @Override
    public ValorarPacienteDTO consultarValoracion(String id, String ocupacion) {
        return objReferenciaRemota.consultarValoracion(id, ocupacion);
    }

    @Override
    public void eliminarCallback(AdminCllbckint objAdmin) {
        System.out.println("Invocando Eliminar Callback");
        for (int i = 0; i < lstAdminCallback.size(); i++) {
            if (lstAdminCallback.get(i).getClass().toString().equals(objAdmin.getClass().toString())) {
                lstAdminCallback.remove(i);
            }
        }
    }

    @Override
    public boolean guardarInfoSesion(InfoSesionDTO objInfoSesionDTO) {
        boolean bandera = false;
        bandera = objReferenciaRemota.guardarInfoSesion(objInfoSesionDTO);
        if (bandera == true) {
            System.out.println("La Informacion de la sesion fue ingresada con exito");
            return true;
        } else {
            System.out.println("Error al ingresar la informacion de la sesion");
            return false;
        }
    }

    @Override
    public InfoSesionDTO consultarInfoSesion(int id) {
        return objReferenciaRemota.consultarInfoSesion(id);
    }

    @Override
    public void validarValoracion(int id, String ocupacion) {
        int med = 0, psi = 0, fisi = 0;
        DatosSesionDTO datosSesion;

        if (ocupacion.equals("Medico")) {
            med++;
            datosSesion = new DatosSesionDTO(id, med, ocupacion);

            listaDatosSesion.add(datosSesion);
        } else if (ocupacion.equals("Psicologa")) {
            psi++;
            datosSesion = new DatosSesionDTO(id, psi, ocupacion);

            listaDatosSesion.add(datosSesion);
        } else {
            fisi++;
            datosSesion = new DatosSesionDTO(id, fisi, ocupacion);

            listaDatosSesion.add(datosSesion);
        }
    }

    @Override
    public int contador(int id, String ocupacion) {
        if (listaDatosSesion.size() == 0) {
            return 0;
        }
        for (int i = 0; i < listaDatosSesion.size(); i++) {
            if (listaDatosSesion.get(i).ocupacion.equals(ocupacion)) {
                return listaDatosSesion.get(i).contValoracion;
            }
        }
        return 0;
    }

    @Override
    public boolean eliminarList(int id) {
        int cont = 0;
        for (int i = 0; i < listaDatosSesion.size(); i++) {
            if (listaDatosSesion.get(i).idPacienteValorado == id) {
                listaDatosSesion.remove(i);
            }
            cont++;
        }
        if (cont == 0) {
            return false;
        }
        return true;
    }

    @Override
    public PacienteDTO consultarPaciente(int id) {
        PacienteDTO resultado = null;
        System.out.println("Entrando a consultar paciente...");
        int bandera = buscarPacientes(id);
        if (bandera != -1) {
            resultado = paciente.get(bandera);
        }
        return resultado;
    }

    @Override
    public boolean registrarPaciente(PacienteDTO objPacientes) {
        System.out.println("Entrando a registrar Paciente...");
        boolean bandera = false;

        bandera = paciente.add(objPacientes);

        System.out.println("Paciente Registrado... ");
        /* for (AdminCllbckInt objUsuario : lstAdminCallback) {
            objUsuario.informarIngreso(objPacientes.getNombreCompleto(), objPacientes.getId());
        }*/
        return bandera;
    }

    @Override
    public boolean consulPersonal(int id) {
        boolean resultado = false;
        for (int i = 0; i < this.personal.size(); i++) {
            if (this.personal.get(i).id == id) {
                resultado = true;
                break;
            }
        }
        return resultado;
    }

    @Override
    public boolean existenPacientes(int id) {
        boolean resultado = false;
        for (int i = 0; i < this.paciente.size(); i++) {
            if (this.paciente.get(i).id == id) {
                resultado = true;
                break;
            }
        }
        return resultado;
    }

    @Override
    public boolean existevaloracion(int id, String ocupacion) {
        boolean objPaciente = false;
        objPaciente = objReferenciaRemota.existevaloracion(id, ocupacion);
        if(objPaciente){
            return true;
        }
        return false;
    }

}
