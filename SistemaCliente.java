

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

public class SistemaCliente implements SistemaAtendeCliente {
	private ArrayList<Clientes> clientes;
	private int plano;
	private ArrayList<Agendamento> agendamento;

	public SistemaCliente() { //construtor 
		clientes = new ArrayList();
		this.plano = plano;
		agendamento = new ArrayList();
	}

	public void Agenda(String nome, String endereco, String numCasa,
			String dataInstalacao) {// classe, onde vai ser criado o agendamento
		
		boolean agen = false;
		for (Agendamento a : this.agendamento) {
			if (a.getNome().equals(nome)) {
				agen = true;

			}
		}
		if (!agen) {
			Agendamento agendamento = new Agendamento(nome, endereco, numCasa,
					dataInstalacao);
			this.agendamento.add(agendamento);
			JOptionPane.showMessageDialog(null, "Cliente agendado");

		} else {
			JOptionPane.showMessageDialog(null, "cliente ja agendado");
		}
	}
	public void removeAgendamento(String nome) {// classe que remove o cliente agendado apos ele ser instalado

		Iterator r = agendamento.iterator();

		while (r.hasNext()) {
			Agendamento a = (Agendamento) r.next();
			if (a.getNome().equals(nome)) {
				r.remove();
			}
		}
		JOptionPane.showMessageDialog(null, "Usuario removido");
	}

	public void cadastraCliente(String nome, String endereco, String cpf,
			String tel) {// cadastrar um cliente novo
		boolean cli = false;
		for (Clientes c : this.clientes) {
			if (c.getNome().equals(nome)) {
				cli = true;

			}
		}
		if (!cli) {
			Clientes cliente = new Clientes(nome, endereco, cpf, tel);
			this.clientes.add(cliente);
			JOptionPane.showMessageDialog(null, "usuario cadastrado");

		} else {
			JOptionPane.showMessageDialog(null, "usuário ja existe");
		}

	}

	public int calculaPlano(int plano) {// vai calcular os planos desejado pelo cliente
		int valor = 20;
		int valorTotal = valor * plano;
		return valorTotal;
	}

	public Clientes pesquisaCliente(String nome) {// metodo pra pesquisar o cilente cadastrado 
		for (Clientes c : this.clientes) {
			if (c.getNome().equals(nome)) {
				return c;
			}
		}
		return null;

	}

	public void removeCliente(String nome) {// metodo pra remover o cliente, caso não queira usar mais o serviço

		Iterator i = clientes.iterator();

		while (i.hasNext()) {
			Clientes c = (Clientes) i.next();
			if (c.getNome().equals(nome)) {
				i.remove();
			}
		}
		JOptionPane.showMessageDialog(null, "Usuario removido");
	}

	@Override
	public List<Clientes> getCliente() {
		return this.clientes;
	}

	public ArrayList<Agendamento> getAgendamento() {
		return this.agendamento;
	}
}

