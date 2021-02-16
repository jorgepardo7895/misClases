package clasesAvanzadas;

import utiles.Calculos;
import utiles.Teclado;

public class Hotel {

	public static void main(String[] args) {
		Habitaciones listHab[]= new Habitaciones[6];
		Teclado ent=new Teclado();
		
		
		listHab[0]= new Habitaciones(1,"Cama de Matrimonio",true,false,false,30.00f);
		listHab[1]= new Habitaciones(1,"Cama de Matrimonio",true,false,true,30.00f);
		listHab[2]= new Habitaciones(1,"Cama de Matrimonio",false,true,false,40.00f);
		listHab[3]= new Habitaciones(2,"Camas Individuales",true,false,true,20.00f);
		listHab[4]= new Habitaciones(2,"Camas Individuales",true,false,false,20.00f);
		listHab[5]= new Habitaciones(2,"Camas Individuales",false,true,false,25.00f);
		
		System.out.println("-->Bienvenido al Hotel Paraiso *** <--");
		
		menuOpciones(ent,listHab);
	}
	//Menú de opciones con switch que nos va llamando a distintos métodos dependiendo de la elección del usuario
	public static void menuOpciones(Teclado ent, Habitaciones listHab[]) {
		System.out.println("Seleccione la opcion que desee"+"\n"+ "·1 - Listado de Habitaciones"+"\n"+"·2 - Reservar"+"\n"+"·3 - Devolver habitación"+"\n"+"·4 - Salir del programa");
		int seleccion=0;
		seleccion = ent.enteros();
		
		switch(seleccion) {
		case 1:
			mostrar(ent,listHab);
			break;
		case 2:
			reserva(ent,listHab);
			break;
		case 3:
			devolver(ent,listHab);
			break;
		case 4:
			System.out.println("Gracias por su visita");
			return;
		}
		
	}
	
	
	//Método para realizar las reservas de habitaciones, nos muestra las habitaciones disponibles y luego tenemos que seleccionar la opción que deseemos
	public static void reserva(Teclado ent,Habitaciones listHab[]) {
		mostrarDisponibles(listHab);
		System.out.println("Seleccione la habitación disponible que desee");
		int seleccion=0;
		seleccion=ent.enteros()-101;
		
		if (listHab[seleccion].reservado) {
			System.out.println("POR FAVOR SELECCIONE UNA HABITACIÓN LIBRE");
			reserva(ent,listHab);
		}else if (!listHab[seleccion].reservado) {
			listHab[seleccion].setDni(ent.dni());
			System.out.println(listHab[seleccion].getDni());
			listHab[seleccion].setReservado(true);
			System.out.println("Gracias por su reserva. Ha seleccionado la habitación "+(seleccion+101)+" de "+listHab[seleccion].getNumCamas()+" "+listHab[seleccion].getTipoCama()+"\t con Terraza: "+listHab[seleccion].getTerraza()+"\t con Ventana: "+listHab[seleccion].getVentana()+"\t Precio: "+listHab[seleccion].getPrecio()+"€/dia");
			menuOpciones(ent, listHab);
		}		
	}
	
	
	//Método que nos muestra todas las habitaciones y sus características estén reservadas o no
	public static void mostrar(Teclado ent,Habitaciones listHab[]) {
		System.out.println("Estas son nuestras habitaciones");
		String frase="";
		for (int i = 0; i < listHab.length; i++) {
			frase+= "La habitación "+ (i+101)+listHab[i].toString()+"\n";
		}
		System.out.println(frase);
		menuOpciones(ent,listHab);
	}
	
	
	//Método que solo nos muestra las habitaciones disponibles
	public static void mostrarDisponibles(Habitaciones listHab[]) {
		String frase="";
		for (int i = 0; i < listHab.length; i++) {
			if (listHab[i].getReservado().equalsIgnoreCase("no")) {
				frase+= "La habitación "+ (i+101)+listHab[i].disponibles()+"\n";
			}
		}
		System.out.println(frase);	
	}
	
	
	//Método para devolver las habitaciones, con un bucle comprobamos el dni del usuario y cuando coincida con una reserva se ejecutará un syso con el total,
	//si no coincide se pedirá volver a intentarlo.
	public static void devolver(Teclado ent, Habitaciones listHab[]) {
		Calculos cal=new Calculos();
		int dias= (int)(Math.random()*5)+1;
		String dni="";
		dni=ent.dni();
		for (int i = 0; i < listHab.length; i++) {
			if (listHab[i].getDni().equalsIgnoreCase(dni)) {
				System.out.println("Gracias por su estancia. El precio de "+dias+" dias de estancia es "+ cal.multiplicacion(listHab[i].getPrecio(),dias)+" €"+"\n"+"\n"+"\n");
				listHab[i].setReservado(false);
				listHab[i].setDni("");
				break;
			}else {
				System.out.println("Su Dni no está registrado en el hotel, vuelva a intentarlo");
				devolver(ent, listHab);	
			}
		}
		menuOpciones(ent,listHab);
		
	}
}
