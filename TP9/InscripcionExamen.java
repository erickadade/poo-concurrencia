public class InscripcionExamen{
    private int nro_inscripcion;
    private String nombre;
    private String condicion;
    
    public InscripcionExamen(String p_nombre, String p_condicion){
        this.setNumero(0);        
        this.setNombre(p_nombre);
        this.setCondicion(p_condicion);
    }
    
    public String mostrar(){
        return("Numero inscripcion: "+ this.getNumero()+
               " - "+ this.getNombre()+
               " - "+ this.getCondicion());
    }
    public void setNumero(int p_nro_inscripcion){
        this.nro_inscripcion = p_nro_inscripcion;
    }
    
    public int getNumero(){
        return this.nro_inscripcion;
    }
 
    public void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    public void setCondicion(String p_condicion){
        this.condicion = p_condicion;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getCondicion(){
        return this.condicion;
    }
}