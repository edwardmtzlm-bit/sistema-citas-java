package modelos;

public class Paciente {

    private String id;
    private String nombreCompleto;
    private int edad;

    public Paciente(String id, String nombreCompleto, int edad) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }
}