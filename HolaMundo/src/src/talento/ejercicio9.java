package src.talento;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer dia, mes, anio;
		boolean bmes, bdia; 
		String valor;
		dia= 1;mes=1;anio=1900;
		
		do
		{
			bdia=true;
			System.out.println("Ingrese día ");
			valor = scanner.nextLine().toString();
			bdia = isNumeric(valor);
			if(bdia) {
				dia= Integer.parseInt(valor);
				if(dia < 1 || dia >30) {
					bdia= false;
				}
			}else {
				bdia= false;
			}
			
		}while (bdia!= true);
		
	
		do
		{
			bmes=true;
			System.out.println("Ingrese mes ");
			mes= scanner.nextInt();
			if(mes < 1 || mes >12) {
				bmes= false;
			}
			
		}while (bmes != true);
		
		do
		{
			System.out.println("Ingrese año > 1900 ");
			anio= scanner.nextInt();
			
		}while (anio <1900);

		System.out.println("La fecha es : "+dia+"-"+mes+"-"+anio);
		
		scanner.close();
		
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
