package s_seguimiento_pacientes.sop_corba;


/**
* s_seguimiento_pacientes/sop_corba/GestionNotificacionesPOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gnotificaciones.idl
* jueves 17 de febrero de 2022 11:50:43 AM COT
*/

public class GestionNotificacionesPOATie extends GestionNotificacionesPOA
{

  // Constructors

  public GestionNotificacionesPOATie ( s_seguimiento_pacientes.sop_corba.GestionNotificacionesOperations delegate ) {
      this._impl = delegate;
  }
  public GestionNotificacionesPOATie ( s_seguimiento_pacientes.sop_corba.GestionNotificacionesOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public s_seguimiento_pacientes.sop_corba.GestionNotificacionesOperations _delegate() {
      return this._impl;
  }
  public void _delegate (s_seguimiento_pacientes.sop_corba.GestionNotificacionesOperations delegate ) {
      this._impl = delegate;
  }
  public org.omg.PortableServer.POA _default_POA() {
      if(_poa != null) {
          return _poa;
      }
      else {
          return super._default_POA();
      }
  }
  public void enviarNotificacion (s_seguimiento_pacientes.sop_corba.GestionNotificacionesPackage.notificacionDTO objNotificacion)
  {
    _impl.enviarNotificacion(objNotificacion);
  } // enviarNotificacion

  private s_seguimiento_pacientes.sop_corba.GestionNotificacionesOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class GestionNotificacionesPOATie
