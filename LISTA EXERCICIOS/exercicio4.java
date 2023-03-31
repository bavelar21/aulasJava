import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double initialMass;
        double grams = 0.5;
        int cont = 0;
        double finalMass = 0;
        System.out.println("Informe a massa inicial em gramas: ");
        initialMass = input.nextDouble();

        while (initialMass <= grams) {
            finalMass =  initialMass -= initialMass / 2;
            cont--;
            break;
        }
        System.out.println("A massa inicial foi: " + initialMass + " e sua massa final é:  " + finalMass);
    }
}
