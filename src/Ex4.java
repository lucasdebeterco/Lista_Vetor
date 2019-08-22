import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int tamanho = 4;
		float soma = 0;
		float[] notas = new float[tamanho];
		
		for (int i = 0; i < tamanho; i++) { 
			System.out.print("->");
			notas[i] = entrada.nextFloat();
			soma += notas[i];
		}
		
		for (int i = 0; i < tamanho; i++) { 
			System.out.println("Nota " + (i+1) + ": " + notas[i]);
		}
		System.out.println("Média: " + soma/tamanho);
		entrada.close();
	}
}
