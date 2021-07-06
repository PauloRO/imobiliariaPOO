import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class RemoverCasa extends JFrame {

	private JPanel contentPane;
	private JTextField textCodigo;
	private JButton btnRemoverCasa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoverCasa frame = new RemoverCasa();
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
	public RemoverCasa() {
		setTitle("Remove Casa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 282, 132);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo da casa:");
		lblCodigo.setBounds(15, 16, 188, 20);
		contentPane.add(lblCodigo);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(174, 13, 75, 26);
		contentPane.add(textCodigo);
		textCodigo.setColumns(10);
		
		btnRemoverCasa = new JButton("Remover");
		btnRemoverCasa.setBounds(15, 52, 235, 29);
		btnRemoverCasa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnRemoverCasa) {
					DadosImovel imovel = new DadosImovel();
					imovel.excluir(Integer.parseInt(textCodigo.getText()));
					RemoverCasa.this.dispose();
			}
		}});
		contentPane.add(btnRemoverCasa);
	}

}
