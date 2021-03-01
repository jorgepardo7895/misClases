package clasesAvanzadas;

public class Cacharro {
	
	//atributos de clase
	private String marca;
	private String tipo;
	private float consumo;
	
	//constructores
	public Cacharro() {
		marca="";
		tipo="";
		consumo=0.0f;
	}
	
	public Cacharro(String marca, String tipo, float consumo) {
		this.marca=marca;
		this.tipo=tipo;
		this.consumo=consumo;
	}
	
	//Getters y Setters
	public String toString() {
		
		return "· Marca: " +getMarca()+ "\n" + "· Tipo: "+getTipo()+"\n"+ "· Consumo: "+getConsumo();
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