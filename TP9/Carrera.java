
public class Carrera{
    public static void main(String argv[]){
        Animal tortuga = new Animal("Tortuga");
        Animal liebre = new Animal("Liebre");
        // La tortuga largará primero
        tortuga.start();
        // Luego la liebre
        liebre.start();
        System.out.println("Termina el main");
    }
}