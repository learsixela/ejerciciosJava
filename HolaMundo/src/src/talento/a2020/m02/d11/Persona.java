package src.talento.a2020.m02.d11;

public class Persona {
	
	String sNombre,sRut, sexo;
	int iEdad; 
	double peso, altura;

	public Persona() {
		
	}
	
	public Persona(String sNombre, String sexo, int iEdad) {
		super();
		this.sNombre = sNombre;
		this.sexo = sexo;
		this.iEdad = iEdad;
	}

	public Persona(String sNombre, String sRut, String sexo, int iEdad, Double peso, Double altura) {
		super();
		this.sNombre = sNombre;
		this.sRut = sRut;
		this.sexo = sexo;
		this.iEdad = iEdad;
		this.peso = peso;
		this.altura = altura;
	}
	
	public String getsNombre() {
		return sNombre;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	public String getsRut() {
		return sRut;
	}

	public void setsRut(String sRut) {
		this.sRut = sRut;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getiEdad() {
		return iEdad;
	}

	public void setiEdad(int iEdad) {
		this.iEdad = iEdad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}








}
