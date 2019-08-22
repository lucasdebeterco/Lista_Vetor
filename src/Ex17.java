import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex17 {
	String nome, email, nasc;
	int telefone, celular;
	float renda, media;
	Scanner entrada = new Scanner(System.in);
	List<Ex17> listaClientes = new ArrayList<Ex17>();

	public void inserirContato() {
		System.out.println("Quantos contatos deseja adicionar?");
		int num = entrada.nextInt();

		for (int i = 0; i < num; i++) {
			Ex17 contato = new Ex17();
			System.out.println("Digite o nome: ");
			contato.nome = entrada.next();
			System.out.println("Digite o telefone: ");
			contato.telefone = entrada.nextInt();
			System.out.println("Digite o celular: ");
			contato.celular = entrada.nextInt();
			System.out.println("Digite o email: ");
			contato.email = entrada.next();
			System.out.println("Digite o nacimento: ");
			contato.nasc = entrada.next();
			listaClientes.add(contato);
			System.out.println("");
		}
	}

	public void listaContatos() {
		System.out.println("Listando clientes: ");
		for (Ex17 cliente : listaClientes) {
			System.out.println(cliente);
		}	
	}
	
	public String toString() {
		return "Nome: " + nome + "\nAniversário: " + nasc;
	}
	
	public static void main(String[] args) {
		Ex17 contato = new Ex17();
		contato.inserirContato();
		contato.listaContatos();

	}

}
