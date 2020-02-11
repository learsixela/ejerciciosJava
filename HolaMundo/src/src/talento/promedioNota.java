package src.talento;

import java.util.Scanner;

public class promedioNota {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Double nota1,nota2,nota3,promedio;
		
		System.out.println("iungrese nota 1");
		nota1 = scanner.nextDouble();
		System.out.println("iungrese nota 2");
		nota2 = scanner.nextDouble();
		System.out.println("iungrese nota 3");
		nota3 = scanner.nextDouble();
		
		promedio = (nota1*0.25) + (nota2*0.25)+ (nota3* 0.5);
		
		System.out.println("El promedio es : "+ promedio );
		
		scanner.close();
	}

}
