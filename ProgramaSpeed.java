//import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import javax.swing.JOptionPane;

public class ProgramaSpeed {
	public static void main(String[] args) {
		
		boolean sair = false;
		SistemaCliente sistema = new SistemaCliente();
		
		while(sair == false){
				String menu = JOptionPane.showInputDialog("1- Adicionar cliente\n2- Pesquisar Cliente\n3- Remover cliente\n4- Calcular Plano\n5- Listar clientes\n6- Sair.");
				switch (menu){
				case "1":
					String nome = JOptionPane.showInputDialog("nome do cliente:");
					String endereço = JOptionPane.showInputDialog("endereço do cliente:");
					String cpf = JOptionPane.showInputDialog("Cpf do cliente:");
					String tel = JOptionPane.showInputDialog("contato do cliente:");
					sistema.cadastraCliente(nome, endereço, cpf, tel);
				
					break;
				
				
				
				case "2":
					String nomeAPesquisar = JOptionPane.showInputDialog("Digite o nome do cliente a ser encontrado");
					System.out.println(sistema.pesquisaCliente(nomeAPesquisar));
					break;
					
					
				case "3":
					String clienteRemover = JOptionPane.showInputDialog("Digite o nome do cliente que deseja remover:");
					sistema.removeCliente(clienteRemover);
					break;
					
					
				case"4":
					int plano = Integer.parseInt(JOptionPane
							.showInputDialog("qual a sua velocidade desejada:"));
					System.out.println("R$ "+sistema.calculaPlano(plano)+",00");
					break;
				case"5":
					List<Clientes> clientesCadastrado = sistema.getCliente();
					System.out.println(clientesCadastrado);
					break;
					
				case"6":
					gerenciaArquivo aaaa = new gerenciaArquivo();
					try {
						aaaa.salvarArquivo(sistema.getCliente());
					} catch (IOException e) {
						
						e.printStackTrace();
					}
					 sair = true;
				}
		
		
		
	

		

	}

}}