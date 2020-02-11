package src.talento.a2020.m02.d03;

import java.util.Scanner;


public class Matrices {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int fila=4, columna=4;
		int matriz [][] = new int [fila][columna];
		

		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {
				//System.out.println("Ingrese valor a matriz["+i+"]["+j+"] =" );
				//matriz [i][j] = scan.nextInt();
				matriz [i][j] = (int) Math.floor(Math.random()*6+1);
			}
		}
		
		/*for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {
				System.out.println("matriz["+i+"]["+j+"] = " +matriz [i][j]);
			}
		}
		*/
		
		System.out.println("");
		
		//visualmente se veria asi
		
		for (int x=0; x < matriz.length; x++) {
			  System.out.print("|");
			  for (int y=0; y < matriz[x].length; y++) {
			    System.out.print (matriz[x][y]);
			    if (y!=matriz[x].length-1) System.out.print("\t");
			  }
			  System.out.println("|");
			}
		
		scan.close();
		
	}

}
