package clasesAvanzadas;

import utiles.Teclado;

public class Vehiculo {
	Teclado ent=new Teclado();
	private String marca;
	private String modelo;
	private String combustible;
	private int numAsientos;
	private float precio;
	
	public Vehiculo() {
		marca="";
		modelo="";
		combustible="";
		numAsientos=0;
		precio=0.0f;
	}
	
	public Vehiculo(String marca,String modelo,String combustible,int numAsientos,float precio) {
		this.marca=marca;
		this.modelo=modelo;
		this.combustible=combustible;
		this.numAsientos=numAsientos;
		this.precio=precio;
		
	}
	
	public String toString() {
		return  "~ Datos del vehiculo ~ "+"\n"+"· Marca: " +getMarca()+ "\n" + "· Modelo: "+getModelo()+"\n"+ "· Combustible: "+getCombustible()+"\n"+ "· Numero de Asientos: "+getNumAsientos()+"\n"+ "· Precio: "+getCombustible()+"\n¯\\(°_o)/¯";
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca() {
		System.out.println("Introduce la marca del vehiculo");
		String marca=ent.letras();
				
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo() {
		System.out.println("Introduce el modelo del vehiculo");
		String modelo=ent.deTodo();
				
		this.modelo = modelo;
	}
	public String getCombustible() {
		return combustible;
	}
	public void setCombustible() {
		System.out.println("Selecciona combustible"+"\n"+"· G - Gasolina"+"\n"+"· D - Diesel"+"\n"+"· H - Hibrido"+"\n"+"· E - Electrico");
		String eleccion=ent.letras();
		String comb="";
		switch(eleccion) {
		case "G":
		case "g":
			comb="Gasolina";
			break;
		case "D":
		case "d":
			comb="Diesel";
			break;
		case "H":
		case "h":
			comb="Hibrido";
			break;
		case "E":
		case "e":
			comb="Electrico";
			break;
		}
		
		this.combustible = comb;
	}
	public int getNumAsientos() {
		return numAsientos;
	}
	public void setNumAsientos() {
		System.out.println("Inserta el numero de asientos");
		int asientos=0;
		boolean correcto=false;
		do {
			
			asientos=ent.enteros();
			if (asientos>=1 && asientos<=8) {
				correcto=true;
			}else {
				System.out.println("Numero de asientos incorrecto");
			}
			
		}while(!correcto);
		
		this.numAsientos = asientos;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
}
