public class Boleteria implements Runnable{
    private Localidades localidades;
    
    Boleteria(Localidades p_localidades){
        this.setLocalidades(p_localidades);
    }
    
    public void setLocalidades(Localidades p_localidades){
        this.localidades = p_localidades;
    }
    
    public Localidades getLocalidades(){
        return this.localidades;
    }
    
    public void run(){
        while(this.getLocalidades().hayDisponible()){
            this.vender();
        }
    }

    private  synchronized void vender(){      
        System.out.println(Thread.currentThread().getName()+" esta por vender una entrada");
        if(this.getLocalidades().hayDisponible()){
             this.getLocalidades().actualizarDisponible();
             System.out.println("      " + Thread.currentThread().getName() + " vendio 1 entrada - "+
                                "Disponibles: " + this.getLocalidades().getDisponibles());
        }else{
             System.out.println("No hay mas entradas... ");
        }
        
        // *********   lo que sigue es solo para que ejecute mas lento   *******
        try { 
            Thread.sleep(1000);
        } 
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }        
    }
}