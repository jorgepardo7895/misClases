package clasesAvanzadas;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String aux="";
		Series miSerie=altaSerie(sc);
		Series tuSerie=altaSerie(sc);
		
		System.out.println(miSerie.getNombre()+" "+tuSerie.getNombre());
		
//		Series vikingos= new Series();
//		
//		System.out.println("Introduce el nombre");
//		vikingos.setNombre(sc.next());
//		
//		System.out.println("Introduce si ha acabado si o no");
//		aux=sc.next();
//		if(aux.equalsIgnoreCase("si")||aux.equalsIgnoreCase("s")) {
//			vikingos.setFin(true);
//		}else {
//			vikingos.setFin(false);
//		}
//		
//		System.out.println("Introduce la cantidad de temporadas");
//		vikingos.setTemporadas(sc.nextInt());
//		
//		System.out.println("Introduce el rating");
//		vikingos.setRating(sc.nextFloat());
		
		
	}
	
	public static Series altaSerie(Scanner sc) {
		boolean fin=false;
		String aux="", nombre="";
		int temporadas=0;
		float rating=0.0f;
		
		System.out.println("Introduce el nombre");
		nombre= sc.next();
		
		System.out.println("¿Esta terminada?si o no");
		aux=sc.next();
		if(aux.equalsIgnoreCase("si")||aux.equalsIgnoreCase("s")) {
			fin=true;
		}else {
			fin=false;
		}
		System.out.println("Introduce la cantidad de temporadas");
		temporadas=sc.nextInt();
		
		System.out.println("Introduce el rating");
		rating=sc.nextFloat();
		
		Series nuevaSerie =new Series(nombre, fin, temporadas, rating);
		return nuevaSerie;
	}
}
