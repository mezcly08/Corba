package s_gestion_pacientes.sop_corba.GestionPersonalPackage;


/**
* s_gestion_pacientes/sop_corba/GestionPersonalPackage/InfoSesionDTOHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gpersonal.idl
* mi�rcoles 9 de marzo de 2022 03:00:58 PM COT
*/

abstract public class InfoSesionDTOHelper
{
  private static String  _id = "IDL:sop_corba/GestionPersonal/InfoSesionDTO:1.0";

  public static void insert (org.omg.CORBA.Any a, s_gestion_pacientes.sop_corba.GestionPersonalPackage.InfoSesionDTO that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static s_gestion_pacientes.sop_corba.GestionPersonalPackage.InfoSesionDTO extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [10];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[0] = new org.omg.CORBA.StructMember (
            "idPaciente",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[1] = new org.omg.CORBA.StructMember (
            "numFase",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "fechaSesion",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[3] = new org.omg.CORBA.StructMember (
            "numSesion",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[4] = new org.omg.CORBA.StructMember (
            "presionArterial",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[5] = new org.omg.CORBA.StructMember (
            "frecuenciaInicial",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[6] = new org.omg.CORBA.StructMember (
            "frecuenciaFinal",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[7] = new org.omg.CORBA.StructMember (
            "saturacionOxigeno",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[8] = new org.omg.CORBA.StructMember (
            "estadoPaciente",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[9] = new org.omg.CORBA.StructMember (
            "observaciones",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (s_gestion_pacientes.sop_corba.GestionPersonalPackage.InfoSesionDTOHelper.id (), "InfoSesionDTO", _members0);
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

  public static s_gestion_pacientes.sop_corba.GestionPersonalPackage.InfoSesionDTO read (org.omg.CORBA.portable.InputStream istream)
  {
    s_gestion_pacientes.sop_corba.GestionPersonalPackage.InfoSesionDTO value = new s_gestion_pacientes.sop_corba.GestionPersonalPackage.InfoSesionDTO ();
    value.idPaciente = istream.read_long ();
    value.numFase = istream.read_long ();
    value.fechaSesion = istream.read_string ();
    value.numSesion = istream.read_long ();
    value.presionArterial = istream.read_long ();
    value.frecuenciaInicial = istream.read_long ();
    value.frecuenciaFinal = istream.read_long ();
    value.saturacionOxigeno = istream.read_long ();
    value.estadoPaciente = istream.read_string ();
    value.observaciones = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, s_gestion_pacientes.sop_corba.GestionPersonalPackage.InfoSesionDTO value)
  {
    ostream.write_long (value.idPaciente);
    ostream.write_long (value.numFase);
    ostream.write_string (value.fechaSesion);
    ostream.write_long (value.numSesion);
    ostream.write_long (value.presionArterial);
    ostream.write_long (value.frecuenciaInicial);
    ostream.write_long (value.frecuenciaFinal);
    ostream.write_long (value.saturacionOxigeno);
    ostream.write_string (value.estadoPaciente);
    ostream.write_string (value.observaciones);
  }

}
