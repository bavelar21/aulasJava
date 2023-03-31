public class exercicio3 {
    public static void main(String[] args) {
        double heighZe = 1.10;
        double heighChico = 1.50;
        int ano = 0;

        while (heighZe <= heighChico) {
            ano++;
            heighZe += 0.03;
            heighChico += 0.02;
        }
        System.out.println("Faltam anos: " + ano + " para que Zé seja maior que Chico! ");
    }
}