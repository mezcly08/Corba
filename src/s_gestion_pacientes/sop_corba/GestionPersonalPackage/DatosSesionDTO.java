package s_gestion_pacientes.sop_corba.GestionPersonalPackage;


/**
* s_gestion_pacientes/sop_corba/GestionPersonalPackage/DatosSesionDTO.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gpersonal.idl
* martes 8 de marzo de 2022 12:07:26 PM COT
*/

public final class DatosSesionDTO implements org.omg.CORBA.portable.IDLEntity
{
  public int idPacienteValorado = (int)0;
  public int contValoracion = (int)0;
  public String ocupacion = null;

  public DatosSesionDTO ()
  {
  } // ctor

  public DatosSesionDTO (int _idPacienteValorado, int _contValoracion, String _ocupacion)
  {
    idPacienteValorado = _idPacienteValorado;
    contValoracion = _contValoracion;
    ocupacion = _ocupacion;
  } // ctor

} // class DatosSesionDTO
