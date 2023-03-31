import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Exemplo1 {
	public static void main(String [] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(3);
		numeros.add(5);
		numeros.add(6);
		System.out.println(numeros.toString());
		System.out.println("Antes: " + numeros.size());
		numeros.add(10);
		System.out.println(numeros.toString());
		System.out.println("Depois: " + numeros.size());
		for(int i = 0; i < numeros.size(); i++) {
			System.out.println("["+i+"]: " + numeros.get(i));
		}
		numeros.remove(2);
		System.out.println("ArrayList pós remoção: \n" + numeros.toString());
		Integer objeto_numero = 5;
		numeros.remove(objeto_numero);
		System.out.println("ArrayList pós remoção: \n" + numeros.toString());
		objeto_numero = 4;
		System.out.println(numeros.contains(objeto_numero));
		numeros.set(0, objeto_numero);
		System.out.println("ArrayList pós alteração: \n" + numeros.toString());
		numeros.add(0);
		numeros.add(20);
		numeros.add(7);
		System.out.println("ArrayList antes da ordenação: \n" + numeros);
		Collections.sort(numeros);
		System.out.println("ArrayList depois da ordenação: \n" + numeros);
	}
}
