import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int tamanho = 10;
		int numCons = 0;
		char[] car = new char[tamanho];

		for (int i = 0; i < tamanho; i++) {
			System.out.print("->");
			car[i] = entrada.next().charAt(0);
		}
		
		System.out.println("Consoantes digitadas: ");
		for (int i = 0; i < tamanho; i++) {
			String valorString = "" + car[i];
			if (valorString.equalsIgnoreCase("a") || valorString.equalsIgnoreCase("e") || 
				valorString.equalsIgnoreCase("i") || valorString.equalsIgnoreCase("o") ||
				valorString.equalsIgnoreCase("u")) {	
			} else {
				numCons += 1;
				System.out.println(valorString);
			}
				
		}
		System.out.println("Total de consoantes: " + numCons);
		entrada.close();
	}
}
