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

public class AlterarApartamento extends JFrame {

	private JPanel contentPane;
	private JCheckBox chckbxPortaria;
	private JTextField textAndar;
	private JLabel lblValorCondominio;
	private JTextField textValorCondominio;
	private JLabel lblPortaria;
	private JButton btnAlterarApartamento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlterarApartamento frame = new AlterarApartamento();
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
	public AlterarApartamento() {
		setTitle("Altera Apartamento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 294, 212);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAndar = new JLabel("N\u00BA do andar:");
		lblAndar.setBounds(15, 16, 101, 20);
		contentPane.add(lblAndar);
		
		textAndar = new JTextField();
		textAndar.setBounds(179, 13, 84, 26);
		contentPane.add(textAndar);
		textAndar.setColumns(10);
				
		lblValorCondominio = new JLabel("Valor do condom\u00EDnio:");
		lblValorCondominio.setBounds(15, 52, 154, 20);
		contentPane.add(lblValorCondominio);
		
		textValorCondominio = new JTextField();
		textValorCondominio.setBounds(179, 49, 84, 26);
		contentPane.add(textValorCondominio);
		textValorCondominio.setColumns(10);
		
		lblPortaria = new JLabel("Possui portaria:");
		lblPortaria.setBounds(15, 90, 121, 20);
		contentPane.add(lblPortaria);
		
		chckbxPortaria = new JCheckBox("Sim");
		chckbxPortaria.setBounds(179, 87, 65, 26);
		contentPane.add(chckbxPortaria);
		
		btnAlterarApartamento = new JButton("Salvar");
		btnAlterarApartamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnAlterarApartamento) {
					DadosEndereco endereco = new DadosEndereco();
					Endereco novoEndereco = new Endereco();
					DadosImovel imovel = new DadosImovel();
					Apartamento apartamento = new Apartamento(
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
							Integer.parseInt(CadastrarResidencial.textQuantidadeQuartos.getText()), 
							Integer.parseInt(CadastrarResidencial.textQuantidadeSuites.getText()),
							Integer.parseInt(CadastrarResidencial.textQuantidadeSalasEstar.getText()),
							Integer.parseInt(CadastrarResidencial.textQuantidadeSalasJantar.getText()),
							Integer.parseInt(CadastrarResidencial.textNumeroVagasGaragem.getText()),
							CadastrarResidencial.chckbxPossuiArmarioEmbutido.isSelected(),
							CadastrarResidencial.textDescricao.getText(),
							Integer.parseInt(textAndar.getText()), 
							Float.parseFloat(textValorCondominio.getText()), 
							chckbxPortaria.isSelected());
					endereco.cadastrar(novoEndereco);
					imovel.cadastrar(apartamento);
					AlterarApartamento.this.dispose();
			}
		}});
		btnAlterarApartamento.setBounds(15, 126, 248, 29);
		contentPane.add(btnAlterarApartamento);
	}

}
