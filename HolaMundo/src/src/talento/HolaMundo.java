package src.talento;

import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		
		
		String nombre, apellido;
		Integer edad, telefono;
		 
		
		System.out.println("Hola");
		Scanner scanner = new Scanner(System.in);
		
	
		System.out.println("Ingrese Nombre");
		nombre = scanner.nextLine();
		
		System.out.println("Ingrese Apellido");
		apellido = scanner.nextLine();
		
		System.out.println("Ingrese Edad");
		edad = scanner.nextInt();
		
		System.out.println("Ingrese Telefono");
		telefono = scanner.nextInt();
		
		System.out.println("El usuario es : "+ nombre+" "+apellido +", edad: "+edad+", telefono: "+telefono);
		System.out.println("");
		
		
	}

}
