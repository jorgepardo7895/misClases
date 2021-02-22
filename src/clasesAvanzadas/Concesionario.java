package clasesAvanzadas;


public class Concesionario {
	
	public static void main(String args[]) {
		
		Vehiculo listaV[]= new Vehiculo[5];

		for (int i = 0; i < listaV.length; i++) {
			listaV[i]= new Vehiculo();
			listaV[i].setMarca();
			listaV[i].setModelo();	
			listaV[i].setCombustible();			
			listaV[i].setNumAsientos();
			System.out.println(listaV[i].toString());
		}
	}
}
