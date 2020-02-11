package src.talento;

import java.util.Scanner;

public class suma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Integer num1, num2, num3, num4, suma, resta, promedio, multiplicacion;
		
			System.out.println("Ingrese numero 1");
			num1 = scanner.nextInt();
			System.out.println("Ingrese numero 2");
			num2 = scanner.nextInt();
			System.out.println("Ingrese numero 3");
			num3 = scanner.nextInt();
			System.out.println("Ingrese numero 4");
			num4 = scanner.nextInt();
		
			resta = num1-num2-num3-num4;
			suma = num1+num2+num3+num4;
			promedio = (suma)/4;
			multiplicacion = num1*num2*num3*num4 ;
			
			System.out.println("La resta es : "+ resta);
			System.out.println("La suma es : "+suma);
			System.out.println("La multiplicacion es : "+ multiplicacion);
			System.out.println("El promedio es : "+promedio );
			 
	}

}
