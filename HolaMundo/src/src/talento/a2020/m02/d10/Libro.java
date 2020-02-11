package src.talento.a2020.m02.d10;

import java.util.ArrayList;
import java.util.Scanner;

public class Libro {
	ArrayList<Libro> arregloLibro= new ArrayList<Libro>();
	Scanner scan = new Scanner(System.in);
	String sTitulo,sAutor;
	Integer iTotalEjemplares=0, iTotalPrestados=0;
	
	
	public Libro() {
		
	}

	public Libro(String sTitulo, String sAutor, Integer iTotalEjemplares, Integer iTotalPrestados) {
		super();
		this.sTitulo = sTitulo;
		this.sAutor = sAutor;
		this.iTotalEjemplares = iTotalEjemplares;
		this.iTotalPrestados = iTotalPrestados;
	}

	@Override
	public String toString() {
		return "Libro [sTitulo=" + sTitulo + ", sAutor=" + sAutor + ", iTotalEjemplares=" + iTotalEjemplares
				+ ", iTotalPrestados=" + iTotalPrestados + "]";
	}

	public String getsTitulo() {
		return sTitulo;
	}

	public void setsTitulo(String sTitulo) {
		this.sTitulo = sTitulo;
	}

	public String getsAutor() {
		return sAutor;
	}

	public void setsAutor(String sAutor) {
		this.sAutor = sAutor;
	}

	public Integer getiTotalEjemplares() {
		return iTotalEjemplares;
	}

	public void setiTotalEjemplares(Integer iTotalEjemplares) {
		this.iTotalEjemplares = iTotalEjemplares;
	}

	public Integer getiTotalPrestados() {
		return iTotalPrestados;
	}

	public void setiTotalPrestados(Integer iTotalPrestados) {
		this.iTotalPrestados = iTotalPrestados;
	}

	/**
	 * ingreso de los libros
	 * */
	
	public void ingreso() {
		Libro libros = null;
		System.out.println("");
		System.out.println("*** Libros en biblioteca ***");
		System.out.println("");
		System.out.println("Ingrese el cantidad de distintos libros que ingresara ");
		int total = scan.nextInt();
		
		for (int i = 0; i < total; i++) {
			System.out.println("****************************");
			System.out.println("Ingrese titulo del libro");
			String ssTitulo = scan.next();
			System.out.println("Ingrese Autor");
			String ssAutor = scan.next();
			System.out.println("Ingrese el stock del libro");
			Integer iiTotalEjemplares = scan.nextInt();
			System.out.println("");
			System.out.println("");
			
			libros = new Libro();
			libros.setsAutor(ssAutor);
			libros.setsTitulo(ssTitulo);
			libros.setiTotalEjemplares(iiTotalEjemplares);
			
			arregloLibro.add(libros);
		}
	}
	
	public void ingreso2() {
		System.out.println("");
		System.out.println("*** Libros en biblioteca ***");
		System.out.println("");
		
		System.out.println("Ingrese el cantidad de distintos libros que ingresara");
		int numLibros = scan.nextInt();
		
		Libro arrayLibros[] = new Libro[numLibros];
		
		for (int i = 0; i < numLibros; i++) {
	    	Libro lib = new Libro();
	    	System.out.println("Ingrese titulo del libro");
			String ssTitulo = scan.next();
			System.out.println("Ingrese Autor");
			String ssAutor = scan.next();
			System.out.println("Ingrese el stock del libro");
			Integer iiTotalEjemplares = scan.nextInt();
			
			lib.setsTitulo(ssTitulo);
			lib.setsAutor(ssAutor);
			lib.setiTotalEjemplares(iiTotalEjemplares);
				
	        arrayLibros[i] = lib;
		}
      
      for (int i = 0; i < arrayLibros.length; i++) {
        System.out.println(arrayLibros[i]);
        System.out.println(arrayLibros[i].getsTitulo());
      }
	}
	
	/**
	 * funcion que realiza el prestamo de los libros
	 * */
	public void prestamo() {
		System.out.println("");
		System.out.println("*** Libros en biblioteca ***");
		System.out.println("");
		
		if (arregloLibro.size()>0) {
		
			for(int i = 0; i< arregloLibro.size(); i++)
	            System.out.println(i + " Libro : "+arregloLibro.get(i).sTitulo);
			
			System.out.println("Ingrese el numero del libro que solicita");
			int numero = scan.nextInt();
			
			int totalLibros = arregloLibro.get(numero).iTotalEjemplares;
			
			if(totalLibros > 0) {
				//3
				System.out.println("Si existe stock del libro");
				arregloLibro.get(numero).iTotalEjemplares = totalLibros - 1;
				
			}else {
				System.out.println("No existe stock del libro");
			}
		}else {
			System.out.println("No existen libros en la biblioteca");
		}
	}
	
	/**
	 * funcion que realiza la entrega del libro
	 * */
	
	public void devolucion() {
		System.out.println("");
		System.out.println("*** Libros en biblioteca ***");
		System.out.println("");
		
		if (arregloLibro.size()>0) {
			for(int i = 0; i< arregloLibro.size(); i++)
	            System.out.println(i + " Libro : "+arregloLibro.get(i).sTitulo+" stock " + +arregloLibro.get(i).iTotalEjemplares);
			
			System.out.println("Ingrese el numero del libro que devuelve");
			int numero = scan.nextInt();
			
			int totalLibros = arregloLibro.get(numero).iTotalEjemplares;
	
			arregloLibro.get(numero).iTotalEjemplares = totalLibros + 1;
		}else {
			System.out.println("No existen libros en la biblioteca");
		}

	}
	
	public void stock() {
		System.out.println("");
		System.out.println("*** Stock Libros en biblioteca ***");
		System.out.println("");
		
	}
}
