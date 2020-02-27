package src.talento.a2020.m02.d21;

//clase main que solo ejecuta el codigo
//ac� aplicamos polimorfismo
public class Main {

	public static void main(String[] args) {
		// Definicion de las variables de tipo Animal
		Animal oAnimalCholito, oAnimalFelix, oAnimalPink, oAnimalPajaroLoko;

		// inicializamos la variable como una nueva instancia de la clase Perro
		oAnimalCholito = new Perro("Perro", "cholito");// pasamos parametros al constructor
		// inicializamos la variable como una nueva instancia de la clase Gato
		oAnimalFelix = new Gato("Gato", "Felix");// pasamos parametros al constructor
		// inicializamos la variable como una nueva instancia de la clase Cerdo
		oAnimalPink = new Cerdo("Cerdo", "Pink", "Loka");
		// inicializamos la variable como una nueva instancia de la clase AVE
		//oAnimalPajaroLoko = new Ave("Ave", "PajaroLoko", "Domestica");

		System.out.printf("\n");
		// llamando al metodo printMensaje de la clase perro
		System.out.printf("\n");
		oAnimalCholito.printMensaje();
		// llamando al metodo printMensaje de la clase gato
		System.out.printf("\n");
		oAnimalFelix.printMensaje();
		// llamando al metodo printMensaje de la clase cerdo
		System.out.printf("\n");
		oAnimalPink.printMensaje();
		/*
		 * Polimosfismo es que heredan de una misma clase pero cada uno tiene su propio
		 * comportamiento
		 */

		Ave ave = new Ave("ave"); ///aqui creo la nueva istacia que esta nula  que tiene ,o de ave 
		System.out.println(ave.getObtenerCrianza());
		System.out.println(ave.getEspecie());
		ave.setIngresarCrianza("salvaje");
		System.out.println(ave.getObtenerCrianza());

	}
}