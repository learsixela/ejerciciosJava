package src.talento.a2020.m02.d25;

import java.util.Date;
import java.util.Scanner;

public class Kromi extends Carro{
	Scanner scan = new Scanner(System.in);
	Integer iAnioFabricacion;
	String Marca;
	
	public Integer getiAnioFabricacion() {
		return iAnioFabricacion;
	}
	public void setiAnioFabricacion(Integer iAnioFabricacion) {
		this.iAnioFabricacion = iAnioFabricacion;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	
	public Kromi() {
		super();
		agregarAnioFabricacion();
		agregarMarca();
	}
	public Kromi(Integer iCantOcupantes, Integer iFila, Integer iColumna, Date dFechaIngreso) {
		super(iCantOcupantes, iFila, iColumna, dFechaIngreso);
		agregarAnioFabricacion();
		agregarMarca();
	}
	public Kromi(Integer iAnioFabricacion, String marca) {
		super();
		this.iAnioFabricacion = iAnioFabricacion;
		this.Marca = marca;
	}
	
	public void agregarAnioFabricacion() {
		System.out.println("Ingrese año fabricación");
		this.iAnioFabricacion = scan.nextInt();
	}
	public void agregarMarca() {
		System.out.println("Ingrese Marca de Kromi");
		this.Marca = scan.nextLine();
	}

}
