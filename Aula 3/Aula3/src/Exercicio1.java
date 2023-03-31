import java.util.Scanner;

public class Exercicio1 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		double nota1, nota2, nota3, nota4;
		double media;
		System.out.println("Informe a nota 1: ");
		nota1 = input.nextDouble();
		System.out.println("Informe a nota 2: ");
		nota2 = input.nextDouble();
		System.out.println("Informe a nota 3: ");
		nota3 = input.nextDouble();
		System.out.println("Informe a nota 4: ");
		nota4 = input.nextDouble();
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.printf("A média do aluno é: %.2f \n " , media );
		if(media > 60) {
			System.out.println("O aluno foi aprovado!");
		}
		else {
			System.out.println("O aluno foi reprovado!");
		}
	}
}
