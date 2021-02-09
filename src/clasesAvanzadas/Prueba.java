package clasesAvanzadas;

import utiles.Teclado;

public class Prueba {

	public static void main(String[] args) {
		Teclado ent=new Teclado();
		Cacharros aparato=new Cacharros(ent.letras(),ent.letras(),ent.decimales());
		
		
		
		System.out.println(aparato.GetTodo());
		
		
	}
}
