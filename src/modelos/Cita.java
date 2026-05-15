package modelos;

public class Cita {

    private String fecha;
    private String hora;
    private String motivo;

    private Doctor doctor;
    private Paciente paciente;

    public Cita(String fecha, String hora, String motivo,
                Doctor doctor, Paciente paciente) {

        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.doctor = doctor;
        this.paciente = paciente;
    }

    public void mostrarInformacion() {

        System.out.println("===== CITA =====");
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        System.out.println("Motivo: " + motivo);

        System.out.println("\nDoctor:");
        System.out.println(doctor.getNombreCompleto());
        System.out.println(doctor.getEspecialidad());

        System.out.println("\nPaciente:");
        System.out.println(paciente.getNombreCompleto());
        System.out.println("Edad: " + paciente.getEdad());
    }
}