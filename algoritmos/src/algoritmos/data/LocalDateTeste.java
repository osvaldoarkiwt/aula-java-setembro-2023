package algoritmos.data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTeste {

	public static void main(String[] args) {
		
	
		LocalDate data = LocalDate.now();
		
		LocalTime tempo = LocalTime.now();
		
		LocalDateTime dataCompleta = LocalDateTime.now();
		
		
		System.out.println("data: "+data);
		
		System.out.println("hora: "+tempo);
		
		System.out.println("data completa: "+dataCompleta);

	}
}
