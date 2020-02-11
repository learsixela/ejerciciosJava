package src.talento;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Integer num1 ,num2,num3;
		
		System.out.println("Ingrese un numero");
		num1= scanner.nextInt();
		System.out.println("Ingrese segundo numero");
		num2 = scanner.nextInt();
		System.out.println("Ingrese tercer numero");
		num3 = scanner.nextInt();

		if(num1 >num2 && num1 >num3) {
			if(num2 >num3) {
				System.out.println(" el orden es : "+ num1+","+num2+","+num3);
			}else {
				System.out.println(" el orden es : "+ num1+","+num3+","+num2);
			}
		}else if (num2 >num1 && num2 >num3) {
			if(num1 >num3) {
				System.out.println(" el orden es : "+ num2+","+num1+","+num3);
			}else {
				System.out.println(" el orden es : "+ num2+","+num3+","+num1);
			}
		}else if (num2 ==num1&& num2==num3) {
			System.out.println("Son todos Iguales");
			
		}else {
			if(num3 > num1 && num3 >num2) {
				if(num1 >num2) {
					System.out.println(" el orden es : "+ num3+","+num1+","+num2);
				}else {
					System.out.println(" el orden es : "+ num3+","+num2+","+num1);
				}
			}
		}
		scanner.close();
	}

}
