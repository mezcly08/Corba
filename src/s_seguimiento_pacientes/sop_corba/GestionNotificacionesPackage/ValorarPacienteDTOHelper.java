package s_seguimiento_pacientes.sop_corba.GestionNotificacionesPackage;


/**
* s_seguimiento_pacientes/sop_corba/GestionNotificacionesPackage/ValorarPacienteDTOHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gnotificaciones.idl
* martes 8 de marzo de 2022 05:44:45 PM COT
*/

abstract public class ValorarPacienteDTOHelper
{
  private static String  _id = "IDL:sop_corba/GestionNotificaciones/ValorarPacienteDTO:1.0";

  public static void insert (org.omg.CORBA.Any a, s_seguimiento_pacientes.sop_corba.GestionNotificacionesPackage.ValorarPacienteDTO that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static s_seguimiento_pacientes.sop_corba.GestionNotificacionesPackage.ValorarPacienteDTO extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [6];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "idPaciente",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "concepto",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "obversaciones",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "fechaValoracion",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[4] = new org.omg.CORBA.StructMember (
            "Profesion",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[5] = new org.omg.CORBA.StructMember (
            "NombreProfesional",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (s_seguimiento_pacientes.sop_corba.GestionNotificacionesPackage.ValorarPacienteDTOHelper.id (), "ValorarPacienteDTO", _members0);
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

  public static s_seguimiento_pacientes.sop_corba.GestionNotificacionesPackage.ValorarPacienteDTO read (org.omg.CORBA.portable.InputStream istream)
  {
    s_seguimiento_pacientes.sop_corba.GestionNotificacionesPackage.ValorarPacienteDTO value = new s_seguimiento_pacientes.sop_corba.GestionNotificacionesPackage.ValorarPacienteDTO ();
    value.idPaciente = istream.read_string ();
    value.concepto = istream.read_string ();
    value.obversaciones = istream.read_string ();
    value.fechaValoracion = istream.read_string ();
    value.Profesion = istream.read_string ();
    value.NombreProfesional = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, s_seguimiento_pacientes.sop_corba.GestionNotificacionesPackage.ValorarPacienteDTO value)
  {
    ostream.write_string (value.idPaciente);
    ostream.write_string (value.concepto);
    ostream.write_string (value.obversaciones);
    ostream.write_string (value.fechaValoracion);
    ostream.write_string (value.Profesion);
    ostream.write_string (value.NombreProfesional);
  }

}
