import java.util.Scanner;

public class Exercicio2 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		double abono = 100;
		double salario;
		double reajuste = 0.5;
		
		System.out.println("Informe o salário do funcionário: ");
		salario = input.nextDouble();
		
		if(salario > 750) {
			double novoSalario = salario + abono;
			
			double salarioReal = novoSalario + reajuste;
			System.out.println("O salário reajustado é: " + novoSalario);
		}
		else {
			
		}
	}
}
