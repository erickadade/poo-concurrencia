public class ATM{
  public static void main (String[] args){   
    Persona p1 = new Persona(12333333, "Juan", "Perez", 19761016);
    Persona p2 = new Persona(12222222, "Ana", "Romero", 26361856);
    Persona p3 = new Persona(21872303, "Pedro", "Gomez", 11574489);
    CuentaBancaria cb = new CuentaBancaria(123,p1,1500);

    Transaccion t1 = new Transaccion(1, cb, 500.0);
    Transaccion t2 = new Transaccion(2, cb, 750.0);
    Transaccion t3 = new Transaccion(3, cb, 630.0);

    t1.setName(p1.getNombre());
    t2.setName(p2.getNombre());
    t3.setName(p3.getNombre());

    System.out.println("****  Saldo Inicial  **** " + cb.getSaldo());
    t1.start();
    t2.start();
    t3.start();
  }
}