package src.talento.a2020.m02.d12;

public class Padre {

	protected String sNombre, sPais;
	protected Integer iAnios; 
	
	public Padre() {
		
	}

	public Padre(String sNombre, String sPais, Integer iAnios) {
		super();
		this.sNombre = sNombre;
		this.sPais = sPais;
		this.iAnios = iAnios;
	}

	public String getsNombre() {
		return sNombre;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	public String getsPais() {
		return sPais;
	}

	public void setsPais(String sPais) {
		this.sPais = sPais;
	}

	public Integer getiAnios() {
		return iAnios;
	}

	public void setiAnios(Integer iAnios) {
		this.iAnios = iAnios;
	}
	
}
