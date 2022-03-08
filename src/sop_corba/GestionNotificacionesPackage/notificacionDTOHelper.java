package sop_corba.GestionNotificacionesPackage;


/**
* sop_corba/GestionNotificacionesPackage/notificacionDTOHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gnotificaciones.idl
* lunes 7 de marzo de 2022 02:04:46 AM COT
*/

abstract public class notificacionDTOHelper
{
  private static String  _id = "IDL:sop_corba/GestionNotificaciones/notificacionDTO:1.0";

  public static void insert (org.omg.CORBA.Any a, sop_corba.GestionNotificacionesPackage.notificacionDTO that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static sop_corba.GestionNotificacionesPackage.notificacionDTO extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "nombreCompleto",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "ocupacion",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (sop_corba.GestionNotificacionesPackage.notificacionDTOHelper.id (), "notificacionDTO", _members0);
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

  public static sop_corba.GestionNotificacionesPackage.notificacionDTO read (org.omg.CORBA.portable.InputStream istream)
  {
    sop_corba.GestionNotificacionesPackage.notificacionDTO value = new sop_corba.GestionNotificacionesPackage.notificacionDTO ();
    value.nombreCompleto = istream.read_string ();
    value.ocupacion = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, sop_corba.GestionNotificacionesPackage.notificacionDTO value)
  {
    ostream.write_string (value.nombreCompleto);
    ostream.write_string (value.ocupacion);
  }

}
