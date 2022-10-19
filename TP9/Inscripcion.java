public class Inscripcion extends Thread {
    private SIU base;
    private InscripcionExamen examen;

    public Inscripcion (String pName, int pPriority, SIU pBase, InscripcionExamen pExamen){
        super(pName);
        setPriority(pPriority);
        setBase(pBase);
        setInscripcionExamen(pExamen);
    }
    
    public void setBase(SIU pBase){
        base = pBase;
    }
    
    public SIU getBase(){
        return base;
    }

     public void setInscripcionExamen(InscripcionExamen pExamen){
        examen = pExamen;
    }
    
    public InscripcionExamen getInscripcionExamen(){
        return examen;
    }

    public void run(){   
        getBase().inscribir(this.getInscripcionExamen());       
    }
}