
import java.util.LinkedList;
import java.util.Queue;


public class Lab0301 {
    static Queue<Registro> regis=new LinkedList<>();

    public static void main(String[] args) {
        registro_estudiante();
        registro_asignaturas();
        reporte_registro_final();
      
    }
    public static void registro_estudiante(){
        int codigo= Entrada.readInt("Codigo estudiante:") ;
        String nombre= Entrada.readText("Nombre estudiante:") ; 
        String correo= Entrada.readText("Correo estudiante:") ; 
        int semestre= Entrada.readInt("Semestre:") ;
        Estudiante estud = new Estudiante(codigo, nombre, correo, semestre);
        regis.add(new Registro(estud));

    
    }
    public static void registro_asignaturas(){
        
    }
    public static void reporte_registro_final(){
        
    }
    
}
