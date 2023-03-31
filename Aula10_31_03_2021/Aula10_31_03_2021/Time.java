import java.util.ArrayList;

public class Time {
	private String nome;
	private ArrayList<Jogador> jogadores;
	
	public Time() {
		jogadores = new ArrayList<Jogador>();
	}
	
	public Time(String nome, ArrayList<Jogador> jogadores) {
		this.nome = nome;
		this.jogadores = jogadores;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
	
	public void adicionarJogador(Jogador jogador) {
		if(!jogadores.contains(jogador)) {
			jogadores.add(jogador);
			System.out.println("Jogador adicionado com sucesso!");
		}
		else {
			System.out.println("O jogador já está no time!");
		}
	}
	
	public void removerJogador(String nome) {
		for(int i = 0; i < jogadores.size(); i++) {
			if(jogadores.get(i).getNome().equals(nome)) {
				jogadores.remove(i);
			}
		}
	}
	
	public int quantidadeDeJogadores() {
		return jogadores.size();
	}
	
	public int quantidadeJogadoresSuspensos() {
		int cont = 0;
		for(int i = 0; i < jogadores.size(); i++) {
			if(jogadores.get(i).isSuspenso()) {
				cont++;
			}
		}
		return cont;
	}
	
	public int totalCartoes() {
		int cont = 0;
		for(int i = 0; i < jogadores.size(); i++) {
			cont += jogadores.get(i).getCartoes();
		}
		return cont;
	}
}
