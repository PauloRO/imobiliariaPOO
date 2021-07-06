import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class CadastrarResidencial extends JFrame {
	
	static JPanel contentPane;
	static JTextField textQuantidadeQuartos;
	static JTextField textQuantidadeSuites;
	static JTextField textQuantidadeSalasEstar;
	static JTextField textQuantidadeSalasJantar;
	static JLabel lblNumeroVagasGaragem;
	static JTextField textNumeroVagasGaragem;
	static JLabel lblPossuiArmarioEmbutido;
	static JTextField textDescricao;
	static JLabel lblDescricao;
	static JCheckBox chckbxPossuiArmarioEmbutido;
	static JButton btnCadastrarResidencial;
	static JButton btnCadastrarApartamento;
	static JButton btnCadastrarCasa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarResidencial frame = new CadastrarResidencial();
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
	public CadastrarResidencial() {
		setTitle("Cadastro Residencial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 353, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQuantidadeQuartos = new JLabel("Quantidade de quartos:");
		lblQuantidadeQuartos.setBounds(15, 16, 167, 20);
		contentPane.add(lblQuantidadeQuartos);
		
		textQuantidadeQuartos = new JTextField();
		textQuantidadeQuartos.setBounds(240, 13, 75, 26);
		contentPane.add(textQuantidadeQuartos);
		textQuantidadeQuartos.setColumns(10);
		
		JLabel lblQuantidadeSuites = new JLabel("Quantidade de suites:");
		lblQuantidadeSuites.setBounds(15, 52, 167, 20);
		contentPane.add(lblQuantidadeSuites);
		
		textQuantidadeSuites = new JTextField();
		textQuantidadeSuites.setBounds(240, 49, 75, 26);
		contentPane.add(textQuantidadeSuites);
		textQuantidadeSuites.setColumns(10);
		
		JLabel lblQuantidadeSalasEstar = new JLabel("Quantidade de salas de estar:");
		lblQuantidadeSalasEstar.setBounds(15, 88, 212, 20);
		contentPane.add(lblQuantidadeSalasEstar);
		
		textQuantidadeSalasEstar = new JTextField();
		textQuantidadeSalasEstar.setBounds(239, 85, 76, 26);
		contentPane.add(textQuantidadeSalasEstar);
		textQuantidadeSalasEstar.setColumns(10);
		
		JLabel lblQuantidadeSalasJantar = new JLabel("Quantidade de salas de jantar:");
		lblQuantidadeSalasJantar.setBounds(15, 124, 223, 20);
		contentPane.add(lblQuantidadeSalasJantar);
		
		textQuantidadeSalasJantar = new JTextField();
		textQuantidadeSalasJantar.setBounds(239, 121, 76, 26);
		contentPane.add(textQuantidadeSalasJantar);
		textQuantidadeSalasJantar.setColumns(10);
		
		lblNumeroVagasGaragem = new JLabel("N\u00BA de vagas de garagem:");
		lblNumeroVagasGaragem.setBounds(15, 160, 196, 20);
		contentPane.add(lblNumeroVagasGaragem);
		
		textNumeroVagasGaragem = new JTextField();
		textNumeroVagasGaragem.setBounds(240, 157, 75, 26);
		contentPane.add(textNumeroVagasGaragem);
		textNumeroVagasGaragem.setColumns(10);
		
		lblPossuiArmarioEmbutido = new JLabel("Possui arm\u00E1rios embutidos:");
		lblPossuiArmarioEmbutido.setBounds(15, 196, 212, 20);
		contentPane.add(lblPossuiArmarioEmbutido);
		
		textDescricao = new JTextField();
		textDescricao.setHorizontalAlignment(SwingConstants.LEFT);
		textDescricao.setBounds(97, 227, 218, 26);
		contentPane.add(textDescricao);
		textDescricao.setColumns(10);
		
		lblDescricao = new JLabel("Descri\u00E7\u00E3o:");
		lblDescricao.setBounds(15, 232, 75, 20);
		contentPane.add(lblDescricao);
		
		chckbxPossuiArmarioEmbutido = new JCheckBox("Sim");
		chckbxPossuiArmarioEmbutido.setBounds(240, 195, 58, 29);
		contentPane.add(chckbxPossuiArmarioEmbutido);
		
		btnCadastrarCasa = new JButton("Salvar e continuar casa");
		btnCadastrarCasa.setEnabled(false);
		btnCadastrarCasa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarCasa casa = new CadastrarCasa();
				casa.setVisible(true);
				CadastrarResidencial.this.dispose();
			}
		});
		btnCadastrarCasa.setBounds(15, 359, 300, 29);
		contentPane.add(btnCadastrarCasa);
		
		btnCadastrarApartamento = new JButton("Salvar e continuar apartamento");
		btnCadastrarApartamento.setEnabled(false);
		btnCadastrarApartamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastrarApartamento apartamento = new CadastrarApartamento();
				apartamento.setVisible(true);
				CadastrarResidencial.this.dispose();
			}
		});
		btnCadastrarApartamento.setBounds(15, 314, 300, 29);
		contentPane.add(btnCadastrarApartamento);
		
		btnCadastrarResidencial = new JButton("Salvar residencial");
		btnCadastrarResidencial.setEnabled(false);
		btnCadastrarResidencial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				if(e.getSource() == btnCadastrarResidencial) {
					DadosEndereco endereco = new DadosEndereco();
					Endereco novoEndereco = new Endereco();
					DadosImovel imovel = new DadosImovel();
					Residencial residencial = new Residencial(
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
							Integer.parseInt(textQuantidadeQuartos.getText()), 
							Integer.parseInt(textQuantidadeSuites.getText()),
							Integer.parseInt(textQuantidadeSalasEstar.getText()),
							Integer.parseInt(textQuantidadeSalasJantar.getText()),
							Integer.parseInt(textNumeroVagasGaragem.getText()),
							chckbxPossuiArmarioEmbutido.isSelected(),
							textDescricao.getText());
					endereco.cadastrar(novoEndereco);
					imovel.cadastrar(residencial);
					CadastrarResidencial.this.dispose();
								
					UIManager.put("OptionPane.minimumSize", new Dimension(220, 200));
					JOptionPane.showMessageDialog(null, residencial.toString(), "Dados cadastrados:", JOptionPane.PLAIN_MESSAGE);
			}
		}});
		btnCadastrarResidencial.setBounds(15, 269, 300, 29);
		contentPane.add(btnCadastrarResidencial);
	}
}
