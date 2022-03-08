package s_seguimiento_pacientes.servidor;

import s_seguimiento_pacientes.sop_corba.GestionNotificaciones;
import s_seguimiento_pacientes.sop_corba.GestionNotificacionesPOATie;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAManagerPackage.AdapterInactive;
import org.omg.PortableServer.POAPackage.ServantNotActive;
import org.omg.PortableServer.POAPackage.WrongPolicy;

public class ServidorDeObjetos {

    public static void main(String args[]) {
        try {
            String[] vec = new String[4];
            vec[0] = "-ORBInitialHost";
            System.out.println("Ingrese la dirección IP donde escucha el n_s");
            vec[1] = UtilidadesConsola.leerCadena();
            vec[2] = "-ORBInitialPort";
            System.out.println("Ingrese el puerto donde escucha el n_s");
            vec[3] = UtilidadesConsola.leerCadena();
            GesNotificacionesImpl objRemoto = new GesNotificacionesImpl();
            inicializarORB(vec, objRemoto);
        } catch (Exception e) {
            System.out.println("Error: " + e);
            e.printStackTrace(System.out);
        }

        System.out.println("Servidor: Saliendo ...");
    }

    private static void inicializarORB(String[] vec, GesNotificacionesImpl convref) throws ServantNotActive, WrongPolicy, org.omg.CORBA.ORBPackage.InvalidName, AdapterInactive, InvalidName, NotFound, CannotProceed {
        try {
            // crea e iniciia el ORB
            ORB orb = ORB.init(vec, null);

            // obtiene la referencia del rootpoa & activate el POAManager
            POA rootpoa
                    = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootpoa.the_POAManager().activate();

            //*** crea el servant y lo registra con el ORB ***
            //GesNotificacionesImpl convref = new GesNotificacionesImpl();
            //convref.setORB(orb); 
            //*** crea un tie, con el servant como delegado***
            GestionNotificacionesPOATie gntie = new GestionNotificacionesPOATie(convref);

            //*** Obtener la referencia para el tie
            GestionNotificaciones reftie = gntie._this(orb);

            // obtiene la base del contexto de nombrado
            org.omg.CORBA.Object objref
                    = orb.resolve_initial_references("NameService");
            // Usa NamingContextExt el cual es parte de la especificacion 
            // Naming Service (INS).
            NamingContextExt ncref = NamingContextExtHelper.narrow(objref);
            System.out.println("Realizar binding de objNotificaciones ...");
            // *** Realiza el binding de la referencia de objeto en el N_S ***
            String name = "objRemotoNotificaciones";
            NameComponent path[] = ncref.to_name(name);
            ncref.rebind(path, reftie);

            System.out.println("El Servidor GestionNotificaciones esta listo y esperando ...");

            // esperan por las invocaciones desde los clientes
            orb.run();
        } catch (Exception e) {
            System.err.println("ERROR: " + e);
            e.printStackTrace(System.out);
        }

        System.out.println("Servidor: Saliendo ...");
    }
}
