import modelos.Administrador;
import modelos.Cita;
import modelos.Doctor;
import modelos.Paciente;
import utilidades.ArchivoCSV;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Administrador admin = new Administrador("admin", "1234");

        Doctor doctorActual = null;
        Paciente pacienteActual = null;

        System.out.println("===== SISTEMA DE CITAS =====");

        System.out.print("Usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Contraseña: ");
        String contrasena = sc.nextLine();

        boolean acceso = admin.validarAcceso(usuario, contrasena);

        if (acceso) {

            System.out.println("\nAcceso permitido");

            int opcion;

            do {
                System.out.println("\n===== MENÚ =====");
                System.out.println("1. Registrar doctor");
                System.out.println("2. Registrar paciente");
                System.out.println("3. Crear cita");
                System.out.println("4. Leer archivos CSV");
                System.out.println("5. Salir");

                System.out.print("Selecciona una opción: ");
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {

                    case 1:
                        System.out.print("ID del doctor: ");
                        String idDoctor = sc.nextLine();

                        System.out.print("Nombre completo del doctor: ");
                        String nombreDoctor = sc.nextLine();

                        System.out.print("Especialidad: ");
                        String especialidad = sc.nextLine();

                        doctorActual = new Doctor(idDoctor, nombreDoctor, especialidad);

                        ArchivoCSV.guardarDoctor(nombreDoctor, especialidad);

                        System.out.println("Doctor registrado correctamente.");
                        break;

                    case 2:
                        System.out.print("ID del paciente: ");
                        String idPaciente = sc.nextLine();

                        System.out.print("Nombre completo del paciente: ");
                        String nombrePaciente = sc.nextLine();

                        System.out.print("Edad del paciente: ");
                        int edad = sc.nextInt();
                        sc.nextLine();

                        pacienteActual = new Paciente(idPaciente, nombrePaciente, edad);

                        ArchivoCSV.guardarPaciente(nombrePaciente, edad);

                        System.out.println("Paciente registrado correctamente.");
                        break;

                    case 3:
                        if (doctorActual == null || pacienteActual == null) {
                            System.out.println("Primero debes registrar un doctor y un paciente.");
                            break;
                        }

                        System.out.print("Fecha de la cita: ");
                        String fecha = sc.nextLine();

                        System.out.print("Hora de la cita: ");
                        String hora = sc.nextLine();

                        System.out.print("Motivo de la cita: ");
                        String motivo = sc.nextLine();

                        Cita cita = new Cita(fecha, hora, motivo, doctorActual, pacienteActual);

                        ArchivoCSV.guardarCita(motivo);

                        cita.mostrarInformacion();

                        System.out.println("Cita registrada correctamente.");
                        break;

                    case 4:
                        System.out.println("\n===== LECTURA DE ARCHIVOS CSV =====");

                        ArchivoCSV.leerArchivo("db/doctores.csv");
                        ArchivoCSV.leerArchivo("db/pacientes.csv");
                        ArchivoCSV.leerArchivo("db/citas.csv");
                        break;

                    case 5:
                        System.out.println("\nSaliendo del sistema...");
                        break;

                    default:
                        System.out.println("\nOpción no válida.");
                }

            } while (opcion != 5);

        } else {
            System.out.println("\nAcceso denegado");
        }

        sc.close();
    }
}