import java.util.Scanner;

public class Exercicio1 {
	public static void main(String [] args) {
		java.util.Scanner input = new Scanner(System.in);
		int vetor[] = new int[10];
		int pos;
		System.out.println("Informe 10 números: ");
		for(pos = 0; pos < 10; pos++) {
			vetor[pos] = input.nextInt();
		}	
	for(pos = 0; pos < 10; pos++) {
		if(vetor[pos] % 2 == 0) {
			System.out.println("O número " + vetor[pos] + " da posição "+ pos + " é par!");
			}
		}
	}
}
	