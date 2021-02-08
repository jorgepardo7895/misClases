package clasesAvanzadas;

import java.util.Scanner;

public class Teclado {
	
	//atributos
	private Scanner sc;
	
	//contructor por defecto
	public Teclado() {
		sc=new Scanner(System.in);
	}
	
	public String letras() {
		String aux="", entrada="";
		int cont=entrada.length();
		System.out.println("Introduce solo palabras");
		entrada=sc.nextLine();
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
	
	public int enteros() {
		String aux="", entrada="";
		int numero=0, cont=entrada.length();
		System.out.println("Introduce un numero entero");
		entrada=sc.nextLine();
		do {
			
			for (int i = 0; i < entrada.length(); i++) {
				if (Character.isDigit(entrada.charAt(i))) {
					aux+=entrada.charAt(i);
					cont--;
				}else if(Character.isLetter(entrada.charAt(i))) {
					System.out.println("Error, inserte un numero por favor");
					entrada=sc.nextLine();
					cont=entrada.length();
					break;
				}
			}
			
		}while(cont>0);
			
		numero = (int)Integer.parseInt(aux);
		return numero;
	}
	
	public float decimales() {
		String aux="", entrada="";
		int cont=entrada.length();
		float numero;
		System.out.println("Introduce un numero decimal");
		entrada=sc.nextLine();
		do {
			
			for (int i = 0; i < entrada.length(); i++) {
				if (Character.isDigit(entrada.charAt(i))||entrada.charAt(i)==','||entrada.charAt(i)=='.') {
					if (Character.isDigit(entrada.charAt(i))||entrada.charAt(i)=='.') {
						aux+=entrada.charAt(i);
						cont--;
					}else if(entrada.charAt(i)==',') {
						aux+='.';
						cont--;
					}
					
				}else if(Character.isLetter(entrada.charAt(i))||entrada.charAt(i)!=','||entrada.charAt(i)!='.') {
					System.out.println("Error, inserte un numero por favor");
					entrada=sc.next();
					cont=entrada.length();
					break;
				}
			}
			
		}while(cont>0);
			
		numero = (float)Float.parseFloat(aux);
		return numero;
	}
}
