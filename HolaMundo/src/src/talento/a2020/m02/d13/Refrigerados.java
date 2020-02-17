package src.talento.a2020.m02.d13;

import java.util.Date;

public class Refrigerados extends Productos{

	String sCodigoSupervision;
	
	public Refrigerados() {
		
	}

	public Refrigerados(Date fecha_caducidad, Integer iNumLote) {
		super(fecha_caducidad, iNumLote);
	}

	public Refrigerados(String sCodigoSupervision) {
		super();
		this.sCodigoSupervision = sCodigoSupervision;
	}

	public String getsCodigoSupervision() {
		return sCodigoSupervision;
	}

	public void setsCodigoSupervision(String sCodigoSupervision) {
		this.sCodigoSupervision = sCodigoSupervision;
	}
	
	

}
