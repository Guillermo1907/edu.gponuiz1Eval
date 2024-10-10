package servicios;

import java.util.ArrayList;
import java.util.Scanner;

import dto.Cliente;


public class gestionCliente implements gestionInterfazCliente {

	private ArrayList<Cliente> listaClientes = new ArrayList<>();
	
	 Scanner scan = new Scanner(System.in);

	 /***
		 * metodo que crea un cliente y lo añade a la lista de clientes
		 * 101024
		 * @author gpr
		 */
	 public void crearCliente() {
		 
		 System.out.println("Dime el nombre");
	 		String nombre = scan.next(); 
	 		scan.nextLine(); //limpiar buffer
	 		
	 		System.out.println("Dime los apellidos");
	 		String apellidos = scan.nextLine();
	 		
	 		Cliente nuevocliente = new Cliente(0, nombre, apellidos);
	 		listaClientes.add(nuevocliente);
	 		
	 		System.out.println("Se ha dado de alta al nuevo cliente: "+ nuevocliente);
	 	
	 		//aqui deberia hacer un bucle para preguntarle si quiero algo mas o si vuelve al menu principal
	 		
	 }	
}
