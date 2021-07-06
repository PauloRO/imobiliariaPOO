import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastrarImovel extends JFrame {

	JPanel contentPane;
	static JTextField textCodigoImovel;
	static JTextField textDataConstrucao;
	static JTextField textDisponibilidade;
	static JTextField textAreaMetrosQuadrados;
	static JLabel lblBairro;
	static JTextField textBairro;
	static JLabel lblValorSugerido;
	static JTextField textValorSugerido;
	static JLabel lblValorReal;
	static JTextField textValorReal;
	static JLabel lblTaxaImobiliaria;
	static JTextField textTaxaImobiliaria;
	static JLabel lblData;
	static JTextField textData;
	static JCheckBox chckbxVenda;
	static JCheckBox chckbxAluguel;
	static JButton btnCadastrarCasa;
	static JButton btnCadastrarSalaComercial;
	static JButton btnCadastrarApartamento;
	static JButton btnCadastrarResidencial;
	static JButton btnCadastrarTerreno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarImovel frame = new CadastrarImovel();
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
	public CadastrarImovel() {		
		setTitle("Cadastro Im\u00F3vel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 348, 659);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigoImovel = new JLabel("C\u00F3digo do im\u00F3vel:");
		lblCodigoImovel.setBounds(15, 16, 136, 20);
		contentPane.add(lblCodigoImovel);
		
		textCodigoImovel = new JTextField();
		textCodigoImovel.setBounds(169, 13, 146, 26);
		contentPane.add(textCodigoImovel);
		textCodigoImovel.setColumns(10);
		
		JLabel lblDataConstrucao = new JLabel("Data da constru\u00E7\u00E3o:");
		lblDataConstrucao.setBounds(15, 52, 146, 20);
		contentPane.add(lblDataConstrucao);
		
		textDataConstrucao = new JTextField();
		textDataConstrucao.setBounds(169, 49, 146, 26);
		contentPane.add(textDataConstrucao);
		textDataConstrucao.setColumns(10);
		
		JLabel lblDisponibilidade = new JLabel("Disponibilidade:");
		lblDisponibilidade.setBounds(15, 88, 119, 20);
		contentPane.add(lblDisponibilidade);
		
		textDisponibilidade = new JTextField();
		textDisponibilidade.setBounds(169, 85, 146, 26);
		contentPane.add(textDisponibilidade);
		textDisponibilidade.setColumns(10);
		
		JLabel lblAreaMetrosQuadrados = new JLabel("\u00C1rea m\u00B2:");
		lblAreaMetrosQuadrados.setBounds(15, 124, 75, 20);
		contentPane.add(lblAreaMetrosQuadrados);
		
		textAreaMetrosQuadrados = new JTextField();
		textAreaMetrosQuadrados.setBounds(169, 121, 146, 26);
		contentPane.add(textAreaMetrosQuadrados);
		textAreaMetrosQuadrados.setColumns(10);
		
		lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(15, 160, 57, 20);
		contentPane.add(lblBairro);
		
		textBairro = new JTextField();
		textBairro.setBounds(169, 157, 146, 26);
		contentPane.add(textBairro);
		textBairro.setColumns(10);
		
		lblValorSugerido = new JLabel("Valor sugerido:");
		lblValorSugerido.setBounds(15, 233, 113, 20);
		contentPane.add(lblValorSugerido);
		
		textValorSugerido = new JTextField();
		textValorSugerido.setBounds(169, 230, 146, 26);
		contentPane.add(textValorSugerido);
		textValorSugerido.setColumns(10);
		
		lblValorReal = new JLabel("Valor real:");
		lblValorReal.setBounds(15, 269, 75, 20);
		contentPane.add(lblValorReal);
		
		textValorReal = new JTextField();
		textValorReal.setBounds(169, 266, 146, 26);
		contentPane.add(textValorReal);
		textValorReal.setColumns(10);
		
		lblTaxaImobiliaria = new JLabel("Taxa imobili\u00E1ria:");
		lblTaxaImobiliaria.setBounds(15, 305, 119, 20);
		contentPane.add(lblTaxaImobiliaria);
		
		textTaxaImobiliaria = new JTextField();
		textTaxaImobiliaria.setBounds(169, 302, 146, 26);
		contentPane.add(textTaxaImobiliaria);
		textTaxaImobiliaria.setColumns(10);
		
		lblData = new JLabel("Data:");
		lblData.setBounds(15, 341, 45, 20);
		contentPane.add(lblData);
		
		textData = new JTextField();
		textData.setBounds(169, 338, 146, 26);
		contentPane.add(textData);
		textData.setColumns(10);
		
		chckbxVenda = new JCheckBox("Venda");
		chckbxVenda.setBounds(169, 376, 131, 29);
		contentPane.add(chckbxVenda);
		
		chckbxAluguel = new JCheckBox("Aluguel");
		chckbxAluguel.setBounds(169, 407, 131, 29);
		contentPane.add(chckbxAluguel);
		
		JLabel lblNewLabel = new JLabel("Dispon\u00EDvel para:");
		lblNewLabel.setBounds(15, 392, 119, 20);
		contentPane.add(lblNewLabel);
		
		btnCadastrarResidencial = new JButton("Continuar residencial");
		btnCadastrarResidencial.setEnabled(false);
		btnCadastrarResidencial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textCodigoImovel.getText().isEmpty() || textDataConstrucao.getText().isEmpty() ||
						textDisponibilidade.getText().isEmpty() ||
						textAreaMetrosQuadrados.getText().isEmpty() ||
						textBairro.getText().isEmpty() ||
						textValorSugerido.getText().isEmpty() ||
						textValorReal.getText().isEmpty() ||
						textData.getText().isEmpty())
				{
					 JOptionPane.showMessageDialog(null, "Preencha todos os campos para prosseguir!");
				} else {
					CadastrarResidencial residencial = new CadastrarResidencial();
					residencial.setVisible(true);
					CadastrarResidencial.btnCadastrarResidencial.setEnabled(true);
					CadastrarImovel.this.dispose();
				}
			}
		});
		btnCadastrarResidencial.setBounds(15, 510, 300, 29);
		contentPane.add(btnCadastrarResidencial);
		
		btnCadastrarCasa = new JButton("Continuar casa");
		btnCadastrarCasa.setEnabled(false);
		btnCadastrarCasa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textCodigoImovel.getText().isEmpty() || textDataConstrucao.getText().isEmpty() ||
						textDisponibilidade.getText().isEmpty() ||
						textAreaMetrosQuadrados.getText().isEmpty() ||
						textBairro.getText().isEmpty() ||
						textValorSugerido.getText().isEmpty() ||
						textValorReal.getText().isEmpty() ||
						textData.getText().isEmpty())
				{
					 JOptionPane.showMessageDialog(null, "Preencha todos os campos para prosseguir!");
				} else {
					CadastrarResidencial residencial = new CadastrarResidencial();
					residencial.setVisible(true);
					CadastrarResidencial.btnCadastrarCasa.setEnabled(true);
					CadastrarImovel.this.dispose();
				}
			}
		});
		btnCadastrarCasa.setBounds(15, 476, 300, 29);
		contentPane.add(btnCadastrarCasa);
		
		btnCadastrarSalaComercial = new JButton("Continuar sala comercial");
		btnCadastrarSalaComercial.setEnabled(false);
		btnCadastrarSalaComercial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textCodigoImovel.getText().isEmpty() || textDataConstrucao.getText().isEmpty() ||
						textDisponibilidade.getText().isEmpty() ||
						textAreaMetrosQuadrados.getText().isEmpty() ||
						textBairro.getText().isEmpty() ||
						textValorSugerido.getText().isEmpty() ||
						textValorReal.getText().isEmpty() ||
						textData.getText().isEmpty())
					{
					 JOptionPane.showMessageDialog(null, "Preencha todos os campos para prosseguir!");
				} else {
					CadastrarSalaComercial salaComercial = new CadastrarSalaComercial();
					salaComercial.setVisible(true);
					CadastrarImovel.this.dispose();
				}
			}
		});
		btnCadastrarSalaComercial.setBounds(15, 543, 300, 29);
		contentPane.add(btnCadastrarSalaComercial);
		
		btnCadastrarApartamento = new JButton("Continuar apartamento");
		btnCadastrarApartamento.setEnabled(false);
		btnCadastrarApartamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textCodigoImovel.getText().isEmpty() || textDataConstrucao.getText().isEmpty() ||
						textDisponibilidade.getText().isEmpty() ||
						textAreaMetrosQuadrados.getText().isEmpty() ||
						textBairro.getText().isEmpty() ||
						textValorSugerido.getText().isEmpty() ||
						textValorReal.getText().isEmpty() ||
						textData.getText().isEmpty()) 
				{					
					 JOptionPane.showMessageDialog(null, "Preencha todos os campos para prosseguir!");
				} else {
					CadastrarResidencial residencial = new CadastrarResidencial();
					residencial.setVisible(true);
					CadastrarResidencial.btnCadastrarApartamento.setEnabled(true);
					CadastrarImovel.this.dispose();
				}
			}
		});
		btnCadastrarApartamento.setBounds(15, 442, 300, 29);
		contentPane.add(btnCadastrarApartamento);
		
		JButton btnCadastrarEndereco = new JButton("Cadastrar");
		btnCadastrarEndereco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaEndereco endereco = new TelaEndereco();
				endereco.setVisible(true);
			}
		});
		btnCadastrarEndereco.setBounds(169, 195, 146, 29);
		contentPane.add(btnCadastrarEndereco);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o:");
		lblEndereco.setBounds(15, 196, 85, 20);
		contentPane.add(lblEndereco);
		
		btnCadastrarTerreno = new JButton("Continuar terreno");
		btnCadastrarTerreno.setEnabled(false);
		btnCadastrarTerreno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textCodigoImovel.getText().isEmpty() || textDataConstrucao.getText().isEmpty() ||
					textDisponibilidade.getText().isEmpty() ||
					textAreaMetrosQuadrados.getText().isEmpty() ||
					textBairro.getText().isEmpty() ||
					textValorSugerido.getText().isEmpty() ||
					textValorReal.getText().isEmpty() ||
					textData.getText().isEmpty())
				{
					 JOptionPane.showMessageDialog(null, "Preencha todos os campos para prosseguir!");
				} else {
					CadastrarTerreno terreno = new CadastrarTerreno();
					terreno.setVisible(true);
					CadastrarImovel.this.dispose();
				}
			}
		});
		btnCadastrarTerreno.setBounds(15, 575, 302, 29);
		contentPane.add(btnCadastrarTerreno);

	}
}
