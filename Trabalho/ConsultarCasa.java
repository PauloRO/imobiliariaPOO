import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ConsultarCasa extends JFrame {

	private JPanel contentPane;
	private JTextField textCodigo;
	private JButton btnConsultarCasa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarCasa frame = new ConsultarCasa();
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
	public ConsultarCasa() {
		setTitle("Consulta Casa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 286, 132);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo da casa:");
		lblCodigo.setBounds(15, 16, 167, 20);
		contentPane.add(lblCodigo);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(180, 13, 75, 26);
		contentPane.add(textCodigo);
		textCodigo.setColumns(10);
		
		btnConsultarCasa = new JButton("Consultar");
		btnConsultarCasa.setBounds(15, 52, 240, 29);
		btnConsultarCasa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnConsultarCasa) {
					DadosImovel imovel = new DadosImovel();
					imovel.buscar(Integer.parseInt(textCodigo.getText()));
					ConsultarCasa.this.dispose();
			}
		}});
		contentPane.add(btnConsultarCasa);
	}

}
