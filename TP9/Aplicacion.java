public class Aplicacion{
    public static void main(String [] args){
        SIU base = new SIU();
       
        ConsultarInscriptos consulta = new ConsultarInscriptos(base);        
        
        Inscripcion inscri_1 = new Inscripcion("Andres", 5,base, new InscripcionExamen("Andres Perez", "Libre"));
        Inscripcion inscri_2 = new Inscripcion("Nicolas",5,base, new InscripcionExamen("Nicolas Marquez", "Regular"));
        Inscripcion inscri_3 = new Inscripcion("Pedro",  5,base, new InscripcionExamen("Pedro Gomez", "Regular"));
        Inscripcion inscri_4 = new Inscripcion("Jose",   5,base, new InscripcionExamen("Jose Lopez", "Regular"));
        Inscripcion inscri_5 = new Inscripcion("Marcos", 5,base, new InscripcionExamen("Marcos Acosta", "Libre"));
        Inscripcion inscri_6 = new Inscripcion("Juan",   5,base, new InscripcionExamen("Juan Gonzalez", "Regular"));        
        
        Thread consul = new Thread(consulta);        
        consul.setName("Profesor");
        consul.setPriority(5);
        
        inscri_1.start();
        inscri_2.start();
        inscri_3.start();
        inscri_4.start();
        inscri_5.start();
        inscri_6.start();
        consul.start();        
        
     // esto es para q espere a q terminen todos los hilos y luego continua con el codigo 
	 try{
		inscri_1.join();
        inscri_2.join();
        inscri_3.join();
        inscri_4.join();
        inscri_5.join();
        inscri_6.join();
        consul.join();   	    
	 }catch(Exception e){}

		System.out.println("\nCerro la inscripcion  !!!!");
        
    }
}