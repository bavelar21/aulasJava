import java.util.Scanner;

public class Ex2 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		double distancia, tempo, velocidade;
		System.out.println("Informe a distância percorrida: ");
		distancia = input.nextDouble();
		System.out.println("Informe o tempo gasto: ");
		tempo = input.nextDouble();
		velocidade = distancia/tempo;
		System.out.println("A velocidade média é: " + velocidade);
		System.out.printf("A velocidade média é: %.2f", velocidade);
	}
}
