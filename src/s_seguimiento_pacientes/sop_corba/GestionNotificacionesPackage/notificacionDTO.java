package s_seguimiento_pacientes.sop_corba.GestionNotificacionesPackage;


/**
* s_seguimiento_pacientes/sop_corba/GestionNotificacionesPackage/notificacionDTO.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gnotificaciones.idl
* martes 8 de marzo de 2022 05:44:45 PM COT
*/

public final class notificacionDTO implements org.omg.CORBA.portable.IDLEntity
{
  public String nombreCompleto = null;
  public String ocupacion = null;

  public notificacionDTO ()
  {
  } // ctor

  public notificacionDTO (String _nombreCompleto, String _ocupacion)
  {
    nombreCompleto = _nombreCompleto;
    ocupacion = _ocupacion;
  } // ctor

} // class notificacionDTO
