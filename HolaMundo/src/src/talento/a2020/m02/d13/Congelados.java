package src.talento.a2020.m02.d13;

import java.util.Date;

public class Congelados extends Productos{

	String sTemperaturaCongelacion;

	public Congelados() {}
	public Congelados(String sTemperaturaCongelacion) {
		super();
		this.sTemperaturaCongelacion = sTemperaturaCongelacion;
	}
	public Congelados(Date fecha_caducidad, Integer iNumLote) {
		super(fecha_caducidad, iNumLote);
	}
	public String getsTemperaturaCongelacion() {
		return sTemperaturaCongelacion;
	}
	public void setsTemperaturaCongelacion(String sTemperaturaCongelacion) {
		this.sTemperaturaCongelacion = sTemperaturaCongelacion;
	}

	
	
}
