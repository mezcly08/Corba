package cliente;

import s_gestion_pacientes.sop_corba.GestionPersonal;
import s_gestion_pacientes.sop_corba.GestionPersonalHelper;
import org.omg.CosNaming.*;

import cliente.utilidades.UtilidadesConsola;
import javafx.scene.control.Menu;

import javax.rmi.CORBA.Util;

import org.omg.CORBA.*;

import s_gestion_pacientes.sop_corba.GestionPersonalPackage.credencialDTO;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.personalDTO;
import s_gestion_pacientes.sop_corba.GestionPersonalPackage.personalDTOHolder;

public class ClienteDeObjetos {
    static GestionPersonal ref;

    public static void main(String args[]) {
        try {
            String[] vec = new String[4];
            vec[0] = "-ORBInitialPort";
            System.out.println("Ingrese la dirección IP donde escucha el n_s");
            vec[1] = cliente.UtilidadesConsola.leerCadena();
            vec[2] = "-ORBInitialPort";
            System.out.println("Ingrese el puerto donde escucha el n_s");
            vec[3] = cliente.UtilidadesConsola.leerCadena();
            
            // crea e inicia el ORB
            ORB orb = ORB.init(vec, null);

            // obtiene la base del naming context
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            // usa NamingContextExt en lugar de NamingContext.Esto es
            // parte del Interoperable naming Service.
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // Resuelve la referencia del objeto en el N_S
            String name = "objRemotoPersonal";
            ref = GestionPersonalHelper.narrow(ncRef.resolve_str(name));

             System.out.println("Obtenido el manejador sobre el servidor deobjetos: " +ref);

            MenuPrincipal();
        } catch (Exception e) {
            System.out.println("ERROR : " + e);
            e.printStackTrace(System.out);
        }
    }

