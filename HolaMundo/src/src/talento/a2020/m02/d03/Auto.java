package src.talento.a2020.m02.d03;

public class Auto {

	String nombre, marca, color;
	int velocidad;
	
	public Auto() {
		// TODO constructor vacío
	}
	
	public Auto(String nombre, String marca,
               int velocidad, String color)
	{
	    this.nombre = nombre;
	    this.marca= marca;
	    this.velocidad = velocidad;
	    this.color = color;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return "Auto [nombre=" + nombre + ", marca=" + marca + ", color=" + color + ", velocidad=" + velocidad + "]";
	}
	
	

}
