
package src.talento.a2020.m02.d20;

public abstract class Telefono {

	Integer iPrefijo;
	Long lNumero;
	
	public Telefono() {
		
	}

	public Telefono(Integer iPrefijo, Long lNumero) {
		super();
		this.iPrefijo = iPrefijo;
		this.lNumero = lNumero;
	}


	public Integer getiPrefijo() {
		return iPrefijo;
	}

	public void setiPrefijo(Integer iPrefijo) {
		this.iPrefijo = iPrefijo;
	}

	public Long getlNumero() {
		return lNumero;
	}

	public void setlNumero(Long lNumero) {
		this.lNumero = lNumero;
	}

	/*public  void agregarContacto(Contacto nuevo) {
		
	} */
	
	public abstract void agregarContacto(Contacto nuevo);
	
	public void realizarLlamada() {
		
	}
	
	public void buscarNumero() {
		
	}
}
