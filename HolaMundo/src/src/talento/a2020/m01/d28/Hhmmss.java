package src.talento.a2020.m01.d28;
import java.util.Scanner;

public class Hhmmss {
	  
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
    //declaracion de variables
     Integer h,m,s; 
    
    System.out.println("Ingresar Hora");
    h=scan.nextInt();
    System.out.println("Ingresar Minutos");
    m=scan.nextInt();
    System.out.println("Ingresar Segundos");
    s=scan.nextInt();
    
    if(s==59&& m==59 && h==23){
      System.out.println("La hora es : 00:00:00");
      
    }else if (s==59){
      if(m==59){
        System.out.println("la hora es : "+(h+1)+":00:00");
      }else{
        System.out.println("la hora es : "+h+":"+(m+1)+":00");
      }
      
    }else if (s<59){
      
      System.out.println("la hora es : "+h+":"+m+":"+(s+1));

    }
 }
  
}