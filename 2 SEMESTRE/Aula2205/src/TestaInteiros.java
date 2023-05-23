import java.util.ArrayList;
import java.util.Collections;

public class TestaInteiros {
	public static void main(String [] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(20);
		numeros.add(50);
		numeros.add(0);
		numeros.add(10);
		
		System.out.println("Antes da ordenação: " + numeros);
		Collections.sort(numeros);
		System.out.println("Depois da ordenação: " + numeros);
		
		System.out.println("Busca binária pelo elemento 0: " + Collections.binarySearch(numeros, 320));
		
		System.out.println("Conjuntos disjuntos: " + Collections.disjoint(numeros, numeros));
		
		numeros.add(20);
		numeros.add(20);
		
		System.out.println("Frequência do elemento 20: " + Collections.frequency(numeros, 20));
		
		System.out.println("Menor Elemento: " + Collections.min(numeros));
		System.out.println("Maior Elemento: " + Collections.max(numeros));
		
		Collections.sort(numeros);
		Collections.reverse(numeros);
		System.out.println("Invertendo a lista: " + numeros);
	}
}
