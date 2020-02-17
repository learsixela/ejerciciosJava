package src.talento.a2020.m02.d13;

import java.util.Date;

public class Productos {

	Date fecha_caducidad;
	Integer iNumLote;
	
	public Productos() {}
	
	public Productos(Date fecha_caducidad, Integer iNumLote) {
		super();
		this.fecha_caducidad = fecha_caducidad;
		this.iNumLote = iNumLote;
	}

	public Date getFecha_caducidad() {
		return fecha_caducidad;
	}

	public void setFecha_caducidad(Date fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}

	public Integer getiNumLote() {
		return iNumLote;
	}

	public void setiNumLote(Integer iNumLote) {
		this.iNumLote = iNumLote;
	}
	
	
}
