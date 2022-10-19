public class MainH {

    public static void main(String[] args) {

        ClienteH cliente1 = new ClienteH("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
        ClienteH cliente2 = new ClienteH("Cliente 2", new int[] { 1, 3, 5, 1, 1 });

        // Tiempo inicial de referencia
        long initialTime = System.currentTimeMillis();
        
        CajeraH cajera1 = new CajeraH("Cajera 1", cliente1, initialTime);
	CajeraH cajera2 = new CajeraH("Cajera 2", cliente2, initialTime);

	cajera1.start();
	cajera2.start();
    
    }
}
