package s_gestion_pacientes.sop_corba;

/**
* s_gestion_pacientes/sop_corba/GestionPersonalHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gpersonal.idl
* martes 8 de marzo de 2022 01:32:41 AM COT
*/

public final class GestionPersonalHolder implements org.omg.CORBA.portable.Streamable
{
  public s_gestion_pacientes.sop_corba.GestionPersonal value = null;

  public GestionPersonalHolder ()
  {
  }

  public GestionPersonalHolder (s_gestion_pacientes.sop_corba.GestionPersonal initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = s_gestion_pacientes.sop_corba.GestionPersonalHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    s_gestion_pacientes.sop_corba.GestionPersonalHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return s_gestion_pacientes.sop_corba.GestionPersonalHelper.type ();
  }

}
