import modelos.Cita;
import modelos.Doctor;
import modelos.Paciente;

public class Main {

    public static void main(String[] args) {

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
    }
}