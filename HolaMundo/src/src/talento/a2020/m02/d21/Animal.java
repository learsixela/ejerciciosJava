package src.talento.a2020.m02.d21;

/*
 * esta es la clase Padre
 */
public class Animal {
	// definicion de variable de tipo string
	private String especie;

	// constructor de la clase
	public Animal(String especie) {
		this.especie = especie;
	}
	//Contructor vacio
	public Animal() {
		super();
	}

	// Metodo de la clase que no retorna nada, sol imprime
	public void printMensaje() {
		System.out.println("Soy un animal de la especie: " + this.getEspecie());
	}

	// getters and setters
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
}