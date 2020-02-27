package src.talento.a2020.m02.d21;

//extiende de clase padre animal e implementa los metodos de tipoCrianza
public class Ave extends Animal implements TipoCrianza {
	// definicion de variables
	private String sNombre;
	private String sCrianza;

	public void printMensaje() {
		super.printMensaje();
		System.out.println("Soy un ave linda");
	}


	// setter and getter
	public String getsNombre() {
		return sNombre;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	public String getsCrianza() {
		return sCrianza;
	}

	public void setsCrianza(String sCrianza) {
		this.sCrianza = sCrianza;
	}

	// contructor con parametros
	public Ave(String especie, String sNombre, String sCrianza) {
		super(especie);
		this.sNombre = sNombre;
		this.sCrianza = sCrianza;
	}

//constructor del padre
	public Ave(String especie) {
		super(especie);
		// TODO Auto-generated constructor stub
	}

//metodo que retorna un string, que es implementado desde TipoCrianza(interface)
	public String getObtenerCrianza() {
		// TODO Auto-generated method stub

		return sCrianza;
	}

//metodo recibe un parametro de tipo String, que es implementado desde TipoCrianza(interface)
	public void setIngresarCrianza(String parametroRecibido) {
		// TODO Auto-generated method stub
		sCrianza = parametroRecibido;

	}

}