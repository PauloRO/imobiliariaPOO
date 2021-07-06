import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ConsultarSalaComercial extends JFrame {

	static JPanel contentPane;
	static JTextField textCodigo;
	static JButton btnConsultarSalaComercial;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
    	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarSalaComercial frame = new ConsultarSalaComercial();
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
	public ConsultarSalaComercial() {
		setTitle("Consulta Sala Comercial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 324, 132);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo da sala comercial:");
		lblCodigo.setBounds(15, 16, 188, 20);
		contentPane.add(lblCodigo);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(218, 13, 75, 26);
		contentPane.add(textCodigo);
		textCodigo.setColumns(10);
		
		btnConsultarSalaComercial = new JButton("Consultar");
		btnConsultarSalaComercial.setBounds(15, 52, 278, 29);
		btnConsultarSalaComercial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnConsultarSalaComercial) {
					DadosImovel imovel = new DadosImovel();
					imovel.buscar(Integer.parseInt(textCodigo.getText()));
					ConsultarSalaComercial.this.dispose();
			}
		}});
		contentPane.add(btnConsultarSalaComercial);
	}

}
