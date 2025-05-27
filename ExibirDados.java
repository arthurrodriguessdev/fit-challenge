package FitChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExibirDados { //Classe para entrada de dados do usuário
	Scanner sc = new Scanner(System.in);

	//Atributos
	Desafios desafios; //Atributos da classe Desafios
	Usuario usuario; //Atributos da classe Usuario
	Integer opcoes; 
	String recadastro = "SIM";
	Boolean menu = true;

	List<Desafios> listaDesafios = new ArrayList<>(); //Definição e instanciação da lista de desafios
	
	//Métodos
	public ExibirDados() {
		
	};

	public void mostrarMenu() {
		while(menu) {
			System.out.println("=====================");
			System.out.println("Fit Challenge");
			System.out.println("=====================");
			System.out.println();
			System.out.println("1 - Cadastrar usuário");
			System.out.println("2 - Exibir dados do usuário");
			System.out.println("3 - Adicionar desafios");
			System.out.println("4 - Remover desafios");
			System.out.println("5 - Listar desafios");
			System.out.println("6 - Sair");
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
				System.out.println();

				usuario = new Usuario(nome, email);
				break;
				
			case 2:
				if(usuario != null) {
					System.out.println("Nome do usuário: " + usuario.getNome());
					System.out.println("E-mail do usuário: " + usuario.getEmail());
					System.out.println();
					break;
				} else {
					System.out.println("Usuário não encontrado!");
					System.out.println();
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

					desafios = new Desafios(nomeDesafio, metaDiaria, descricaoDesafio, diasDesafio); //Objeto desafios recebe dados dos desafios
					listaDesafios.add(desafios); //Adiciona cada desafio na lista

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
					System.out.println("Sua lista de desafios: ");
					System.out.println();
					
					int i = 1;
					
					for(Desafios lista : listaDesafios) {
						System.out.printf("Desafio %d: %s%n", i, lista.getNomeDesafio());
						i++;
					}
					
					System.out.println();
					System.out.print("Digite o número do desafio que você deseja remover (ordem de inserção): ");
					opcoes = sc.nextInt();
					
					if(opcoes >= 1 && opcoes <= listaDesafios.size()) {
						listaDesafios.remove(opcoes - 1);
						System.out.println();
						System.out.println("Desafio removido com sucesso!");
						System.out.println();
					} else {
						System.out.println();
						System.out.println("Esse desafio não existe!");
						System.out.println();
					}
					
				} else {
					System.out.println("Você não possui desafios adicionados!");
					System.out.println();
				}
				
				break;

			case 5:
				if(!listaDesafios.isEmpty()) { //Se a lista não estiver vazia, exibirá os desafios contidos nela
					int i = 1;
					for(Desafios lista : listaDesafios) {
						System.out.printf("--- Desafio: %d ---%n", i);
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
				
			case 6:
				System.out.println("----- SAÍDA CONCLUÍDA ----");
				menu = false; //Atribui o valor false ao menu, para a execução do while
			}

		}

	}

}