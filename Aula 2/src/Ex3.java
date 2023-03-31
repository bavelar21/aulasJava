import java.util.Scanner;

public class Ex3 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int numero, dezena, auxiliar;
		System.out.println("Informe um número de 3 casas decimais:");
		numero = input.nextInt();
		auxiliar = numero/10;
		dezena = auxiliar % 10;
		System.out.println("O número é: " + dezena);
	}
}

