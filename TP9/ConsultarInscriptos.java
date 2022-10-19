public class ConsultarInscriptos implements Runnable{
    private SIU base;

    public ConsultarInscriptos(SIU p_base){
        this.setBase(p_base);
    }
    
    public void setBase(SIU p_base){
        this.base = p_base;
    }
    
    public synchronized SIU getBase(){
        return this.base;
    }

    public void run(){
       for(int i = 0; i < 7; i++){
            System.out.println("\n" + Thread.currentThread().getName() + 
            " consulto los estudiantes inscriptos: " + 
            ((SIU)this.getBase()).mostrarInscriptos());
       }
    }
}