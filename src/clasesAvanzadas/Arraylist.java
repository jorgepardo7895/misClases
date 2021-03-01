package clasesAvanzadas;

import java.util.ArrayList;

public class Arraylist {
	
	public static void main(String args[]) {
		
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("hola");
		lista.add("Mundo");
		lista.add("Maravilloso");
		
		for (String cadena : lista) {
			System.out.println(cadena);
		}
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).equalsIgnoreCase("hola")) {
				lista.set(i, "Adios");
			}
			System.out.println(lista.get(i));
		}
		
		ArrayList<Habitacion> habs = new ArrayList<Habitacion>();
		
		habs.add(new Habitacion());
		habs.get(0).setDni("72148322t");
		
		System.out.println(habs.get(0).getDni());
	}
}
