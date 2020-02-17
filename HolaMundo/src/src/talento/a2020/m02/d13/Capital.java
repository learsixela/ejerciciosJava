package src.talento.a2020.m02.d13;

import java.util.ArrayList;
import java.util.Scanner;

public class Capital extends Pais {
			Scanner scan=new Scanner(System.in).useDelimiter("\n");
			ArrayList<Capital> arrCapital =new ArrayList<Capital>();
			Integer posicion=null;
		String sMunicipio;
	public Capital() {
		// TODO Auto-generated constructor stub
	}
	public Capital(String sContinente, String sZona,String sNombre) {
		super(sContinente, sZona,sNombre);
		// TODO Auto-generated constructor stub
	}
	public Capital(String sMunicipio) {
		super();
		this.sMunicipio = sMunicipio;
	}
	public String getsMunicipio() {
		return sMunicipio;
	}
	public void setsMunicipio(String sMunicipio) {
		this.sMunicipio = sMunicipio;
	}
	public void ingresoCapital() {
		System.out.println("Cuantas capitales desea ingresar");
		int iQcapitales=scan.nextInt();
		for (int i = 0; i < iQcapitales; i++) {
			Capital capital=new Capital();
		//scan.useDelimiter("\n");
		System.out.println("Ingresar nombre de capital");
		String sNombre=scan.next();
		System.out.println("Ingresar Municipio");
		String sMunicipio=scan.next();
		//Seteando valores a nuestro objeto capital.
		capital.setsMunicipio(sMunicipio);
		capital.setsNombre(sNombre);
		//Ahora agregamos nuestro objeto al arreglo
		arrCapital.add(capital);
		}
		for (int i = 0; i < arrCapital.size(); i++) {
			//Recorremos arreglo e imprimimos dato de los objetos.
			//System.out.println(arrCapital.get(i).sMunicipio);
			//System.out.println(arrCapital.get(i).sNombre);
		}
	}
    public void buscarCapitalXNombre() {
    	System.out.println("Ingrese nombre de la capital a buscar");
    	String sNomCap=scan.next();
    	boolean encontrada=false;
    	for (int i = 0; i < arrCapital.size(); i++) {
			String scomNom =arrCapital.get(i).sNombre;
			Capital capital=new Capital();
			capital=arrCapital.get(i);
		//comparacion de 2 String
			if (sNomCap.equals(scomNom)) {
				System.out.println(arrCapital.get(i).sMunicipio);
				System.out.println(arrCapital.get(i).sNombre);
				System.out.println("Se encuentra en la posicion: " +i);
				posicion=i;
				encontrada=true;
			}
		}
		if (!encontrada) {
			System.out.println("La capital ingresada no se encuentra en el arreglo");
		}
    }
	public void modificarCapital() {
		// TODO Auto-generated method stub
		if (arrCapital.size()>0) {
			this.buscarCapitalXNombre();	
			if (posicion!=null && posicion>=0) {
				System.out.println("Ingresar Nuevo Nombre de Capital");
				String sNNombrecap=scan.next();
				arrCapital.get(posicion).sNombre=sNNombrecap;
			}
			posicion=null;
		}else {
			System.out.println("Falta ingresar alguna capital");
			System.out.println("Desea ingresar una Capital 1.SI");
			int resp=scan.nextInt();
			if (resp==1) {
				this.ingresoCapital();
			}
		}
	}
	public void eliminarCapital() {
		if (arrCapital.size()>0) {
			this.buscarCapitalXNombre();	
			if (posicion!=null && posicion>=0) {
				System.out.println("Se eliminara la siguiente capital " +arrCapital.get(posicion).sNombre);	
				arrCapital.remove(posicion);
			}
			posicion=null;
		}else {
			System.out.println("Falta ingresar alguna capital");
			System.out.println("Desea ingresar una Capital 1.SI");
			int resp=scan.nextInt();
			if (resp==1) {
				this.ingresoCapital();
			}
		}
	}
}