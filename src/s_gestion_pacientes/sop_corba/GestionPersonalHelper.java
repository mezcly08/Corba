package s_gestion_pacientes.sop_corba;


/**
* s_gestion_pacientes/sop_corba/GestionPersonalHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gpersonal.idl
* mi�rcoles 9 de marzo de 2022 11:38:15 PM COT
*/

abstract public class GestionPersonalHelper
{
  private static String  _id = "IDL:sop_corba/GestionPersonal:1.0";

  public static void insert (org.omg.CORBA.Any a, s_gestion_pacientes.sop_corba.GestionPersonal that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static s_gestion_pacientes.sop_corba.GestionPersonal extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (s_gestion_pacientes.sop_corba.GestionPersonalHelper.id (), "GestionPersonal");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static s_gestion_pacientes.sop_corba.GestionPersonal read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_GestionPersonalStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, s_gestion_pacientes.sop_corba.GestionPersonal value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static s_gestion_pacientes.sop_corba.GestionPersonal narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof s_gestion_pacientes.sop_corba.GestionPersonal)
      return (s_gestion_pacientes.sop_corba.GestionPersonal)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      s_gestion_pacientes.sop_corba._GestionPersonalStub stub = new s_gestion_pacientes.sop_corba._GestionPersonalStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static s_gestion_pacientes.sop_corba.GestionPersonal unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof s_gestion_pacientes.sop_corba.GestionPersonal)
      return (s_gestion_pacientes.sop_corba.GestionPersonal)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      s_gestion_pacientes.sop_corba._GestionPersonalStub stub = new s_gestion_pacientes.sop_corba._GestionPersonalStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
