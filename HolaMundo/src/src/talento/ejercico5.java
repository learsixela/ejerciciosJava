package src.talento;

import java.util.Scanner;

public class ejercico5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Double num1 ,num2,num3,num4,suma, resta, multiplicacion, promedio;
		Integer operacion;
		
		num1=0D; num2=0D; num3= 0D; num4 = 0D;
		
		System.out.println("Ingrese operacion a realizar");
		System.out.println("(1) Suma: (2) resta; (3) Multi; (4) Division");
		operacion= scanner.nextInt();
		
		if (operacion >=1 && operacion <= 4) {
			System.out.println("ingrese numero 1");
			num1 = scanner.nextDouble();
			System.out.println("ingrese numero 2");
			num2 = scanner.nextDouble();
			System.out.println("ingrese numero 3");
			num3 = scanner.nextDouble();
			System.out.println("ingrese numero 4");
			num4 = scanner.nextDouble();
		}else {
			operacion= 0;
		}
		
		//System.out.println(operacion);
		
		switch (operacion) {
		
		case 1:
			System.out.println("Suma");
			suma = num1+num2+num3+num4;
			System.out.println("El resultado es: "+ suma);
			break;
			
		case 2: 
			System.out.println("Resta");
			resta = num1-num2-num3-num4;
			System.out.println("El resultado de la resta es: "+ resta);
			break;
			
		case 3:
			System.out.println("Multiplicación");
			multiplicacion = num1*num2*num3*num4;
			System.out.println("El resultado es: "+ multiplicacion);
			break;
		case 4:
			System.out.println("División");
			promedio  = (num1+num2+num3+num4)/4;
			
			System.out.println("El resultado es: "+ promedio);
			break;
		
		} 
		
	


		scanner.close();
	}

}