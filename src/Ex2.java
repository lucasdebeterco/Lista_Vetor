import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int tamanho = 3;
		float vetor[] = new float[tamanho];
		
		System.out.println("Digite os valores: ");
		for(int x = 0; x < tamanho; x++) {
			System.out.print("-> ");
			vetor[x] = entrada.nextInt();
		}
		for (int x = (tamanho-1); x >= 0; x--) {
			System.out.println("Posição "+ x + "--> " + vetor[x]);
		}
		entrada.close();
	}

}
