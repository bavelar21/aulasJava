import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a velocidade do motorista (em km/h): ");
        double velocidade = sc.nextDouble();

        System.out.print("Digite a velocidade máxima da via (em km/h): ");
        double velocidadeMaxima = sc.nextDouble();

        double limite20 = velocidadeMaxima * 1.2;
        double limite50 = velocidadeMaxima * 1.5;

        if (velocidade <= limite20) {
            System.out.println("Multa de R$130,16.");
        } else if (velocidade <= limite50) {
            System.out.println("Multa de R$195,23.");
        } else {
            System.out.println("Multa de R$880,41.");
        }

        sc.close();
    }
}
