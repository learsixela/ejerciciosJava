package src.talento.a2020.m02.d20;

import java.util.Scanner;

public class MainTelefono {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese nombre del contacto");
		String sNombre = scan.nextLine(); 
		System.out.println("Ingrese el prefigo sin +");
		Integer iPrefijo = scan.nextInt();
		System.out.println("Ingrese el número de telefono");
		Long lNumero = scan.nextLong();
		
		Contacto oContacto = new Contacto();
		Celular oCelular = new Celular();
		
		oContacto.setsNombre(sNombre);
		oContacto.setlNumero(lNumero);
		oContacto.setiPrefijo(iPrefijo);
		
		oContacto.agregarContacto(oContacto);
		
		

	}

}
