package s_gestion_pacientes.sop_corba.GestionPersonalPackage;


/**
* s_gestion_pacientes/sop_corba/GestionPersonalPackage/DatosSesionDTOHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gpersonal.idl
* martes 8 de marzo de 2022 01:45:56 PM COT
*/

abstract public class DatosSesionDTOHelper
{
  private static String  _id = "IDL:sop_corba/GestionPersonal/DatosSesionDTO:1.0";

  public static void insert (org.omg.CORBA.Any a, s_gestion_pacientes.sop_corba.GestionPersonalPackage.DatosSesionDTO that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static s_gestion_pacientes.sop_corba.GestionPersonalPackage.DatosSesionDTO extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [3];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[0] = new org.omg.CORBA.StructMember (
            "idPacienteValorado",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[1] = new org.omg.CORBA.StructMember (
            "contValoracion",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "ocupacion",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (s_gestion_pacientes.sop_corba.GestionPersonalPackage.DatosSesionDTOHelper.id (), "DatosSesionDTO", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static s_gestion_pacientes.sop_corba.GestionPersonalPackage.DatosSesionDTO read (org.omg.CORBA.portable.InputStream istream)
  {
    s_gestion_pacientes.sop_corba.GestionPersonalPackage.DatosSesionDTO value = new s_gestion_pacientes.sop_corba.GestionPersonalPackage.DatosSesionDTO ();
    value.idPacienteValorado = istream.read_long ();
    value.contValoracion = istream.read_long ();
    value.ocupacion = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, s_gestion_pacientes.sop_corba.GestionPersonalPackage.DatosSesionDTO value)
  {
    ostream.write_long (value.idPacienteValorado);
    ostream.write_long (value.contValoracion);
    ostream.write_string (value.ocupacion);
  }

}
