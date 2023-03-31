
public class Jogador {
	private String nome;
	private int numero;
	private String apelido;
	private int cartoes;
	private boolean suspenso;
	
	public Jogador() {
		cartoes = 0;
		suspenso = false;
	}
	
	public Jogador(String nome, int numero, String apelido) {
		this.nome = nome;
		this.numero = numero;
		this.apelido = apelido;
		cartoes = 0;
		suspenso = false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public int getCartoes() {
		return cartoes;
	}

	public void setCartoes(int cartoes) {
		this.cartoes = cartoes;
	}

	public boolean isSuspenso() {
		return suspenso;
	}

	public void setSuspenso(boolean suspenso) {
		this.suspenso = suspenso;
	}
	
	public int adicionaCartao() {
		return ++cartoes;
	}
	
	public int removeCartao() {
		return --cartoes;
	}
	
	public void zeraCartoes() {
		cartoes = 0;
	}
}
