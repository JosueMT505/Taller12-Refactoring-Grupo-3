public class Persona {
    private String nombre;
    private int edad;
    private String genero;
    private DatosCom Comunicacion;
    

    public Persona(String nombre, int edad, String genero, DatosCon Comunicacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.Comunicacion = Comunicacion ;
 ;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
    if (edad < 0) {
        throw new IllegalArgumentException("No se puede tener edad negativa");
    }
    this.edad = edad;
}


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }}

   
