package src.talento;

public class Validador {

	public boolean esNumero(String retiro) {
		try {
			Double.parseDouble(retiro);
			return true;
		} catch (Exception e) {
			//System.out.println("No es un número valido");
			return false;
		}
	}
	
	public Integer stringToInteger(String numero) {
		int num = Integer.parseInt(numero);
		return num;
	}
	
	public Double stringToDouble(String numero) {
		double cant = Double.parseDouble(numero);
		return cant;
	}
	
}
