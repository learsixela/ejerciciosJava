package src.talento.a2020.m01.d30;

import java.util.Scanner;
//import java.lang.Math;

public class guia4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("******* 1 *******");
		
		Integer contador1=0, suma15=0, numero=0;
		
		while(contador1 < 15) {
			contador1=contador1+1;
			System.out.println("Ingrese valor "+ contador1);
			numero=scan.nextInt();
			suma15 = suma15+numero;
		}
		System.out.println("La suma es : "+suma15);
		
		System.out.println("******* 2 *******");
		
		Integer contador2=0,numero2=0;
		
		do {
			contador2=contador2+1;
			System.out.println("Ingrese valor "+ contador1);
			numero2=scan.nextInt();
			System.out.println(numero2);
					
		}while(contador2 <13);
		
		System.out.println("ingresados "+contador2);
		
		scan.close();
	}
}
