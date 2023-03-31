
public class Participante {
	private String nome;
	private int idade;
	private double peso;
	private double altura;
	
	public Participante() {
		
	}
	
	public Participante(String nome, int idade, double peso, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public String toString() {
		return "Nome: " + nome + "\n" +
			   "Idade: " + idade + "\n"+
			   "Peso: " + peso + "\n" +
			   "Altura: " + altura + "\n";
	}
	
}
