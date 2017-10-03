
import java.util.ArrayList;
import java.util.List;

public class SistemaCliente implements SistemaAtendeCliente {
	private List<Clientes> clientes;
	private int plano;
	
	
	public SistemaCliente(){
		clientes = new ArrayList();
		this.plano = plano;
	}

	public void cadastraCliente(String nome, String endereço, String cpf,
			String tel) {
		for (Clientes c : this.clientes) {
			if (c.getNome().equals(nome)) {
				return;
			}
		}
		Clientes cliente = new Clientes(nome, endereço, cpf, tel);

		this.clientes.add(cliente);

	}
	
	public int calculaPlano(int plano) {
		int valor = 20;
		int valorTotal = valor * plano;
		return valorTotal;
	}


	public Clientes pesquisaCliente(String nome) {
		for (Clientes c : this.clientes) {
			if (c.getNome().equals(nome)) {
				return c;
			}
		}
		return null;

	}
	
	public void removeCliente(String nome){
		for(Clientes c : this.clientes){
			if(c.getNome().equals(nome)){
			 this.clientes.remove(c);
			}
		}
	}

	
	@Override
	public List<Clientes> getCliente() {
		return this.clientes;
	}
}
