package src.talento.a2020.m02.d20;

import java.util.ArrayList;

public class Contacto extends Telefono{
	ArrayList<Contacto> arrContacto = new ArrayList<Contacto>(); 
	String sNombre;
	
	public Contacto() {
		
	}

	public Contacto(Integer iPrefijo, Long lNumero) {
		super(iPrefijo, lNumero);
		// TODO Auto-generated constructor stub
	}

	public String getsNombre() {
		return sNombre;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	@Override
	public void agregarContacto(Contacto nuevo) {
		arrContacto.add(nuevo);
	}
	

}
