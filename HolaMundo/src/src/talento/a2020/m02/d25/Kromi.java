package src.talento.a2020.m02.d25;

import java.util.Date;

public class Kromi extends Carro{
	
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
	}
	public Kromi(Integer iCantOcupantes, Integer iFila, Integer iColumna, Date dFechaIngreso) {
		super(iCantOcupantes, iFila, iColumna, dFechaIngreso);
	}
	public Kromi(Integer iAnioFabricacion, String marca) {
		super();
		this.iAnioFabricacion = iAnioFabricacion;
		Marca = marca;
	}

}
