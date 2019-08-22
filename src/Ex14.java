import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int tamanho = 10;
		float[] vet1 = new float[tamanho];
		float[] vet2 = new float[tamanho];
		float[] vet3 = new float[tamanho*2];

		for (int i = 0; i < tamanho; i++) {
			System.out.print("posicao " + i + " do vetor 1 : ");
			vet1[i] = entrada.nextFloat();
			System.out.print("posicao " + i + " do vetor 2 : ");
			vet2[i] = entrada.nextFloat();
		}
	
			
		for (int i = 0; i < tamanho*2; i = i + 2) {
			for (int x = 0; x < tamanho; x++) {
				vet3[i]= vet1[x];
				vet3[i+1]= vet2[x];
			}
		}

		entrada.close();
	}
}
