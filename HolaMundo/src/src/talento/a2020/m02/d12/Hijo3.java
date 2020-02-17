package src.talento.a2020.m02.d12;

public class Hijo3 extends Persona{

	String adoptado;
	
	public Hijo3() {
	}
	
	public Hijo3(String nombre, String apellidos, int edad) {
		super(nombre, apellidos, edad);
	}
	
	public String getAdoptado() {
		return adoptado;
	}
	
	public void setAdoptado(String adoptado) {
		this.adoptado = adoptado;
	}

	public void metodoHijo3() {
        System.out.println("Nombre: " + getNombre() + ", apellido anterior " +  getApellidos() +
                " apellido adoptado: " + getAdoptado() );
	}
}
