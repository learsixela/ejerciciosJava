package src.talento.a2020.m01.d31;

import java.util.Scanner;

public class BuenasPracticas {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Integer option = 0;
	Boolean exit=true;
	do{
	System.out.println("");
	System.out.println("******* Menu Principios Programación *******");
	System.out.println("");
	System.out.println(" (0) Exit");
	System.out.println(" (1) DRY - Don’t repeat yourself.");  
	System.out.println(" (2) Abstraction Principle.");
	System.out.println(" (3) KISS (Keep it simple, stupid!).");
	System.out.println(" (4) Avoid Creating a YAGNI (You aren’t going to need it).");
	System.out.println(" (5) Do the simplest thing that could possibly work.");
	System.out.println(" (6) Don’t make me think. ");
	System.out.println(" (7) Open/Closed Principle."); 
	System.out.println(" (8) Write Code for the Maintainer.");
	System.out.println(" (9) Principle of least astonishment.");
	System.out.println(" (10) Single Responsibility Principle.");
	System.out.println(" (11)Minimize Coupling.");
	System.out.println(" (12) Maximize Cohesion.");
	System.out.println(" (13)Hide Implementation Details.");
	System.out.println(" (14) Law of Demeter.");
	System.out.println(" (15)Avoid Premature Optimization.");
	System.out.println(" (16)Code Reuse is Good.");
	System.out.println(" (17)Separation of Concerns.");
	System.out.println(" (18) Embrace Change.");
	System.out.println("");
	System.out.println("***************************************");
	
	do {
	System.out.println(" Select your option");
	option = scan.nextInt();
	if(option< 0) {
		option = 19;
	}
	}while(option > 18);
	
	switch (option) {
	case 0:
		System.out.println("See you later"); 
		exit = false;
		break;
	case 1:
			dry();
			break;
	case 2:
		 abstraction();
		break;
	case 3:
		kiss();
		break;
	case 4:
		yagni();
		break;
	case 5:
		simplest();
		break;
	case 6:
		dontMake();
		break;
	case 7:
		openClose();
		break;
	case 8:
		
		break;
	case 9:
		
		break;
	case 10:
		
		break;
	case 11:
		
		break;
	case 12:
		
		break;
	case 13:
		
		break;
	case 14:
		
		break;
	case 15:
		
		break;
	case 16:
		
		break;
	case 17:
		
		break;
	case 18:
	
	break;
	default:
		break;
	}
	
	System.out.flush();
	}while(exit==true);
	
	scan.close();
	}
	
	public static boolean dry() {
		
		System.out.println("***** DRY ****");
		System.out.println(" No repetirse a si mismo");
		System.out.println(" Evitar la repetición en todas sus posibilidades");
		System.out.println(" NO REPETIR CONOCIMIENTO");
		return false;
	}
	public static boolean abstraction() {
		System.out.println("***** Abstraction Principle ****");
		System.out.println(" Implementación en un sólo lugar de la funciones o métodos");
		return false;
	}
	
	public static boolean kiss() {
		System.out.println("***** Keep it simple , stupid! ****");
		System.out.println(" mantener un codigo simple y facil de entender");
		System.out.println(" menos código, menos bugs.");
		return false;
	}
	
	public static boolean yagni() {
		System.out.println("***** Avoid Creating YAGNI ****");
		System.out.println(" Evitar crear algo que no sera necesario a futuro");
		System.out.println(" perdidad e tiempo");
		System.out.println(" Definir correctamente");
		System.out.println(" Hace el software más complicado");

		return false;
	}
	
	public static boolean simplest() {
		System.out.println("***** Do the simpplest thing that... ****");
		System.out.println(" Hacer lo mas simple, que funcione.");
		
		return false;
	}
	
	public static boolean dontMake() {
		System.out.println("***** Don´t Make me think ****");
		System.out.println(" Evitar que otros se pregunten: como lo hago");
		System.out.println(" mantener nombres de funciones y variables relevantes a su función");
		return false;
	}
	public static boolean openClose() {
		
		System.out.println("");
		return false;
	}
	
}
