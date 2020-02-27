/**
 * 
 */
package src.talento.a2020.m02.d25;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author israelpalma
 *
 */
public class Carro {

	/**
	 * 
	 */

	Integer iCantOcupantes=0,iFila,iColumna;
	Date dFechaIngreso;
	
	public Carro() {
		ingresoDatos();
	}

	public Carro(Integer iCantOcupantes, Integer iFila, Integer iColumna, Date dFechaIngreso) {
		super();
		this.iCantOcupantes = iCantOcupantes;
		this.iFila = iFila;
		this.iColumna = iColumna;
		this.dFechaIngreso = dFechaIngreso;
	}

	public Integer getiCantOcupantes() {
		return iCantOcupantes;
	}

	public void setiCantOcupantes(Integer iCantOcupantes) {
		this.iCantOcupantes = iCantOcupantes;
	}

	public Integer getiFila() {
		return iFila;
	}

	public void setiFila(Integer iFila) {
		this.iFila = iFila;
	}

	public Integer getiColumna() {
		return iColumna;
	}

	public void setiColumna(Integer iColumna) {
		this.iColumna = iColumna;
	}

	public Date getdFechaIngreso() {
		return dFechaIngreso;
	}

	public void setdFechaIngreso(Date dFechaIngreso) {
		this.dFechaIngreso = dFechaIngreso;
	}
	
	public void ingresoDatos() {
		Scanner scan = new Scanner(System.in);
		System.out.println("***********************");
		System.out.println("Ingrese cantidad de ocupantes");
		this.iCantOcupantes = scan.nextInt();
	    
		try {
			System.out.println("Ingrese fecha de ingreso, DD/MM/YYYY");
			String sFecha = scan.next();
			
			Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sFecha);
		} catch (ParseException e) {
			System.out.println("Error en el ingreso de fecha");
			System.out.println();
		}   
		
		System.out.println();
	}
	

}
