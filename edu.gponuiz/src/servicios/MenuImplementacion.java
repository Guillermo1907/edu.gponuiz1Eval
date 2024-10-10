package servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {

	
	/***
	 * metodo que muestra el menu de seleccion
	 * 101024
	 * @author gpr
	 */
	
	public int mostrarMenu() {
		int opcion;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elige una opcion");
		System.out.println("0.Salir");
		System.out.println("1.Menu Empleado");
		System.out.println("2.Menu gerencia");
		
		opcion = sc.nextInt();
		
		return opcion;
	}

	/***
	 * metodo que muestra el menu de empleado
	 * 101024
	 * @author gpr
	 */
	
	public int menuEmpleado() {
		int opcion;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elige una opcion");
		System.out.println("0.Volver atras");
		System.out.println("1.Calcular total de ventas mensual");
		System.out.println("2.Añadir compras a un cliente");
		
		opcion = sc.nextInt();
		
		return opcion;
	}

	/***
	 * metodo que muestra el menu de gerencia
	 * 101024
	 * @author gpr
	 */
	public int menuGerencia() {
		int opcion;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elige una opcion");
		System.out.println("0.Volver atras");
		System.out.println("1.Crear nuevo cliente");
		
		opcion = sc.nextInt();
		
		return opcion;
	}

}
