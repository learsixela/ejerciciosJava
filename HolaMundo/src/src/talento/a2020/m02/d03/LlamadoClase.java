package src.talento.a2020.m02.d03;

import java.util.Scanner;

public class LlamadoClase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//intancia de una clase
		Auto auto1 = new Auto();
		
		// llenado de atributos
		auto1.color="rojo";
		/*auto1.nombre = "cars";
		auto1.marca = "Charade";
		auto1.velocidad = 100;*/

		System.out.println(auto1.toString());
		
		//
		Auto auto2 = new Auto("mani","Mercedez", 100, "Azul");
		
        System.out.println(auto2.toString());
        
        System.out.println(auto1.getColor());
        
        auto1.setColor("amarillo");
        
        System.out.println(auto1.getColor());
        
        Estudiante estudiante = new Estudiante();
        
        System.out.println("Ingrese edad");
        int edad = scan.nextInt();
        
        estudiante.setEdad(edad);
        
        if(estudiante.getEdad() >= 18) {
        	System.out.println("es mayor de edad "+ estudiante.getEdad());
        }else {
        	System.out.println("es menor de edad "+ estudiante.getEdad());
        }
        
        //System.out.println(estudiante.toString());
	}

}
