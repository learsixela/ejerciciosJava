/**
 * Clase Lavadora que hereda de Electrodomestico
 */
package src.talento.a2020.m02.d24.evaluacion;

/**
 * @author israelpalma
 *
 */
public class Lavadora extends Electrodomestico{
	 
    //Constante global
    private final static int IN_CONST_CARGA=5;
  
    //Atributo propio de la clase
    private int inCarga;
 
  //getter and setter
	public int getInCarga() {
		return inCarga;
	}

	public void setInCarga(int inCarga) {
		this.inCarga = inCarga;
	}

	//constructores
	//Un constructor por defecto.
	//Un constructor con el precio y peso. El resto por defecto.
	//Un constructor con la carga y el resto de atributos heredados. 
	//Recuerda que debes llamar al constructor de la clase padre.

	public Lavadora() {
		super();
		this.inCarga =IN_CONST_CARGA;
	}

	public Lavadora(int inCarga) {
		super();
		this.inCarga = inCarga;
	}

	public Lavadora(double dPrecio, double dPeso, char cConsumoEnergetico, String sColor) {
		super(dPrecio, dPeso, cConsumoEnergetico, sColor);
		// TODO Auto-generated constructor stub
	}

	public Lavadora(double dPrecio, double dPeso) {
		super(dPrecio, dPeso);
		// TODO Auto-generated constructor stub
	}
	public Lavadora(double dPrecio, double dPeso,int inCarga) {
		super(dPrecio, dPeso);
		this.inCarga = inCarga;
	}
	
	public Lavadora(double dPrecio, double dPeso, char cConsumoEnergetico, String sColor,int inCarga) {
		super(dPrecio, dPeso, cConsumoEnergetico, sColor);
		this.inCarga = inCarga;
	}
	/**
     * si tiene una carga mayor de 30 kg, aumentara el precio 50000,
     * sino es así no se incrementara el precio. Llama al método padre y añade el código necesario. 
     * Recuerda que las condiciones que hemos visto en la clase Electrodoméstico también deben afectar al precio.
     * @return dPrecioFinal
     */
    public double precioFinal(){
 
        //Invocamos el método precioFinal del método padre
        double dPrecioFinal=super.precioFinal();
  
        //comprobamos si tiene una carga mayor de 30 kg
        if (inCarga>30){
        	dPrecioFinal=dPrecioFinal+50000;
        }
  
        return dPrecioFinal;
    }


  

}
