package clasesAvanzadas;

import utiles.CalculoVueltas;
import utiles.Calculos;
import utiles.Teclado;

public class Prueba {

	public static void main(String[] args) {
		Teclado ent=new Teclado();
		Calculos cal=new Calculos();
		float num= cal.sumaDecimal(5.6666f, 3.32222f);
		
		System.out.println(num);
		
		num = cal.division(17, 7);
		System.out.println(num);
		num = cal.multiplicacion(17.5f, 7);
		System.out.println(num);
		
	}
}
