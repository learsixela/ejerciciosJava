/**
 * 
 */
package src.talento.a2020.m02.d25;

import java.util.Date;

/**
 * @author israelpalma
 *
 */
public class Trupalla extends Carro{
	
	Integer iNivelArmadura=0;
	String sNombreArmadura;
	
	public Trupalla() {
		super();
	}
	
	public Trupalla(Integer iNivelArmadura, String sNombreArmadura) {
		super();
		this.iNivelArmadura = iNivelArmadura;
		this.sNombreArmadura = sNombreArmadura;
	}
	
	public Trupalla(Integer iCantOcupantes, Integer iFila, Integer iColumna, Date dFechaIngreso) {
		super(iCantOcupantes, iFila, iColumna, dFechaIngreso);
	}
	
	public Integer getiNivelArmadura() {
		return iNivelArmadura;
	}
	public void setiNivelArmadura(Integer iNivelArmadura) {
		this.iNivelArmadura = iNivelArmadura;
	}
	public String getsNombreArmadura() {
		return sNombreArmadura;
	}
	public void setsNombreArmadura(String sNombreArmadura) {
		this.sNombreArmadura = sNombreArmadura;
	}
	
	
}
