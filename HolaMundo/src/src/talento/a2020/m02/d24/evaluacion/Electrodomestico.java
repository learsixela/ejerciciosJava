/**
 * Clase Padre Electrodomestico
 */
package src.talento.a2020.m02.d24.evaluacion;

/**
 * @author israelpalma
 *
 */
public class Electrodomestico {

	/**
	 * Constantes
	 * */	
	protected final static String STRING_CONST_COLOR="BLANCO";
    protected final static char CHAR_CONST_CONSUMO_ENERGETICO='F';
    protected final static double DOUBLE_CONST_PRECIO_BASE=100000;
    protected final static double DOUBLE_CONST_PESO=5;
   
    /**
     * Atributos*/
  
    protected double dPrecioBase;
    protected String sColor;
    protected char cConsumoEnergetico;
    protected double dPeso;
    
    /**
     * Los constructores que se implementarán serán
     * Un constructor por defecto.
     * Un constructor con el precio y peso. El resto por defecto.
     * Un constructor con todos los atributos.
     */
    
    /**
     * Contructor por defecto
     */
    public Electrodomestico(){
		this(DOUBLE_CONST_PRECIO_BASE, DOUBLE_CONST_PESO, CHAR_CONST_CONSUMO_ENERGETICO, STRING_CONST_COLOR);
    }
   
    /**
     * Contructor con 2 parametros. El resto por defecto.
     * @param dPrecio
     * @param dPeso
     */
    public Electrodomestico(double dPrecio, double dPeso){
        this(dPrecio, dPeso, CHAR_CONST_CONSUMO_ENERGETICO, STRING_CONST_COLOR);
    }
   
    /**
     * Constructor con 4 parametros
     * @param dPrecio
     * @param dPeso
     * @param cConsumoEnergetico
     * @param sColor
     */
    public Electrodomestico(double dPrecio, double dPeso, char cConsumoEnergetico, String sColor){
        this.dPrecioBase=dPrecio;
        this.dPeso=dPeso;
        comprobarConsumoEnergetico(cConsumoEnergetico);
        comprobarColor(sColor);
    }
   
    /**
     * Métodos*/
    
/**
 * Solo se piden los metodos get, pero se implementan ambos
 * */
	public double getdPrecioBase() {
		return dPrecioBase;
	}

	public void setdPrecioBase(double dPrecioBase) {
		this.dPrecioBase = dPrecioBase;
	}

	public String getsColor() {
		return sColor;
	}

	public void setsColor(String sColor) {
		this.sColor = sColor;
	}

	public char getcConsumoEnergetico() {
		return cConsumoEnergetico;
	}

	public void setcConsumoEnergetico(char cConsumoEnergetico) {
		this.cConsumoEnergetico = cConsumoEnergetico;
	}

	public double getdPeso() {
		return dPeso;
	}

	public void setdPeso(double dPeso) {
		this.dPeso = dPeso;
	}
    
    /**
     * comprueba que la letra es correcta, 
     * sino es correcta usara la letra por defecto. 
     * Se invocará al crear el objeto y no sera visible.
     * @param parametroLetra
     */
    public void comprobarConsumoEnergetico(char parametroLetra){
          //los rangos de 65 a 70 corresponde al valor ascii de A a la F
        if(parametroLetra>=65 && parametroLetra<=70){	
            this.cConsumoEnergetico=parametroLetra;
        }else{
            this.cConsumoEnergetico=CHAR_CONST_CONSUMO_ENERGETICO;
        }
    }

	/**
	 * comprueba que el color es correcto, sino lo es usa el color por defecto. 
	 * Se invocará al crear el objeto y no será visible (private).
	 * */
    private void comprobarColor(String parametroColor){
    	   
    	/**
    	 * Los colores disponibles son blanco, negro, rojo, azul y gris. 
    	 * No importa si el nombre está en mayúsculas o en minúsculas.
    	 * */
  
        String arrColores[]={"blanco", "negro", "rojo", "azul", "gris"};
        boolean bEncontrado=false;
  
        for(int i=0;i<arrColores.length;i++){
            //convertimos los colores a mayuscula para evitar errores  
            if(arrColores[i].toUpperCase().equals(parametroColor.toUpperCase())){
            	bEncontrado=true;
            }  
        }
         //si fue encontrado, asignamos al atributo, el color pasado por parametro, 
        //en caso contrario el color por defecto (blanco)
        if(bEncontrado){
            this.sColor=parametroColor;
        }else{
            this.sColor=STRING_CONST_COLOR;
        }
          
          
    }
      
	/**
	 * según el consumo energético, aumentará su precio, y según su tamaño también.
	 * */
    public double precioFinal(){
        double dPrecioFinal=0;
        //validamos el consumo energetico segun su letra
        switch(cConsumoEnergetico){
            case 'A':
            	dPrecioFinal=dPrecioFinal+100000;
                break;
            case 'B':
            	dPrecioFinal=dPrecioFinal+80000;
                break;
            case 'C':
            	dPrecioFinal=dPrecioFinal+60000;
                break;
            case 'D':
            	dPrecioFinal=dPrecioFinal+50000;
                break;
            case 'E':
            	dPrecioFinal=dPrecioFinal+30000;
                break;
            case 'F':
            	dPrecioFinal=dPrecioFinal+10000;
                break;
        }
        //validamos segun su tamaño en kg e incrementamos el precio final
        if(dPeso>=0 && dPeso<19){
        	dPrecioFinal=dPrecioFinal+10000;
        }else if(dPeso>=20 && dPeso<49){
        	dPrecioFinal=dPrecioFinal+50000;
        }else if(dPeso>=50 && dPeso<=79){
        	dPrecioFinal=dPrecioFinal+80000;
        }else if(dPeso>=80){
        	dPrecioFinal=dPrecioFinal+100000;
        }
        // retorno de resultado (suma de dos double) 
        return dPrecioBase+dPrecioFinal;
    }
   
    
   
}

