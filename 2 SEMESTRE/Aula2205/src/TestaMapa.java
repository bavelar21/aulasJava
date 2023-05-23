import java.util.HashMap;

public class TestaMapa {
	public static void main(String [] args) {
		HashMap<String, Conta> contas = new HashMap<String, Conta>();
		Conta c1 = new Conta(2350);
		Conta c2 = new Conta (10000);
		
		contas.put("Bruno", c1);
		contas.put("Jonatan", c2);
		
		System.out.println(contas.get("Bruno").getSaldo_conta());
	}
}
