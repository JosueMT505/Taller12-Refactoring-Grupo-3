import java.util.ArrayList;
import java.util.List;

public class SistemaAtencionMedico {

    private static final int EDAD_ADULTO_MAYOR = 65;
    private static final double DESCUENTO_ADULTO_MAYOR = 0.25;

    private List<Paciente> pacientes;
    private List<Medico> medicos;
    private List<ServicioMedico> serviciosMedicos;

    public SistemaAtencionMedico() {
        this.pacientes = new ArrayList<>();
        this.medicos = new ArrayList<>();
        this.serviciosMedicos = new ArrayList<>();
    }

    public void agregarServicioMedico(ServicioMedico servicioMedico) {
        serviciosMedicos.add(servicioMedico);
    }
    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void agregarPaciente(Paciente paciente) {
        if (paciente != null) {
            pacientes.add(paciente);
        }
    }

    public void agendarConsulta(Paciente paciente, Consulta consulta) {
        double costoBase = consulta.getServicioMedico().getCosto();

        double costoFinal = calcularValorFinalConsulta(costoBase, paciente.getEdad());

        System.out.println("Se han cobrado " + costoFinal + " dolares de su tarjeta de credito");

        paciente.registrarConsultaEnHistorial(consulta);
    }

    public double calcularValorFinalConsulta(double costoConsulta, int edadPaciente) {
        double descuento = 0;

        if (edadPaciente >= EDAD_ADULTO_MAYOR) {
            descuento = costoConsulta * DESCUENTO_ADULTO_MAYOR;
        }
        return costoConsulta - descuento;
    }

    public Paciente obtenerPaciente(String nombre) {
        for (Paciente p : pacientes) {
            if (p.getNombre().equalsIgnoreCase(nombre)) return p;
        }
        return null;
    }

    public Medico obtenerMedico(String nombre) {
        for (Medico m : medicos) {
            if (m.getNombre().equalsIgnoreCase(nombre)) return m;
        }
        return null;
    }

    public ServicioMedico obtenerServicioMedico(String nombre) {
        for (ServicioMedico s : serviciosMedicos) {
            if (s.getNombre().equalsIgnoreCase(nombre)) return s;
        }
        return null;
    }
}
