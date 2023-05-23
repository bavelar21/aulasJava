import java.util.ArrayList;
import java.util.Collections;

public class TestaString {
	public static void main(String [] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Pedro");
		nomes.add("Jonas");
		nomes.add("Vitória");
		nomes.add("Júlia");
		nomes.add("Shirley");
		
		System.out.println("Antes da ordenação: " + nomes);
		Collections.sort(nomes);
		System.out.println("Depois da ordenação: " + nomes);
		
		System.out.println("Busca binária pelo nome Jonas: " + Collections.binarySearch(nomes, "Jonas"));
		
		System.out.println("Menor elemento: " + Collections.min(nomes));
		System.out.println("Maior elemento: " + Collections.max(nomes));
		Collections.reverse(nomes);
		
		System.out.println("Lista invertida: " + nomes);
	}
}
