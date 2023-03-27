package aula8;

import java.util.Scanner;

public class MainContador {
	public static void main(String [] args) {
	Scanner input = new Scanner(System.in);
	Contador cont = new Contador();
	int num;
	System.out.println("Digite um número: ");
	num = input.nextInt();
	cont.setNumber(num);
	System.out.println(cont.increment());
	
}
	}