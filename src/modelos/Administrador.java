package modelos;

public class Administrador {

    private String usuario;
    private String contrasena;

    public Administrador(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public boolean validarAcceso(String usuarioIngresado, String contrasenaIngresada) {
        return usuario.equals(usuarioIngresado) && contrasena.equals(contrasenaIngresada);
    }
}