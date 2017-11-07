import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;


public class Speed_Net extends JFrame {
	private SistemaCliente sistema = new SistemaCliente();
	private JPanel telaPrincipal;
	private JTextField entradaNome;
	private JTextField entradaTel;
	private JTextField entradaEndereco;
	private JTextField entradaCpf;
	private JTextField nomePesquisa;
	private JTextField nomeRemove;
	private JTextField nomeagenda;
	private JTextField enderecoagenda;
	private JTextField ncasa;
	private JTextField datestalacao;

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
		telaPrincipal = new JPanel();
		telaPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(telaPrincipal);
		telaPrincipal.setLayout(new CardLayout(0, 0));
		
		JPanel telaIncial = new JPanel();
		telaPrincipal.add(telaIncial, "name_4800281700115");
		telaIncial.setLayout(null);
		
		JPanel telaCadastro = new JPanel();
		telaPrincipal.add(telaCadastro, "name_4997179445072");
		telaCadastro.setLayout(null);
		
		JButton btnCadastrar = new JButton("Cadastrar Cliente");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				telaIncial.setVisible(false);
				telaCadastro.setVisible(true);
			}
		});
		btnCadastrar.setBounds(10, 11, 162, 23);
		telaIncial.add(btnCadastrar);
		
		JPanel telaPesquisa = new JPanel();
		telaPrincipal.add(telaPesquisa, "name_5523848168737");
		telaPesquisa.setLayout(null);
		
		JButton btnPesquisarCliente = new JButton("Pesquisar Cliente");
		btnPesquisarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaIncial.setVisible(false);
				telaPesquisa.setVisible(true);
			}
		});
		btnPesquisarCliente.setBounds(10, 45, 162, 23);
		telaIncial.add(btnPesquisarCliente);
		
		JPanel telaRemove = new JPanel();
		telaPrincipal.add(telaRemove, "name_6547863955449");
		telaRemove.setLayout(null);
		
		JButton btnRemoveCliente = new JButton("Remove cliente cadastrado");
		btnRemoveCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaIncial.setVisible(false);
				telaRemove.setVisible(true);
			
			}
		});
		btnRemoveCliente.setBounds(10, 79, 162, 23);
		telaIncial.add(btnRemoveCliente);
		
		JPanel telaValores = new JPanel();
		telaPrincipal.add(telaValores, "name_7094186906287");
		telaValores.setLayout(null);
		
		JButton btnCalcularValorLink = new JButton("Calcular valor link");
		btnCalcularValorLink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaValores.setVisible(true);
				telaIncial.setVisible(false);
			}
		});
		btnCalcularValorLink.setBounds(244, 11, 138, 23);
		telaIncial.add(btnCalcularValorLink);
		
		JPanel telaListar = new JPanel();
		telaPrincipal.add(telaListar, "name_7697131828346");
		telaListar.setLayout(null);
		
		JList listaClientes = new JList();
		listaClientes.setBounds(0, 11, 542, 196);
		telaListar.add(listaClientes);
		
		JButton btnListarCliente = new JButton("Listar Cliente");
		btnListarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<Clientes> cliente = sistema.getCliente();
				String[] listCombo = new String[cliente.size()];
				for(int i=0;i<cliente.size();i++){
					listCombo[i] = "Nome: "+cliente.get(i).getNome()+" Tel.: "+cliente.get(i).getTel()+" CPF: "+cliente.get(i).getCpf()
							+" Endereço: "+ cliente.get(i).getEndereço();
				}
				listaClientes.setModel(new javax.swing.DefaultComboBoxModel(listCombo));
				telaIncial.setVisible(false);
				telaListar.setVisible(true);
			}
		});
		btnListarCliente.setBounds(244, 45, 138, 23);
		telaIncial.add(btnListarCliente);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gerenciaArquivo aaaa = new gerenciaArquivo();
				try {
					aaaa.salvarArquivo(sistema.getCliente());
				} catch (IOException ze) {
					
					ze.printStackTrace();
				}System.exit(0);
			}
		});
		btnSair.setBounds(244, 145, 138, 23);
		telaIncial.add(btnSair);
		
		JLabel lblSpeedNet = new JLabel("Speed net");
		lblSpeedNet.setBounds(159, 211, 69, 14);
		telaIncial.add(lblSpeedNet);
		
		JPanel telaAgendamento = new JPanel();
		telaPrincipal.add(telaAgendamento, "name_685925637577138");
		telaAgendamento.setLayout(null);
		
		JButton btnAgendarCliente = new JButton("Agendar Cliente");
		btnAgendarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				telaIncial.setVisible(false);
				telaAgendamento.setVisible(true);
			}
		});
		btnAgendarCliente.setBounds(10, 113, 162, 23);
		telaIncial.add(btnAgendarCliente);
		
		JPanel telaMostraAgendamento = new JPanel();
		telaPrincipal.add(telaMostraAgendamento, "name_686607025349706");
		telaMostraAgendamento.setLayout(null);
		

		JList listagenda = new JList();
		listagenda.setBounds(10, 24, 445, 194);
		telaMostraAgendamento.add(listagenda);
		
		JButton btnVoltar_5 = new JButton("Voltar");
		btnVoltar_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaMostraAgendamento.setVisible(false);
				telaIncial.setVisible(true);
			}
		});
		btnVoltar_5.setBounds(325, 217, 89, 23);
		telaMostraAgendamento.add(btnVoltar_5);
		
		JLabel lblClientesAgendados = new JLabel("Clientes Agendados:");
		lblClientesAgendados.setBounds(10, 0, 156, 14);
		telaMostraAgendamento.add(lblClientesAgendados);
		
		JButton btnClienteAgendado = new JButton("Cliente agendado");
		btnClienteAgendado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Agendamento> agendamentos = sistema.getAgendamento();
				String[] listaagenda = new String[agendamentos.size()];
				for(int i = 0; i<agendamentos.size(); i++){
					listaagenda[i] = "Nome: "+agendamentos.get(i).getNome()+" Endereço: "+agendamentos.get(i).getEndereço()+
							" Numero da Casa: "+ agendamentos.get(i).getNumCasa()+" Data da instalação: "
							+agendamentos.get(i).getDataInstalacao();					
				}listagenda.setModel(new javax.swing.DefaultComboBoxModel(listaagenda));
				telaIncial.setVisible(false);
				telaMostraAgendamento.setVisible(true);
				
			}
		});
		btnClienteAgendado.setBounds(244, 79, 138, 23);
		telaIncial.add(btnClienteAgendado);
		
		JPanel telaRemover = new JPanel();
		telaPrincipal.add(telaRemover, "name_692857939397101");
		telaRemover.setLayout(null);
		
		JLabel lblEscolhaOUsuario = new JLabel("Escolha o usuario");
		lblEscolhaOUsuario.setBounds(10, 11, 136, 14);
		telaRemover.add(lblEscolhaOUsuario);
		
		JComboBox usuariocombo = new JComboBox();
		usuariocombo.setBounds(10, 31, 203, 20);
		telaRemover.add(usuariocombo);
		
		JButton btnRemover_1 = new JButton("Remover");
		btnRemover_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sistema.removeAgendamento(sistema.getAgendamento().get(usuariocombo.getSelectedIndex()).getNome());
				telaRemover.setVisible(false);
				telaIncial.setVisible(true);
			}
		});
		btnRemover_1.setBounds(314, 217, 89, 23);
		telaRemover.add(btnRemover_1);
		
		JButton btnVoltar_6 = new JButton("Voltar");
		btnVoltar_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaRemover.setVisible(false);
				telaIncial.setVisible(true);
			}
		});
		btnVoltar_6.setBounds(215, 217, 89, 23);
		telaRemover.add(btnVoltar_6);
		
		JButton btnRemoveClienteInstalado = new JButton("Remove cliente instalado");
		btnRemoveClienteInstalado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] nomes = new String[sistema.getAgendamento().size()];
				for(int i=0; i<sistema.getAgendamento().size(); i++){
					nomes[i] = sistema.getAgendamento().get(i).getNome();
					
				}usuariocombo.setModel(new javax.swing.DefaultComboBoxModel(nomes));
				telaIncial.setVisible(false);
				telaRemover.setVisible(true);
			}
		});
		btnRemoveClienteInstalado.setBounds(10, 147, 162, 23);
		telaIncial.add(btnRemoveClienteInstalado);
		
		
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 11, 46, 14);
		telaCadastro.add(lblNome);
		
		entradaNome = new JTextField();
		entradaNome.setBounds(10, 25, 250, 20);
		telaCadastro.add(entradaNome);
		entradaNome.setColumns(10);
		
		JLabel lblTel = new JLabel("Tel");
		lblTel.setBounds(10, 56, 46, 14);
		telaCadastro.add(lblTel);
		
		entradaTel = new JTextField();
		entradaTel.setBounds(10, 81, 250, 20);
		telaCadastro.add(entradaTel);
		entradaTel.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(10, 112, 89, 14);
		telaCadastro.add(lblEndereo);
		
		entradaEndereco = new JTextField();
		entradaEndereco.setBounds(10, 137, 250, 20);
		telaCadastro.add(entradaEndereco);
		entradaEndereco.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(10, 168, 46, 14);
		telaCadastro.add(lblCpf);
		
		entradaCpf = new JTextField();
		entradaCpf.setBounds(10, 198, 250, 20);
		telaCadastro.add(entradaCpf);
		entradaCpf.setColumns(10);
		
		JButton btnCadastrar_1 = new JButton("Cadastrar");
		btnCadastrar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sistema.cadastraCliente(entradaNome.getText(), entradaEndereco.getText(), entradaCpf.getText(), entradaTel.getText());
				entradaNome.setText("");
				entradaTel.setText("");
				entradaCpf.setText("");
				entradaEndereco.setText("");
				telaCadastro.setVisible(false);
				telaIncial.setVisible(true);
			}
		});
		btnCadastrar_1.setBounds(280, 218, 122, 23);
		telaCadastro.add(btnCadastrar_1);
		
		
		JLabel lblNome_1 = new JLabel("Nome");
		lblNome_1.setBounds(10, 11, 46, 14);
		telaPesquisa.add(lblNome_1);
		
		nomePesquisa = new JTextField();
		nomePesquisa.setBounds(10, 29, 294, 20);
		telaPesquisa.add(nomePesquisa);
		nomePesquisa.setColumns(10);
		
		JPanel telaMostraPesquisa = new JPanel();
		telaPrincipal.add(telaMostraPesquisa, "name_5605113324771");
		telaMostraPesquisa.setLayout(null);
		
		JLabel nomeMostra = new JLabel("");
		nomeMostra.setBounds(10, 28, 267, 14);
		telaMostraPesquisa.add(nomeMostra);
		
		JLabel telefoneMostra = new JLabel("");
		telefoneMostra.setBounds(10, 53, 252, 14);
		telaMostraPesquisa.add(telefoneMostra);
		
		JLabel enderecoMostra = new JLabel("");
		enderecoMostra.setBounds(10, 78, 252, 14);
		telaMostraPesquisa.add(enderecoMostra);
		
		JLabel cpfMostra = new JLabel("");
		cpfMostra.setBounds(10, 103, 267, 14);
		telaMostraPesquisa.add(cpfMostra);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaPesquisa.setVisible(false);
				Clientes cliente = sistema.pesquisaCliente(nomePesquisa.getText());
				nomeMostra.setText("Nome: "+cliente.getNome());
				telefoneMostra.setText("Telefone: "+cliente.getTel());
				enderecoMostra.setText("Endereço: "+cliente.getEndereço());
				cpfMostra.setText("CPF: "+ cliente.getCpf());
				telaMostraPesquisa.setVisible(true);
			}
		});
		btnPesquisar.setBounds(266, 218, 127, 23);
		telaPesquisa.add(btnPesquisar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaMostraPesquisa.setVisible(false);
				telaIncial.setVisible(true);
			}
		});
		btnVoltar.setBounds(305, 218, 89, 23);
		telaMostraPesquisa.add(btnVoltar);
		
		
		
		JLabel lblNome_2 = new JLabel("Nome");
		lblNome_2.setBounds(10, 11, 46, 14);
		telaRemove.add(lblNome_2);
		
		nomeRemove = new JTextField();
		nomeRemove.setBounds(10, 29, 280, 20);
		telaRemove.add(nomeRemove);
		nomeRemove.setColumns(10);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sistema.removeCliente(nomeRemove.getText());
				telaIncial.setVisible(true);
				telaRemove.setVisible(false);
				
				
			}
		});
		btnRemover.setBounds(325, 218, 89, 23);
		telaRemove.add(btnRemover);
		
		JButton btnVoltar_1 = new JButton("Voltar");
		btnVoltar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nomeRemove.setText("");
				telaRemove.setVisible(false);
				telaIncial.setVisible(true);
			}
		});
		btnVoltar_1.setBounds(228, 218, 89, 23);
		telaRemove.add(btnVoltar_1);
		
		
		
		JLabel valores = new JLabel("");
		valores.setBounds(229, 27, 133, 14);
		telaValores.add(valores);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedIndex() == 1){
					valores.setText("Valor do Plano: R$ "+20);
				}else if(comboBox.getSelectedIndex() == 2){
					valores.setText("Valor do Plano: R$ "+40);
				}else if(comboBox.getSelectedIndex() == 3){
					valores.setText("Valor do Plano: R$ "+60);
				}else if(comboBox.getSelectedIndex() == 4){
					valores.setText("Valor do Plano: R$ "+100);
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Escolha um plano", "1 Mbps", "2 Mbps", "3 Mbps", "5 Mbps"}));
		comboBox.setBounds(10, 24, 156, 20);
		telaValores.add(comboBox);
		
		JLabel lblValores = new JLabel("Valores");
		lblValores.setBounds(10, 11, 46, 14);
		telaValores.add(lblValores);
		
		JButton btnVoltar_2 = new JButton("Voltar");
		btnVoltar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaValores.setVisible(false);
				telaIncial.setVisible(true);
			}
		});
		btnVoltar_2.setBounds(325, 218, 89, 23);
		telaValores.add(btnVoltar_2);
		
		JButton btnVoltar_3 = new JButton("Voltar");
		btnVoltar_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaListar.setVisible(false);
				telaIncial.setVisible(true);
			}
		});
		btnVoltar_3.setBounds(325, 218, 89, 23);
		telaListar.add(btnVoltar_3);
		
		
		JLabel lblNome_3 = new JLabel("Nome");
		lblNome_3.setBounds(10, 11, 46, 14);
		telaAgendamento.add(lblNome_3);
		

		
		nomeagenda = new JTextField();
		nomeagenda.setBounds(10, 26, 321, 20);
		telaAgendamento.add(nomeagenda);
		nomeagenda.setColumns(10);
		
		JLabel lblEdendereo = new JLabel("Edendere\u00E7o");
		lblEdendereo.setBounds(10, 49, 100, 14);
		telaAgendamento.add(lblEdendereo);
		
		enderecoagenda = new JTextField();
		enderecoagenda.setBounds(10, 74, 321, 20);
		telaAgendamento.add(enderecoagenda);
		enderecoagenda.setColumns(10);
		
		JLabel lblNumeroDaCasa = new JLabel("Numero da casa");
		lblNumeroDaCasa.setBounds(10, 105, 87, 14);
		telaAgendamento.add(lblNumeroDaCasa);
		
		ncasa = new JTextField();
		ncasa.setBounds(10, 130, 321, 20);
		telaAgendamento.add(ncasa);
		ncasa.setColumns(10);
		
		
		JLabel lblDataDeEstalao = new JLabel("Data da instala\u00E7\u00E3o");
		lblDataDeEstalao.setBounds(10, 155, 112, 14);
		telaAgendamento.add(lblDataDeEstalao);
		
		datestalacao = new JTextField();
		datestalacao.setBounds(11, 180, 320, 20);
		telaAgendamento.add(datestalacao);
		datestalacao.setColumns(10);
		
		JButton btnAgendar = new JButton("Agendar");
		btnAgendar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sistema.Agenda(nomeagenda.getText(), enderecoagenda.getText(), ncasa.getText(), datestalacao.getText());
				datestalacao.setText("");
				nomeagenda.setText("");
				enderecoagenda.setText("");
				ncasa.setText("");
				
				
				
				telaAgendamento.setVisible(false);
				telaIncial.setVisible(true);
			}
		});
		btnAgendar.setBounds(325, 217, 89, 23);
		telaAgendamento.add(btnAgendar);
		
		JButton btnVoltar_4 = new JButton("Voltar");
		btnVoltar_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telaAgendamento.setVisible(false);
				telaIncial.setVisible(true);
			}
		});
		btnVoltar_4.setBounds(226, 217, 89, 23);
		telaAgendamento.add(btnVoltar_4);
		
		

		
		
		
	}
}
