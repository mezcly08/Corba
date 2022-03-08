package s_gestion_pacientes.sop_corba;

public class _GestionPersonalStub extends org.omg.CORBA.portable.ObjectImpl implements s_gestion_pacientes.sop_corba.GestionPersonal
{

  public void registrarPersonal (s_gestion_pacientes.sop_corba.GestionPersonalPackage.personalDTO objPersonal, org.omg.CORBA.BooleanHolder res)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("registrarPersonal", true);
                s_gestion_pacientes.sop_corba.GestionPersonalPackage.personalDTOHelper.write ($out, objPersonal);
                $in = _invoke ($out);
                res.value = $in.read_boolean ();
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                registrarPersonal (objPersonal, res        );
            } finally {
                _releaseReply ($in);
            }
  } // registrarPersonal

  public boolean consultarPersonal (int id, s_gestion_pacientes.sop_corba.GestionPersonalPackage.personalDTOHolder objPersonal)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("consultarPersonal", true);
                $out.write_long (id);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                objPersonal.value = s_gestion_pacientes.sop_corba.GestionPersonalPackage.personalDTOHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return consultarPersonal (id, objPersonal        );
            } finally {
                _releaseReply ($in);
            }
  } // consultarPersonal

  public boolean abrirSesion (s_gestion_pacientes.sop_corba.GestionPersonalPackage.credencialDTO objCredencial)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("abrirSesion", true);
                s_gestion_pacientes.sop_corba.GestionPersonalPackage.credencialDTOHelper.write ($out, objCredencial);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return abrirSesion (objCredencial        );
            } finally {
                _releaseReply ($in);
            }
  } // abrirSesion

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:sop_corba/GestionPersonal:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _GestionPersonalStub
