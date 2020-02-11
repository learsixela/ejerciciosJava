package src.talento.a2020.m01.d29;

import java.util.Scanner;

public class WhileDowhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Integer numero = 0,numero2 = 0;
		
		//do while, ejecuta y despues valida
		do {
		System.out.println("(Do While) Ingrese un numero mayor a 0");
		numero = scan.nextInt();
		}while(numero  == 0);
		
		//while
		System.out.println(" Ingrese un numero mayor a 0");
		numero2 = scan.nextInt();
		
		//Primero valida luego ejecuta
		while(numero2==0) {
			System.out.println("( While) Ingrese un numero mayor a 0");
			numero2 = scan.nextInt();
		}
		
		System.out.println("Fin del Programa");
		scan.close();
	}

}
