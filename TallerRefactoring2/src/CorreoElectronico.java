public class CorreoElectronico {
    private String valor;

    public CorreoElectronico(String valor) {
        if (!valor.contains("@")) {
            throw new IllegalArgumentException("Correo inválido");
        }
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
