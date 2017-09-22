

	import static org.junit.Assert.*;

	import javax.swing.JOptionPane;

import org.junit.Test;

	public class TestaProvedor {

		@Test
		public void cadastraCliente() {
			SistemaCliente sistema = new SistemaCliente();
			String nome = JOptionPane.showInputDialog("digite o nome do cliente");
			String cidade = JOptionPane
					.showInputDialog("digite o nome da sua cidade:");
			int quantMega = 40;
			String tel = JOptionPane.showInputDialog("digite seu contato:");
			String valor = 20;
			sistema.cadastraCliente(nome, cidade, quantMega, tel);

			sistema.pesquisaCliente("Jose");
			assertTrue(client != null);
			assertTrue(client1 != null);


			int valorTotal = valor * quantMega;

			assertTrue(valorTotal == 80);
			assertEquals(80, valorTotal);

		}

	}


}
