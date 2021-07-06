package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class AlterarProprietario extends JFrame {

	private JPanel contentPane;
	private JFrame frmAlterarProprietario;
	private JTextField textData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlterarProprietario frame = new AlterarProprietario();
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
	public AlterarProprietario() {
		frmAlterarProprietario = new JFrame();
		frmAlterarProprietario.setTitle("ALterar Proprietario");
		frmAlterarProprietario.setBounds(100, 100, 450, 138);
		frmAlterarProprietario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAlterarProprietario.getContentPane().setLayout(null);
		
		JLabel lblDataCadastro = new JLabel("Data do Cadastro :");
		lblDataCadastro.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDataCadastro.setBounds(10, 14, 107, 14);
		frmAlterarProprietario.getContentPane().add(lblDataCadastro);
		
		textData = new JTextField();
		textData.setBounds(140, 11, 107, 20);
		frmAlterarProprietario.getContentPane().add(textData);
		textData.setColumns(10);
		
		JButton btnAlterarProprietario = new JButton("Alterar");
		btnAlterarProprietario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnAlterarProprietario) {
					DadosEndereco endereco = new DadosEndereco();
					Endereco novoEndereco = new Endereco();
					DadosPessoa pessoa = new DadosPessoa();
					Proprietario proprietario = new Proprietario(
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
					pessoa.cadastrar(proprietario);
					AlterarProprietario.this.dispose();

			}
		}});
					btnAlterarProprietario.setBounds(152, 59, 116, 29);
					frmAlterarProprietario.getContentPane().add(btnAlterarProprietario);
	}

}
