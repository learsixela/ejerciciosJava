/**
 * 
 */
package src.talento.a2020.m02.d25;

import java.util.Date;

/**
 * @author israelpalma
 *
 */
public class Caguano extends Carro{
	
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
	
	

}
