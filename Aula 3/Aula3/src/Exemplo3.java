import java.util.Scanner;

public class Exemplo3 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("Informe um número: ");
		num = input.nextInt();
		if((num % 2 == 0) && (num % 5 == 0)) {
			System.out.println("O número é divisível por 2 e 5");
		}
	}
}
