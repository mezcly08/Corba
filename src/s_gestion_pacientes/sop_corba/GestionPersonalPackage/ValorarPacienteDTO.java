package s_gestion_pacientes.sop_corba.GestionPersonalPackage;


/**
* s_gestion_pacientes/sop_corba/GestionPersonalPackage/ValorarPacienteDTO.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gpersonal.idl
* martes 8 de marzo de 2022 12:07:26 PM COT
*/

public final class ValorarPacienteDTO implements org.omg.CORBA.portable.IDLEntity
{
  public String idPaciente = null;
  public String concepto = null;
  public String obversaciones = null;
  public String fechaValoracion = null;
  public String Profesion = null;
  public String NombreProfesional = null;

  public ValorarPacienteDTO ()
  {
  } // ctor

  public ValorarPacienteDTO (String _idPaciente, String _concepto, String _obversaciones, String _fechaValoracion, String _Profesion, String _NombreProfesional)
  {
    idPaciente = _idPaciente;
    concepto = _concepto;
    obversaciones = _obversaciones;
    fechaValoracion = _fechaValoracion;
    Profesion = _Profesion;
    NombreProfesional = _NombreProfesional;
  } // ctor

} // class ValorarPacienteDTO
