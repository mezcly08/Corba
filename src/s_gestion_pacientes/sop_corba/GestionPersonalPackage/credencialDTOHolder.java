package s_gestion_pacientes.sop_corba.GestionPersonalPackage;

/**
* s_gestion_pacientes/sop_corba/GestionPersonalPackage/credencialDTOHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gpersonal.idl
* mi�rcoles 9 de marzo de 2022 03:00:58 PM COT
*/

public final class credencialDTOHolder implements org.omg.CORBA.portable.Streamable
{
  public s_gestion_pacientes.sop_corba.GestionPersonalPackage.credencialDTO value = null;

  public credencialDTOHolder ()
  {
  }

  public credencialDTOHolder (s_gestion_pacientes.sop_corba.GestionPersonalPackage.credencialDTO initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = s_gestion_pacientes.sop_corba.GestionPersonalPackage.credencialDTOHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    s_gestion_pacientes.sop_corba.GestionPersonalPackage.credencialDTOHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return s_gestion_pacientes.sop_corba.GestionPersonalPackage.credencialDTOHelper.type ();
  }

}
