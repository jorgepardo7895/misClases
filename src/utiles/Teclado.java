package utiles;

import java.util.Scanner;

public class Teclado {
	
	//atributos
	private Scanner sc;
	
	//contructor por defecto
	public Teclado() {
		sc=new Scanner(System.in);
	}
	
	
	//Metodo de entrada que nos evita que la entrada este vacia y nos produzca una excepcion
	public String entrada() {
		String frase=sc.nextLine();
		while(frase.isEmpty()) {
			System.out.println("Intentelo de nuevo");
			frase=sc.nextLine();
		}
		return frase;
	}
	
	public String deTodo() {
		String frase="";
		frase=entrada();
		return frase;
	}
	
	public String letras() {
		String aux="", frase="";
		int cont=0;
		System.out.println("Ingresa solo palabras");
		frase=entrada();
		cont=frase.length();
		do {
			for (int i = 0; i < frase.length(); i++) {
				if (Character.isLetter(frase.charAt(i))||frase.charAt(i)==' ') {
					aux+=frase.charAt(i);
					cont--;
				}else if(Character.isDigit(frase.charAt(i))) {
					System.out.println("Error, por favor solo letras");
					frase=entrada();
					cont=frase.length();
					break;
				}
			}
		
		}while(cont>0);
	return aux;
	}
	
	public int enteros() {
		String aux="", frase="";
		int numero=0, cont=0;
		System.out.println("Ingrese un numero entero");
		frase=entrada();
		cont=frase.length();
		do {
			for (int i = 0; i < frase.length(); i++) {
				if (Character.isDigit(frase.charAt(i))) {
					aux+=frase.charAt(i);
					cont--;
				}else if(Character.isLetter(frase.charAt(i))) {
					System.out.println("Error, ingrese un numero entero por favor");
					frase=entrada();
					cont=frase.length();
					break;
				}
			}
		}while(cont>0);
		numero = (int)Integer.parseInt(aux);
	return numero;
	}
	
	public float decimales() {
		String aux="", frase="";
		int cont=0;
		float numero=0;
		System.out.println("Ingresa un numero decimal");
		frase=entrada();
		cont=frase.length();
		do {
			for (int i = 0; i < frase.length(); i++) {
				if (Character.isDigit(frase.charAt(i))||frase.charAt(i)==','||frase.charAt(i)=='.') {
					if (Character.isDigit(frase.charAt(i))||frase.charAt(i)=='.') {
						aux+=frase.charAt(i);
						cont--;
					}else if(frase.charAt(i)==',') {
						aux+='.';
						cont--;
					}
				}else if(Character.isLetter(frase.charAt(i))||frase.charAt(i)!=','||frase.charAt(i)!='.') {
					System.out.println("Error, ingrese un numero decimal por favor");
					frase=entrada();
					cont=frase.length();
					break;
				}
			}
			
		}while(cont>0);
		numero = (float)Float.parseFloat(aux);
	return numero;
	}
	
	public boolean bool() {
		boolean bool = false;
		String respuesta="";
		System.out.println("Escriba 's' o 'n', 'verdadero' o 'falso', 'v' o 'f', 'si' o 'no'");
		respuesta = entrada();
		
		if (respuesta.equalsIgnoreCase("s")||respuesta.equalsIgnoreCase("verdadero")||respuesta.equalsIgnoreCase("v")||respuesta.equalsIgnoreCase("si")) {
			bool=true;
		}else if(respuesta.equalsIgnoreCase("n")||respuesta.equalsIgnoreCase("falso")||respuesta.equalsIgnoreCase("f")||respuesta.equalsIgnoreCase("no")) {
			bool=false;
		}else {
			System.out.println("Selección incorrecta, ciñase a las indicaciones");
			bool();
		}
		
		return bool;
	}
	
	public char letra() {
		System.out.println("Introduce la letra");
		String frase="";
		frase=entrada();
		char letra[]=new char[0];
		if (frase.length()>1||frase.length()<1) {
			System.out.println("Solo una letra por favor");
		}else if (frase.length()==1) {
			letra=frase.toCharArray();
		}
		return letra[0];
	}
	
	public String dni() {
		System.out.println("Introduzca su DNI");
		String dni="";
		dni = entrada();
		String dniComprobado="";
		if (dni.length()< 9 ||dni.length()>9 ) {
			dni();
		}else {
			for (int i = 0; i < dni.length(); i++) {
				if (Character.isDigit(dni.charAt(i))||Character.isLetter(dni.charAt(8))) {
					dniComprobado+=dni.charAt(i);
				}else {
					System.out.println("ERROR EN EL DNI INTRODUCIDO, INTENTELO DE NUEVO");
					dni();
				}
			}
		}
		
		return dniComprobado;
	}
}
