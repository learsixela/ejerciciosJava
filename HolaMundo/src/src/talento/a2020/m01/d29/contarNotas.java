package src.talento.a2020.m01.d29;

import java.util.Scanner;

public class contarNotas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Integer suma1=0,suma2=0, errorIngreso =0;
		Double nota;
		
		for(int i = 1; i<=10;i++) {
			
			System.out.println("Ingrese nota "+i);
			nota = scan.nextDouble();
			
			if(nota >= 1 && nota < 4) {
				suma1 = suma1 + 1;
			}else if(nota >= 4 && nota <= 7) {
				suma2 = suma2 + 1;
			}else {
				errorIngreso = errorIngreso+1;
			}
		}
		
		System.out.println("Notas menores a 4 -> "+suma1);
		System.out.println("Notas mayores a 4 y menor o igual 7 -> "+suma2);
		System.out.println("Error de ingreso notas ->"+ errorIngreso);

		scan.close();

	}

}
