package s_gestion_pacientes.sop_corba.GestionPersonalPackage;

/**
* s_gestion_pacientes/sop_corba/GestionPersonalPackage/personalDTOHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gpersonal.idl
* martes 8 de marzo de 2022 08:30:58 AM COT
*/

public final class personalDTOHolder implements org.omg.CORBA.portable.Streamable
{
  public s_gestion_pacientes.sop_corba.GestionPersonalPackage.personalDTO value = null;

  public personalDTOHolder ()
  {
  }

  public personalDTOHolder (s_gestion_pacientes.sop_corba.GestionPersonalPackage.personalDTO initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = s_gestion_pacientes.sop_corba.GestionPersonalPackage.personalDTOHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    s_gestion_pacientes.sop_corba.GestionPersonalPackage.personalDTOHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return s_gestion_pacientes.sop_corba.GestionPersonalPackage.personalDTOHelper.type ();
  }

}
