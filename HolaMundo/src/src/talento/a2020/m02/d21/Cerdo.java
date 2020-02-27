package src.talento.a2020.m02.d21;

public class Cerdo extends Animal {
	
	private String Nombre, Apellido;

	//Constructor que implementa las variables del padre y la propia
	public Cerdo(String especie, String nombre, String apellido) {
		super(especie);
		Nombre = nombre;
		Apellido = apellido;
	}
	
	
	//
	public Cerdo(String especie) {
		super(especie);
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	
	//Mostrar un mensaje en pantalla
    public void printMensaje(){
        super.printMensaje();
        System.out.println("De nombre: "+ Nombre +" de Apellido: "+Apellido);
        System.out.println("Soy un cerdo que grunhe");
    }
	
	

}
