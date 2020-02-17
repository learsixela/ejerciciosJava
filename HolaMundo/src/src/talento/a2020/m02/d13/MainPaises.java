package src.talento.a2020.m02.d13;

import java.util.Scanner;
public class MainPaises {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		Capital capital=new Capital();
		boolean resp=true;
		do {
		System.out.println("*********");
		System.out.println("Ingrese su opción");
		System.out.println("(0)Salir; (1) Ingresar; (2) Buscar; (3) Modificar; (4) Eliminar");
		System.out.println("*********");
		int key = scan.nextInt();
		switch (key) {
		case 0:
			resp=false;
			break;
		case 1:
			capital.ingresoCapital();
			break;
		case 2:
			capital.buscarCapitalXNombre();
			break;
		case 3:
			capital.modificarCapital();
			break;
		case 4:
			capital.eliminarCapital();
			break;						
		}
		} while (resp);
	}
}