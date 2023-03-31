import java.util.ArrayList;

public class Conjunto {
	private ArrayList<Integer> conjunto;
	
	public Conjunto() {
		conjunto = new ArrayList<>();
	}
	
	public Conjunto(ArrayList<Integer> conjunto) {
		this.conjunto = conjunto;
	}
	
	public void adicionar(int numero) {
		if(!conjunto.contains((Integer)numero)) {
			System.out.println("Número adicionado com sucesso!");
			conjunto.add(numero);
		}
		else {
			System.out.println("O número já está no conjunto!");
		}
	}
	
	public void remove(int numero) {
		if(!conjunto.contains((Integer)numero)) {
			System.out.println("O número não pertence ao conjunto!");
		}
		else {
			conjunto.remove((Integer)numero);
			System.out.println("Número removido com sucesso!");
		}
	}
	
	public int busca(int numero) {
		return conjunto.indexOf((Integer)numero);
	}
	
	public int tamanho() {
		return conjunto.size();
	}
	
	public void imprime() {
		System.out.println(conjunto.toString());
	}
}
