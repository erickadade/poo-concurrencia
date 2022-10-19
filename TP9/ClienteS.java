
public class ClienteS {

    private String nombre;
    private int[] carroCompra;

    // Constructor, getter y setter
    public ClienteS (String p_nombre, int[] p_carroCompra){
        this.setNombre(p_nombre);
        this.setCarroCompra(p_carroCompra);
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int[] getCarroCompra(){
        return this.carroCompra;
    }
    
    private void setNombre(String p_nombre){
        this.nombre= p_nombre;
    }
    
    private void setCarroCompra(int[] p_carroCompra){
        this.carroCompra = p_carroCompra;
    }
}