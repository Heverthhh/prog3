
public class Asignatura {
    int codigo;
    String nombre;
    int semestre;
    int num_creditos;
    String horario;

    public Asignatura(int codigo, String nombre, int semestre, int num_creditos, String horario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.semestre = semestre;
        this.num_creditos = num_creditos;
        this.horario = horario;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public int getNum_creditos() {
        return num_creditos;
    }

    public String getHorario() {
        return horario;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setNum_creditos(int num_creditos) {
        this.num_creditos = num_creditos;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
}
