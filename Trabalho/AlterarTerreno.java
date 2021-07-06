import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

public class AlterarTerreno extends JFrame {

	private JFrame frmAlterarTerreno;
	private JTextField textLargura;
	private JTextField textComprimento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlterarTerreno window = new AlterarTerreno();
					window.frmAlterarTerreno.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public AlterarTerreno() {
		frmAlterarTerreno = new JFrame();
		frmAlterarTerreno.setBackground(Color.BLACK);
		frmAlterarTerreno.setTitle("Alterar Terreno");
		frmAlterarTerreno.setBounds(100, 100, 318, 194);
		frmAlterarTerreno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAlterarTerreno.getContentPane().setLayout(null);
		
		JLabel lblLargura = new JLabel("Largura:");
		lblLargura.setBounds(10, 11, 90, 14);
		frmAlterarTerreno.getContentPane().add(lblLargura);
		
		textLargura = new JTextField();
		textLargura.setBounds(159, 8, 124, 20);
		frmAlterarTerreno.getContentPane().add(textLargura);
		textLargura.setColumns(10);
		
		JLabel lblComprimento = new JLabel("Comprimento:");
		lblComprimento.setBounds(10, 44, 108, 14);
		frmAlterarTerreno.getContentPane().add(lblComprimento);
		
		textComprimento = new JTextField();
		textComprimento.setBounds(159, 41, 124, 20);
		frmAlterarTerreno.getContentPane().add(textComprimento);
		textComprimento.setColumns(10);
		
		JLabel lblPossui = new JLabel("Possui:");
		lblPossui.setBounds(10, 78, 61, 14);
		frmAlterarTerreno.getContentPane().add(lblPossui);
		
		JRadioButton rdbtnAclive = new JRadioButton("Aclive");
		rdbtnAclive.setBounds(101, 74, 75, 23);
		frmAlterarTerreno.getContentPane().add(rdbtnAclive);
		
		JRadioButton rdbtnDeclive = new JRadioButton("Declive");
		rdbtnDeclive.setBounds(208, 74, 75, 23);
		frmAlterarTerreno.getContentPane().add(rdbtnDeclive);
		
		JButton btnAlterarTerreno = new JButton("Alterar");
		btnAlterarTerreno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnAlterarTerreno) {
					DadosEndereco endereco = new DadosEndereco();
					Endereco novoEndereco = new Endereco();	
					DadosImovel imovel = new DadosImovel();
					Terreno terreno = new Terreno(
							Integer.parseInt(CadastrarImovel.textCodigoImovel.getText()), 
							CadastrarImovel.textDataConstrucao.getText(),
							Byte.parseByte(CadastrarImovel.textDisponibilidade.getText()),
							Float.parseFloat(CadastrarImovel.textAreaMetrosQuadrados.getText()),
							CadastrarImovel.textBairro.getText(),
							Float.parseFloat(CadastrarImovel.textValorSugerido.getText()),
							Float.parseFloat(CadastrarImovel.textValorReal.getText()),
							Float.parseFloat(CadastrarImovel.textTaxaImobiliaria.getText()),
							CadastrarImovel.textData.getText(),
							CadastrarImovel.chckbxVenda.isSelected(),
							CadastrarImovel.chckbxAluguel.isSelected(),
							novoEndereco = new Endereco(
									TelaEndereco.campoRua.getText(),
									TelaEndereco.campoNumero.getText(),
									TelaEndereco.campoComplemento.getText(),
									TelaEndereco.campoCep.getText(),
									TelaEndereco.campoCidade.getText()
								),
							Integer.parseInt(textLargura.getText()), 
							Integer.parseInt(textComprimento.getText()),
							rdbtnAclive.isSelected(),
							rdbtnDeclive.isSelected());
					endereco.cadastrar(novoEndereco);
					imovel.cadastrar(terreno);
					AlterarTerreno.this.dispose();
					
					UIManager.put("OptionPane.minimumSize", new Dimension(220, 200));
					JOptionPane.showMessageDialog(null, terreno.toString(), "Dados alterados:", JOptionPane.PLAIN_MESSAGE);
				}
			}});
		btnAlterarTerreno.setBounds(10, 108, 273, 30);
		frmAlterarTerreno.getContentPane().add(btnAlterarTerreno);
	}
}
