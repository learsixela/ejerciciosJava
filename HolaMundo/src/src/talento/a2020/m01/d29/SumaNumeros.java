package src.talento.a2020.m01.d29;

import java.util.Scanner;

public class SumaNumeros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Integer suma=0, numero;
		
		for(int i = 1; i<=10;i++) {
			
			System.out.println("Ingrese un numero");
			numero = scan.nextInt();
			
			suma = suma + numero;
		}
		
		System.out.println(" la suma es: "+suma+ " y el promedio es:"+suma /10);

		scan.close();
	}

}
