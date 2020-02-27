/**
 * 
 */
package src.talento.a2020.m02.d25;

import java.util.Scanner;

import src.talento.a2020.m02.d24.evaluacion.Electrodomestico;

/**
 * @author israelpalma
 *
 */
public class MainConsecuencias {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean condition= true,condition3= true;
		Integer iColHuevo= null,iFilHuevo= null;
		
		Tablero tablero = new Tablero();
		
		tablero.matrizTablero();
	do {
		do {
			System.out.println("Ingrese fila donde caera el huevo");
			iFilHuevo = scan.nextInt();
			if(iFilHuevo<0 || iFilHuevo>14 ) {
				condition=false;
			}else {
				condition=true;
			}
		} while (!condition);
		condition=false;
		do {	
			System.out.println("Ingrese Columna donde caera el huevo");
			iColHuevo = scan.nextInt();
			if(iColHuevo<0 || iColHuevo>14 ) {
				condition=false;
			}else {
				condition=true;
			}
		} while (!condition);
		
		tablero.calculoPuntaje(iFilHuevo, iColHuevo);
		
		System.out.println("desea continuar (1) SI");
		int inOpcion= scan.nextInt();
		if(inOpcion!=1) {
			condition3= false;
		}
		
	} while (condition3);
	
	
	System.out.println("Game Over");
		
	}

}
