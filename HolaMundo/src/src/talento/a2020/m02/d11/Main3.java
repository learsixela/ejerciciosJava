package src.talento.a2020.m02.d11;

import java.util.Scanner;

public class Main3 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Persona persona = new Persona();
		
		System.out.println("Ingrese nombre");
		String nombre = scan.next();
		System.out.println("Ingrese RUT");
		String rut = scan.next();
		System.out.println("Ingrese sexo (M) Mujer (H) Hombre ");
		String cIngresoSexo =  scan.next();	
		System.out.println("Ingrese peso");
		String peso = scan.next();
		System.out.println("Ingrese altura");
		String altura = scan.next();
		
		//llamado a funcion con paso de parametros y sin retorno
		persona.comprobarSexo(cIngresoSexo.toCharArray());
		
		//llamado a funcion con paso de parametros y con retorno
		int edad = persona.esMayorDeEdad();

		//validación retorno de edad
		if(edad == 1) {
			System.out.println(nombre+ ", Es mayor de edad");
		}else {
			System.out.println(nombre+ " Es menor de edad");
		} 
		//mensaje por pantalla
		System.out.println(", y su rut es : "+ rut);
		System.out.println();
		
		// validcion del peso
		String splitPeso = peso.replace(",", ".");
		double dPeso = Double.parseDouble(splitPeso);
		String splitAltura = altura.replace(",", ".");
		double dAltura = Double.parseDouble(splitAltura);
		persona.calcularIMC(dPeso, dAltura);
		
		scan.close();
	}

}
