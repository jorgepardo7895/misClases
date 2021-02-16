package utiles;

public class Calculos {
	
	
	public int sumaEntero(int num1,int num2) {
		
		return num1+num2;
	}
	public int restaEntero(int num1,int num2) {
		
		return num1-num2;
	}
	public float multiplicacion(float num1,float num2) {
		
		return dosDecimales(num1*num2);
	}
	public float division(float num1,float num2) {
		float result=0;
		if (num2==0) {
			System.out.println("No se puede dividir entre 0");
			result=0;
		}else {
			result=num1/num2;
			
		}
		return dosDecimales(result);
	}
	public float sumaDecimal(float num1,float num2) {
		float suma=num1+num2;
		
		return dosDecimales(suma);
	}
	public float dosDecimales(float num) {
		String numero=num+"";
		String aux="";
		float res=0;
		String result=String.format("%.2f",Float.parseFloat(numero));
		for (int i = 0; i < result.length(); i++) {
			if (Character.isDigit(result.charAt(i))||result.charAt(i)=='.') {
				aux+=result.charAt(i);
			}else if(result.charAt(i)==',') {
				aux+='.';
			}
		}
		res = Float.parseFloat(aux);
		return res;
		
	}
}
