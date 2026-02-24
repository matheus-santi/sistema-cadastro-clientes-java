package sistemaCadastroClientesJava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println(":::SISTEMA DE CADASTRO DE CLIENTES:::");
			System.out.println("Escolha uma opção:  "
					           + "\n1 - Cadastrar\r\n"
					           + "2 - Listar\r\n"
					           + "3 - Editar\r\n"
					           + "4 - Remover\r\n"
					           + "0 - Sair\n:");
			opcao = scan.nextInt();
			
			switch (opcao) {
			case 1: 
				cadastrar();
				break;
			case 2:
				listar();
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
	
	public static void cadastrar() {
		//...
	}
	
    public static void listar() {
		//...
	}
    
    public static void editar() {
		//...
	}
    
    public static void remover() {
		//...
	}

}
