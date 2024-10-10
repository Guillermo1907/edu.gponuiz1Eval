package controladores;

import java.util.ArrayList;
import java.util.List;

import dto.Cliente;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.OperativaImplementacion;
import servicios.OperativaInterfaz;
import servicios.gestionCliente;
import servicios.gestionInterfazCliente;

public class Inicio {

	private ArrayList<Cliente> listaClientes = new ArrayList<>();
	
	private static String mensaje;

	public static void main(String[] args) {
		MenuInterfaz mi = new MenuImplementacion();
		OperativaInterfaz oi = new OperativaImplementacion();
		gestionInterfazCliente gi = new gestionCliente();
		
		boolean esCerrado = false;
		int opcion;
		
		do {
		opcion = mi.mostrarMenu();
		
		switch (opcion) {
		case 0: 
			mensaje = "Se sale del menu principal"; //Aqui deberia escribirse en el ficheroLog creado, pero no llego a entender bien como funciona, de momento no va.
			esCerrado = true;
			break;
		case 1: 
			System.out.println("Has elegido menu empleado");
			mi.menuEmpleado();
				switch (opcion) {
				case 1: 
					System.out.println("Has seleccionado Calculo de ventas mensual");
					oi.calculoTotalVentasMensual();
					break;
				case 2:
					System.out.println("Añadir compras a un cliente");
					oi.añadirComprasCliente();
				}
			break;
		case 2: 
			System.out.println("Has elegido menu gerencia");
			mi.menuGerencia();
			switch (opcion) {
				case 1: 
				System.out.println("Has seleccionado crear cliente");
				gi.crearCliente(); //no va la opcion del segundo menu
				break;
			}
			break;	
		default:
			System.out.println("Opcion Inválida");
		}
		
		} while (!esCerrado);

	}

}
