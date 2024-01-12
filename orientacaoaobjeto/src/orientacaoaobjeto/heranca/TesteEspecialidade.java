package orientacaoaobjeto.heranca;

import orientacaoaobjeto.heranca.enums.Especialidade;

public class TesteEspecialidade {

	public static void main(String[] args) {
		
		for(Especialidade e : Especialidade.values()) {
			System.out.println(e);
			System.out.println(Especialidade.valueOf("NEUROLOGISTA"));
		}
		

	}
}
