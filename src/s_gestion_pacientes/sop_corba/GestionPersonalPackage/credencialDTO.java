package s_gestion_pacientes.sop_corba.GestionPersonalPackage;


/**
* s_gestion_pacientes/sop_corba/GestionPersonalPackage/credencialDTO.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gpersonal.idl
* mi?rcoles 9 de marzo de 2022 11:38:15 PM COT
*/

public final class credencialDTO implements org.omg.CORBA.portable.IDLEntity
{
  public String usuario = null;
  public String clave = null;
  public int id = (int)0;

  public credencialDTO ()
  {
  } // ctor

  public credencialDTO (String _usuario, String _clave, int _id)
  {
    usuario = _usuario;
    clave = _clave;
    id = _id;
  } // ctor

} // class credencialDTO
