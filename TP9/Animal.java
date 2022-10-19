
public class Animal extends Thread{
    private String tipoAnimal;
    public Animal(String p_tipoAnimal){
        this.setTipoAnimal(p_tipoAnimal);
    }

    public void setTipoAnimal(String p_tipoAnimal){this.tipoAnimal=p_tipoAnimal;}

    public String getTipoAnimal(){return this.tipoAnimal;}

    public void run(){
        for(int i = 0; i < 5 ; i++){
            System.out.println(i + " - avanza " + this.getTipoAnimal());
        }
        System.out.println("llegó la " + this.getTipoAnimal());
}
}