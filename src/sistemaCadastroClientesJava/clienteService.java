package sistemaCadastroClientesJava;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class clienteService {
	private ArrayList<Cliente> listaClientes;
	
	public clienteService() {
        this.listaClientes = new ArrayList<>();
    }
	
	public void cadastrarCliente(Cliente cliente) {
		listaClientes.add(cliente);
	}
	public void cadastrarCliente(int id, String nome, String email, String telefone) {
		Cliente newCliente = new Cliente(id, nome, email, telefone);
		cadastrarCliente(newCliente);
	}
	
	public void listarCliente() {
		if (listaClientes == null || listaClientes.isEmpty()) {
			System.out.println("Nenhum cliente cadastrado ainda");
			return;
		} else {
		   for (Cliente lista : listaClientes) {
			    System.out.println("ID: " + lista.getId() + " | Nome: " + lista.getNome() + " | E-mail: " + lista.getEmail() + " | Telefone: " + lista.getTelefone());
		    }
		}
	}
	
	public void editarCliente(int id, String nome, String telefone, String email) {

        for (Cliente c : listaClientes) {
            if (c.getId() == id) {
                c.setNome(nome);
                c.setTelefone(telefone);
                c.setEmail(email);
                System.out.println("Cliente atualizado!");
                return;
            }
        }

        System.out.println("Cliente não encontrado.");
    }
	
	public void removerCliente(int id) {
		for (int i = 0; i< listaClientes.size(); i++) {
			Cliente c = listaClientes.get(i);
			if (c.getId() == id) {
				listaClientes.remove(i);
				i--;
				System.out.println("Cliente removido com sucesso");
				return;
			} else {
				System.out.println("Id não encontrado!!");
				return;
			}
		}
	}
	
	public void salvarEmArquivo() {

	    try {
	        FileWriter fw = new FileWriter("clientes.txt");
	        PrintWriter pw = new PrintWriter(fw);

	        for (Cliente c : listaClientes) {
	            pw.println(c.getId() + ";" 
	                       + c.getNome() + ";" 
	                       + c.getTelefone() + ";" 
	                       + c.getEmail());
	        }

	        pw.close();
	        System.out.println("Dados salvos com sucesso!");

	    } catch (IOException e) {
	        System.out.println("Erro ao salvar arquivo.");
	    }
	}
	
	public void carregarDoArquivo() {

	    try {
	        FileReader fr = new FileReader("clientes.txt");
	        BufferedReader br = new BufferedReader(fr);

	        String linha;

	        while ((linha = br.readLine()) != null) {

	            String[] partes = linha.split(";");

	            int id = Integer.parseInt(partes[0]);
	            String nome = partes[1];
	            String telefone = partes[2];
	            String email = partes[3];

	            listaClientes.add(new Cliente(id, nome, email, telefone));
	        }

	        br.close();
	        System.out.println("Dados carregados!");

	    } catch (IOException e) {
	        System.out.println("Arquivo não encontrado, será criado um novo.");
	    }
	}

}
