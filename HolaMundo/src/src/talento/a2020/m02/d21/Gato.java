package src.talento.a2020.m02.d21;
//clase perro que hereda de la clase padre animal
public class Gato extends Animal{
    //definicion de la variable
    private String nombre;
    
  //Constructor que implementa las variables del padre y la propia
    public Gato(String especie, String nombre){
        super(especie);
        this.nombre = nombre;
    }
    
  //Mostrar un mensaje en pantalla
    public void printMensaje(){
        super.printMensaje();
        System.out.println("De nombre: "+ nombre);
        System.out.println("Soy un gato que maulla");
    }
  //getters and setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}