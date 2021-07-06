import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setTitle("Menu Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 138);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escolha uma das op\u00E7\u00F5es abaixo:");
		lblNewLabel.setBounds(15, 16, 230, 20);
		contentPane.add(lblNewLabel);
		
		JButton btnEndereco = new JButton("Endere\u00E7o");
		btnEndereco.setBounds(15, 52, 115, 23);
		btnEndereco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaEndereco telaEndereco = new TelaEndereco();
				telaEndereco.setVisible(true);
				MenuPrincipal.this.dispose();
			}
		});
		contentPane.add(btnEndereco);
		
		JButton btnImovel = new JButton("Im\u00F3vel");
		btnImovel.setBounds(145, 52, 115, 23);
		btnImovel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuImovel menuImovel = new MenuImovel();
				menuImovel.setVisible(true);
				MenuPrincipal.this.dispose();
			}
		});
		contentPane.add(btnImovel);
		
		JButton btnPessoa = new JButton("Pessoa");
		btnPessoa.setBounds(275, 52, 115, 23);
		btnPessoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPessoa menuPessoa = new MenuPessoa();
				menuPessoa.setVisible(true);
				MenuPrincipal.this.dispose();
			}
		});
		contentPane.add(btnPessoa);
		
		JButton btnTransacao = new JButton("Transa\u00E7\u00E3o");
		btnTransacao.setBounds(407, 52, 115, 23);
		btnTransacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TelaEfetuarTransacao telaEfetuarTransacao = new TelaEfetuarTransacao();
				//telaEfetuarTransacao.setVisible(true);
				MenuPrincipal.this.dispose();
			}
		});
		contentPane.add(btnTransacao);
		
	}

}
