
public class TestaConjunto {
	public static void main(String [] args) {
		Conjunto c = new Conjunto();
		c.adicionar(2);
		c.adicionar(4);
		c.adicionar(3);
		c.imprime();
		System.out.println("Posição do número 4: " +c.busca(4));
		c.remove(2);
		c.imprime();
	}
}
