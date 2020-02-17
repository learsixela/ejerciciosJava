package src.talento.a2020.m02.d12;

public class Main {

	public static void main(String[] args) {
		
		//Hijo2 hijo2 = new Hijo2 ("Juan", "Hernández García", 33);
		Hijo2 hijo2 = new Hijo2 ();
		hijo2.ingreso();
		
		Hijo2 hijob = new Hijo2();
		hijob.setNombre("Israel");
		hijob.setApellidos("Palma");
		hijob.setEdad(39);
		hijob.setIdHijo2("312321");
		
		hijob.metodoHijo();
		
		Hijo3 h3 = new Hijo3();
		h3.setAdoptado(" laskjfhg");
		h3.metodoHijo3();
		h3.metodoPadre();
		
		Persona persona= new Persona();
		persona.metodoPadre();
		
		
	}

}
