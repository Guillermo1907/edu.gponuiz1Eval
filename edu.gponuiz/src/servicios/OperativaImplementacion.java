package servicios;

import java.sql.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class OperativaImplementacion implements OperativaInterfaz {

	 Scanner scan = new Scanner(System.in);
	/***
	 * metodo que calcula el total de ventas mensual
	 * 101024
	 * @author gpr
	 */
	public double calculoTotalVentasMensual() {
		System.out.println("Indicame una fecha en formato MM-yyyy");
		String fecha = scan.next();
		
		
		return 0;
		
	}

	/***
	 * metodo que añade compras al cliente
	 * 101024
	 * @author gpr
	 */
	public void añadirComprasCliente() {
		
		System.out.println("¿Cual es el importe?");
		double importe = scan.nextDouble();
		System.out.println("¿Cual es el ID del cliente?");
		//if () {
		// aqui deberia poner si el ID se encuentra en la lista que devuelva el resultado 
		//"Compra añadida", si no se encuentra pondria "Error,no se localiza el ID de cliente"
		//}
		
	}
	
}
