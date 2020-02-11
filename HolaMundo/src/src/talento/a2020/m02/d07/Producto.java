package src.talento.a2020.m02.d07;

public class Producto {

	String sCodigo,sNombre;
	Long lPrecio;
	public Producto() {
	}
	public Producto(String sCodigo, String sNombre, Long lPrecio) {
		super();
		this.sCodigo = sCodigo;
		this.sNombre = sNombre;
		this.lPrecio = lPrecio;
	}
	@Override
	public String toString() {
		return "Producto [sCodigo=" + sCodigo + ", sNombre=" + sNombre + ", lPrecio=" + lPrecio + "]";
	}
	public String getsCodigo() {
		return sCodigo;
	}
	public void setsCodigo(String sCodigo) {
		this.sCodigo = sCodigo;
	}
	public String getsNombre() {
		return sNombre;
	}
	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}
	public Long getlPrecio() {
		return lPrecio;
	}
	public void setlPrecio(Long lPrecio) {
		this.lPrecio = lPrecio;
	}
	
	
	

}
