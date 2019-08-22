import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int tamanho = 10;
		float nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, media = 0, cont = 0;
		float[] medias = new float[tamanho];

		for (int i = 0; i < tamanho; i++) {
			nota1 = entrada.nextFloat();
			nota2 = entrada.nextFloat();
			nota3 = entrada.nextFloat();
			nota4 = entrada.nextFloat();
			media = (nota1+nota2+nota3+nota4)/4;
			medias[i] = media;
			System.out.println(" ---- ");
		}
		
		for (int i = 0; i < tamanho; i++) {
			System.out.print(medias[i] + " ");
			if (medias[i] >= 7) {
				cont += 1;
			}
		}
		System.out.println(cont + " alunos com media maior ou igual a 7");
		
		entrada.close();
	}
}
