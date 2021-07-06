package view;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.Font;

public class CadastrarProprietario {

	private JFrame frmCadastrarProprietario;
	private JTextField textData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarProprietario window = new CadastrarProprietario();
					window.frmCadastrarProprietario.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public CadastrarProprietario() {
		frmCadastrarProprietario = new JFrame();
		frmCadastrarProprietario.setTitle("Cadastrar Proprietario");
		frmCadastrarProprietario.setBounds(100, 100, 450, 138);
		frmCadastrarProprietario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastrarProprietario.getContentPane().setLayout(null);
		
		JLabel lblDataCadastro = new JLabel("Data do Cadastro :");
		lblDataCadastro.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDataCadastro.setBounds(10, 14, 107, 14);
		frmCadastrarProprietario.getContentPane().add(lblDataCadastro);
		
		textData = new JTextField();
		textData.setBounds(140, 11, 107, 20);
		frmCadastrarProprietario.getContentPane().add(textData);
		textData.setColumns(10);
		
		JButton btnCadastroProprietario = new JButton("Cadastrar");
		btnCadastroProprietario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnCadastroProprietario) {
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
					CadastrarProprietario.this.dispose();
					
					UIManager.put("OptionPane.minimumSize", new Dimension(220, 200));
					JOptionPane.showMessageDialog(null, proprietario.toString(), "Dados cadastrados:", JOptionPane.PLAIN_MESSAGE);
			}
		}});
					btnCadastroProprietario.setBounds(152, 59, 116, 29);
					frmCadastrarProprietario.getContentPane().add(btnCadastroProprietario);
}
	}

