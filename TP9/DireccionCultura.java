public class DireccionCultura{
    public static void main (String[] args){
        int totalDisponibles = 20;
        System.out.println("****** La Direccion de Cultura dispone de "+ totalDisponibles + " localidades  ***");
        Localidades localidades = new Localidades(totalDisponibles);
        Boleteria unaBoleteria = new Boleteria(localidades);
        
        Thread b_Uno = new Thread(unaBoleteria);
        Thread b_Dos = new Thread(unaBoleteria);
        Thread b_Tres = new Thread(unaBoleteria);

        b_Uno.setName("Anfiteatro");
        b_Dos.setName("Teatro Vera");
        b_Tres.setName("Dir.Cultura");

        b_Uno.start();
        b_Dos.start();
        b_Tres.start();
    }
}