package clasesAvanzadas;

public class Articulo {
	
	//atributo de las isntancias
	public int id;
	public String nombre;
	public float precio;
	public int cantidad;
	
	//atributo de classe
	public static int stock=0;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setPrecio(float precio) {
		this.precio=precio;
	}
	
	public float getPrecio() {
		return precio;
	}
	
	public void setCantidad(int cantidadEntera) {
		this.cantidad=cantidadEntera;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public float getTotal() {
		return cantidad*precio;
	}
}
