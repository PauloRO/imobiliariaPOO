import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AlterarImovel extends JFrame {

	private JPanel contentPane;
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
	static JButton btnAlterarCasa;
	static JButton btnAlterarSalaComercial;
	static JButton btnAlterarApartamento;
	static JButton btnAlterarResidencial;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlterarImovel frame = new AlterarImovel();
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
	public AlterarImovel() {
		setTitle("Altera Im\u00F3vel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 348, 603);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigoImovel = new JLabel("C\u00F3digo do im\u00F3vel:");
		lblCodigoImovel.setBounds(15, 16, 136, 20);
		contentPane.add(lblCodigoImovel);
		
		textCodigoImovel = new JTextField();
		textCodigoImovel.setBounds(169, 13, 75, 26);
		contentPane.add(textCodigoImovel);
		textCodigoImovel.setColumns(10);
		
		JButton btnBuscar = new JButton("B");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DadosImovel imovel = new DadosImovel();
				SalaComercial salaComercial = new SalaComercial();
				
				imovel.buscar(Integer.parseInt(textCodigoImovel.getText()));
				textCodigoImovel.setEditable(false);
				btnBuscar.setEnabled(false);
				
				textDisponibilidade.setText(salaComercial.getDisponibilidade());
				textBairro.setText(salaComercial.getBairro());
			}
		});
		btnBuscar.setBounds(259, 12, 58, 29);
		contentPane.add(btnBuscar);
		
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
		lblValorSugerido.setBounds(15, 196, 113, 20);
		contentPane.add(lblValorSugerido);
		
		textValorSugerido = new JTextField();
		textValorSugerido.setBounds(169, 193, 146, 26);
		contentPane.add(textValorSugerido);
		textValorSugerido.setColumns(10);
		
		lblValorReal = new JLabel("Valor real:");
		lblValorReal.setBounds(15, 232, 75, 20);
		contentPane.add(lblValorReal);
		
		textValorReal = new JTextField();
		textValorReal.setBounds(169, 229, 146, 26);
		contentPane.add(textValorReal);
		textValorReal.setColumns(10);
		
		lblTaxaImobiliaria = new JLabel("Taxa imobili\u00E1ria:");
		lblTaxaImobiliaria.setBounds(15, 268, 119, 20);
		contentPane.add(lblTaxaImobiliaria);
		
		textTaxaImobiliaria = new JTextField();
		textTaxaImobiliaria.setBounds(169, 265, 146, 26);
		contentPane.add(textTaxaImobiliaria);
		textTaxaImobiliaria.setColumns(10);
		
		lblData = new JLabel("Data:");
		lblData.setBounds(15, 304, 45, 20);
		contentPane.add(lblData);
		
		textData = new JTextField();
		textData.setBounds(169, 301, 146, 26);
		contentPane.add(textData);
		textData.setColumns(10);
		
		chckbxVenda = new JCheckBox("Venda");
		chckbxVenda.setBounds(169, 339, 131, 29);
		contentPane.add(chckbxVenda);
		
		chckbxAluguel = new JCheckBox("Aluguel");
		chckbxAluguel.setBounds(169, 370, 131, 29);
		contentPane.add(chckbxAluguel);
		
		JLabel lblNewLabel = new JLabel("Dispon\u00EDvel para:");
		lblNewLabel.setBounds(15, 355, 119, 20);
		contentPane.add(lblNewLabel);
		
		btnAlterarResidencial = new JButton("Salvar e continuar residencial");
		btnAlterarResidencial.setEnabled(false);
		btnAlterarResidencial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlterarResidencial residencial = new AlterarResidencial();
				residencial.setVisible(true);
				AlterarResidencial.btnAlterarResidencial.setEnabled(true);
				AlterarImovel.this.dispose();
			}
		});
		btnAlterarResidencial.setBounds(15, 446, 300, 29);
		contentPane.add(btnAlterarResidencial);
		
		btnAlterarCasa = new JButton("Salvar e continuar casa");
		btnAlterarCasa.setEnabled(false);
		btnAlterarCasa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlterarResidencial residencial = new AlterarResidencial();
				residencial.setVisible(true);
				AlterarResidencial.btnAlterarCasa.setEnabled(true);
				AlterarImovel.this.dispose();
			}
		});
		btnAlterarCasa.setBounds(15, 526, 300, 29);
		contentPane.add(btnAlterarCasa);
		
		btnAlterarSalaComercial = new JButton("Salvar e continuar sala comercial");
		btnAlterarSalaComercial.setEnabled(false);
		btnAlterarSalaComercial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlterarSalaComercial salaComercial = new AlterarSalaComercial();
				salaComercial.setVisible(true);
				AlterarImovel.this.dispose();
			}
		});
		btnAlterarSalaComercial.setBounds(15, 406, 302, 29);
		contentPane.add(btnAlterarSalaComercial);
		
		btnAlterarApartamento = new JButton("Salvar e continuar apartamento");
		btnAlterarApartamento.setEnabled(false);
		btnAlterarApartamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlterarResidencial residencial = new AlterarResidencial();
				residencial.setVisible(true);
				AlterarResidencial.btnAlterarApartamento.setEnabled(true);
				AlterarImovel.this.dispose();
			}
		});
		btnAlterarApartamento.setBounds(15, 486, 300, 29);
		contentPane.add(btnAlterarApartamento);

	}
}
