package controladores;

import java.util.ArrayList;
import java.util.Scanner;

import servicios.ImplDatos;
import servicios.ImplMenu;
import servicios.InterfazDatos;
import servicios.InterfazMenu;

public class Menu {

	public static void main(String[] args) {
		// Inicializamos la interfaz del menu y de los datos
		InterfazMenu intM = new ImplMenu();
		InterfazDatos intD = new ImplDatos();
		
		//Listado de citas
		ArrayList(Datos) bd = new ArrayList<Datos>();
		
		//Mostramos el menu por consola y creamos un scanner para la informacion pedidad al usuario
		Scanner sc = new Scanner (System.in);
		Boolean cerrarMenu = false;
		int opcion;
		
		while(!cerrarMenu) {
		//Mostramos el menu
			intM.mostrarMenu();
			System.out.println("¿Que opcion desea utilizar?: ");
			opcion=sc.nextInt();
			System.out.println("[INFO] - Usted ha seleccionado la opcion " + opcion);
			
			switch (opcion) {
				case 0:
					cerrarMenu=true;
					break;
				case 1:
					bd.add(ImplMenu.addDatosVeterinario(bd));
					break;
				case 2:
					bd.add(ImplMenu.addDatosPropietario(bd));
					break;
				case 3:
					ImplMenu.mostrarDatos(bd);
					break;
				default:
			}
			
		}
		
	}

}
