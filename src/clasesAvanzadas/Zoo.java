package clasesAvanzadas;

import utiles.Calculos;
import utiles.Teclado;

public class Zoo {

	public static void main(String[] args) {
		
		Animal lista[]= new Animal[8];
		
//		lista[0]= new Animal(0,"León","Tierra","Carne",6.5f);
//		lista[1]= new Animal(1,"Aguila","Aire","Pienso",0.5f);
//		lista[2]= new Animal(2,"Cebra","Tierra","Pienso",10f);
//		lista[3]= new Animal(3,"Pinguino","Agua","Pescado",1.5f);
//		lista[4]= new Animal(4,"Babuino","Tierra","Pienso",4.3f);
//		lista[5]= new Animal(5,"Buitre","Aire","Pienso",1.9f);
//		lista[6]= new Animal(6,"Tigre","Tierra","Carne",4.8f);
//		lista[7]= new Animal(7,"Cocodrilo","Agua","Carne",3.3f);
		rellenar(lista);
		informe(lista);
	}
	
	public static void rellenar(Animal lista[]) {
		Teclado ent=new Teclado();
		int seleccion;
		for (int i = 0; i < lista.length; i++) {
			lista[i]= new Animal();
			System.out.println("Ingrese el ID del animal");
			seleccion = ent.enteros();
			for (int j = 0; j < lista.length; j++) {
				if (lista[j].getId()==seleccion) {
					System.out.println("Ya existe un animal con ese ID");
					break;
				}else if(lista[j].getId()!=seleccion) {
					lista[i].setId(seleccion);
					System.out.println("Ingrese la raza del animal");
					lista[i].setRaza(ent.letras());
					lista[i].setHabitat();
					lista[i].setTipoComida();
					System.out.println("Ingrese la cantidad de comida");
					lista[i].setKgComida(ent.decimales());
					break;
				}
			}
		}
	}
	
	public static void informe(Animal lista[]) {
		String tierra="Los animales de tierra son: ";
		String agua="\nLos animales de agua son: ";
		String aire="\nLos animales de aire son: ";
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].getHabitat().equalsIgnoreCase("Tierra")) {
				tierra+="\n"+lista[i].toString();
			}else if(lista[i].getHabitat().equalsIgnoreCase("Agua")) {
				agua+="\n"+lista[i].toString();
			}else if(lista[i].getHabitat().equalsIgnoreCase("Aire")) {
				aire+="\n"+lista[i].toString();
			}
		}
		System.out.println(tierra+"\n"+agua+"\n"+aire);
		
		//Zona del metodo para calcular los kg de comida de la semana
		
		Calculos calc=new Calculos();
		float carne=0.0f;
		float pescado=0.0f;
		float pienso=0.0f;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].getTipoComida().equalsIgnoreCase("Carne")) {
				carne+=calc.multiplicacion(lista[i].getKgComida(),7);
			}else if(lista[i].getTipoComida().equalsIgnoreCase("Pescado")) {
				pescado+=calc.multiplicacion(lista[i].getKgComida(),7);
			}else if(lista[i].getTipoComida().equalsIgnoreCase("Pienso")) {
				pienso+=calc.multiplicacion(lista[i].getKgComida(),7);
			}
		}
		System.out.println("\nA la semana se consumen: \n"+carne+" Kg de Carne \n"+pescado+" Kg de Pescado \n"+pienso+" Kg de Pienso");
		
		
		// Zona del metodo para calcular el precio diario de las jaulas
		float terrestre=0;
		float acuatico=0;
		float aves=0;
		
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].getHabitat().equalsIgnoreCase("tierra")) {
				terrestre++;
			}else if (lista[i].getHabitat().equalsIgnoreCase("agua")) {
				acuatico++;
			}else if (lista[i].getHabitat().equalsIgnoreCase("aire")) {
				aves++;
			}
		}
		System.out.println("\nLos costes de mantenimiento diarios son: "+"\nPara jaulas terrestres: "+ terrestre*15+"\nPara jaulas de agua son: "+ acuatico*45+"\nPara jaulas de aves son: "+ aves*20+"\n");
	}
}
