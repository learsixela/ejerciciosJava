package src.talento.a2020.m01.d28;

import java.util.Scanner;

public class cifras_numero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Integer tamanio,numero;
		String sNumero;
		
		System.out.println("Ingrese numero");
		//numero= scanner.nextInt();
		sNumero= scanner.nextLine();
		
		tamanio=sNumero.length();
		
		System.out.println("El largo del numero es :"+ tamanio);
		scanner.close();

	}

}
