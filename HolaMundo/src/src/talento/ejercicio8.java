package src.talento;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Double nota ;
		
		System.out.println("Ingrese una nota de 1.0 a 10.0");
		nota= scanner.nextDouble();
		
		if(nota <=3.99) {
			System.out.println("Nota deficiente ...");
		}else if (nota >= 4.0 && nota < 7.0  ) {
			System.out.println("Nota suficiente ...");
			
		}else if (nota >=7.0 && nota <8.0  ) {
			System.out.println(" Nota bien ...");
			
		}else if (nota >= 8.0 && nota <= 10.0 ){
			System.out.println("Nota Excelente ...");
		}else {
			System.out.println("Fuera de rango ");
			
		}

	}

}
