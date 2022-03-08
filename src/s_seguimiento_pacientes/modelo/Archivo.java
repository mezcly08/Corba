package s_seguimiento_pacientes.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivo {

    private File archivo;

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public Archivo(String nomDocumento) {
        //Ruta del proyecto
        String ruta = (new File("").getAbsolutePath());
        ruta = ruta + "\\" + nomDocumento;
        this.archivo = new File(ruta);
        try {
            if (!this.archivo.exists()) {
                this.archivo.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error en la creación del fichero");
        }
    }

    public boolean escribirLinea(String linea) {
        try {
            FileWriter fichero = new FileWriter(this.archivo, true);
            PrintWriter pw = new PrintWriter(fichero);
            pw.println(linea);
            fichero.close();
            System.out.println("Se ingreso con exito");
            return true;
        } catch (IOException e) {

            System.out.println("Ha ocurrido un error en la escritura en el archivo ");
            return false;
        }
    }

    public boolean reemplazarLinea(int posicion, String linea) {
        ArrayList<String> lineas = leerLineasArchivo();
        lineas.set(posicion, linea);
        limpiarTxt();
        boolean bandera = false;
        for (String ln : lineas) {
            bandera = escribirLinea(ln);
        }
        return bandera;
    }

    private void limpiarTxt() {
        PrintWriter writer;
        try {
            writer = new PrintWriter(archivo);
            writer.print("");
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<String> leerLineasArchivo() {
        ArrayList<String> lineas = new ArrayList<String>();
        String cadena;
        try {
            FileReader f = new FileReader(this.archivo);
            BufferedReader b = new BufferedReader(f);
            while ((cadena = b.readLine()) != null) {
                lineas.add(cadena);
            }
            b.close();
            f.close();

            return lineas;

        } catch (IOException e) {
            System.out.println("Ha ocurrido un error en la lectura del archivo");
            return null;
        }
    }
}
