package src.talento.a2020.m01.d30;

import java.util.Scanner;

public class arreglos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("******* Arreglos *******");

		int tamanio =2;
		int arreglo[];
		arreglo = new int[tamanio];
		System.out.println(arreglo.length);
		
		//creacion del arreglo
		int arreglo2[] = new int [tamanio];
		System.out.println(" el tamaño del arreglo es "+ arreglo2.length);
		
		//redimension del arreglo
		arreglo2 = new int [4];
		System.out.println(" el tamaño del arreglo es "+ arreglo2.length);
		
		//Otro tipo de arreglos
		
		byte[ ] bEdad = new byte[4];
		System.out.println(" arreglo byte "+ bEdad);

        short[ ] shEdad = new short[4];
        System.out.println(" arreglo short "+ shEdad);

        int[ ] iEdad = new int[4];
        System.out.println(" arreglo int "+ iEdad);
        
        long[ ] lEdad = new long[4];
        System.out.println(" arreglo long "+ lEdad);

        float[ ] fEstatura = new float[3];
        System.out.println(" arreglo float "+ fEstatura);

        double[ ] dEstatura = new double[3];
        System.out.println(" arreglo double "+ dEstatura);

        boolean[ ] bEstado = new boolean[5];
        System.out.println(" arreglo boolean "+ bEstado);

        char[ ] cSexo = new char[2];
        System.out.println(" arreglo char "+ cSexo.length);

        String[ ] sNombre = new String[2];
        System.out.println(" arreglo string "+ sNombre);
        
		
		scan.close();
	}
}
