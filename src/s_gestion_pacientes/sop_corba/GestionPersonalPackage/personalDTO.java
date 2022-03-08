package s_gestion_pacientes.sop_corba.GestionPersonalPackage;

public final class personalDTO implements org.omg.CORBA.portable.IDLEntity
{
  public String tipo_id = null;
  public int id = (int)0;
  public String nombreCompleto = null;
  public String ocupacion = null;
  public String usuario = null;
  public String clave = null;

  public personalDTO ()
  {
  } // ctor

  public personalDTO (String _tipo_id, int _id, String _nombreCompleto, String _ocupacion, String _usuario, String _clave)
  {
    tipo_id = _tipo_id;
    id = _id;
    nombreCompleto = _nombreCompleto;
    ocupacion = _ocupacion;
    usuario = _usuario;
    clave = _clave;
  } // ctor

} // class personalDTO
