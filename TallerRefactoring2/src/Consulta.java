import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Consulta {

    private LocalDateTime fechaHora;
    private Paciente paciente;
    private Medico medico;
    private ServicioMedico servicioMedico;
    private boolean realizada;
    private Diagnostico diagnostico;
    private String tratamiento;

    private List<String> examenesMedicos;

    public Consulta(LocalDateTime fechaHora, Paciente paciente, Medico medico, ServicioMedico servicioMedico) {
        this.fechaHora = fechaHora;
        this.paciente = paciente;
        this.medico = medico;
        this.servicioMedico = servicioMedico;
        this.realizada = false;
        this.examenesMedicos = new ArrayList<>();
    }

    public void registrarResultado(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
        this.realizada = true;
    }

    public void programarNuevaFecha(LocalDateTime nuevaFecha) {
        this.fechaHora = nuevaFecha;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public List<String> getExamenesMedicos() {
        return Collections.unmodifiableList(examenesMedicos);
    }

    public void agregarExamenMedico(String examen) {
        this.examenesMedicos.add(examen);
    }

    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }

    public Medico getMedico() { return medico; }
    public void setMedico(Medico medico) { this.medico = medico; }

    public ServicioMedico getServicioMedico() { return servicioMedico; }
    public void setServicioMedico(ServicioMedico servicioMedico) { this.servicioMedico = servicioMedico; }

    public boolean isRealizada() { return realizada; }
    public void setRealizada(boolean realizada) { this.realizada = realizada; }

    public Diagnostico getDiagnostico() { return diagnostico; }

    public String getTratamiento() { return tratamiento; }
    public void setTratamiento(String tratamiento) { this.tratamiento = tratamiento; }
}
