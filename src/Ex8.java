import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int tamanho = 5;
		float soma = 0, mult = 1;
		float[] vet = new float[tamanho];

		for (int i = 0; i < tamanho; i++) {
			vet[i] = entrada.nextFloat();
			soma += vet[i];
			mult *= vet[i];
		}
		
		for (int i = 0; i < tamanho; i++) {
			System.out.print(vet[i] + " ");
		} System.out.println();
		
		System.out.println("Soma: " + soma);
		System.out.println("Multiplicação: " + mult);
		
		entrada.close();
	}
}
