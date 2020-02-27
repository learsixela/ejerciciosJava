package src.talento.a2020.m02.d21;

//clase perro que hereda de la clase padre animal
public class Perro extends Animal {
	// definicion de la variable
	private String nombre;

	// constructor de los atributos del padre y del propio
	public Perro(String especie, String nombre) {
		super(especie);
		this.nombre = nombre;
	}

	// metodo que no retorna nada, solo imprime el mensaje
	public void printMensaje() {
		super.printMensaje();
		System.out.println("De nombre: "+ nombre);
		System.out.println("Soy un perro que ladra");
	}

	// getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}