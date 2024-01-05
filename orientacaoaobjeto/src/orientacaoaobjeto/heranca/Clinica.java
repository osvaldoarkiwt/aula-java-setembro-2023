package orientacaoaobjeto.heranca;

import orientacaoaobjeto.heranca.enums.Especialidade;

public class Clinica {

	public static void main(String[] args) {
		
		Paciente p01 = new Paciente("123456789","110.805.002-60",
										"Rodrigo Marcos Enzo Carvalho",
										"Rua Trinta e Sete",
										"(65) 98306-5835");
		
		Medico m01 = new Medico("36545",Especialidade.NEUROLOGISTA,
								"202.943.587-22",
								"Esther Rafaela Heloisa da Rocha",
								"Rua Subestação 2",
								"(82) 2787-8280");
		
		System.out.println(p01);
		System.out.println(m01);
		
		
	}
}
