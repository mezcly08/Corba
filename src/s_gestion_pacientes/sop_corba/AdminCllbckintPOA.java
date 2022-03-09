package s_gestion_pacientes.sop_corba;


/**
* s_gestion_pacientes/sop_corba/AdminCllbckintPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gpersonal.idl
* mi�rcoles 9 de marzo de 2022 04:10:45 PM COT
*/

public abstract class AdminCllbckintPOA extends org.omg.PortableServer.Servant
 implements s_gestion_pacientes.sop_corba.AdminCllbckintOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("notificar", new java.lang.Integer (0));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // sop_corba/AdminCllbckint/notificar
       {
         String nombreCompleto = in.read_string ();
         int id = in.read_long ();
         this.notificar (nombreCompleto, id);
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:sop_corba/AdminCllbckint:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public AdminCllbckint _this() 
  {
    return AdminCllbckintHelper.narrow(
    super._this_object());
  }

  public AdminCllbckint _this(org.omg.CORBA.ORB orb) 
  {
    return AdminCllbckintHelper.narrow(
    super._this_object(orb));
  }


} // class AdminCllbckintPOA
