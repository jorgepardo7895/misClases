package clasesAvanzadas;

import utiles.Teclado;

public class Animal {
	Teclado ent=new Teclado();
	private int id;
	private String raza;
	private String habitat;
	private String tipoComida;
	private float kgComida;
	
	public Animal() {
		this.id=0;
		this.raza="";
		this.habitat="";
		this.tipoComida="";
		this.kgComida=0.0f;		
	}
	
	public Animal(int id,String raza,String habitat,String tipoComida,float kgComida) {
		this.id=id;
		this.raza=raza;
		this.habitat=habitat;
		this.tipoComida=tipoComida;
		this.kgComida=kgComida;
	}
	
	public String toString() {
		return "El animal con ID "+this.id+" de la raza "+this.raza+" vive en un habitat "+this.habitat+" se alimenta de "+this.tipoComida+" y come "+this.kgComida+ " Kg al dia";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat() {
		System.out.println("Seleccione el tipo de habitat"+"\n"+"·1 - Tierra"+"\n"+"·2 - Agua"+"\n"+"·3 - Aire");
		
		int selec=ent.enteros();
		switch(selec) {
		case 1:this.habitat="Tierra";
			break;
		case 2:this.habitat="Agua";
			break;
		case 3:this.habitat="Aire";
			break;
		default:
			setHabitat();
			break;
		}
	}
	public String getTipoComida() {
		return tipoComida;
	}
	public void setTipoComida() {
		System.out.println("Seleccione el tipo de comida"+"\n"+"·1 - Carne"+"\n"+"·2 - Pescado"+"\n"+"·3 - Pienso");
	
		int selec=ent.enteros();
		switch(selec) {
		case 1:this.tipoComida="Carne";
			break;
		case 2:this.tipoComida="Pescado";
			break;
		case 3:this.tipoComida="Pienso";
			break;
		default:
			setTipoComida();
			break;
		}
	}
	public float getKgComida() {
		return kgComida;
	}
	public void setKgComida(float kgComida) {
		this.kgComida = kgComida;
	}
}
