package src.talento.a2020.m01.d28;

public class StringClass {

	public static void main(String[] args) {
		String texto = "Talento digital";
		System.out.println("El tamaño del texto es"+texto.length());
		
		System.out.println("Character de la 8 posicion = "+texto.charAt(8));
		
		System.out.println("Palabra desde el tercer caracater"+texto.substring(3));

		System.out.println("contando la palabra = "+texto.substring(2,5));
		
		System.out.println("String Concatenado = "+texto.substring(0,6).concat(texto.substring(8,15)));
		
		System.out.println("Indice de primera aparición letra a: "+texto.indexOf('a'));
		System.out.println("indice de la letra a comenzando desde la primera a = "+texto.indexOf('a', 2));
		
		
		System.out.println("Comprobando la igualdad de String de Talento con talento"+ "Talento".equalsIgnoreCase("talento"));
		
		System.out.println("Comprobando la igualdad de String de Talento con Talento "+ "Talento".equalsIgnoreCase("Talento"));
	
		System.out.println("Comprobando la igualdad de String de talento con talento"+ "talento".equalsIgnoreCase("talento"));
	
		String s1 = "TaLeNTo";
		String s2 = "tAlEntO";
		int salida = s1.compareToIgnoreCase(s2);
		System.out.println("Si s1 = s2 : "+ salida);
		
		System.out.println("cambiando a minúsculas: "+"TALENTODIGITAL".toLowerCase());
		
		System.out.println("cambiando a minúsculas: "+"talentodigital".toUpperCase());
		
		System.out.println("String Original: TalentoDijital");
		System.out.println("Reemplazando j por g "+"TalentoDijital".replace('j','g'));
		
		
	}

}
