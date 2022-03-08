package s_gestion_pacientes.servidor;

import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import org.omg.CORBA.BooleanHolder;
import org.omg.CosNaming.NamingContextExt;
import s_gestion_pacientes.sop_corba.AdminCllbckint;

import s_gestion_pacientes.sop_corba.GestionPersonalPackage.credencialDTO;
import s_gestion_pacientes.sop_corba.GestionPersonalOperations;
import s_gestion_pacientes.sop_corba.GestionPersonalPOA;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.InfoSesionDTO;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.ValorarPacienteDTO;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.personalDTO;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.personalDTOHolder;
import s_seguimiento_pacientes.sop_corba.GestionNotificaciones;
import s_seguimiento_pacientes.sop_corba.GestionNotificacionesHelper;
import s_seguimiento_pacientes.sop_corba.GestionNotificacionesPackage.notificacionDTO;

public class GestionPersonalImpl implements GestionPersonalOperations {
    // Atributos
    private ArrayList<personalDTO> lstPersonal;
    GestionNotificaciones ref;
    // Atributos del administrador
    String admNombre = "Administrador";
    String admtTipoID = "CC";
    int admID = 0;
    String admOcup = "Admin";
    String admUser = "Admin";
    String admPsw = "12345";
    personalDTO admin = new personalDTO(admtTipoID, admID, admNombre, admOcup, admUser, admUser, admNombre);

    public GestionPersonalImpl() {
        lstPersonal = new ArrayList<personalDTO>();
        ref = null;
        lstPersonal.add(admin);
    }

    @Override
    public boolean abrirSesion(credencialDTO objCredencial) {
        System.out.println("***En abrirSesion()...");
        boolean resultado = false;
        personalDTO varPersonal = null;
        for (int i = 0; i < lstPersonal.size(); i++) {
            if (objCredencial.usuario.equals(lstPersonal.get(i).usuario) &&
                    objCredencial.clave.equals(lstPersonal.get(i).clave) &&
                    objCredencial.id == lstPersonal.get(i).id) {
                resultado = true;
                varPersonal = lstPersonal.get(i);
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
                    ref.enviarNotificacion(varNotificacion);
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
        if (lstPersonal.size() < 3) {
            if (lstPersonal.add(objPersonal)) {
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
            if (!lstPersonal.isEmpty()) {
                for (int i = 0; i < lstPersonal.size(); i++) {
                    if (lstPersonal.get(i).id == id) {
                        objPersonal.value = lstPersonal.get(i);
                        resultado = true;
                        System.out.println("*** Se encontró al usuario con id " + lstPersonal.get(i).id);
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

    public void consultarReferenciaRemota(NamingContextExt nce, String servicio) {
        // GestionNotificaciones ref;
        try {
            this.ref = GestionNotificacionesHelper.narrow(nce.resolve_str(servicio));
            System.out.println("Obtenido el manejador sobre el servidor de objetos: " + ref);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    @Override
    public void registrarCallback(AdminCllbckint objCllbck) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean valorarPaciente(ValorarPacienteDTO objValorarPaciente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ValorarPacienteDTO consultarValoracion(String id, String ocupacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean existenPacientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarCallback(AdminCllbckint objAdmin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean guardarInfoSesion(InfoSesionDTO objInfoSesionDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public InfoSesionDTO consultarInfoSesion(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void validarValoracion(int id, String ocupacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int contador(int id, String ocupacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarList(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
