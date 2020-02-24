/**
 * Clase Padre Main
 */
package src.talento.a2020.m02.d24.evaluacion;

/**
 * @author israelpalma
 *
 */
public class MainEvaluacion {

	public static void main(String[] args) {
		//definicion de variables a utilizar
        double dTotalSumaElectrodomesticos=0,dTotalSumaTelevisiones=0,dTotalSumaLavadoras=0;
        
        //Creamos un array de Electrodomesticos
        int inTamArray=10;
        Electrodomestico arrayElectrodomesticos[]=new Electrodomestico[inTamArray];
   
        //instanciamos y llamamos a casi todos los constructores
        arrayElectrodomesticos[0]=new Electrodomestico();
        arrayElectrodomesticos[1]=new Electrodomestico(200000, 60, 'C', "BLANCO");
        arrayElectrodomesticos[2]=new Electrodomestico(50000, 10);
        arrayElectrodomesticos[3]=new Electrodomestico(10000, 20, 'D', "GRIS");
        
        arrayElectrodomesticos[4]=new Lavadora();
        arrayElectrodomesticos[5]=new Lavadora(300000, 40, 'Z', "AZUL");
        arrayElectrodomesticos[6]=new Lavadora(450000, 100);
        
        arrayElectrodomesticos[7]=new Television(350000, 70);
        arrayElectrodomesticos[8]=new Television(600000, 80, 'E', "NEGRO");
        arrayElectrodomesticos[9]=new Television(39, true);
        
   
        //recorre este array y ejecuta el método precioFinal ().
        for(int i=0;i<arrayElectrodomesticos.length;i++){
            if(arrayElectrodomesticos[i] instanceof Electrodomestico){
                dTotalSumaElectrodomesticos=dTotalSumaElectrodomesticos +arrayElectrodomesticos[i].precioFinal();
            }
            if(arrayElectrodomesticos[i] instanceof Lavadora){
                dTotalSumaLavadoras=dTotalSumaLavadoras+arrayElectrodomesticos[i].precioFinal();
            }
            if(arrayElectrodomesticos[i] instanceof Television){
                dTotalSumaTelevisiones=dTotalSumaTelevisiones+arrayElectrodomesticos[i].precioFinal();
            }
        }
   
        System.out.println("******************* Resultados ****************************");
        System.out.println("Suma Total de los electrodomesticos: $"+ dTotalSumaElectrodomesticos);
        System.out.println();
        System.out.println("Suma Total de las lavadoras: $"+dTotalSumaLavadoras);
        System.out.println();
        System.out.println("Suma Total de las televisiones: $"+dTotalSumaTelevisiones);
        System.out.println("*************************************************");
   
    }

}
