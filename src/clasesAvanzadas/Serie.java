package clasesAvanzadas;

public class Serie {
	//atributos de la clase
	public String nombre;
	public boolean fin;
	public int temporadas;
	public float rating;
	
	//contructor por defecto
	public Serie() {
		nombre="";
		fin=false;
		temporadas=0;
		rating=0.0f;
	}
	
	//constructor con parametros
	public Serie(String nombre, boolean fin, int temporadas, float rating) {
		this.nombre=nombre;
		this.fin=fin;
		this.temporadas=temporadas;
		this.rating=rating;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isFin() {
		return fin;
	}

	public void setFin(boolean fin) {
		this.fin = fin;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}
}