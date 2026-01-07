public class Comunicacion {

    private String direccion;
    private String telefono;
    private CorreoElectronico correo;

    public  Comunicacion(String direccion, String telefono, CorreoElectronico correo) {
        if (telefono == null || telefono.isBlank()) {
            throw new IllegalArgumentException("El teléfono no puede ser nulo ni vacío");
        }
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public CorreoElectronico getCorreo() {
        return correo;
    }
    public void setTelefono(String telefono) {
    if (telefono == null || telefono.isEmpty()) {
        throw new IllegalArgumentException("Teléfono inválido");
    }
    this.telefono = telefono;
}
}
