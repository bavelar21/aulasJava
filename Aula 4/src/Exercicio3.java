import java.util.Scanner;

public class Exercicio3 {
	public static void main(String [] args) {
		java.util.Scanner input = new Scanner(System.in);
		String vetor[] = new String[10];
		String name;
		int i, cont = 0;
		System.out.println("Preenchendo  o vetor:");
		for(i = 0; i < 10; i++) {
			System.out.println("Informe o nome da posição " + i);
			vetor[i] = input.nextLine().toLowerCase();
		}
		System.out.println("Informe o nome a ser buscado:");
		name = input.nextLine().toLowerCase();
		for(i = 0; i < 10; i++) {
			if(vetor[i].contains(name)) {
				cont++;
			}
		}
		System.out.println(cont + " pessoas possuem " + "o nome " + name);
	}
}