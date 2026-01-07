import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class Diagnostico {
    private String detalle;
    private String tratamiento;
    private List<String> examenesMedicos;

    public Diagnostico(String detalle, String tratamiento, List<String> examenesMedicos) {
        this.detalle = detalle;
        this.tratamiento = tratamiento;
        this.examenesMedicos = new ArrayList<>(examenesMedicos);
    }

    public String getDetalle() { return detalle; }
    public String getTratamiento() { return tratamiento; }

    public List<String> getExamenesMedicos() {
        return Collections.unmodifiableList(examenesMedicos);
    }
}