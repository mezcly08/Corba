package s_gestion_pacientes.sop_corba.GestionPersonalPackage;


/**
* s_gestion_pacientes/sop_corba/GestionPersonalPackage/PacienteDTO.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gpersonal.idl
* mi�rcoles 9 de marzo de 2022 04:10:45 PM COT
*/

public final class PacienteDTO implements org.omg.CORBA.portable.IDLEntity
{
  public String nombreCompleto = null;
  public int id = (int)0;
  public String fechaIngreso = null;
  public String ordenApoyo = null;
  public String hostoriaClinica = null;

  public PacienteDTO ()
  {
  } // ctor

  public PacienteDTO (String _nombreCompleto, int _id, String _fechaIngreso, String _ordenApoyo, String _hostoriaClinica)
  {
    nombreCompleto = _nombreCompleto;
    id = _id;
    fechaIngreso = _fechaIngreso;
    ordenApoyo = _ordenApoyo;
    hostoriaClinica = _hostoriaClinica;
  } // ctor

} // class PacienteDTO
