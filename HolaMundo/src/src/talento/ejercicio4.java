package src.talento;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer numero;
		
		System.out.println("Ingrese número");
		numero= scanner.nextInt();
		
		if(numero >40) {
			System.out.println("El numero es mayor que 40");
		}else {
			System.out.println("El numero es menor que 40");
		}

		scanner.close();
	}

}
