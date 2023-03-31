import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome completo");
        String userName = input.nextLine();

        String[] words = userName.split(" ");
        StringBuilder shortHand = new StringBuilder();
        for (String word : words) {
            if (word.length() > 2) {
                shortHand.append(word.charAt(0));
                shortHand.append(".");

            } else {
                shortHand.append(word);
                shortHand.append(" ");
            }
        }
        System.out.println("abreviatura do nome é : " + shortHand);
    }
}
