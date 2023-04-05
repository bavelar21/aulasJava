import java.util.ArrayList;

public class Agenda {
	private ArrayList<Contato> contatos;
	
	public Agenda() {
		contatos = new ArrayList<Contato>();
	}
	
	public Agenda(ArrayList<Contato> contatos) {
		this.contatos = contatos;
	}
	
	public void adicionarContato(Contato contato) {
		if(contatos.contains(contato)) {
			System.out.println("O contato já foi adicionado à agenda!");
		}
		else {
			contatos.add(contato);
			System.out.println("Contato adicionado com sucesso!");
		}
	}
	
	public void removerContato(String nome) {
		boolean achou = false;
		for(int i = 0; i < contatos.size(); i++) {
			if((contatos.get(i)).getNome().toUpperCase().equals(nome.toUpperCase())) {
				contatos.remove(i);
				achou = true;
				System.out.println("Contato removido com sucesso!");
				break;
			}
		}
		if(!achou) {
			System.out.println("O contato não está na agenda!");
		}
	}
	
	public void buscarContato(String nome) {
		for(int i = 0; i < contatos.size(); i++) {
			if(contatos.get(i).getNome().toUpperCase().
					contains(nome.toUpperCase())) {
				System.out.println(contatos.get(i).toString());
			}
		}
	}
	
	public void alterarContato(String nome, String telefone, String email) {
		boolean achou = false;
		for(int i = 0; i < contatos.size(); i++) {
			if(contatos.get(i).getNome().toUpperCase().equals(nome.toUpperCase())) {
				contatos.get(i).setTelefone(telefone);
				contatos.get(i).setEmail(email);
				achou = true;
				System.out.println("Contato alterado com sucesso!");
				break;
			}
		}
		if(!achou) {
			System.out.println("O contato não está na agenda!");
		}
	}
	
	public void listarTodos() {
		for(int i = 0; i < contatos.size(); i++) {
			System.out.println(contatos.get(i).toString());
		}
	}
}
