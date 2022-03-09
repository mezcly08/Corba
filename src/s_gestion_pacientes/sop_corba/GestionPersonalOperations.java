package s_gestion_pacientes.sop_corba;


/**
* s_gestion_pacientes/sop_corba/GestionPersonalOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from gpersonal.idl
* mi�rcoles 9 de marzo de 2022 03:00:58 PM COT
*/

public interface GestionPersonalOperations 
{
  void registrarPersonal (s_gestion_pacientes.sop_corba.GestionPersonalPackage.personalDTO objPersonal, org.omg.CORBA.BooleanHolder res);
  boolean consultarPersonal (int id, s_gestion_pacientes.sop_corba.GestionPersonalPackage.personalDTOHolder objPersonal);
  boolean consulPersonal (int id);
  boolean existevaloracion (int id, String ocupacion);
  s_gestion_pacientes.sop_corba.GestionPersonalPackage.PacienteDTO consultarPaciente (int id);
  boolean registrarPaciente (s_gestion_pacientes.sop_corba.GestionPersonalPackage.PacienteDTO objPacientes);
  boolean abrirSesion (s_gestion_pacientes.sop_corba.GestionPersonalPackage.credencialDTO objCredencial);
  void registrarCallback (s_gestion_pacientes.sop_corba.AdminCllbckint objCllbck);
  boolean valorarPaciente (s_gestion_pacientes.sop_corba.GestionPersonalPackage.ValorarPacienteDTO objValorarPaciente);
  s_gestion_pacientes.sop_corba.GestionPersonalPackage.ValorarPacienteDTO consultarValoracion (String id, String ocupacion);
  boolean existenPacientes (int id);
  void eliminarCallback (s_gestion_pacientes.sop_corba.AdminCllbckint objAdmin);
  boolean guardarInfoSesion (s_gestion_pacientes.sop_corba.GestionPersonalPackage.InfoSesionDTO objInfoSesionDTO);
  s_gestion_pacientes.sop_corba.GestionPersonalPackage.InfoSesionDTO consultarInfoSesion (int id);
  void validarValoracion (int id, String ocupacion);
  int contador (int id, String ocupacion);
  boolean eliminarList (int id);
  boolean validarEstadoPaciente (String id);
  boolean existenciaspersonal ();
} // interface GestionPersonalOperations
