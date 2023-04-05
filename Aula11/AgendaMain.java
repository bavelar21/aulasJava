import java.util.Scanner;

public class AgendaMain {
	public static void main(String [] args) {
		int op;
		Agenda agenda = new Agenda();
		Scanner input = new Scanner(System.in);
		System.out.println("Escolha uma opção:\n"
				+ "0 - Listar todos\n"
				+ "1 - Adicionar contato\n"
				+ "2 – Remover contato\n"
				+ "3 – Buscar contato pelo nome\n"
				+ "4 – Alterar contato\n"
				+ "5 - Sair");
		op = input.nextInt();
		input.nextLine();
		while(op != 5) {
			switch(op) {
				case 0: {
					agenda.listarTodos();
					break;
				}
				case 1:{
					String nome, telefone, email;
					System.out.println("Informe o nome do contato:");
					nome = input.nextLine();
					System.out.println("Informe o telefone do contato:");
					telefone = input.nextLine();
					System.out.println("Informe o email do contato:");
					email = input.nextLine();
					Contato contato = new Contato(nome, telefone, email);
					agenda.adicionarContato(contato);
					break;
				}
				case 2:{
					String nome;
					System.out.println("Informe o nome do contato:");
					nome = input.nextLine();
					agenda.removerContato(nome);
					break;
				}
				case 3:{
					String nome;
					System.out.println("Informe o nome do contato:");
					nome = input.nextLine();
					agenda.buscarContato(nome);
					break;
				}
				case 4:{
					String nome, telefone, email;
					System.out.println("Informe o nome do contato a ser alterado:");
					nome = input.nextLine();
					System.out.println("Informe o telefone do contato:");
					telefone = input.nextLine();
					System.out.println("Informe o email do contato:");
					email = input.nextLine();
					agenda.alterarContato(nome, telefone, email);
					break;
				}
				case 5:{
					break;
				}
				default:{
					System.out.println("Opção inválida! Escolha novamente!");
				}
			}
			System.out.println("Escolha uma opção:\n"
					+ "0 - Listar todos\n"
					+ "1 - Adicionar contato\n"
					+ "2 – Remover contato\n"
					+ "3 – Buscar contato pelo nome\n"
					+ "4 – Alterar contato\n"
					+ "5 - Sair");
			op = input.nextInt();
			input.nextLine();
		}
	}
}
