import java.util.Scanner;

public class Exercicio2 {
	public static void main(String [] args) {
		java.util.Scanner input = new Scanner(System.in);
		int vetor[] = new int[10];
		int i, cont = 0, number;
		System.out.println("Preencha o vetor: ");
		for(i = 0; i < 10; i++) {
			System.out.println("Informe o número da posição " + i);
			vetor[i] = input.nextInt();
		}
		System.out.println("Informe o número a ser buscado: ");
		number = input.nextInt();
		for(i = 0; i < 10; i++) {
			if(vetor[i] == number) {
				cont++;
			}
		}
		System.out.println("O número aparece " + cont + " vezes no vetor.");
	}
}
