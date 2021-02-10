package clasesAvanzadas;

public class Concesionario {
	
	public static void main(String args[]) {
		
		Vehiculo listaV[]= new Vehiculo[5];
		
		listaV[0]=new Vehiculo("Bmw","M3","Gasolina",4,30000.0f);
		listaV[0].setNumAsientos();
//		listaV[0].setCombustible();
//		listaV[0].setMarca();
//		listaV[0].setModelo();
//		
		
		System.out.println(listaV[0].toString());
	}

}
