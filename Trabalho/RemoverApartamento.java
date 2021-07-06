import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class RemoverApartamento extends JFrame {

	private JPanel contentPane;
	private JTextField textCodigo;
	private JButton btnRemoverApartamento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoverApartamento frame = new RemoverApartamento();
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
	public RemoverApartamento() {
		setTitle("Remove Apartamento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 324, 132);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo do apartamento:");
		lblCodigo.setBounds(15, 16, 188, 20);
		contentPane.add(lblCodigo);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(218, 13, 75, 26);
		contentPane.add(textCodigo);
		textCodigo.setColumns(10);
		
		btnRemoverApartamento = new JButton("Remover");
		btnRemoverApartamento.setBounds(15, 48, 278, 29);
		btnRemoverApartamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnRemoverApartamento) {
					DadosImovel imovel = new DadosImovel();
					imovel.excluir(Integer.parseInt(textCodigo.getText()));
					RemoverApartamento.this.dispose();
			}
		}});
		contentPane.add(btnRemoverApartamento);
	}

}
