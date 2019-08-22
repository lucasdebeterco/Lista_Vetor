import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int tamanho = 5;
		int totalPares = 0, totalImpares = 0, contPares = 0, contImpares = 0;
		int vetor[] = new int[tamanho];

		System.out.println("Digite os valores: ");
		for (int x = 0; x < tamanho; x++) {
			System.out.print("-> ");
			vetor[x] = entrada.nextInt();
			if (vetor[x] % 2 == 0) {
				totalPares += 1;
			} else
				totalImpares += 1;
		}

		int[] vetorPares = new int[totalPares];
		int[] vetorImpares = new int[totalImpares];

		for (int x = 0; x < tamanho; x++) {
			if (vetor[x] % 2 == 0) {
				vetorPares[contPares] = vetor[x];
				contPares += 1;
			} else {
				vetorImpares[contImpares] = vetor[x];
				contImpares += 1;
			}
		}

		System.out.println("Imprimindo vetor: ");
		for (int x = 0; x < tamanho; x++) {
			System.out.println(vetor[x]);
		}

		System.out.println("Imprimindo vetor de pares: ");
		for (int x = 0; x < contPares; x++) {
			System.out.println(vetorPares[x]);
		}

		System.out.println("Imprimindo vetor de impares: ");
		for (int x = 0; x < contImpares; x++) {
			System.out.println(vetorImpares[x]);
		}

		entrada.close();
	}

}
