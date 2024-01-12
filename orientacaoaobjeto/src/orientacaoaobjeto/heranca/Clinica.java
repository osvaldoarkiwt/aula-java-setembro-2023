package orientacaoaobjeto.heranca;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import orientacaoaobjeto.heranca.enums.Especialidade;

public class Clinica {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		Scanner leitor = new Scanner(System.in);
		
		boolean continua = true;
		
		int opcao = 0;
		Long consultaId = 1L;
		
		Paciente p01 = new Paciente("123456789","110.805.002-60",
										"Rodrigo Marcos Enzo Carvalho",
										"Rua Trinta e Sete",
										"(65) 98306-5835");
		
		List<Medico> lista = getMedicos();
		
		List<Consulta> consultas = new ArrayList<>();
		
		while(continua) {

			System.out.println();
			System.out.println();
			System.out.println();
					
			
			System.out.println("Digite a opção que você deseja escolher");
			System.out.println("1-ver médicos disponíveis\n"
							 + "2-marcar consulta\n"
							 + "3-visualizar consultas\n"	
							 + "4-desmarcar consulta\n"
							 + "5-sair");
			opcao = leitor.nextInt();
			
			switch(opcao) {
				
				case 1: mostraMedicos(lista); break;
				
				case 2: agendarConsulta(consultaId, leitor, p01, consultas, lista); break;
				
				case 3: if(consultas.size()!=0) {
							System.out.println(consultas);
						}else {
							System.out.println("Não existem consultas agendadas.");
						}
						break;
						
				case 4: if(consultas.size()!=0) {
							System.out.println("Digite o número da consulta que deseja desmarcar, se não souber olhe na opção 3 :)");
							int escolha = leitor.nextInt();
							
							if(escolha-1 <=consultas.size()) {
								
								Consulta consulta = consultas.get(escolha);
							}else {								
								System.out.println("Escolha uma consulta válida. Para mais informações vide opção 03 :)");
							}
							
							
						}else {
							System.out.println("Não existem consultas agendadas.");
						}
						break;
				
				case 5: continua = false; break;
			}
		}
		
		
		
		
		
/*
		
		Consulta c01 = new Consulta(1L,Especialidade.NEUROLOGISTA,p01,m01,
									LocalDate.of(2024, Month.JANUARY, 20),
									LocalTime.of(15, 30));
		
		//System.out.println(p01);
		//System.out.println(m01);
		System.out.println(c01);
*/		
		
	}

public static List<Medico> getMedicos(){
	
	Medico m01 = new Medico("36545",Especialidade.NEUROLOGISTA,
			"614.626.253-63",
			"Arthur Marcelo Anthony Monteiro",
			"Rua Doutor Renato Mazzi Lucas",
			"(79) 3482-0019");
	
	Medico m02 = new Medico("12128",Especialidade.CARDIOLOGISTA,
			"202.943.587-22",
			"Esther Rafaela Heloisa da Rocha",
			"Rua Subestação 2",
			"(82) 2787-8280");
	
	Medico m03 = new Medico("397911",Especialidade.CLINICO_GERAL,
			"031.027.995-07",
			"Carlos Marcelo Pedro Henrique Gonçalves",
			"Rua E",
			"(51) 98266-2085");
	
	
	List<Medico> medicos = new ArrayList<>();
	
	medicos.addAll(Arrays.asList(m01,m02,m03));
	
	return medicos;
}

public static void mostraMedicos(List<Medico> lista) {
	
	for(Medico medico : lista) {
		System.out.println(medico.getNome().split(" ")[0]+"-"
						  +medico.getEspecialidade());
	}
}

public static void agendarConsulta(Long consultaId, Scanner leitor, Paciente p01, List<Consulta>consultas, List<Medico> lista) {
	
	System.out.println("Escolha a especialidade");
	for(Medico m : lista) {
		
		System.out.print((lista.indexOf(m)+1)+"-"+m.getEspecialidade()+" ");
	}
	int escolha = leitor.nextInt() -1;
	Medico medico = lista.get(escolha);
	
	System.out.println("Escolha o dia");
	int dia = leitor.nextInt();
	
	System.out.println("Escolha o mês");
	int mes = leitor.nextInt();
	
	int ano = LocalDate.now().getYear();
	
	LocalDate data = LocalDate.of(ano, mes, dia);
	
	System.out.println("Escolha a hora formato 24hs");
	int hora = leitor.nextInt();
	
	LocalTime horaConsulta = LocalTime.of(hora, 0);
	
	String espEnum = medico.getEspecialidade();
	
	Consulta c = new Consulta(consultaId,Especialidade.valueOf(espEnum.toUpperCase()),
							 p01,medico,data,horaConsulta);
	
	consultas.add(c);
	
}

}