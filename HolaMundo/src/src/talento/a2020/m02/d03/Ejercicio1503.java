package src.talento.a2020.m02.d03;

import java.util.Scanner;

public class Ejercicio1503 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		int fila=5, columna=0;
		int matriz [][] = new int [fila][columna];
		
		System.out.println("Ingrese numero columnas");
		columna = scan.nextInt();
		
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {
				matriz [i][j] = (int) Math.floor(Math.random()*9+1);
			}
		}
		
		for (int x=0; x < matriz.length; x++) {
			  System.out.print("|");
			  for (int y=0; y < columna; y++) {
			    System.out.print (matriz[x][y]);
			    if (y!=matriz[x].length-1) System.out.print("\t");
			  }
			  System.out.println("|");
			}
		scan.close();

	}

}
