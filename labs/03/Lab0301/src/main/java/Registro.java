
import java.util.LinkedList;


public class Registro {
    
    LinkedList<Asignatura> listAsignatura;
    Estudiante estudiante;
    
    Registro(Estudiante estudiante){
        this.estudiante = estudiante;
        listAsignatura= new LinkedList<>();
    }
    
}
