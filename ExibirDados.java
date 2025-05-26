package FitChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExibirDados {
	Scanner sc = new Scanner(System.in);

	Desafios desafios;
	Usuario usuario;
	Integer opcoes;
	String recadastro = "SIM";
	Boolean menu = true;

	List<Desafios> listaDesafios = new ArrayList<>();
	
	public ExibirDados() {;
	}

	public void mostrarMenu() {
		while(menu = true) {
			System.out.println("=====================");
			System.out.println("Fit Challenge");
			System.out.println("=====================");
			System.out.println();
			System.out.println("1 - Cadastrar usuário");
			System.out.println("2 - Exibir dados do usuário");
			System.out.println("3 - Adicionar metas");
			System.out.println("4 - Listar metas");
			System.out.println("5 - Sair");
			System.out.println();
			System.out.print("Digite a opção que deseja: ");
			opcoes = sc.nextInt();
			System.out.println();

			switch (opcoes) {
			case 1:
				sc.nextLine();
				System.out.print("Digite seu nome: ");
				String nome = sc.nextLine();
				System.out.print("Digite seu email: ");
				String email = sc.nextLine();

				usuario = new Usuario(nome, email);
				break;
			case 2:
				if(usuario != null) {
					System.out.println("Nome do usuário: " + usuario.getNome());
					System.out.println("Nome do usuário: " + usuario.getEmail());
					break;
				} else {
					System.out.println("Usuário não encontrado!");
					break;
				}

			case 3:
				while(recadastro.equals("SIM")) {

					sc.nextLine();
					System.out.print("Nome do desafio: ");
					String nomeDesafio = sc.nextLine();
					System.out.print("Adicione uma descrição do desafio: ");
					String descricaoDesafio = sc.nextLine();
					System.out.print("Qual será a meta diária do desafio? ");
					String metaDiaria = sc.nextLine();
					System.out.print("Período (em dias) de duração do desafio: ");
					Integer diasDesafio = sc.nextInt();
					System.out.println();

					desafios = new Desafios(nomeDesafio, metaDiaria, descricaoDesafio, diasDesafio);
					listaDesafios.add(desafios);

					System.out.println("Desafio cadastrado com sucesso!");
					System.out.println();

					System.out.print("Deseja cadastrar outro desafio? [SIM/NÃO] ");
					sc.nextLine();
					recadastro = sc.next().toUpperCase();
					System.out.println();

				}
				break;

			case 4:
				if(!listaDesafios.isEmpty()) {
					int i = 1;
					for(Desafios lista : listaDesafios) {
						System.out.printf("--- Desafio: %d%n ---", i);
						System.out.println();
						System.out.println("Nome do desafio: " + lista.getNomeDesafio());
						System.out.println("Descrição do desafio: " + lista.getDescricaoDesafio());
						System.out.println("Meta diária do desafio: " + lista.getMetaDiaria());
						System.out.println("Duração do desafio: " + lista.getDiasDesafio());
						System.out.println();
						i++;
					}
				} else {
					System.out.println("Seus desafios ainda não foram cadastrados!");
				}
				break;


			}

		}

	}


}


