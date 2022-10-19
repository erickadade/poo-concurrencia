public class Localidades{
    private int disponibles;    
    
    public Localidades(int p_disponibles){
       this.setDisponibles(p_disponibles);
    }
    
    private void setDisponibles(int p_disponibles){
        this.disponibles = p_disponibles;
    }
    
    public int getDisponibles(){
        return this.disponibles;
    }

    public boolean hayDisponible(){
        if(this.getDisponibles() > 0){
           return true;
        }else{
             return false;
        }
    }
    
    public void actualizarDisponible(){
        this.setDisponibles(this.getDisponibles() - 1);
    }
}