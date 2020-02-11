package src.talento.a2020.m02.d03;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Integer option = 0;
	Boolean exit=true;
	do{
		System.out.println("");
		System.out.println("******* Menu Calculadora *******");
		System.out.println("");
		System.out.println(" (0) Exit");
		System.out.println(" (1) Sumar");  
		System.out.println(" (2) Restar.");
		System.out.println(" (3) Dividir.");
		System.out.println(" (4) Multiplicar.");
		System.out.println("");
		System.out.println("***************************************");
	
		do {
			System.out.println(" Select your option");
			option = scan.nextInt();
			if(option< 0) {
				option = 5;
			}
		}while(option > 4);
	
		switch (option) {
		case 0:
			System.out.println("See you later"); 
			exit = false;
			break;
		case 1:
			Integer suma = 0;
			int [ ] numeros = new int[2];
			System.out.println("Sumar 2 numeros");
			numeros = obtenerNumeros();
			
			suma = numeros[0]+numeros[1];
			System.out.println("La suma es : "+ suma);
			
			break;
		case 2:
			 //restar();
			break;
		case 3:
			//dividir();
			break;
		case 4:
			//multiplicar();
			break;
		default:
			break;
		}
		
		System.out.flush();
	}while(exit==true);
	
	scan.close();
	}
	
	public static boolean sumar(){
		Integer suma = 0;
		int [ ] numeros = new int[2];
		System.out.println("Sumar 2 numeros");
		numeros = obtenerNumeros();
		
		suma = numeros[0]+numeros[1];
		System.out.println("La suma es : "+ suma);
		
		return true;
	}
	
	public static int[] obtenerNumeros() {
		Scanner scans = new Scanner(System.in);
		int [ ] numeros = new int[2];
		String numero1, numero2;
		Boolean validador = false;
		
		do {
		System.out.println("Ingrese primer numero");
		numero1= scans.nextLine();
		validador = isNumeric(numero1);
		}while(!validador);
		
		
		do {
			System.out.println("Ingrese segundo numero");
			numero2= scans.nextLine();
			validador = isNumeric(numero2);
		}while(!validador);
		
		numeros[0] = Integer.parseInt(numero1);
		numeros[1] = Integer.parseInt(numero2);
		scans.close();
		return numeros;
	}
	
	private static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}

}
