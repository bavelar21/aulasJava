
public class TestaCorrida {
	public static void main(String [] args) {
		Corrida corrida = new Corrida();
		corrida.setData("01/05/2023");
		corrida.setHora("08:00h");
		Participante p1 = new Participante("Maria dos Santos", 30, 50, 1.59);
		corrida.adicionarParticipante(p1);
		Participante p2 = new Participante("João do Carmo", 28, 70, 1.80);
		corrida.adicionarParticipante(p2);
		Participante p3 = new Participante("Camila Silva", 40, 70, 1.59);
		corrida.adicionarParticipante(p3);
		System.out.println("Dados da corrida: "+corrida.dataHora());
		corrida.imprimeLista();
		System.out.println("Busca por idade: 30 - " + corrida.buscaPorIdade(30) + " participantes");
		System.out.println("Busca por imc: " + corrida.buscaPorIMC());
		System.out.println("\nRemovendo o participante João do Carmo");
		corrida.removerParticipante(p2);
		System.out.println("\nNova lista:");
		corrida.imprimeLista();
	}
}
