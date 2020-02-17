package src.talento.a2020.m02.d12;

public class Hijo1 extends Padre{

	String puesto;
	Integer numero;
	
	public Hijo1() {
		super();
	}

	public Hijo1(String sNombre, String sPais, Integer iAnios) {
		super(sNombre, sPais, iAnios);
	}

	public Hijo1(String puesto, Integer numero) {
		super();
		this.puesto = puesto;
		this.numero = numero;
	}



}
