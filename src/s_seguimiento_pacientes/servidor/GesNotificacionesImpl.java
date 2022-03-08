package s_seguimiento_pacientes.servidor;

import s_seguimiento_pacientes.sop_corba.GestionNotificacionesOperations;
import s_seguimiento_pacientes.sop_corba.GestionNotificacionesPackage.InfoSesionDTO;
import s_seguimiento_pacientes.sop_corba.GestionNotificacionesPackage.ValorarPacienteDTO;
import s_seguimiento_pacientes.sop_corba.GestionNotificacionesPackage.notificacionDTO;

public class GesNotificacionesImpl implements GestionNotificacionesOperations{

    @Override
    public void enviarNotificacion(notificacionDTO objNotificacion) {
        System.out.println("***En enviarNotificacion()...");
        System.out.println("El personal [" + objNotificacion.nombreCompleto + "] y ocupacion ["
        + objNotificacion.ocupacion + "] esta autorizado para ingresar al sistema.");    
    }


    @Override
    public InfoSesionDTO consultarInfoSesion(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public boolean guardarInfoSesion(s_gestion_pacientes.sop_corba.GestionPersonalPackage.InfoSesionDTO objInfoSesion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean guardarValoracionPaciente(s_gestion_pacientes.sop_corba.GestionPersonalPackage.ValorarPacienteDTO objValorarPaciente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
