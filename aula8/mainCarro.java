package oabAula1;

public class mainCarro {
	public static void main(String [] args) {
		Carro c1 = new Carro();
		c1.tipo = "Ferrari";
		c1.cor = "Vermelha";
		c1.placa = "HNB0988";
		c1.num_portas = 4;
		
		System.out.println("Carro: " + c1.tipo +
							"\nCor: " + c1.cor +
							"\nPlaca: " + c1.placa +
							"\nNúmero de portas: " + c1.num_portas);
		
		c1.liga();
		c1.desliga();
		c1.acelerar();
		c1.frear();
		
		CarroPrivado c2 = new CarroPrivado();
		c2.setTipo("Porsche");
		c2.setCor("Prata");
		c2.setPlaca("KMM0234");
		c2.setNum_portas(2);
		
		System.out.println("Carro 2:");
		System.out.println("Tipo: " + c2.getipo() + 
							"\nCor: " + c2.getCor()
							"\nPlaca: " + c2.getPlaca()
							"\nNúmero de portas: " + c2.getNum_portas);
	}
}
