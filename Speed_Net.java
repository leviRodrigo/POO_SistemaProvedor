import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


public class Speed_Net extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Speed_Net frame = new Speed_Net();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Speed_Net() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCadastraCliente = new JButton("Cadastra Cliente");
		btnCadastraCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadC cad = new CadC();
				cad.setVisible(true);
			}
		});
		btnCadastraCliente.setBounds(20, 26, 145, 23);
		contentPane.add(btnCadastraCliente);
		
		JButton btnPesquisaCliente = new JButton("Pesquisa Cliente");
		btnPesquisaCliente.setBounds(20, 92, 145, 23);
		contentPane.add(btnPesquisaCliente);
		
		JButton btnRemoveCliente = new JButton("Remove Cliente");
		btnRemoveCliente.setBounds(20, 167, 145, 23);
		contentPane.add(btnRemoveCliente);
		
		JButton btnCalculaValorLink = new JButton("Calcula valor link");
		btnCalculaValorLink.setBounds(234, 26, 157, 23);
		contentPane.add(btnCalculaValorLink);
		
		JButton btnListarCliente = new JButton("Listar cliente");
		btnListarCliente.setBounds(266, 92, 125, 23);
		contentPane.add(btnListarCliente);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(266, 167, 125, 23);
		contentPane.add(btnSair);
		
		JLabel lblSpeedNet = new JLabel("Speed Net");
		lblSpeedNet.setBounds(196, 214, 83, 14);
		contentPane.add(lblSpeedNet);
	}
}
