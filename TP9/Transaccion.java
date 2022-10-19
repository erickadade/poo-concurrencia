public class Transaccion extends Thread{
    private int numero;    
    private CuentaBancaria cuenta;
    private double importe;
   
    Transaccion(int p_numero, CuentaBancaria p_cuenta, double p_importe){
        this.setNumero(p_numero);
        this.setCuenta(p_cuenta);
        this.setImporte(p_importe);
    }
    
    public void run(){
        this.getCuenta().hacerRetiro(this);
    }
    
    private void setNumero(int p_numero){this.numero=p_numero;}
    public int getNumero(){return this.numero;}

    private void setCuenta(CuentaBancaria p_cuenta){this.cuenta=p_cuenta;}
    public CuentaBancaria getCuenta(){return this.cuenta;}

    private void setImporte(double p_importe){this.importe=p_importe;}
    public double getImporte(){return this.importe;}
}
