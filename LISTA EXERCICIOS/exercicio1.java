import java.util.ArrayList;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int biggerNumber = Integer.MAX_VALUE;
        int smallerNumber = Integer.MIN_VALUE;
        int number = 0;
        int countNumber = 0;
        int sum = 0;
        int avarage = 0;
        ArrayList<Integer> listNumber = new ArrayList<>();
        boolean isPositive = true;
        while (isPositive) {
            System.out.println("Digite um número inteiro  (ou digite um número negativo para sair)");
            number = input.nextInt();
            listNumber.add(number);
            countNumber++;
            sum += number;

            for (int index = 0; index < listNumber.size(); index++) {
                if (number < 0) {
                    isPositive = false;
                    System.out.println(" O Maior Número" + smallerNumber);
                    System.out.println("O Menor Número" + biggerNumber);
                    System.out.println("A media dos números é " + avarage);
                    break;
                }
            }
            if (biggerNumber > number) {
                biggerNumber = number;
            }
            if (smallerNumber < number) {
                smallerNumber = number;
            }
            for (int i = 0; i < countNumber; i++) {
                avarage = sum / countNumber;
            }
        }
    }
}
