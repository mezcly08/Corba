package s_gestion_pacientes.sop_corba;

/**
* s_gestion_pacientes/sop_corba/AdminCllbckintHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gpersonal.idl
* mi?rcoles 9 de marzo de 2022 11:38:15 PM COT
*/

public final class AdminCllbckintHolder implements org.omg.CORBA.portable.Streamable
{
  public s_gestion_pacientes.sop_corba.AdminCllbckint value = null;

  public AdminCllbckintHolder ()
  {
  }

  public AdminCllbckintHolder (s_gestion_pacientes.sop_corba.AdminCllbckint initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = s_gestion_pacientes.sop_corba.AdminCllbckintHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    s_gestion_pacientes.sop_corba.AdminCllbckintHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return s_gestion_pacientes.sop_corba.AdminCllbckintHelper.type ();
  }

}
