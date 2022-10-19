import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class SIU {
    private List inscripciones;
    
    public SIU(){
        this.setInscripciones(new ArrayList());
    }
    
    private void setInscripciones(List p_inscripciones){
        this.inscripciones =  Collections.synchronizedList(p_inscripciones);
    }
    
    public List getInscripciones(){
        return this.inscripciones;
    }
    
    public synchronized void inscribir(InscripcionExamen p_examen){
        p_examen.setNumero(this.inscriptos()+1);
        this.getInscripciones().add(p_examen);
        System.out.println(Thread.currentThread().getName() + " se inscribio");
    }
    
    public int inscriptos(){
        return  this.getInscripciones().size();
    }
    
    public synchronized String mostrarInscriptos(){
       String variable = "\n%~%~%~%~%~%~%~%~%~%~%~%~%~%~%~%~%~%~%~%~%~%~%~%~%~%~%~\n".toString();
       for(int i = 0; i <  this.getInscripciones().size(); i++){
           variable = variable + ((InscripcionExamen) this.getInscripciones().get(i)).mostrar() + "\n".toString();
       }
       variable = variable + "%~%~%~%~%~%~%~%~%~%~%~%~%~%~%~%~%~%~%~%~%~%~%~%~%~%~%~\n\n".toString();;
       return(variable);
    }
}