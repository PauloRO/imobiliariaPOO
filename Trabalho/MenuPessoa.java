import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MenuPessoa extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPessoa frame = new MenuPessoa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuPessoa() {
		setTitle("Menu Pessoa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escolha uma das op\u00E7\u00F5es abaixo:");
		lblNewLabel.setBounds(10, 11, 231, 14);
		contentPane.add(lblNewLabel);
		
		///////////////////////////////// CLIENTE
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(10, 44, 59, 20);
		contentPane.add(lblCliente);
		
		JButton btnAlterarCliente = new JButton("Alterar");
		btnAlterarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlterarPessoa alterarPessoa = new AlterarPessoa();
				lterarPessoa.setVisible(true);
				MenuPessoa.this.dispose();
			}
		});
		btnAlterarCliente.setBounds(10, 67, 115, 23);
		contentPane.add(btnAlterarCliente);
		
		JButton btnCadastrarCliente = new JButton("Cadastrar");
		btnCadastrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarPessoa cadastrarPessoa = new CadastrarPessoa();
				cadastrarPessoa.setVisible(true);
				MenuPessoa.this.dispose();
			}
		});
		btnCadastrarCliente.setBounds(140, 67, 115, 23);
		contentPane.add(btnCadastrarCliente);
		
		JButton btnConsultarCliente = new JButton("Consultar");
		btnConsultarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarCliente consultarCliente = new ConsultarCliente();
				consultarCliente.setVisible(true);
				MenuPessoa.this.dispose();
			}
		});
		btnConsultarCliente.setBounds(270, 67, 115, 23);
		contentPane.add(btnConsultarCliente);
		
		JButton btnExcluirCliente = new JButton("Remover");
		btnExcluirCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RemoverCliente removerCliente = new RemoverCliente();
				removerCliente.setVisible(true);
				MenuPessoa.this.dispose();
			}
		});
		btnExcluirCliente.setBounds(402, 67, 115, 23);
		contentPane.add(btnExcluirCliente);
		
		///////////////////////////////// CORRETOR
		
		JLabel lblCorretor = new JLabel("Corretor");
		lblCorretor.setBounds(10, 106, 72, 20);
		contentPane.add(lblCorretor);
		
		JButton btnAlterarCorretor = new JButton("Alterar");
		btnAlterarCorretor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaAlteraCorretor alterarCorretor = new TelaAlterarCorretor();
				alterarCorretor.setVisible(true);
				MenuPessoa.this.dispose();
			}
		});
		btnAlterarCorretor.setBounds(10, 131, 115, 23);
		contentPane.add(btnAlterarCorretor);
		
		JButton btnCadastrarCorretor = new JButton("Cadastrar");
		btnCadastrarCorretor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroFuncionario cadastrarFuncionario = new TelaCadastroFuncionario();
				cadastrarFuncionario.setVisible(true);
				MenuPessoa.this.dispose();
				}
		});
		btnCadastrarCorretor.setBounds(140, 131, 115, 23);
		contentPane.add(btnCadastrarCorretor);
		
		JButton btnConsultarCorretor = new JButton("Consultar");
		btnConsultarCorretor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaConsultaFuncionario consultarCorretor = new TelaConsultaFuncionario();
				consultarCorretor.setVisible(true);
				MenuPessoa.this.dispose();
			}
		});
		btnConsultarCorretor.setBounds(270, 131, 115, 23);
		contentPane.add(btnConsultarCorretor);
		
		JButton btnExcluirCorretor = new JButton("Remover");
		btnExcluirCorretor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaRemocaoFuncionario removerCorretor = new TelaRemocaoFuncionario();
				removerCorretor.setVisible(true);
				MenuPessoa.this.dispose();
			}
		});
		btnExcluirCorretor.setBounds(402, 131, 115, 23);
		contentPane.add(btnExcluirCorretor);
				
		///////////////////////////////// FUNCIONÁRIO
		
		JLabel lblFuncionario = new JLabel("Funcionario");
		lblFuncionario.setBounds(10, 170, 99, 20);
		contentPane.add(lblFuncionario);
		
		JButton btnAlterarFuncionario = new JButton("Alterar");
		btnAlterarFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaAlteraFuncionario alterarFuncionario = new TelaAlteraFuncionario();
				alterarFuncionario.setVisible(true);
				MenuPessoa.this.dispose();
			}
		});
		btnAlterarFuncionario.setBounds(10, 196, 115, 23);
		contentPane.add(btnAlterarFuncionario);
		
		JButton btnCadastrarFuncionario = new JButton("Cadastrar");
		btnCadastrarFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroFuncionario cadastrarFuncionario = new TelaCadastroFuncionario();
				cadastrarFuncionario.setVisible(true);
				MenuPessoa.this.dispose();
			}
		});
		btnCadastrarFuncionario.setBounds(140, 196, 115, 23);
		contentPane.add(btnCadastrarFuncionario);
		
		JButton btnConsultarFuncionario = new JButton("Consultar");
		btnConsultarFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaConsultaFuncionario consultarCorretor = new TelaConsultaFuncionario();
				consultarCorretor.setVisible(true);
				MenuPessoa.this.dispose();
			}
		});
		btnConsultarFuncionario.setBounds(270, 196, 115, 23);
		contentPane.add(btnConsultarFuncionario);	
		
		JButton btnExcluirFuncionario = new JButton("Remover");
		btnExcluirFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaRemocaoFuncionario removerCorretor = new TelaRemocaoFuncionario();
				removerCorretor.setVisible(true);
				MenuPessoa.this.dispose();
			}
		});
		btnExcluirFuncionario.setBounds(402, 196, 115, 23);
		contentPane.add(btnExcluirFuncionario);
				
		///////////////////////////////// PROPRIETÁRIO
		
		JLabel lblProprietário = new JLabel("Propriet\u00E1rio");
		lblProprietário.setBounds(10, 235, 88, 20);
		contentPane.add(lblProprietário);
		
		JButton btnAlterarProprietario = new JButton("Alterar");
		btnAlterarProprietario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlterarPessoa alterarPessoa = new AlterarPessoa();
				lterarPessoa.setVisible(true);
				MenuPessoa.this.dispose();
			}
		});
		btnAlterarProprietario.setBounds(10, 261, 115, 23);
		contentPane.add(btnAlterarProprietario);
		
		JButton btnCadastrarProprietario = new JButton("Cadastrar");
		btnCadastrarProprietario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarPessoa cadastrarPessoa = new CadastrarPessoa();
				cadastrarPessoa.setVisible(true);
				MenuPessoa.this.dispose();
			}
		});
		btnCadastrarProprietario.setBounds(140, 261, 115, 23);
		contentPane.add(btnCadastrarProprietario);
		
		JButton btnConsultarProprietario = new JButton("Consultar");
		btnConsultarProprietario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarProprietario consultarProprietario = new ConsultarProprietario();
				consultarProprietario.setVisible(true);
				MenuPessoa.this.dispose();
			}
		});
		btnConsultarProprietario.setBounds(270, 261, 115, 23);
		contentPane.add(btnConsultarProprietario);
				
		JButton btnExcluirProprietario = new JButton("Remover");
		btnExcluirProprietario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RemoverProprietario removerProprietario = new RemoverProprietario();
				removerProprietario.setVisible(true);
				MenuPessoa.this.dispose();
			}
		});
		btnExcluirProprietario.setBounds(402, 261, 115, 23);
		contentPane.add(btnExcluirProprietario);
				
		///////////////////////////////// USUÁRIO
			
		JLabel lblUsuario = new JLabel("Usu\u00E1rio");
		lblUsuario.setBounds(10, 300, 59, 20);
		contentPane.add(lblUsuario);
		
		JButton btnAlterarUsuario = new JButton("Alterar");
		btnAlterarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlterarPessoa alterarPessoa = new AlterarPessoa();
				lterarPessoa.setVisible(true);
				MenuPessoa.this.dispose();
			}
		});
		btnAlterarUsuario.setBounds(10, 326, 115, 23);
		contentPane.add(btnAlterarUsuario);
		
		JButton btnCadastrarUsuario = new JButton("Cadastrar");
		btnCadastrarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarPessoa cadastrarPessoa = new CadastrarPessoa();
				cadastrarPessoa.setVisible(true);
				MenuPessoa.this.dispose();
			}
		});
		btnCadastrarUsuario.setBounds(140, 326, 115, 23);
		contentPane.add(btnCadastrarUsuario);
		
		JButton btnConsultarUsuario = new JButton("Consultar");
		btnConsultarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarUsuario consultarUsuario = new ConsultarUsuario();
				consultarUsuario.setVisible(true);
				MenuPessoa.this.dispose();
			}
		});
		btnConsultarUsuario.setBounds(270, 326, 115, 23);
		contentPane.add(btnConsultarUsuario);
		
		JButton btnExcluirUsuario = new JButton("Remover");
		btnExcluirUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RemoverUsuario removerUsuario = new RemoverUsuario();
				removerUsuario.setVisible(true);
				MenuPessoa.this.dispose();
			}
		});
		btnExcluirUsuario.setBounds(402, 326, 115, 23);
		contentPane.add(btnExcluirUsuario);
		
	}
}
