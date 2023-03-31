import java.util.Scanner;

public class StringExercicio1 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		String word;
		String letter;
		System.out.println("Informe uma palavra:");
		word = input.next();
		System.out.println("Informe uma letra");
		letter = input.next();
		System.out.println(word.contains(letter));
		bigWord = word.toUpperCase();
		System.out.println("A palavra em letra maiúscula:" + bigWord);
	}
}
