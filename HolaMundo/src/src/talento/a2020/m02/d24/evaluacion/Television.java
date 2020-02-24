/**
 * Clase Television que hereda de Electrodomestico
 */
package src.talento.a2020.m02.d24.evaluacion;

/**
 * @author israelpalma
 *
 */
public class Television extends Electrodomestico{
    
    //Atributos de la clase
    private int inResolucion = 20;
    private boolean bSintonizadorTDT=false;

  //Constructores
	public Television() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Television(double dPrecio, double dPeso, char cConsumoEnergetico, String sColor) {
		super(dPrecio, dPeso, cConsumoEnergetico, sColor);
		// TODO Auto-generated constructor stub
	}


	public Television(double dPrecio, double dPeso) {
		super(dPrecio, dPeso);
		// TODO Auto-generated constructor stub
	}

	public Television(int inResolucion, boolean bSintonizadorTDT) {
		super();
		this.inResolucion = inResolucion;
		this.bSintonizadorTDT = bSintonizadorTDT;
	}
	  
    /**
     *  si tiene una resolución mayor de 40 pulgadas, se incrementara el precio un 30% y 
     *  si tiene un sintonizador TDT incorporado, aumentara 50000.
     *  Recuerda que las condiciones que hemos visto en la clase Electrodoméstico también deben afectar al precio.
     * @return dPrecioFinal
     */
    public double precioFinal(){
        //Invocamos el método precioFinal del método padre
        double dPrecioFinal=super.precioFinal();
  
        //validamos tamaño de pulgadas
        if (inResolucion>40){
        	dPrecioFinal=dPrecioFinal+(dPrecioBase*0.3);
        }
        //validamos si tiene sintonizador
        if (bSintonizadorTDT){
        	dPrecioFinal=dPrecioFinal+50000;
        }
        //retorno un double de precio final
        return dPrecioFinal;
    }

}
