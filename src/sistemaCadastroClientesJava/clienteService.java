package sistemaCadastroClientesJava;

import java.util.ArrayList;

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
	
	public void editarCliente () {
		//...
	}

}
