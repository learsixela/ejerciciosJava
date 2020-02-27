/**
 * 
 */
package src.talento.a2020.m02.d25;

import java.util.Date;
import java.util.Scanner;

/**
 * @author israelpalma
 *
 */
public class Caguano extends Carro{
	Scanner scan = new Scanner(System.in);
	Integer iTiro=0;
	String sColor;
	public Caguano() {
		super();
	}
	public Caguano(Integer iTiro, String sColor) {
		super();
		this.iTiro = iTiro;
		this.sColor = sColor;
	}
	public Caguano(Integer iCantOcupantes, Integer iFila, Integer iColumna, Date dFechaIngreso) {
		super(iCantOcupantes, iFila, iColumna, dFechaIngreso);
		// TODO Auto-generated constructor stub
	}
	
	public Integer getiTiro() {
		return iTiro;
	}
	public void setiTiro(Integer iTiro) {
		this.iTiro = iTiro;
	}
	public String getsColor() {
		return sColor;
	}
	public void setsColor(String sColor) {
		this.sColor = sColor;
	}
	
	public void agregarParametros() {
		System.out.println("Ingrese tiro");
		this.iTiro= scan.nextInt();
		System.out.println("Ingrese Color");
		this.sColor= scan.nextLine();
	}
	
	

}
