
public class Exemplo2 {
	public static void main(String [] args) {
		int matriz[] [] = new int[3] [3];
		//Preenchendo a matriz
		for(int i = 0; i < 3; i++) {//andando nas linhas
			for(int j = 0; j < 3; j++) {//andando nas colunas
				matriz[i][j] = i + j;
			}
		}
		//imprimindo a matriz
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
