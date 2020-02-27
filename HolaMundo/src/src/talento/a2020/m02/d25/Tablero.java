/**
 * 
 */
package src.talento.a2020.m02.d25;

import java.util.ArrayList;

/**
 * @author israelpalma
 *
 */
public class Tablero {

	Integer tamCarro=18;
	Carro arregloCarro[] = new Carro[tamCarro];
	ArrayList<Carro> arregloCarros= new ArrayList<Carro>();
	Integer iPuntajeTotal=0;
	
	int fila=15, columna=15;
	String matriz[][] = new String [fila][columna];
	
	public void matrizTablero() {
		
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				matriz [i][j] = "0";
			}
		}	
		
		System.out.println("***********");
		System.out.println("Kromis");
		llenarMatrizKromis();
		System.out.println("Caguano");
		llenarMatrizCaguano();
		System.out.println("Trupallas");
		llenarMatrizTrupalla();
		System.out.println("***********");
	}
	
	public void calculoPuntaje(int inFilaHuevo, int inColHuevo) {
		
		//validamos el ingreso de la posicion del huevo
		String dato = matriz [inFilaHuevo][inColHuevo];
		
		if(dato.equals("H")) {
			System.out.println("Ya lanzo acá un huevo");
		}else if(!dato.equals("0") && !dato.equals("H")) {
			switch (dato) {
			case "K":
				iPuntajeTotal+=3;
				iPuntajeTotal=iPuntajeTotal+obtenerImpactoKromis( inFilaHuevo,  inColHuevo);
				break;
			case "C":
				iPuntajeTotal+=2;
				iPuntajeTotal=iPuntajeTotal+obtenerImpactoCaguano( inFilaHuevo,  inColHuevo);
				break;
			case "T":
				iPuntajeTotal+=1;
				
				break;
			default:
				break;
			}	
		}
		matriz [inFilaHuevo][inColHuevo] = "H";
		
		for(int i = 0;i<15;i++)
		{
			for (int j = 0; j < 15; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("El puntaje total es:"+ iPuntajeTotal);
		
	}
	private Integer obtenerImpactoCaguano(int inFilaHuevo, int inColHuevo) {
		int inSumaAcierto=0;
		switch (inColHuevo) {
		case 0:
			for (int i = 0; i <=1; i++) {
				String dato= matriz[inFilaHuevo][inColHuevo+i];
				if(dato.equals("C")) {
					inSumaAcierto=inSumaAcierto+1;
				}
			}
			if(inSumaAcierto==1) {
				return 7;
			}

			
			break;

		default:
			for (int i = -1; i <=1; i++) {
				String dato= matriz[inFilaHuevo][inColHuevo+i];
				if(dato.equals("C")) {
					inSumaAcierto=inSumaAcierto+1;
				}
			}
			if(inSumaAcierto==1) {
				return 7;
			}
			
			break;
		}
		return 0;
	}
	public void llenarMatrizKromis() {
		
		boolean bCondition1 = true;
		int iContadorKromi =0; 
		do {
			//Carro oKromi = new Kromi();
			//System.out.println("okromi() "+oKromi.getiCantOcupantes());
			
			int inFilaRandomKromi = (int) (Math.random()*12)+0;
			int inColRandomKromi = (int) (Math.random()*14)+0;
			
			if(inFilaRandomKromi >=0 && inFilaRandomKromi<=12) {
				if(inColRandomKromi >=0 && inColRandomKromi<=14) {
	
					matriz [inFilaRandomKromi][inColRandomKromi] = "K";
					matriz [inFilaRandomKromi+1][inColRandomKromi] = "K";
					matriz [inFilaRandomKromi+2][inColRandomKromi] = "K";
					//oKromi.setiFila(inFilaRandomKromi);
					//oKromi.setiColumna(inColRandomKromi);
					iContadorKromi= iContadorKromi+1;
				}
			}
			//arregloCarros.add(oKromi);
			
			if(iContadorKromi==3) {
				bCondition1 =false;
			}
			
		} while (bCondition1);		
	}
	public void llenarMatrizCaguano() {
		boolean condition2 = true;
		int iContadorC =0; 
		do {
		int inFilaRandomCaguano = (int)(Math.random()*14)+0;
		int inColRandomCaguano = (int)(Math.random()*13)+0;
		
		if(inFilaRandomCaguano >=0 && inFilaRandomCaguano<=14) {
			if(inColRandomCaguano >=0 && inColRandomCaguano<=13) {
				String ocupada= matriz [inFilaRandomCaguano][inColRandomCaguano];
				String ocupada2= matriz [inFilaRandomCaguano+1][inColRandomCaguano];
				
				if(ocupada.equals("0") && ocupada2.equals("0")) {
					matriz [inFilaRandomCaguano][inColRandomCaguano] = "C";
					matriz [inFilaRandomCaguano][inColRandomCaguano+1] = "C";
					iContadorC=iContadorC+1;
				}else {
					System.out.println();
				}
			}
		}
		if(iContadorC==5) {
			condition2 =false;
		}
		
	} while (condition2);
	}

	public void llenarMatrizTrupalla() {
		boolean condition3 = true;
		int iContadorT =0; 
		do {
			
			int inFilaRandomTrupalla = (int)(Math.random()*14)+0;
			int inColRandomTrupalla = (int)(Math.random()*14)+0;
			
			if(inFilaRandomTrupalla >=0 && inFilaRandomTrupalla<=14) {
				if(inColRandomTrupalla >=0 && inColRandomTrupalla<=14) {
					
					String ocupadaTrupalla= matriz [inFilaRandomTrupalla][inColRandomTrupalla];
					
					if(ocupadaTrupalla.equals("0")) {
						matriz [inFilaRandomTrupalla][inColRandomTrupalla] = "T";
						iContadorT+=1;
					}
				}
			}
			if(iContadorT==10) {
				condition3 =false;
			}
			
		} while (condition3);
	}
	
	public int obtenerImpactoKromis(int inFilaHuevo, int inColHuevo) {
		
		int retorno =0, inSumaAcierto=0;
		switch (inFilaHuevo) {
		case 0:
				for (int i = 1; i <= 2; i++) {
					String sDato0 = matriz [inFilaHuevo+i][inColHuevo];
					 if(!sDato0.equals("K")) {
						 inSumaAcierto+=1;
					 }
				}
				if(inSumaAcierto==2) {
					return 10;
				}
				
			break;
		case 1:
			for (int i = -1; i <= 1; i++) {
				String sDato0 = matriz [inFilaHuevo+i][inColHuevo];
				 if(!sDato0.equals("K")) {
					 inSumaAcierto+=1;
				 }
			}
			if(inSumaAcierto==2) {
				return 10;
			}
			break;
			
		case 13:
			for (int i = -1; i <= 1; i++) {
				String sDato0 = matriz [inFilaHuevo+i][inColHuevo];
				 if(!sDato0.equals("K")) {
					 inSumaAcierto+=1;
				 }
			}
			if(inSumaAcierto==2) {
				return 10;
			}
			
			break;
		case 14:
			for (int i = -2; i <= 0; i++) {
				String sDato0 = matriz [inFilaHuevo+i][inColHuevo];
				 if(!sDato0.equals("K")) {
					 inSumaAcierto+=1;
				 }
			}
			if(inSumaAcierto==2) {
				return 10;
			}
			break;			
		default:
			for (int i = -2; i <= 2; i++) {
				String sDato0 = matriz [inFilaHuevo+i][inColHuevo];
				 if(sDato0.equals("K")) {
					 inSumaAcierto+=1;
				 }
			}
			if(inSumaAcierto==1) {
				return 10;
			}
			break;
		}
		
		
		return retorno;
	}
	
	
}
