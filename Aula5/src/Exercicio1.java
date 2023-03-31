import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String [] args) {
		ArrayList<Integer> conjunto = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		int number;
		System.out.println("Informe um número: ");
		number = input.nextInt();
		while(number != -1) {
			if(!conjunto.contains(number)) {
				conjunto.add(number);
			}
			else {
				System.out.println("O conjunto já contém o número!");
			}
			System.out.println("Informe um número: ");
			number = input.nextInt();
		}
		System.out.println("Conjunto oedenado: ");
		Collections.sort(conjunto);
		System.out.println(conjunto.toString());
	}
}
