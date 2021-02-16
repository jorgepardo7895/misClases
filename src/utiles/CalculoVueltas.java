package utiles;

public class CalculoVueltas {
	//atibutos
	private float monedas[];
	private float entrega;
	private float aPagar;
	private float resto;
	//constructor
	public CalculoVueltas() {
		monedas= new float[]{2.00f,1.00f,0.50f,0.20f,0.10f,0.05f,0.02f,0.01f};
		entrega=0.0f;
		aPagar=0.0f;
		resto=0.0f;
	}
	public float[] getMonedas() {
		return monedas;
	}
	public void setMonedas(float[] monedas) {
		this.monedas = monedas;
	}
	public float getEntrega() {
		return entrega;
	}
	public void setEntrega(float entrega) {
		this.entrega = entrega;
	}
	public float getaPagar() {
		return aPagar;
	}
	public void setaPagar(float importe) {
		this.aPagar = importe;
	}
	public void calculoResto(float importe, float entrega) {
		this.resto=entrega-importe;

	}
	public float getResto() {
		return resto;
	}
	public void setResto(float resto) {
		this.resto = resto;
	}	
	public String monedas() {
		String monedas="";
		String aux="";
		float devolucion=this.resto;
		int cont=0;
		while(devolucion>0.0f) {
			for (int i = 0; i < this.monedas.length; i++) {
				if (this.monedas[i]<=devolucion) {
					aux=cont+" moneda/s de "+this.monedas[i];
				}
			}
			monedas+=aux;
			
		}
		
		
		return monedas;
	}

		
	
	
}
