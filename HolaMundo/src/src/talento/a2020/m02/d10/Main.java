package src.talento.a2020.m02.d10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Integer option = 0;
		Boolean exit=true;
		//intancia de la clase
		Libro libro = new Libro();
		
		do{
			System.out.println("");
			System.out.println("******* Menu Biblioteca *******");
			System.out.println("");
			System.out.println(" (0) Exit");
			System.out.println(" (1) Ingreso de Libro");  
			System.out.println(" (2) Prestar Libro.");
			System.out.println(" (3) Devolver libro.");
			System.out.println("");
			System.out.println("***************************************");
		
			do {
				System.out.println(" Selecione su opción");
				option = scan.nextInt();
				if(option< 0) {
					option = 5;
				}
			}while(option > 5);
		
			switch (option) {
			case 0:
				System.out.println("See you later....."); 
				exit = false;
				break;
			case 1:
				libro.ingreso();
				break;
			case 2:
				 libro.prestamo();
				break;
			case 3:
				libro.devolucion();
				break;
			case 4:
				libro.stock();
				break;
			case 5:
				libro.ingreso2();
				break;
			default:
				break;
			}
			
			System.out.flush();
		}while(exit==true);

		scan.close();
	}

}
