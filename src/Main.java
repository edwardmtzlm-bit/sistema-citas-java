import modelos.Administrador;
import modelos.Cita;
import modelos.Doctor;
import modelos.Paciente;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Administrador admin = new Administrador(
                "admin",
                "1234"
        );

        System.out.println("===== SISTEMA DE CITAS =====");

        System.out.print("Usuario: ");
        String usuario = sc.nextLine();

        System.out.print("Contraseña: ");
        String contrasena = sc.nextLine();

        boolean acceso = admin.validarAcceso(usuario, contrasena);

        if (acceso) {

            System.out.println("\nAcceso permitido");

            Doctor doctor1 = new Doctor(
                    "DOC001",
                    "Carlos Mendoza",
                    "Cardiología"
            );

            Paciente paciente1 = new Paciente(
                    "PAC001",
                    "Luis Eduardo Martínez",
                    28
            );

            Cita cita1 = new Cita(
                    "15/05/2026",
                    "4:00 PM",
                    "Chequeo general",
                    doctor1,
                    paciente1
            );

            cita1.mostrarInformacion();

        } else {

            System.out.println("\nAcceso denegado");

        }

        sc.close();
    }
}