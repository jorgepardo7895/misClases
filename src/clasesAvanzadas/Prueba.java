package clasesAvanzadas;

import utiles.Teclado;

public class Prueba {

	public static void main(String[] args) {
		Teclado ent=new Teclado();
//		Cacharros ps5=new Cacharros();
//		System.out.println("Introduce la marca");
//		ps5.setMarca(ent.letras());
//		System.out.println("Introduce el tipo");
//		ps5.setTipo(ent.letras());
//		System.out.println("Introduce el consumo");
//		ps5.setConsumo(ent.decimales());
//		
//		System.out.println(ps5.toString());
		
		boolean si=false;
		
		si=ent.bool();
		
		if(si) {
			System.out.println("hola");
		}
		
	}
}
