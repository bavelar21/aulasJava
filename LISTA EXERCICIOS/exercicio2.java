import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um de 4 digitos");
        number = input.nextInt();
        int firstNumber = (number % 10000) / 100;
        double soma = firstNumber;
        System.out.println("teste" + firstNumber);
        firstNumber = (number % 100) / 1;
        soma += firstNumber;
        System.out.println("Ultimo" + firstNumber);
        System.out.println("soma" + soma);
        System.out.println("raiz quadrada >>>>>>>>" + Math.sqrt(soma));


    }
}
