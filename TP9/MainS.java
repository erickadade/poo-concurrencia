public class MainS {

	public static void main(String[] args) {

		ClienteS cliente1 = new ClienteS("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
		ClienteS cliente2 = new ClienteS("Cliente 2", new int[] { 1, 3, 5, 1, 1 });

		CajeraS cajera1 = new CajeraS("Cajera 1");
		CajeraS cajera2 = new CajeraS("Cajera 2");

		// Tiempo inicial de referencia
		long initialTime = System.currentTimeMillis();

		cajera1.procesarCompra(cliente1, initialTime);
		cajera2.procesarCompra(cliente2, initialTime);
	}
}