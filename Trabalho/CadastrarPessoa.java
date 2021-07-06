package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastrarPessoa extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textCpf;
	private JTextField textTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarPessoa frame = new CadastrarPessoa();
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
	public CadastrarPessoa() {
		setTitle("Cadastrar Pessoa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 254);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome :");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNome.setBounds(10, 11, 46, 14);
		contentPane.add(lblNome);
		
		textNome = new JTextField();
		textNome.setBounds(104, 8, 177, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF :");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCpf.setBounds(10, 46, 46, 14);
		contentPane.add(lblCpf);
		
		textCpf = new JTextField();
		textCpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		textCpf.setBounds(104, 43, 125, 20);
		contentPane.add(textCpf);
		textCpf.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone :");
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTelefone.setBounds(10, 83, 64, 14);
		contentPane.add(lblTelefone);
		
		textTelefone = new JTextField();
		textTelefone.setFont(new Font("Tahoma", Font.BOLD, 11));
		textTelefone.setBounds(104, 80, 125, 20);
		contentPane.add(textTelefone);
		textTelefone.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o :");
		lblEndereco.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEndereco.setBounds(10, 126, 64, 14);
		contentPane.add(lblEndereco);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnContinuar.setEnabled(false);
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textCpf.getText().isEmpty()) {
					 JOptionPane.showMessageDialog(null, "Preencha todos os campos para prosseguir!");
				} else {
					CadastrarCliente cliente = new CadastrarCliente();
					cliente.setVisible(true);
					CadastrarPessoa.this.dispose();
				}
			}
		});
		btnContinuar.setBounds(171, 173, 125, 31);
		contentPane.add(btnContinuar);
		
		JButton btnEndereco = new JButton("Cadastrar Endere\u00E7o");
		btnEndereco.setBounds(104, 122, 152, 23);
		contentPane.add(btnEndereco);
		
	}
}
