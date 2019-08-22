import java.util.Scanner;
public class Ex9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String[] alfabeto = {"a","b", "c" ,"d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r" ,"s", "t", "u", "v", "w", "x", "y", "z"};
		int tam = 0;
		
		System.out.println("tamanho da senha");
		tam = entrada.nextInt();
		while (tam>26) {
			tam = entrada.nextInt();
		}
	}

}
