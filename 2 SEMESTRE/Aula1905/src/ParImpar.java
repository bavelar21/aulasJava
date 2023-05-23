
public class ParImpar {
	private int numero;
	
	public ParImpar() {
		
	}
	
	public ParImpar(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void verificaParImpar() {
		try {
			if(numero % 2 == 0) {
				System.out.println("O número é par!");
			}else {
				throw new ExcecaoParImpar(numero);
			}
		}
		catch(ExcecaoParImpar p) {
			System.out.println("To String: " + p.toString());
			System.out.println("Get message: " + p.getMessage());
		}
	}
	
	public void verificaParImpar2() throws ExcecaoParImpar{
		if(numero % 2 ==0) {
			System.out.println("O número é par!");
		}else {
			throw new ExcecaoParImpar(numero);
		}
	}
}
