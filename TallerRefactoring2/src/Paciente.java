public class Paciente extends Persona {
    //Encapsulamiento de historialMedico
    private HistorialMedico historialMedico;

    //Constante para la edad de adulto mayor
    public static final int EDAD_ADULTO_MAYOR = 65;
    
    //Constructor de la clase Paciente
    public Paciente(String nombre, int edad, String genero, String direccion, String telefono, String correoElectronico, HistorialMedico historial) {
            super(nombre, edad, genero, direccion, telefono, correoElectronico);
            this.historialMedico = historial;
    }

    //Método para determinar si el paciente es adulto mayor
    public boolean esAdultoMayor(){
        //Cambio en la condición para usar la constante EDAD_ADULTO_MAYOR
        return super.getEdad()>=EDAD_ADULTO_MAYOR;
    }

    //Getter para historialMedico
    public HistorialMedico getHistorialMedico() {
        return historialMedico;
    }
}

