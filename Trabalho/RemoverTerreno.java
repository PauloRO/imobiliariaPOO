import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
public class RemoverTerreno extends JFrame {

	private JPanel contentPane;
	private JTextField textCodigo;
	private JButton btnRemoverTerreno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoverTerreno frame = new RemoverTerreno();
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
	public RemoverTerreno() {
		setTitle("Remover Terreno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 346, 132);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo do Terreno:");
		lblCodigo.setBounds(15, 16, 188, 20);
		contentPane.add(lblCodigo);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(195, 13, 120, 26);
		contentPane.add(textCodigo);
		textCodigo.setColumns(10);
		
		btnRemoverTerreno = new JButton("Remover");
		btnRemoverTerreno.setBounds(15, 52, 300, 29);
		btnRemoverTerreno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnRemoverTerreno) {
					DadosImovel imovel = new DadosImovel();
					imovel.excluir(Integer.parseInt(textCodigo.getText()));
					RemoverTerreno.this.dispose();
			}
		}});
		contentPane.add(btnRemoverTerreno);
	}

}