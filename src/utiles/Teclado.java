package utiles;

import java.util.Scanner;

public class Teclado {
	
	//atributos
	private Scanner sc;
	
	//contructor por defecto
	public Teclado() {
		sc=new Scanner(System.in);
	}
	
	public String deTodo() {
		String frase="";
		frase=sc.nextLine();
		
		return frase;
	}
	
	public String letras() {
		String aux="", entrada="";
		int cont=0;
		cont=entrada.length();
		System.out.println("Ingresa solo palabras");
		entrada=sc.nextLine();
		do {
			
			for (int i = 0; i < entrada.length(); i++) {
				if (Character.isLetter(entrada.charAt(i))||entrada.charAt(i)==' ') {
					aux+=entrada.charAt(i);
					cont--;
				}else if(Character.isDigit(entrada.charAt(i))) {
					System.out.println("Error, por favor solo letras");
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
		int numero=0, cont=0;
		cont=entrada.length();
		System.out.println("Ingrese un numero entero");
		entrada=sc.nextLine();
		do {
			
			for (int i = 0; i < entrada.length(); i++) {
				if (Character.isDigit(entrada.charAt(i))) {
					aux+=entrada.charAt(i);
					cont--;
				}else if(Character.isLetter(entrada.charAt(i))) {
					System.out.println("Error, ingrese un numero entero por favor");
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
		int cont=0;
		cont=entrada.length();
		float numero=0;
		
		System.out.println("Ingresa un numero decimal");
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
					System.out.println("Error, ingrese un numero decimal por favor");
					entrada=sc.next();
					cont=entrada.length();
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
		respuesta = sc.nextLine();
		
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
		String entrada="";
		entrada=letras();
		char letra[]=new char[0];
		if (entrada.length()>1||entrada.length()<1) {
			System.out.println("Solo una letra por favor");
		}else if (entrada.length()==1) {
			letra=entrada.toCharArray();
		}
		return letra[0];
	}
	
	public String dni() {
		System.out.println("Introduzca su DNI");
		String dni="";
		dni = deTodo();
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
