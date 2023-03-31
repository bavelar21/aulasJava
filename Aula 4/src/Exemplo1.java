import java.util.Scanner;

public class Exemplo1 {
	public static void main(String [] args) {
		java.util.Scanner input = new Scanner(System.in);
		int vetor[] = new int[10];
		int number, i, position = -1;
		boolean found = false;
		System.out.println("Informe 10 números: ");
		for(i = 0; i < 10; i++) {
			vetor[i] = input.nextInt();
		}
		System.out.println("Informe um número a ser buscado: ");
		number = input.nextInt();
		for(i = 0; i < 10; i++) {
			if(vetor[i] == number) {
				found = true;
				position = i;
				break;
			}
		}
		if(found) {
			System.out.println("O número está no vetor na posição: " + position);
		}
		else {
			System.out.println("O número não está no vetor");
		}
	}
	
	
}
