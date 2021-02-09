package clasesAvanzadas;

public class Cacharros {
	
	//atributos de clase
	private String marca;
	private String tipo;
	private float consumo;
	
	//constructores
	public Cacharros() {
		marca="";
		tipo="";
		consumo=0.0f;
	}
	
	public Cacharros(String marca, String tipo, float consumo) {
		this.marca=marca;
		this.tipo=tipo;
		this.consumo=consumo;
	}
	
	//Getters y Setters
	public String GetTodo() {
		String datos="Marca: "+this.marca+", Tipo"+this.tipo+", "+this.consumo;
		return datos;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getConsumo() {
		return consumo;
	}

	public void setConsumo(float consumo) {
		this.consumo = consumo;
	}	
}