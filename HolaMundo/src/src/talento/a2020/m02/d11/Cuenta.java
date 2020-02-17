package src.talento.a2020.m02.d11;

import java.util.Scanner;
import src.talento.Validador;

public class Cuenta {
	Cuenta arrayCuentas[] = new Cuenta[1];
	Validador valida = new Validador();
	Scanner scan = new Scanner(System.in);
	
	String sTitular;
	double dCantidad;
	public Cuenta() {
	
	}
	public Cuenta(String sTitular) {
		super();
		this.sTitular = sTitular;
	}
	public Cuenta(String sTitular, double dCantidad) {
		super();
		this.sTitular = sTitular;
		this.dCantidad = dCantidad;
	}
	
	@Override
	public String toString() {
		return "Cuenta [sTitular=" + sTitular + ", dCantidad=" + dCantidad + "]";
	}
	public String getsTitular() {
		return sTitular;
	}
	public void setsTitular(String sTitular) {
		this.sTitular = sTitular;
	}
	public double getdCantidad() {
		return dCantidad;
	}
	public void setdCantidad(double dCantidad) {
		this.dCantidad = dCantidad;
	}
	
	public void inicio() {
		Cuenta cuenta = new Cuenta();
		
		System.out.println("Ingrese nombre titular");
		String sTitular = scan.next();
		cuenta.setsTitular(sTitular);
		arrayCuentas[0] = cuenta;
		boolean condition = false;
		
		
		do {
			
			System.out.println("Ingrese cantidad");
			String sCantidad = scan.next();
			
			String replaceCantidad = sCantidad.replace(",", ".");
			
			if(!sCantidad.isEmpty() && valida.esNumero(replaceCantidad)) {
				double cant = valida.stringToDouble(replaceCantidad);
				
				if(cant >= 0 ) {
					this.ingresar(cant);
					condition =true;
				}else {
					System.out.println("No puede ingresar montos negativos");
					condition =false;
				}
			}else {
				condition = false;
			}
		} while (!condition);
		
	}
	
	public void ingresar(double dCantidad) {
		
		arrayCuentas[0].setdCantidad(dCantidad);
	}
	
	public void opcionRetiro() {		
		boolean condition = false;
		do {
			System.out.println("");
			System.out.println("Desea retirar dinero de la cuenta (1) SI (2) No");
			String retiro = scan.next();
			
			if(valida.esNumero(retiro)) {
				int valor = valida.stringToInteger(retiro);
				if(valor == 1) {
					if(arrayCuentas[0].getdCantidad() < 1 ) {
						System.out.println("No posee suficiente dinero en la cuenta");
						System.out.println("Desea ingresar cantidad? (1) SI (2) NO");
						String opcion2 = scan.next();
						
						
						
						if(valida.esNumero(opcion2)) {
							int valor2 = Integer.parseInt(opcion2);
							
						}else {
							condition = true;
						}
						
					}else {
						System.out.println("usted posee en su cuenta "+ arrayCuentas[0].getdCantidad());
						System.out.println("");
						
						
						System.out.println("Ingrese cantidad a retirar");
						String cantidad = scan.next();
						
						if(valida.esNumero(cantidad) ) {
							
							String replaceCantidad = cantidad.replace(",", ".");
							double dCantidad = Double.parseDouble(replaceCantidad);
							if(dCantidad<1) {
								System.out.println("Cantidad invalida");
							}else {
								this.retirar(dCantidad);
								System.out.println("");
								System.out.println("Su saldo es: "+ arrayCuentas[0].getdCantidad() );
							}
							
						}else {
							System.out.println("");
							System.out.println("Cantidad invalida");
							condition = false;
						}
					}
				} else if(valor == 2) {	
					System.out.println("Eligio Salir...");
					condition = true;
				}else {
					System.out.println("Opción ingresada no valida");
					System.out.println("");
					condition = false;
				}
			
			}else {
				System.out.println("Opción ingresada no valida");
				System.out.println("");
				condition = false;
			}
				
		} while (!condition);
		
		System.out.println("Adios...");
		
		
	scan.close();
		
	}
	
	public void retirar(double cantidad) {
		
		double total = arrayCuentas[0].getdCantidad() - cantidad;
		if (total < 0) {
			arrayCuentas[0].setdCantidad(0d);
		}else {
			arrayCuentas[0].setdCantidad(total);
		}
		
	}
	
	private void ingresarCantidad(String cantidad) {
		boolean valido= false;
		if(valida.esNumero(cantidad) ) {
			String replaceCantidad = cantidad.replace(",", ".");
			double dCantidad = valida.stringToDouble(replaceCantidad);
			valido= false;
		}
	}
	public void fin() {
		// TODO Auto-generated method stub
		
	}
}
