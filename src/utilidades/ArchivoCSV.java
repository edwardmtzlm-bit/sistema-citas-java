package utilidades;

import java.io.*;

public class ArchivoCSV {

    public static void guardarPaciente(String nombre, int edad) {
        try {
            FileWriter fw = new FileWriter("db/pacientes.csv", true);
            PrintWriter pw = new PrintWriter(fw);

            pw.println(nombre + "," + edad);
            pw.close();

            System.out.println("Paciente guardado en CSV.");

        } catch (IOException e) {
            System.out.println("Error al guardar paciente.");
        }
    }

    public static void guardarDoctor(String nombre, String especialidad) {
        try {
            FileWriter fw = new FileWriter("db/doctores.csv", true);
            PrintWriter pw = new PrintWriter(fw);

            pw.println(nombre + "," + especialidad);
            pw.close();

            System.out.println("Doctor guardado en CSV.");

        } catch (IOException e) {
            System.out.println("Error al guardar doctor.");
        }
    }

    public static void guardarCita(String motivo) {
        try {
            FileWriter fw = new FileWriter("db/citas.csv", true);
            PrintWriter pw = new PrintWriter(fw);

            pw.println(motivo);
            pw.close();

            System.out.println("Cita guardada en CSV.");

        } catch (IOException e) {
            System.out.println("Error al guardar cita.");
        }
    }

    public static void leerArchivo(String nombreArchivo) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            String linea;

            System.out.println("\n===== CONTENIDO DEL ARCHIVO =====");

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe todavía.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }
}