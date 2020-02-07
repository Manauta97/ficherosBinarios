package ficheroBinario;

import java.util.Scanner;

public class Principal {
	
	public static void calculoprecio(Ventas[] vVentas) {
		Scanner leer = new Scanner(System.in);
		double calculo = 0, total=0;
		String nombre = "";
		
		
		
		System.out.println("nombre del cliente a buscar");
		nombre = leer.nextLine();
		
		for (Ventas venta : vVentas) {
			if (venta != null && nombre.equalsIgnoreCase(venta.getCliente())) {
				calculo = venta.getPrecioUnitario() * venta.getUnidadesVendidas();
				total+=calculo;
			}
		}
		
		System.out.println(total +"€");
		
	}

	public static void main(String[] args) {

		Ventas[] vVentas = null;
		
		/*
		vVentas[0] = new Ventas("Jose Martinez", 1, 3, 15.50);
		vVentas[1] = new Ventas("Mario Fernandez", 2, 2, 19.90);
		vVentas[2] = new Ventas("Raúl Manauta", 3, 3, 10.50);
		vVentas[3] = new Ventas("Luis Perez", 4, 1, 9.50);
		vVentas[4] = new Ventas("Luis Perez", 5, 2, 6.50);
		vVentas[5] = new Ventas("Luis Perez", 6, 1, 20);

		IoDatos.guardarDatosFichero(vVentas);
		*/
		
		vVentas = IoDatos.cargarDatosFichero();
		
		calculoprecio(vVentas);
		
	}

}
