import java.util.Scanner;

public class ExemploThrow {
	public static void main(String [] args) {
		String senha = "12345";
		Scanner in = new Scanner(System.in);
		String senha_usuario;
		System.out.println("Informe a senha: ");
		senha_usuario = in.next();
		try {
		if(senha.equals(senha_usuario)) {
			System.out.println("Senha correta!");
		}else {
			throw new Exception("A senha está incorreta!");
		}
	}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}	
	}
}
