package s_seguimiento_pacientes.servidor;

import s_seguimiento_pacientes.sop_corba.GestionNotificacionesOperations;
import s_seguimiento_pacientes.sop_corba.GestionNotificacionesPackage.notificacionDTO;

public class GesNotificacionesImpl implements GestionNotificacionesOperations{

    @Override
    public void enviarNotificacion(notificacionDTO objNotificacion) {
        System.out.println("***En enviarNotificacion()...");
        System.out.println("El personal [" + objNotificacion.nombreCompleto + "] y ocupacion ["
        + objNotificacion.ocupacion + "] esta autorizado para ingresar al sistema.");    
    }
    
}
