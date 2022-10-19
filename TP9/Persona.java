import java.util.Calendar;
import java.util.GregorianCalendar;

public class Persona {
  private int dni;
  private String nombre;
  private String apellido;
  private Calendar fechaNacimiento;
  
//  *****   no se modifica nada, debido a que tiene los accesors
  Persona(int p_dni, String p_nombre, String p_apellido, int p_anio) {
    this.setDni(p_dni);
    this.setNombre(p_nombre);
    this.setApellido(p_apellido);
    this.setAnioNacimiento(p_anio);
  }
  
// **  este constructor se agrega  (sobrecargado)  ***
  Persona(int p_dni, String p_nombre, String p_apellido, Calendar  p_fecha) {
    this.setDni(p_dni);
    this.setNombre(p_nombre);
    this.setApellido(p_apellido);
    this.setFechaNacimiento(p_fecha);
  }
 
  public void setDni(int p_dni) {
    this.dni=p_dni;
  }
  public void setNombre(String p_nombre) {
    this.nombre=p_nombre;
  }
  public void setApellido(String p_apellido) {
    this.apellido=p_apellido;
  }

//  ***  este set se usa para el constructor antigï¿½o. 
//  ***  Se asume 1ï¿½ de enero, dado que no usan dia/mes. Lo importante es sï¿½lo el aï¿½o
//  *** acï¿½ destacar que este accesor permite mantener el constructor antiguo como estaba
  public void setAnioNacimiento(int p_anio) {
    // Es necesario tener un objeto Calendar xq aï¿½n no existe el atributo Calendar FechaNacimiento
    Calendar unaFecha = Calendar.getInstance();
    unaFecha.set(p_anio,1,1);
    this.setFechaNacimiento(unaFecha);
  }
  
//  ****  este set se agrega  para el nuevo atributo ***
  public void setFechaNacimiento(Calendar p_fecha) {
    this.fechaNacimiento = p_fecha;
  }

//  ****  este get se agrega  para el nuevo atributo ***
  public Calendar getFechaNacimiento() {
    return this.fechaNacimiento;
  }

  public int getDni() {
    return this.dni;
  }
  public String getNombre() {
    return this.nombre;
  }
    public String getApellido() {
    return this.apellido;  
  }
  
// este get sigue devolviendo lo mismo que antes, para los objetos q lo estaban usando 
// mantiene la misma interfaz pï¿½blica, gracias a que el atributo es privado
  public int getAnioNacimiento() {
    return (this.getFechaNacimiento()).get(Calendar.YEAR);
  }
  
// este mï¿½todo NO se modifica debido a q usa get incluso para sus propias v.i. (doble encapsulamiento)
  public int edad() {
    Calendar fechaHoy = new GregorianCalendar();
    int anioHoy  = fechaHoy.get(Calendar.YEAR);
    return (anioHoy - this.getAnioNacimiento());
  }
  
  public String nomYape(){
        return (this.getNombre()+ " " + this.getApellido());
  }
  public String apeYnom(){
        return (this.getApellido()+ ", " + this.getNombre());
  }
// no se modifica nada, dado que el mï¿½todo edad() devuelve lo esperado
  public void mostrar(){
      System.out.println("Nombre y Apellido: "+ this.nomYape());
      System.out.println("DNI: "+ this.getDni() +"  Edad: "+ this.edad() + " aï¿½os");
  }
// mï¿½todo nuevo, para el nuevo requerimiento
  public boolean esCumpleaños(){
        boolean cumple = false;
        Calendar fechaHoy = new GregorianCalendar();
        int mesActual = fechaHoy.get(Calendar.MONTH) + 1; // ATENCION !!  recordar que comienza en 0 (cero) para Enero
        int diaActual = fechaHoy.get(Calendar.DATE);

        int mesNacimiento  = (this.getFechaNacimiento()).get(Calendar.MONTH);
        int diaNacimiento  = (this.getFechaNacimiento()).get(Calendar.DATE);
        
        if((mesActual == mesNacimiento) && (diaActual == diaNacimiento)){
                cumple = true;
        } 
        return cumple;
  }   
}