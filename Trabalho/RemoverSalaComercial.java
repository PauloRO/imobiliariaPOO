import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class RemoverSalaComercial extends JFrame {

	private JPanel contentPane;
	private JTextField textCodigo;
	private JButton btnRemoverSalaComercial;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoverSalaComercial frame = new RemoverSalaComercial();
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
	public RemoverSalaComercial() {
		setTitle("Remove Sala Comercial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 346, 132);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo da sala comercial:");
		lblCodigo.setBounds(15, 16, 188, 20);
		contentPane.add(lblCodigo);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(240, 13, 75, 26);
		contentPane.add(textCodigo);
		textCodigo.setColumns(10);
		
		btnRemoverSalaComercial = new JButton("Remover");
		btnRemoverSalaComercial.setBounds(15, 52, 300, 29);
		btnRemoverSalaComercial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnRemoverSalaComercial) {
					DadosImovel imovel = new DadosImovel();
					imovel.excluir(Integer.parseInt(textCodigo.getText()));
					RemoverSalaComercial.this.dispose();
			}
		}});
		contentPane.add(btnRemoverSalaComercial);
	}

}
