	
public class Corrida {
	private String data;
	private String hora;
	private Participante [] participantes;
	
	public Corrida() {
		participantes = new Participante[10];
		inicializacao();
	}
	
	public Corrida(String data, String hora, Participante [] participantes) {
		this.data = data;
		this.hora = hora;
		this.participantes = participantes;
		inicializacao();
	}

	private void inicializacao() {
		for(int i = 0; i < 10; i++) {
			participantes[i] = null;
		}
	}
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public Participante[] getParticipantes() {
		return participantes;
	}

	public void setParticipantes(Participante[] participantes) {
		this.participantes = participantes;
	}
	
	public String dataHora() {
		return "Data: " + data + "\nHora: " + hora + "\n";
	}
	
	public int buscaPorIdade(int idade) {
		int cont = 0;
		for(int i = 0; i < 10; i++) {
			if(participantes[i] != null) {
				if(participantes[i].getIdade() >= idade) {
					cont++;
				}
			}
		}
		return cont;
	}
	
	public int buscaPorIMC() {
		int cont = 0;
		for(int i = 0; i < 10; i++) {
			if(participantes[i] != null) {
				double imc = participantes[i].getPeso()/
						Math.pow(participantes[i].getAltura(), 2);
				if(imc >= 18.5 && imc <=24.9) {
					cont++;
				}
			}
		}
		return cont;
	}
	
	public int adicionarParticipante(Participante participante) {
		for(int i = 0; i < 10; i++) {
			if(participantes[i] == null) {
				participantes[i] = participante;
				return i;
			}
		}
		return -1;
	}
	
	public void removerParticipante(Participante participante) {
		boolean achou = false;
		for(int i = 0; i < 10; i++) {
			if(participantes[i] == participante) {
				participantes[i] = null;
				System.out.println("Participante removido com sucesso!");
				achou = true;
				break;
			}
		}
		if(!achou) {
			System.out.println("O participante não está inscrito na corrida!");
		}
	}
	
	public void imprimeLista() {
		for(int i = 0; i < 10; i++) {
			if(participantes[i] != null) {
				System.out.println(participantes[i].toString());
			}
		}
	}
}
