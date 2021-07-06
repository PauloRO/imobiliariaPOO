import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ConsultarResidencial extends JFrame {

	private JPanel contentPane;
	private JTextField textCodigo;
	private JButton btnConsultarResidencia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarResidencial frame = new ConsultarResidencial();
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
	public ConsultarResidencial() {
		setTitle("Consulta Residencial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 301, 132);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo da resid\u00EAncia:");
		lblCodigo.setBounds(15, 16, 167, 20);
		contentPane.add(lblCodigo);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(180, 13, 75, 26);
		contentPane.add(textCodigo);
		textCodigo.setColumns(10);
		
		btnConsultarResidencia = new JButton("Consultar");
		btnConsultarResidencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnConsultarResidencia) {
					DadosImovel imovel = new DadosImovel();
					imovel.buscar(Integer.parseInt(textCodigo.getText()));
					ConsultarResidencial.this.dispose();
			}
		}});
		btnConsultarResidencia.setBounds(15, 52, 240, 29);
		contentPane.add(btnConsultarResidencia);
	}

}
