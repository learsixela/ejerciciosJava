package src.talento;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Integer num1 ,num2;
		
		System.out.println("Ingrese un numero");
		num1= scanner.nextInt();
		System.out.println("Ingrese un otro numero");
		num2 = scanner.nextInt();
		
		if (num1==num2) {
			System.out.println("Son iguales ...");
		}else {
			System.out.println("No son iguales ...");
		}
		
		scanner.close();

	}

}
