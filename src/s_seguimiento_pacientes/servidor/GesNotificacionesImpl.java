package s_seguimiento_pacientes.servidor;

import java.util.ArrayList;
import s_seguimiento_pacientes.modelo.Archivo;
import s_seguimiento_pacientes.sop_corba.GestionNotificacionesOperations;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.InfoSesionDTO;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.ValorarPacienteDTO;
import s_seguimiento_pacientes.sop_corba.GestionNotificacionesPackage.notificacionDTO;

public class GesNotificacionesImpl implements GestionNotificacionesOperations {

    private Archivo objArchivo;
    ArrayList<ValorarPacienteDTO> lstValoraciones;
    ArrayList<InfoSesionDTO> lstSesiones;
    ArrayList<ValorarPacienteDTO> lstValoracionesAux;
    ArrayList<String> lineas;

    public GesNotificacionesImpl() {
        super();
        lstValoraciones = new ArrayList<ValorarPacienteDTO>();
        lstSesiones = new ArrayList<InfoSesionDTO>();
    }

    @Override
    public void enviarNotificacion(notificacionDTO objNotificacion) {
        System.out.println("***En enviarNotificacion()...");
        System.out.println("El personal [" + objNotificacion.nombreCompleto + "] y ocupacion ["
                + objNotificacion.ocupacion + "] esta autorizado para ingresar al sistema.");
    }

    @Override
    public boolean guardarInfoSesion(s_gestion_pacientes.sop_corba.GestionPersonalPackage.InfoSesionDTO objInfoSesion) {
        objArchivo = new Archivo("listadoSesionesPaciente_" + objInfoSesion.idPaciente + ".txt");
        boolean bandera = false;
        String cadena = objInfoSesion.idPaciente + "," + objInfoSesion.numFase + ","  + objInfoSesion.fechaSesion
                + "," + objInfoSesion.numSesion + "," + objInfoSesion.presionArterial + "," + objInfoSesion.frecuenciaInicial
                + "," + objInfoSesion.frecuenciaFinal + "," + objInfoSesion.saturacionOxigeno + "," + objInfoSesion.estadoPaciente
                + "," + objInfoSesion.observaciones;
        bandera = objArchivo.escribirLinea(cadena);

        if (bandera == true) {
            System.out.println("La informacion de la sesión del paciente " + objInfoSesion.idPaciente + " fue ingresada");
            return true;
        } else {
            System.out.println("Error al ingresar la informacion de la sesión del paciente " + objInfoSesion.idPaciente);
            return false;
        }
    }

    @Override
    public boolean guardarValoracionPaciente(s_gestion_pacientes.sop_corba.GestionPersonalPackage.ValorarPacienteDTO objValorarPaciente) {
        objArchivo = new Archivo("historialPacientes.txt");
        boolean bandera = false;
        String cadena = objValorarPaciente.idPaciente + "," + objValorarPaciente.concepto + ","
                + objValorarPaciente.obversaciones + "," + objValorarPaciente.fechaValoracion + "," + objValorarPaciente.Profesion + "," + objValorarPaciente.NombreProfesional + "," + objValorarPaciente.estado;
        bandera = objArchivo.escribirLinea(cadena);

        if (bandera == true) {
            System.out.println("La valoracion fue ingresada");
            return true;
        } else {
            System.out.println("Error al ingresar la valoracion");
            return false;
        }
    }

    private ArrayList<ValorarPacienteDTO> armarOBJ(ArrayList<String> lstCadenas) {
        ValorarPacienteDTO objValorarPaciente;
        String[] cadena = null;
        for (int i = 0; i < lstCadenas.size(); i++) {
            cadena = lstCadenas.get(i).split(",");
            objValorarPaciente = new ValorarPacienteDTO(cadena[0], cadena[1], cadena[2], cadena[3],
                    cadena[4], cadena[5], cadena[6]);
            lstValoraciones.add(objValorarPaciente);
        }
        return lstValoraciones;
    }

    private ArrayList<InfoSesionDTO> armarOBJSesiones(ArrayList<String> lstCadenas) {
        InfoSesionDTO objInfoSesion;
        String[] cadena = null;
        for (int i = 0; i < lstCadenas.size(); i++) {
            cadena = lstCadenas.get(i).split(",");
            objInfoSesion = new InfoSesionDTO(Integer.parseInt(cadena[0]), Integer.parseInt(cadena[1]), cadena[2],
                    Integer.parseInt(cadena[3]), Integer.parseInt(cadena[4]), Integer.parseInt(cadena[5]),
                    Integer.parseInt(cadena[6]), Integer.parseInt(cadena[7]), cadena[8], cadena[9]);
            lstSesiones.add(objInfoSesion);
        }
        return lstSesiones;
    }

    @Override
    public InfoSesionDTO consultarInfoSesion(int id) {
        new Archivo("listadoSesionesPaciente_" + id + ".txt");
        ArrayList<InfoSesionDTO> lstInfoSesion = new ArrayList<InfoSesionDTO>();
        ArrayList<String> lineas = new ArrayList<String>();
        try {
            lineas = objArchivo.leerLineasArchivo();

            lstInfoSesion = armarOBJSesiones(lineas);
            int valor = -1;
            for (int i = 0; i < lstInfoSesion.size(); i++) {
                if ((lstInfoSesion.get(i).idPaciente == id)) {
                    valor = i;
                }
            }
            if (valor != -1) {
                return lstInfoSesion.get(valor);
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public ValorarPacienteDTO consultarValoracion(String id, String ocupacion) {
        armartodo();
        int valor = -1;
        for (int i = 0; i < lstValoracionesAux.size(); i++) {
            if ((lstValoracionesAux.get(i).idPaciente).equals(id) && lstValoracionesAux.get(i).Profesion.equals(ocupacion)) {
                valor = i;
            }
        }
        if (valor != -1) {
            return lstValoracionesAux.get(valor);
        } else {
            return null;
        }
    }

    public void armartodo() {
        new Archivo("historialPacientes.txt");
        lstValoracionesAux = new ArrayList<ValorarPacienteDTO>();
        lineas = new ArrayList<String>();
        lineas = objArchivo.leerLineasArchivo();
        lstValoracionesAux = armarOBJ(lineas);
    }

    @Override
    public boolean existevaloracion(int id, String ocupacion) {
        return false;
    }

}
