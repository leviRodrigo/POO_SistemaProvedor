import static org.junit.Assert.*;

import javax.swing.JOptionPane;

import org.junit.Test;



public class TestaProvedor {

	@Test
	public void cadastraCliente() {
		SistemaCliente sistema = new SistemaCliente();
		
		sistema.cadastraCliente("Jose", "jacarau", 2, "99999999");
		sistema.cadastraCliente("Maria", "mamanguape", 3, "4444444");
		
		Clientes client = sistema.pesquisaCliente("Jose");
		Clientes client1 = sistema.pesquisaCliente("Maria");
		assertTrue(client != null);
		assertTrue(client1!= null);
		
		//sistema.calculaQuantMega(2);
		//int valor = 20;
		//int quantMega = 4;
		//int valorTotal = valor * quantMega;

		//assertTrue(valorTotal == 80);
		//assertEquals(80, valorTotal);

	}


}
