package src.talento.a2020.m01.d29;

import java.util.Scanner;

public class PromedioEdades {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Integer edadm=0,edadt=0, edadn =0, summ=0, sumt=0,sumn=0, promm,promt,promn;
		
		
		System.out.println("Jornada Mañana");
		for (int i = 0; i < 10; i++) {
			System.out.println("Ingrese edad estudiante "+ i);
			edadm=scan.nextInt();
			summ=summ+edadm;
		}
		System.out.println("Jornada Tarde");
		for (int j = 0; j < 7; j++) {
			System.out.println("Ingrese edad estudiante "+ j);
			edadt=scan.nextInt();
			sumt=sumt+edadt;
			
		}
		System.out.println("Jornada Noche");
		for (int k = 0; k < 5; k++) {
			System.out.println("Ingrese edad estudiante "+ k);
			edadn=scan.nextInt();
			sumn=sumn+edadn;
		}
		
		
		promm = summ/10;
		promt = sumt/7;
		promn = sumn/5;
		
		System.out.println("El promedio jornada mañana es : "+ promm);
		System.out.println("El promedio jornada tarde es : "+promt);
		System.out.println("El promedio jornada noche es : "+promn);
		
		if((promm > promt) && (promm > promn)) {
			System.out.println("El turno mañana tiene el promedio mas alto");
		}else if((promt > promm) && (promt > promn)) {
			System.out.println("El turno tarde tiene el promedio mas alto");
		}else if((promn > promm) && (promn > promt)) {
			System.out.println("El turno Noche tiene el promedio mas alto");
		}else if((promn == promm) && (promn == promt)){
			System.out.println("Todos tienen el mismo promedio");
		}
		
		scan.close();

		
	}

}
