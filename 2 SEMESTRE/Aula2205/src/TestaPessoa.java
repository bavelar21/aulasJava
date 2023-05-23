import java.util.ArrayList;
import java.util.Collections;

public class TestaPessoa {
	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		Pessoa p1 = new Pessoa("Junior Cleber", "342-234-123-45","20/05/1998");
		Pessoa p2 = new Pessoa("Fernanda Assís", "098-234-231-16","12/07/1990");
		
		pessoas.add(p1);
		pessoas.add(p2);
		
		System.out.println("Antes da ordenação: " + pessoas);
		
		Collections.sort(pessoas);
		
		System.out.println("Depois da ordenação: " + pessoas);

	}

}
