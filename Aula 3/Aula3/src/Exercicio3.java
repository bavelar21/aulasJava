import java.util.Scanner;

public class Exercicio3 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int temp;
		int opcao;
		
		System.out.println("Informe a temperatura em graus celsius: ");
		temp = input.nextInt();
		System.out.println("Informe a conversão desejada: ");
		System.out.println("Digite 1 para: Kelvin (K)");
		double kelvin = temp + 273.15;
		System.out.println("Digite 2 para: Réaumur (Re)");
		double reaumur = temp * 0.8;
		System.out.println("Digite 3 para: Rankine (Ra)");
		double rankine = temp * 1.8 + 459.67;
		System.out.println("Digite 4 para: Fahernheit (F)");
		double fahernheit = temp * 1.8 + 32;
		opcao = input.nextInt();
		
		switch (opcao) {
		case 1:{
			System.out.println("A conversão para Kelvin é: " + kelvin);
			break;
		} 
		case 2:{
			System.out.println("A conversão para Réaumur é: " + rankine);
			break;
		}
		case 3:{
			System.out.println("A conversão para Rankine é: " + fahernheit);
			break;
		} 
		case 4:{
			System.out.println("A conversão para Fahernheit é: " + reaumur);
			break;
		} 
		default:{
			System.out.println("Número inválido!");
		}
}
	}
}