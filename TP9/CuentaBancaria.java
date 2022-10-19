import java.util.ArrayList;
public class CuentaBancaria{
    private int nroCuentaBancaria;
    private ArrayList<Persona> titulares;
    private double saldo;
    
    public CuentaBancaria(int p_nroCuentaBancaria, ArrayList<Persona> p_titulares, double p_saldo){
          this.setNroCuentaBancaria(p_nroCuentaBancaria);
          this.setTitulares(p_titulares);
          this.setSaldo(p_saldo);
    }
    
    public CuentaBancaria(int p_nroCuentaBancaria, Persona p_titular, double p_saldo){
          this.setNroCuentaBancaria(p_nroCuentaBancaria);
          this.titulares = new ArrayList<Persona>();
          this.getTitulares().add(p_titular);
          this.setSaldo(p_saldo);
    }

     private void setNroCuentaBancaria (int p_nroCuentaBancaria){
          this.nroCuentaBancaria = p_nroCuentaBancaria;
     }
     private void setSaldo (double p_saldo){
          this.saldo = p_saldo;
     }
     private void setTitulares (ArrayList<Persona> p_titular){
          this.titulares = p_titular;
     }

     public int getNroCuentaBancaria(){
          return this.nroCuentaBancaria;
     }
     public double getSaldo(){
          return this.saldo;
     }
     public ArrayList<Persona> getTitulares(){
          return this.titulares;
     }
     
     public double depositar (double p_importe){
          this.setSaldo(this.saldo + p_importe);
          return this.saldo;
     }
     
     public double extraer (double p_importe){
         this.setSaldo(this.saldo - p_importe);
          return this.saldo;
     }
     
    public synchronized void hacerRetiro(Transaccion p_transaccion){
       System.out.println("Transaccion " + p_transaccion.getNumero()+ " - " +
                          Thread.currentThread().getName()+" va a retirar $"+ p_transaccion.getImporte());
        
       if(this.getSaldo()>= p_transaccion.getImporte()){
          this.extraer(p_transaccion.getImporte());
          System.out.println("   "+Thread.currentThread().getName() + " retiro con exito. Saldo actual: $" + this.getSaldo());
       }
       else{
          System.out.println("   Saldo insuficiente Sr/a." + Thread.currentThread().getName());
          System.out.println("   Saldo actual: "+this.getSaldo());           
       }
       try{ 
           Thread.sleep(500);
       }catch (InterruptedException ex) {
                ex.printStackTrace();
       }
    }

     public void mostrar(){
         System.out.println ("CuentaBancaria Bancaria");
         for(Persona p: this.getTitulares()){
             if(p.getNombre().equals(Thread.currentThread().getName())){
                  System.out.println("Titular: " + p.nomYape()+
                                    "("+ p.edad()+" años)");
                  System.out.println("Saldo: " + this.getSaldo());
             }
            
         }
         
     }
}
