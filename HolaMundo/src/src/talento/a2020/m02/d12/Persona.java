package src.talento.a2020.m02.d12;

//Código de la clase Persona 

public class Persona {

  private String nombre;
  private String apellidos;
  private int edad;

  //Constructores
  public Persona () {};
  
  public Persona (String nombre, String apellidos, int edad) {

      this.nombre = nombre;
      this.apellidos = apellidos;
      this.edad = edad;                   
  }

  //Métodos
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	protected void metodoPadre() {
		System.out.println("Metodo del padre");
	}
	
} //Cierre de la clase
