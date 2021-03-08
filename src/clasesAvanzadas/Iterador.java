package clasesAvanzadas;

import java.util.ArrayList;
import java.util.Iterator;



public class Iterador {
	public static void main(String args[]) {
		ArrayList<Integer> lista=new ArrayList<Integer>();
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		
		Iterator<Integer> it=lista.iterator();
		
		while (it.hasNext()) {
			Integer num = it.next();
			if (num==3) {
				System.out.println("El tres");
			}else {
				System.out.println(num);
			}
		}
	}
}
