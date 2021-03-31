package clasesAvanzadas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Fechas {

	public static void main(String[] args) {
		LocalDate fecha=LocalDate.now();
		String nac="08/10/1988";
		
		LocalDate fecha2=LocalDate.parse(nac, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDate fecha1=fecha2.minusDays(3);
		System.out.println(fecha1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		Period dif= Period.between(fecha2,LocalDate.now());
		System.out.println(dif);
		System.out.println(aleatorio().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		
		
	}
	
	
	public static LocalDate aleatorio() {
		LocalDate fecha = LocalDate.now().minusDays((int)(Math.random()*80));
		return fecha;
	}
}
