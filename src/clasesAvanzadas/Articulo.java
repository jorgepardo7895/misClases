package clasesAvanzadas;

public class Articulo {

	public String nombre;
	public float precio;
	public int cantidad;

	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return "El articulo es "+nombre;
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
