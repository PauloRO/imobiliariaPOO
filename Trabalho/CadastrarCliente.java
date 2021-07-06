package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class CadastrarCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textEmail;
	private JTextField textSexo;
	private JTextField textEstadoCivil;
	private JTextField textProfissao;
	private JButton btnUsuario;
	private JButton btnProprietario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarCliente frame = new CadastrarCliente();
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
	public CadastrarCliente() {
		setTitle("Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 249);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmail = new JLabel("E-mail :");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEmail.setBounds(10, 11, 46, 14);
		contentPane.add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		textEmail.setBounds(99, 8, 194, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo :");
		lblSexo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSexo.setBounds(10, 46, 46, 14);
		contentPane.add(lblSexo);
		
		textSexo = new JTextField();
		textSexo.setFont(new Font("Tahoma", Font.BOLD, 11));
		textSexo.setBounds(99, 43, 86, 20);
		contentPane.add(textSexo);
		textSexo.setColumns(10);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil :");
		lblEstadoCivil.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEstadoCivil.setBounds(10, 84, 76, 14);
		contentPane.add(lblEstadoCivil);
		
		textEstadoCivil = new JTextField();
		textEstadoCivil.setFont(new Font("Tahoma", Font.BOLD, 11));
		textEstadoCivil.setBounds(99, 81, 101, 20);
		contentPane.add(textEstadoCivil);
		textEstadoCivil.setColumns(10);
		
		JLabel lblProfissao = new JLabel("Profiss\u00E3o :");
		lblProfissao.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProfissao.setBounds(10, 124, 76, 14);
		contentPane.add(lblProfissao);
		
		textProfissao = new JTextField();
		textProfissao.setFont(new Font("Tahoma", Font.BOLD, 11));
		textProfissao.setBounds(99, 121, 86, 20);
		contentPane.add(textProfissao);
		textProfissao.setColumns(10);
		
		btnUsuario = new JButton("Cadastrar Usu\u00E1rio");
		btnUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnUsuario) {
					DadosEndereco endereco = new DadosEndereco();
					Endereco novoEndereco = new Endereco();
					DadosPessoa pessoa = new DadosPessoa();
					Usuario usuario = new Usuario(
							CadastrarPessoa.textNome.getText(),
							CadastrarPessoa.textCpf.getText(),
							Integer.parseInt(CadastrarPessoa.textTelefone.getText()), 
							novoEndereco = new Endereco(
									TelaEndereco.campoRua.getText(),
									TelaEndereco.campoNumero.getText(),
									TelaEndereco.campoComplemento.getText(),
									TelaEndereco.campoCep.getText(),
									TelaEndereco.campoCidade.getText()
								),
							Integer.parseInt(CadastrarCliente.textEmail.getText()), 
							Integer.parseInt(CadastrarCliente.textSexo.getText()),
							Integer.parseInt(CadastrarCliente.textEstadoCivil.getText()),
							Integer.parseInt(CadastrarCliente.textProfissao.getText()),
					endereco.cadastrar(novoEndereco);
					pessoa.cadastrar(usuario);
					CadastrarCliente.this.dispose();
					
					UIManager.put("OptionPane.minimumSize", new Dimension(220, 200));
					JOptionPane.showMessageDialog(null, usuario.toString(), "Dados cadastrados:", JOptionPane.PLAIN_MESSAGE);
			}
	}});
		btnUsuario.setBounds(40, 161, 168, 38);
		contentPane.add(btnUsuario);
		
		btnProprietario = new JButton("Continuar Proprietario");
		btnProprietario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textEmail.getText().isEmpty()) {
					 JOptionPane.showMessageDialog(null, "Preencha todos os campos para prosseguir!");
				} else {
					CadastrarProprietario proprietario = new CadastrarProprietario();
					proprietario.setVisible(true);
					CadastrarPessoa.this.dispose();
				}
			}
		});
		btnProprietario.setBounds(233, 161, 168, 38);
		contentPane.add(btnProprietario);
	}
}
