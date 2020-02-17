package src.talento.a2020.m02.d12;

public class Hijo2 extends Persona {

    //Campos específicos de la subclase.

    private String IdHijo2;

    //Constructor de la subclase: incluimos como parámetros al menos los del constructor de la superclase

	public Hijo2(String nombre, String apellidos, int edad) {
		super(nombre, apellidos, edad);
	}
	
    //Métodos específicos de la subclase

	public Hijo2() {
		super();
	}

	public String getIdHijo2() {
		return IdHijo2;
	}

	public void setIdHijo2(String idHijo2) {
		IdHijo2 = idHijo2;
	}

	public void mostrarNombreApellidosYCarnet() {

        System.out.println("Hijo de nombre: " + getNombre() + " " +  getApellidos() +
         " con RUT de hijo: " + getIdHijo2() ); 
    }
	
	public void metodoHijo() {
		System.out.println("nombre: " + getNombre() + ", apellido " +  getApellidos() +
		         ", edad"+ getEdad()+", RUT: " + getIdHijo2() ); 
	}

	public void ingreso() {
		Hijo2 hijo2 = new Hijo2 ();
		hijo2.setIdHijo2("RUT 22-387-11");
		hijo2.mostrarNombreApellidosYCarnet();
		hijo2.metodoHijo();
		hijo2.metodoPadre();
		
	}

	
	

}