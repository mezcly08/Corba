package s_gestion_pacientes.sop_corba;


/**
* s_gestion_pacientes/sop_corba/AdminCllbckintPOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gpersonal.idl
* martes 8 de marzo de 2022 12:07:26 PM COT
*/

public class AdminCllbckintPOATie extends AdminCllbckintPOA
{

  // Constructors

  public AdminCllbckintPOATie ( s_gestion_pacientes.sop_corba.AdminCllbckintOperations delegate ) {
      this._impl = delegate;
  }
  public AdminCllbckintPOATie ( s_gestion_pacientes.sop_corba.AdminCllbckintOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public s_gestion_pacientes.sop_corba.AdminCllbckintOperations _delegate() {
      return this._impl;
  }
  public void _delegate (s_gestion_pacientes.sop_corba.AdminCllbckintOperations delegate ) {
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
  public void notificar (String nombreCompleto, int id)
  {
    _impl.notificar(nombreCompleto, id);
  } // notificar

  private s_gestion_pacientes.sop_corba.AdminCllbckintOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class AdminCllbckintPOATie
