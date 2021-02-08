package clasesAvanzadas;

import java.util.Scanner;

public class Teclado {
	Scanner sc=new Scanner(System.in);
	
	
	
	public String letras(String entrada) {
		String aux="";
		int cont=entrada.length();
		
		do {
			
			for (int i = 0; i < entrada.length(); i++) {
				if (Character.isLetter(entrada.charAt(i))||entrada.charAt(i)==' ') {
					aux+=entrada.charAt(i);
					cont--;
				}else if(Character.isDigit(entrada.charAt(i))) {
					System.out.println("Error, no inserte numeros por favor");
					entrada=sc.nextLine();
					cont=entrada.length();
					break;
				}
			}
			
		}while(cont>0);
		
		return aux;
	}
	
	public int enteros(String entrada) {
		String aux="";
		int numero=0, cont=entrada.length();
		
		do {
			
			for (int i = 0; i < entrada.length(); i++) {
				if (Character.isDigit(entrada.charAt(i))) {
					aux+=entrada.charAt(i);
					cont--;
				}else if(Character.isLetter(entrada.charAt(i))) {
					System.out.println("Error, inserte un numero por favor");
					entrada=sc.next();
					cont=entrada.length();
					break;
				}
			}
			
		}while(cont>0);
			
		numero = (int)Integer.parseInt(aux);
		return numero;
	}
}
