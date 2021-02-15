package clasesAvanzadas;

public class Habitaciones {
	// Atributos de la Clase
	int numCamas;
	String tipoCama;
	boolean ventana;
	boolean terraza;
	boolean reservado;
	float precio;
	String dni;
	
	//Constructores
	public Habitaciones() {
		numCamas=0;
		tipoCama="";
		ventana=false;
		terraza=false;
		reservado=true;
		precio=0.0f;
		dni="";
	}
	public Habitaciones(int numCamas,String tipoCama, boolean ventana, boolean terraza,boolean reservado,float precio) {
		this.numCamas=numCamas;
		this.tipoCama=tipoCama;
		this.ventana=ventana;
		this.terraza=terraza;
		this.reservado=reservado;
		this.precio=precio;
		this.dni="";
	}
	
	//Métodos toString normal y uno con algún filtro
	public String toString() {
		String frase=" cuenta con: "+numCamas+" "+tipoCama +"\t"+" Ventana: "+getVentana()+"\t"+" Terraza: "+getTerraza()+"\t"+" Reservado: "+getReservado()+"\t"+" Precio/dia: "+precio+"€";
		frase=frase.toString();
		
		return frase;
	}
	public String disponibles() {
		String frase="";
		if (!this.reservado) {
			frase=" cuenta con: "+numCamas+" "+tipoCama +"\t"+" Ventana: "+getVentana()+"\t"+" Terraza: "+getTerraza()+"\t"+" Reservado: "+getReservado()+"\t"+" Precio/dia: "+precio+"€";
			frase=frase.toString();
		}
		
		return frase;
	}
	
	//Getters y setters
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getTipoCama() {
		return tipoCama;
	}
	public void setTipoCama(String tipoCama) {
		this.tipoCama = tipoCama;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getReservado() {
		String resp="";
		
		if (this.reservado) {
			resp="Si";
		}else if (!this.reservado) {
			resp="No";
		}
		return resp;
	}
	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}
	public int getNumCamas() {
		
		return numCamas;
	}
	public void setNumCamas(int numCamas) {
		this.numCamas = numCamas;
	}
	public String getVentana() {
		String resp="";
		
		if (this.ventana) {
			resp="Si";
		}else if (!this.ventana) {
			resp="No";
		}
		return resp;
	}
	public void setVentana(boolean ventana) {
		this.ventana = ventana;
	}
	public String getTerraza() {
		String resp="";
		
		if (this.terraza) {
			resp="Si";
		}else if (!this.terraza) {
			resp="No";
		}
		return resp;
	}
	public void setTerraza(boolean terraza) {
		this.terraza = terraza;
	}
}
