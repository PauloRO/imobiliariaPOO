import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

public class CadastrarTerreno extends JFrame {

	private JPanel contentPane;
	private JTextField textLargura;
	private JTextField textComprimento;
	private JButton btnCadastrarTerreno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarTerreno window = new CadastrarTerreno();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public CadastrarTerreno() {
		setTitle("Cadastro Terreno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 190);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLargura = new JLabel("Largura:");
		lblLargura.setBounds(10, 11, 90, 14);
		contentPane.add(lblLargura);
		
		textLargura = new JTextField();
		textLargura.setBounds(159, 8, 124, 20);
		contentPane.add(textLargura);
		textLargura.setColumns(10);
		
		JLabel lblComprimento = new JLabel("Comprimento:");
		lblComprimento.setBounds(10, 42, 108, 14);
		contentPane.add(lblComprimento);
		
		textComprimento = new JTextField();
		textComprimento.setBounds(159, 39, 124, 20);
		contentPane.add(textComprimento);
		textComprimento.setColumns(10);
		
		JLabel lblPossui = new JLabel("Possui:");
		lblPossui.setBounds(10, 72, 61, 14);
		contentPane.add(lblPossui);
		
		JRadioButton rdbtnAclive = new JRadioButton("Aclive");
		rdbtnAclive.setBounds(101, 68, 75, 23);
		contentPane.add(rdbtnAclive);
		
		JRadioButton rdbtnDeclive = new JRadioButton("Declive");
		rdbtnDeclive.setBounds(208, 68, 75, 23);
		contentPane.add(rdbtnDeclive);
		
		btnCadastrarTerreno = new JButton("Salvar");
		btnCadastrarTerreno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnCadastrarTerreno) {
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
					CadastrarTerreno.this.dispose();
					
					UIManager.put("OptionPane.minimumSize", new Dimension(220, 200));
					JOptionPane.showMessageDialog(null, terreno.toString() + novoEndereco.toString(), "Dados cadastrados:", JOptionPane.PLAIN_MESSAGE);
				}
			}});
		btnCadastrarTerreno.setBounds(10, 102, 273, 30);
		contentPane.add(btnCadastrarTerreno);
	}
}
