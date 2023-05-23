
public class Conta {
	private int saldo_conta;
	
	public Conta() {
		
	}
	
	public Conta(int saldo_conta) {
		this.saldo_conta = saldo_conta;
	}

	public int getSaldo_conta() {
		return saldo_conta;
	}

	public void setSaldo_conta(int saldo_conta) {
		this.saldo_conta = saldo_conta;
	}
	
	public void depositar(double valor) {
        if (valor > 0) {
            saldo_conta += valor;
            System.out.println("Depósito de " + "R$" + valor + " realizado com sucesso!" + "\n" + "Novo saldo: " + "R$" + saldo_conta);
        } else {
            System.out.println("O valor do depósito deve ser maior que zero.");
        }
    }
	
	public int sacar(double valor) {
		if(saldo_conta >= valor) {
			saldo_conta -= valor;
		}
		return saldo_conta;
	}
}

