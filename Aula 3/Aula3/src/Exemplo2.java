import java.util.Scanner;

public class Exemplo2 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("Informe um número: ");
		num = input.nextInt();
		if(num > 0) {
			System.out.println("O número é positivo!");
		}
		else if(num < 0) {
			System.out.println("O número é negativo!");
		}
		else {
			System.out.println("O número é nulo!");
		}
	}
}
