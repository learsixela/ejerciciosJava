package src.talento.a2020.m01.d29;

import java.util.Scanner;

public class EjerciciosVarios {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("******* A *******");
		Integer  numero =0, suma=0;
		
		for (int k = 0; k < 10; k++) {
			System.out.println("Ingrese valor "+ k);
			numero=scan.nextInt();
			if (k>5) {
				suma=suma+numero;
			}
			
		}
		
		System.out.println(" La suma de los 5 ultimos es: "+ suma);
		scan.close();
		
		
		System.out.println("******* B *******");
		
		for (int i = 1; i <= 50; i++) {
			if (i>5) {
				System.out.println("5 * "+i + " = ");
			}
		}
		
		System.out.println("******* C *******");
		
		Integer numeroc=0,contadorneg=0, contadorpos=0,multiplos=0,pares=0;
		
		for (int j = 0; j < 10; j++) {
			System.out.println("Ingrese valor "+ j);
			numeroc=scan.nextInt();
			
			if(numeroc < 0) {
				contadorneg = contadorneg +1;
			}else if(numeroc > 0) {
				contadorpos = contadorpos +1;
			}
			
			if( numeroc %15 == 0) {
				multiplos= multiplos+1;
			}
			
			if(numeroc % 2 ==0) {
				pares = pares + numeroc;
			}
		}
		
		System.out.println("negativos "+contadorneg );
		System.out.println("positivos"+ contadorpos);
		System.out.println("multiplos de 15"+multiplos);
		System.out.println("Acumulado pares"+pares);
		scan.close();
		
	}

}
