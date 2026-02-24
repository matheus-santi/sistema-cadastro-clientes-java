package sistemaCadastroClientesJava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		clienteService cs = new clienteService();
		int opcao=0;
		
		do {
			opcao = opcoes(opcao, scan);
			
			switch (opcao) {
			case 1: 
				cadastrar(scan, cs);
				break;
			case 2:
				listar(cs);
				break;
			case 3:
				editar();
				break;
			case 4:
				remover();
				break;
			case 0:
				System.out.println("\nSaindo do sistema...");
				break;
				
				default:
					System.out.println("Opção invalida. Tente novamente!!");
			}
			
		} while (opcao != 0);
		
		
		scan.close();

	}
	
	public static int opcoes(int opcao, Scanner scan) {
		System.out.println(":::SISTEMA DE CADASTRO DE CLIENTES:::");
		System.out.println("Escolha uma opção:  "
				           + "\n1 - Cadastrar\r\n"
				           + "2 - Listar\r\n"
				           + "3 - Editar\r\n"
				           + "4 - Remover\r\n"
				           + "0 - Sair\n:");
		opcao = scan.nextInt();
		return opcao;
	}
	
	public static void cadastrar(Scanner scan, clienteService cs) {
		System.out.println("Id do cliente: ");
		int id = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Nome do cliente: ");
		String nome = scan.nextLine();
		
		System.out.println("Email do cliente: ");
		String email = scan.nextLine();
		
		System.out.println("Telefone do cliente: ");
		String telefone = scan.nextLine();
		
		cs.cadastrarCliente(id, nome, email, telefone);
		System.out.println("Cliente cadastrado com sucesso");
	}
	
    public static void listar(clienteService cs) {
    	System.out.println("Lista de clientes cadastrados: ");
		cs.listarCliente();
	}
    
    public static void editar() {
		//...
	}
    
    public static void remover() {
		//...
	}

}
