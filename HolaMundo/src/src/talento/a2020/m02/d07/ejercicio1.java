package src.talento.a2020.m02.d07;

import java.util.Scanner;

public class ejercicio1 {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese codigo del producto");
		String sCodigo = scan.nextLine();
		
		System.out.println("Ingrese nombre del producto");
		String sNombre = scan.nextLine();
		
		System.out.println("Ingrese precio del producto");
		Long lPrecio = scan.nextLong();
		
		Producto producto = new Producto();
		producto.setsCodigo(sCodigo);
		producto.setsNombre(sNombre);
		producto.setlPrecio(lPrecio);
		
		System.out.println(" Codigo: "+ producto.getsCodigo());
		System.out.println(" Nombre: "+ producto.getsNombre());
		System.out.println(" precio: "+ producto.getlPrecio());
		
		scan.close();
	}
}
