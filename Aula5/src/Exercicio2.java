import java.util.ArrayList;
import java.util.Scanner;

	public class Exercicio2 {
		public static void main(String [] args) {
			ArrayList<String> conjunto = new ArrayList<String>();
			Scanner input = new Scanner(System.in);
			String name;
			boolean found = false;
			System.out.println("Informe um nome e sobrenome: ");
			name = input.nextLine();
			while(!name.equalsIgnoreCase("fim")) {
				conjunto.add(name);
				System.out.println("Informe um nome e sobrenome: ");
				name = input.next();
			}	
			System.out.println("Informe um nome a ser buscado: ");
			name = input.nextLine();
			for(int i = 0; i < conjunto.size(); i++) {
				if(conjunto.get(i).equalsIgnoreCase(name)) {
					conjunto.remove(name);
					found = true;
					System.out.println("O nome " + name + "estava na posição " + i + " e foi removido com sucesso!" );
				}
			}
			if(!found) {
				System.out.println("O nome não esta na lista!");
			}
		}
				
	}