    private static void MenuPrincipal() {
        int opcion = 0;
        do {
            System.out.println("==Menu==");
            System.out.println("1. Abrir Sesion");
            System.out.println("2. Salir");
            System.out.println("========================");
            System.out.print("Ingrese su opcion: ");
            opcion = UtilidadesConsola.leerEntero();
            switch (opcion) {
                case 1:
                    Login();
                    break;
                case 2:
                    System.out.println("Saliendo...");
                    ;
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != 2);
    }

    private static void Login() {
        try {
            String user = "";
            String password = "";
            int id = 0;
            boolean login = false;
            System.out.println("==Iniciar Sesion==");
            System.out.println("Usuario: ");
            user = UtilidadesConsola.leerCadena();
            System.out.println("Clave: ");
            password = UtilidadesConsola.leerCadena();
            System.out.println("ID: ");
            id = UtilidadesConsola.leerEntero();
            credencialDTO varCredencial = new credencialDTO(user, password, id);
            login = ref.abrirSesion(varCredencial);
            if (login) {
                boolean resultado;
                personalDTOHolder objPersonal = new personalDTOHolder();
                resultado = ref.consultarPersonal(id, objPersonal);
                if (resultado == true && objPersonal != null) {
                    switch (objPersonal.value.ocupacion) {
                        case "Admin":
                            MenuAdmin();
                            break;
                        case "Recepcionista":
                            MenuRecepcionista();
                            break;
                        case "Psicologa":
                            MenuValoracion();
                            break;
                        case "Medico":
                            MenuValoracion();
                            break;
                        case "Fisioterapeuta":
                            MenuFisio();
                            break;
                        default:
                            break;
                    }
                }
            } else {
                System.out.println("El personal " + user + " NO está autorizado para ingresar al sistema.");
                System.out.println("***Verificar que el Usuario y Clave sean correctas***");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    private static void MenuAdmin() {
        int opcion = 0;
        do {
            System.out.println("==========Menu==========");
            System.out.println("|1. Registrar Personal  |");
            System.out.println("|2. Consultar Personal  |");
            System.out.println("|3. Salir               |");
            System.out.println("========================|");
            System.out.print("Ingrese su opcion: ");
            opcion = UtilidadesConsola.leerEntero();
            switch (opcion) {
                case 1:
                    RegistrarPersonal();
                    break;
                case 2:
                    ConsultarPersonal();
                    break;
                case 3:
                    System.out.println("Salir...");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != 3);
    }

    private static void MenuRecepcionista() {
        int opcion = 0;
        do {
            System.out.println("===Menu Recepcionista===");
            System.out.println("|1. Registrar Paciente |");
            System.out.println("|2. Consultar Paciente |");
            System.out.println("|3. Salir              |");
            System.out.println("========================");
            System.out.print("Ingrese su opcion: ");
            opcion = UtilidadesConsola.leerEntero();
            switch (opcion) {
                case 1:
                    System.out.println("Opcion En construccion...\n");
                    break;
                case 2:
                    System.out.println("Opcion En construccion...\n");
                    break;
                case 3:
                    System.out.println("Salir...");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != 3);
    }

    private static void MenuValoracion() {
        int opcion = 0;
        do {
            System.out.println("==== Menu Valoracion ====");
            System.out.println("|1. Valorar Paciente    |");
            System.out.println("|2. Consultar Paciente  |");
            System.out.println("|3. Salir               |");
            System.out.println("========================");
            System.out.print("Ingrese su opcion: ");
            opcion = UtilidadesConsola.leerEntero();
            switch (opcion) {
                case 1:
                    System.out.println("Opcion En construccion...\n");
                    break;
                case 2:
                    System.out.println("Opcion En construccion...\n");
                    break;
                case 3:
                    System.out.println("Salir...");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != 3);
    }

    private static void MenuFisio() {
        int opcion = 0;
        do {
            System.out.println("===Menu Fisioterapeuta====");
            System.out.println("|1. Valorar Paciente     |");
            System.out.println("|2. Seguimiento Paciente |");
            System.out.println("|3. Consultar Paciente   |");
            System.out.println("|4. Salir                |");
            System.out.println("=========================");
            System.out.print("Ingrese su opcion: ");
            opcion = UtilidadesConsola.leerEntero();
            switch (opcion) {
                case 1:
                    System.out.println("Opcion En construccion...\n");
                    break;
                case 2:
                    System.out.println("Opcion En construccion...\n");
                    break;
                case 3:
                    System.out.println("Opcion En construccion...\n");
                    break;
                case 4:
                    System.out.println("Salir...");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != 4);
    }

    private static void RegistrarPersonal() {
        try {
            System.out.println("******* Registrar Personal *******");
            String tipoID = "";
            int opc = 0;
            do {
                System.out.println("=== Tipo de identificacion ====");
                System.out.println("|1. Cedula de Ciudadania(CC)  |");
                System.out.println("|2. Tarjeta de Identidad(TI)  |");
                System.out.println("|3. Pasaporte(PP)             |");
                System.out.println("==============================|");
                System.out.print("Ingrese su opcion: ");

                opc = UtilidadesConsola.leerEntero();

                switch (opc) {
                    case 1:
                        tipoID = "CC";
                        break;
                    case 2:
                        tipoID = "TI";
                        break;
                    case 3:
                        tipoID = "PP";
                        break;
                    default:
                        System.out.println("Error: Ingrese una opción válida");
                }
            } while (opc < 1 || opc > 3);
            int id = 0;
            do {
                System.out.println("Ingrese la Identificación: ");
                id = UtilidadesConsola.leerEntero();
                if (id < 1) {
                    System.out.println("Error: La identificación debe ser mayor a cero (0)");
                }
            } while (id < 1);
            String nombre = "";
            do {
                System.out.println("Ingrese El nombre completo: ");
                nombre = UtilidadesConsola.leerCadena();
                if (nombre.length() < 2) {
                    System.out.println("Error: El nombre debe contener al menos 2 caracteres");
                }
            } while (nombre.length() < 2);
            String ocupacion = "";
            do {
                System.out.println("====== Ocupacion ======");
                System.out.println("|1. Recepcionista     |");
                System.out.println("|2. Medico            |");
                System.out.println("|3. Psicologa         |");
                System.out.println("|4. Fisioterapeuta    |");
                System.out.println("=======================");
                System.out.print("Ingrese su opcion: ");
                opc = UtilidadesConsola.leerEntero();

                switch (opc) {
                    case 1:
                        ocupacion = "Recepcionista";
                        break;
                    case 2:
                        ocupacion = "Medico";
                        break;
                    case 3:
                        ocupacion = "Psicologa";
                        break;
                    case 4:
                        ocupacion = "Fisioterapeuta";
                        break;

                    default:
                        System.out.println("Error: Seleccione una opción válida");
                }
            } while (opc < 1 || opc > 4);
            String usuario = "";
            do {
                System.out.println("Digite el usuario: ");
                usuario = UtilidadesConsola.leerCadena();
                if (usuario.length() < 8) {
                    System.out.println("Error: El usuario debe contener al menos 8 caracteres");
                }
            } while (usuario.length() < 8);
            String clave = "";
            do {
                System.out.println("Digite la clave: ");
                clave = UtilidadesConsola.leerCadena();
                if (clave.length() < 8) {
                    System.out.println("Error: la clave debe contener al menos 8 caracteres");
                }
            } while (clave.length() < 8);

            personalDTO objPersonal = new personalDTO(tipoID, id, nombre, ocupacion, usuario, clave);
            BooleanHolder res = new BooleanHolder();
            ref.registrarPersonal(objPersonal, res);
            if (res.value == true) {
                System.out.println("***Personal Registrado Exitosamente***");
            } else {
                System.out.println("ERROR: NO se pudo registrar el Personal");
            }
        } catch (Exception e) {
            System.err.println("ERROR NO CONTROLADO");
        }
    }

    private static void ConsultarPersonal() {
        System.out.println("======Consulta de Personal ======");
        System.out.println("Ingrese la identificacion: ");
        int id = UtilidadesConsola.leerEntero();
        try {
            boolean resultado;
            personalDTOHolder objPersonal = new personalDTOHolder();
            resultado = ref.consultarPersonal(id, objPersonal);
            if (resultado) {
                System.out.println();
                System.out.println("==Resultado de la Consulta==");
                System.out.println("Tipo ID: " + objPersonal.value.tipo_id);
                System.out.println("ID: " + objPersonal.value.id);
                System.out.println("Nombre Completo: " + objPersonal.value.nombreCompleto);
                System.out.println("Ocupación: " + objPersonal.value.ocupacion);
                System.out.println("Usuario: " + objPersonal.value.usuario);
                System.out.println();
            }
        } catch (Exception e) {
            System.err.println("Error: El usuario con ID " + id + " no se encontró!");
        }
    }
}
