package src.talento.a2020.m02.d11;

import java.util.Scanner;

public class Persona {
	
	String sNombre,sRut, sexo;
	int iEdad; 
	double peso, altura;
	Scanner scan = new Scanner(System.in);

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

	public int esMayorDeEdad() {
		System.out.println("Ingrese su edad");
		int edad = scan.nextInt();
		
		if(edad >= 18) {
			return 1;
		} 
		return 0;
		
	}
	public void comprobarSexo(char[] cs) {

		String sSexo ="H";
		if(cs.toString().toUpperCase().equals("M")) {
			 sSexo ="M";
		}
	}
	
	public void calcularIMC(double peso, double altura) {
		
		double imc = (peso/(altura*altura));
		
		System.out.println("Su IMC es : "+ imc);
		
		int indiceMC= nivelIMC(imc);
		
		switch (indiceMC) {
		case -1:
			System.out.println(", Se encuentra bajo de peso");
			break;
		case 0:
			System.out.println(", Su peso es Normal");
			break;
		case 1:
			System.out.println(", Tiene sobre peso");
			break;
		default:
			break;
		}
	}
	
	private int nivelIMC(double imc) {
		
		if(imc < 20  ) {
			return -1;
		}else if(imc >= 20 && imc <= 25) {
			return 0;
		}else if(imc > 25) {
			return 1;
		}
				
		return 0;
	}

	
	@Override
	public String toString() {
		return "Persona [sNombre=" + sNombre + ", sRut=" + sRut + ", sexo=" + sexo + ", iEdad=" + iEdad + ", peso="
				+ peso + ", altura=" + altura + "]";
	}






}
