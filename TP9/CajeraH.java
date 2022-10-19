public class CajeraH extends Thread {

    private String nombre;
    private ClienteH cliente;
    private long timeStamp;
    
    // Constructor, getter y setter
    public CajeraH (String p_nombre, ClienteH p_cliente, long p_timeStamp){
        //this.setNombre(p_nombre);
        super (p_nombre);
        this.setClienteH(p_cliente);
        this.setTimeStamp(p_timeStamp);
    }
    
         
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
         
    public String getNombre(){
        return Thread.currentThread().getName();
    }
    
    private void setClienteH(ClienteH p_cliente){
        this.cliente = p_cliente;
    }
         
    public ClienteH getCliente(){
        return this.cliente;
    }
    
    private void setTimeStamp(long p_timeStamp){
        this.timeStamp = p_timeStamp;
    }
         
    public long getTimeStamp(){
        return this.timeStamp;
    }

    public void run() {

        System.out.println("La cajera " + this.getNombre() + 
                " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + cliente.getNombre() + 
                " EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000    +
                "seg");

        for (int i = 0; i < cliente.getCarroCompra().length; i++) { 
                this.esperarXsegundos(cliente.getCarroCompra()[i]); 
                System.out.println("Cajera " + this.getNombre() + " - Procesado el producto " + (i + 1) +  
                " ->Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + 
                "seg");
        }

        System.out.println("La cajera " + this.getNombre() + " HA TERMINADO DE PROCESAR " + 
                cliente.getNombre() + " EN EL TIEMPO: " + 
                (System.currentTimeMillis() - timeStamp) / 1000 + "seg");

    }


    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}
