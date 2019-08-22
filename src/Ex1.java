import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int tamanho = 5;
		int vetor[] = new int[tamanho];
		
		System.out.println("Digite os valores: ");
		for(int x = 0; x < tamanho; x++) {
			System.out.print("-> ");
			vetor[x] = entrada.nextInt();
		}
		for (int x = 0; x < tamanho; x++) {
			System.out.println("Posição "+ x + "--> " + vetor[x]);
		}
		entrada.close();
	}

}
