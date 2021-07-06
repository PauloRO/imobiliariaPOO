import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ConsultarTerreno extends JFrame {

	static JPanel contentPane;
	static JTextField textCodigo;
	static JButton btnConsultarTerreno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
    	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarTerreno frame = new ConsultarTerreno();
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
	public ConsultarTerreno() {
		setTitle("Consultar Terreno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 324, 132);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo do Terreno:");
		lblCodigo.setBounds(15, 16, 188, 20);
		contentPane.add(lblCodigo);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(173, 13, 120, 26);
		contentPane.add(textCodigo);
		textCodigo.setColumns(10);
		
		btnConsultarTerreno = new JButton("Consultar");
		btnConsultarTerreno.setBounds(15, 52, 278, 29);
		btnConsultarTerreno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnConsultarTerreno) {
					DadosImovel imovel = new DadosImovel();
					imovel.buscar(Integer.parseInt(textCodigo.getText()));
					ConsultarTerreno.this.dispose();
			}
		}});
		contentPane.add(btnConsultarTerreno);
	}

}