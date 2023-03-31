import java.util.Random;
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tries = 0;
        int userNumber;
        boolean isNumber = false;
        Random rnd = new Random();
        int sortead = rnd.nextInt(100);

        while (!isNumber) {
            System.out.println("Digite um número");
            userNumber = input.nextInt();
            tries++;

            if (userNumber > sortead) {
                System.out.println(" O número é menor");
            }
            if (userNumber < sortead) {
                System.out.println(" O número é maior");
            }
            if (userNumber == sortead) {
                isNumber = true;
                System.out.println(" Você acertou");
                System.out.println(" O número de tentativas foi : " + tries);
            }
        }

    }

}
