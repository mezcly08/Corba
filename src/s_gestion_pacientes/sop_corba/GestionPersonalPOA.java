package s_gestion_pacientes.sop_corba;


/**
* s_gestion_pacientes/sop_corba/GestionPersonalPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gpersonal.idl
* martes 8 de marzo de 2022 01:45:56 PM COT
*/

public abstract class GestionPersonalPOA extends org.omg.PortableServer.Servant
 implements s_gestion_pacientes.sop_corba.GestionPersonalOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("registrarPersonal", new java.lang.Integer (0));
    _methods.put ("consultarPersonal", new java.lang.Integer (1));
    _methods.put ("consulPersonal", new java.lang.Integer (2));
    _methods.put ("consultarPaciente", new java.lang.Integer (3));
    _methods.put ("registrarPaciente", new java.lang.Integer (4));
    _methods.put ("abrirSesion", new java.lang.Integer (5));
    _methods.put ("registrarCallback", new java.lang.Integer (6));
    _methods.put ("valorarPaciente", new java.lang.Integer (7));
    _methods.put ("consultarValoracion", new java.lang.Integer (8));
    _methods.put ("existenPacientes", new java.lang.Integer (9));
    _methods.put ("eliminarCallback", new java.lang.Integer (10));
    _methods.put ("guardarInfoSesion", new java.lang.Integer (11));
    _methods.put ("consultarInfoSesion", new java.lang.Integer (12));
    _methods.put ("validarValoracion", new java.lang.Integer (13));
    _methods.put ("contador", new java.lang.Integer (14));
    _methods.put ("eliminarList", new java.lang.Integer (15));
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
       case 0:  // sop_corba/GestionPersonal/registrarPersonal
       {
         s_gestion_pacientes.sop_corba.GestionPersonalPackage.personalDTO objPersonal = s_gestion_pacientes.sop_corba.GestionPersonalPackage.personalDTOHelper.read (in);
         org.omg.CORBA.BooleanHolder res = new org.omg.CORBA.BooleanHolder ();
         this.registrarPersonal (objPersonal, res);
         out = $rh.createReply();
         out.write_boolean (res.value);
         break;
       }

       case 1:  // sop_corba/GestionPersonal/consultarPersonal
       {
         int id = in.read_long ();
         s_gestion_pacientes.sop_corba.GestionPersonalPackage.personalDTOHolder objPersonal = new s_gestion_pacientes.sop_corba.GestionPersonalPackage.personalDTOHolder ();
         boolean $result = false;
         $result = this.consultarPersonal (id, objPersonal);
         out = $rh.createReply();
         out.write_boolean ($result);
         s_gestion_pacientes.sop_corba.GestionPersonalPackage.personalDTOHelper.write (out, objPersonal.value);
         break;
       }

       case 2:  // sop_corba/GestionPersonal/consulPersonal
       {
         int id = in.read_long ();
         boolean $result = false;
         $result = this.consulPersonal (id);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // sop_corba/GestionPersonal/consultarPaciente
       {
         int id = in.read_long ();
         s_gestion_pacientes.sop_corba.GestionPersonalPackage.PacienteDTO $result = null;
         $result = this.consultarPaciente (id);
         out = $rh.createReply();
         s_gestion_pacientes.sop_corba.GestionPersonalPackage.PacienteDTOHelper.write (out, $result);
         break;
       }

       case 4:  // sop_corba/GestionPersonal/registrarPaciente
       {
         s_gestion_pacientes.sop_corba.GestionPersonalPackage.PacienteDTO objPacientes = s_gestion_pacientes.sop_corba.GestionPersonalPackage.PacienteDTOHelper.read (in);
         boolean $result = false;
         $result = this.registrarPaciente (objPacientes);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 5:  // sop_corba/GestionPersonal/abrirSesion
       {
         s_gestion_pacientes.sop_corba.GestionPersonalPackage.credencialDTO objCredencial = s_gestion_pacientes.sop_corba.GestionPersonalPackage.credencialDTOHelper.read (in);
         boolean $result = false;
         $result = this.abrirSesion (objCredencial);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 6:  // sop_corba/GestionPersonal/registrarCallback
       {
         s_gestion_pacientes.sop_corba.AdminCllbckint objCllbck = s_gestion_pacientes.sop_corba.AdminCllbckintHelper.read (in);
         this.registrarCallback (objCllbck);
         out = $rh.createReply();
         break;
       }

       case 7:  // sop_corba/GestionPersonal/valorarPaciente
       {
         s_gestion_pacientes.sop_corba.GestionPersonalPackage.ValorarPacienteDTO objValorarPaciente = s_gestion_pacientes.sop_corba.GestionPersonalPackage.ValorarPacienteDTOHelper.read (in);
         boolean $result = false;
         $result = this.valorarPaciente (objValorarPaciente);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 8:  // sop_corba/GestionPersonal/consultarValoracion
       {
         String id = in.read_string ();
         String ocupacion = in.read_string ();
         s_gestion_pacientes.sop_corba.GestionPersonalPackage.ValorarPacienteDTO $result = null;
         $result = this.consultarValoracion (id, ocupacion);
         out = $rh.createReply();
         s_gestion_pacientes.sop_corba.GestionPersonalPackage.ValorarPacienteDTOHelper.write (out, $result);
         break;
       }

       case 9:  // sop_corba/GestionPersonal/existenPacientes
       {
         int id = in.read_long ();
         boolean $result = false;
         $result = this.existenPacientes (id);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 10:  // sop_corba/GestionPersonal/eliminarCallback
       {
         s_gestion_pacientes.sop_corba.AdminCllbckint objAdmin = s_gestion_pacientes.sop_corba.AdminCllbckintHelper.read (in);
         this.eliminarCallback (objAdmin);
         out = $rh.createReply();
         break;
       }

       case 11:  // sop_corba/GestionPersonal/guardarInfoSesion
       {
         s_gestion_pacientes.sop_corba.GestionPersonalPackage.InfoSesionDTO objInfoSesionDTO = s_gestion_pacientes.sop_corba.GestionPersonalPackage.InfoSesionDTOHelper.read (in);
         boolean $result = false;
         $result = this.guardarInfoSesion (objInfoSesionDTO);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 12:  // sop_corba/GestionPersonal/consultarInfoSesion
       {
         int id = in.read_long ();
         s_gestion_pacientes.sop_corba.GestionPersonalPackage.InfoSesionDTO $result = null;
         $result = this.consultarInfoSesion (id);
         out = $rh.createReply();
         s_gestion_pacientes.sop_corba.GestionPersonalPackage.InfoSesionDTOHelper.write (out, $result);
         break;
       }

       case 13:  // sop_corba/GestionPersonal/validarValoracion
       {
         int id = in.read_long ();
         String ocupacion = in.read_string ();
         this.validarValoracion (id, ocupacion);
         out = $rh.createReply();
         break;
       }

       case 14:  // sop_corba/GestionPersonal/contador
       {
         int id = in.read_long ();
         String ocupacion = in.read_string ();
         int $result = (int)0;
         $result = this.contador (id, ocupacion);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 15:  // sop_corba/GestionPersonal/eliminarList
       {
         int id = in.read_long ();
         boolean $result = false;
         $result = this.eliminarList (id);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:sop_corba/GestionPersonal:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public GestionPersonal _this() 
  {
    return GestionPersonalHelper.narrow(
    super._this_object());
  }

  public GestionPersonal _this(org.omg.CORBA.ORB orb) 
  {
    return GestionPersonalHelper.narrow(
    super._this_object(orb));
  }


} // class GestionPersonalPOA
