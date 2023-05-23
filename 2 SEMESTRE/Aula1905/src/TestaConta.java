
public class TestaConta {
	public static void main(String[] args) {
        Conta c1 = new Conta(100);  
        c1.depositar(60);
        c1.sacar(90);
        System.out.println(c1.toString());
    }
}

