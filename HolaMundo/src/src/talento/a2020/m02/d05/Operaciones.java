package src.talento.a2020.m02.d05;

import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Persona pers= new Persona();
		System.out.println("Ingrese nombre");
		String nom = scan.nextLine();
		pers.setNombre(nom);
		System.out.println("Ingrese apellido");
		String apell = scan.nextLine();
		pers.setApellido(apell);
		System.out.printf("Ingrese direccion");
		String dire = scan.nextLine();
		pers.setDireccion(dire);
		System.out.println("Ingrese rut");
		String ruts = scan.nextLine();
		pers.setRut(ruts);
		
		scan.close();
		System.out.println(pers.toString());
	}

}
