package s_gestion_pacientes.sop_corba.GestionPersonalPackage;


/**
* s_gestion_pacientes/sop_corba/GestionPersonalPackage/PacienteDTOHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gpersonal.idl
* mi�rcoles 9 de marzo de 2022 04:10:45 PM COT
*/

abstract public class PacienteDTOHelper
{
  private static String  _id = "IDL:sop_corba/GestionPersonal/PacienteDTO:1.0";

  public static void insert (org.omg.CORBA.Any a, s_gestion_pacientes.sop_corba.GestionPersonalPackage.PacienteDTO that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static s_gestion_pacientes.sop_corba.GestionPersonalPackage.PacienteDTO extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [5];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "nombreCompleto",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[1] = new org.omg.CORBA.StructMember (
            "id",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "fechaIngreso",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "ordenApoyo",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[4] = new org.omg.CORBA.StructMember (
            "hostoriaClinica",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (s_gestion_pacientes.sop_corba.GestionPersonalPackage.PacienteDTOHelper.id (), "PacienteDTO", _members0);
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

  public static s_gestion_pacientes.sop_corba.GestionPersonalPackage.PacienteDTO read (org.omg.CORBA.portable.InputStream istream)
  {
    s_gestion_pacientes.sop_corba.GestionPersonalPackage.PacienteDTO value = new s_gestion_pacientes.sop_corba.GestionPersonalPackage.PacienteDTO ();
    value.nombreCompleto = istream.read_string ();
    value.id = istream.read_long ();
    value.fechaIngreso = istream.read_string ();
    value.ordenApoyo = istream.read_string ();
    value.hostoriaClinica = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, s_gestion_pacientes.sop_corba.GestionPersonalPackage.PacienteDTO value)
  {
    ostream.write_string (value.nombreCompleto);
    ostream.write_long (value.id);
    ostream.write_string (value.fechaIngreso);
    ostream.write_string (value.ordenApoyo);
    ostream.write_string (value.hostoriaClinica);
  }

}
