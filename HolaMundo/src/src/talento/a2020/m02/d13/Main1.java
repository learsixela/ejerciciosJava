package src.talento.a2020.m02.d13;

import java.util.ArrayList;
import java.util.Collection;

import src.talento.a2020.m02.d07.Producto;

public class Main1 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayPais = new ArrayList<>(); 
		
		for (int i = 0; i < 10; i++) {
			arrayPais.add(i, "hola"+i);
			
		}
		
		for (String sPais : arrayPais) {
			//System.out.println(sPais);
		}
		String arrString [] = {"","",""};
		
		System.out.println(arrayPais.size()+","+arrString.length);
		
		String nombre ="Israel";
		
		System.out.println(nombre.length());
		
		ArrayList<Productos> arrayProductos = new ArrayList<Productos>(); 
		
		Producto prod = new Producto();
		arrayProductos.addAll((Collection<? extends Productos>) prod);
		
	}

}
