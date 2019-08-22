import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int tamanho = 3;
		int soma = 0, maior = 0, menor = 0, pares = 0, impares = 0, media = 0, aciMedia = 0, abxMedia = 0;
		int vetor[] = new int[tamanho];

		System.out.println("Digite os valores: ");
		System.out.print("-> ");
		vetor[0] = entrada.nextInt();
		maior = vetor[0];
		menor = vetor[0];

		for (int x = 1; x < tamanho; x++) {
			System.out.print("-> ");
			vetor[x] = entrada.nextInt();
		}
		for (int x = 0; x < tamanho; x++) {
			soma += vetor[x];

			if (vetor[x] > maior) {
				maior = vetor[x];
			}

			if (vetor[x] < menor) {
				menor = vetor[x];
			}

			if (vetor[x] % 2 == 0) {
				pares += 1;
			} else
				impares += 1;
		}
		media = soma / tamanho;
		for (int x = 0; x < tamanho; x++) {
			if (vetor[x] > media) {
				aciMedia += 1;
			} else if (vetor[x] < media) {
				abxMedia += 1;
			}
		}

		System.out.println("Soma dos valores: " + soma);
		System.out.println("Média dos valores: " + media);
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		System.out.println("Pares: " + pares);
		System.out.println("Impares: " + impares);
		System.out.println("Acima da média: " + aciMedia);
		System.out.println("Abaixo da média: " + abxMedia);
		entrada.close();
	}

}
