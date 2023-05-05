package servicios;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.Datos;

public class ImplDatos implements InterfazDatos{
	Boolean esVeterinario=true;
	
	@Override
	public List<Datos> addInformacion(List<Datos> listaDatos){
		Datos datos = new Datos();
		Scanner dt = new Scanner (System.in);
		
		if(esVeterinario==false) {
			//Pedimos la informacion al propietario
			System.out.println("Cual es su nombre: ");
			datos.setNombrePropietario(dt.next());;
			System.out.println("Cual es su apellido: ");
			datos.setApellidoPropietario(dt.next());
			System.out.println("Cuantas mascotas tienes registradas. ");
			datos.setNumeroMascotas(dt.nextInt());
			
			System.out.println(datos.getNombrePropietario() + " " +datos.getApellidoPropietario() + "es propietario y tiene " + datos.getNumeroMascotas() + " registadas");
		}
		else {
			//Pedimos la informacion del veterinario
			System.out.println("Cual es su nombre: ");
			datos.setNombreVeterinario(dt.next());
			System.out.println("Cual es su apellido: ");
			datos.setApellidoVeterinario(dt.next());
			
			System.out.println(datos.getNombreVeterinario() + " " + datos.getApellidoVeterinario() + " es veterinario y su numero de colegiado es "+datos.getNumeroColegiado());
		}
		
	}
	
	private int calculaId(ArrayList<Datos> listaDatos) {
		int ayuda = 0;
		
		for(int i=0;i<listaDatos.size();i++) {
			int j = listaDatos.get(i).getCodigoIdentificador();
			if(ayuda < j) {
				ayuda = j;
			}
		}
		return ayuda+1;
	}

}
