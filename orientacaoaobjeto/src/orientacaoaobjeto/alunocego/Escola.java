package orientacaoaobjeto.alunocego;

import java.time.LocalDate;
import java.time.Month;

public class Escola {

	public static void main(String[] args) {
	
		Aluno a01 = new Aluno("12345","José",LocalDate.of(2000, Month.DECEMBER, 1),"Java");

		System.out.println(a01);
		
		System.out.println("idade: "+a01.getIdade());
		
		System.out.println("data de vencimento: "+a01.getDataVencimentoMatricula());
		
	}
}
