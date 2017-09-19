import java.util.ArrayList;

public class SistemaCliente {
	private ArrayList<Clientes> clientes;

	public void cadastraCliente(String nome, String endere�o, int quantMega,
			String tel) {
		for (Clientes c : this.clientes) {
			if (c.getNome().equals(nome)){
				return ;
			}
		}
		Clientes cliente = new Clientes(nome, endere�o, quantMega, tel);

		this.clientes.add(cliente);

	}

	public Clientes pesquisaCliente(String nome) {
		for (Clientes c : this.clientes) {
			if (c.getNome().equals(nome)) {
				return c;
			}
		}
		return null;

	}

	public int calculaQuantMega( int quantMega) {
		int valor = 20;
		int valorTotal = valor * quantMega;
		return valorTotal;
	}
}
