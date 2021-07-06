import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class AlterarCasa extends JFrame {

	private JPanel contentPane;
	private JCheckBox chckbxCondominio;
	private JLabel lblPiscina;
	private JCheckBox chckbxPiscina;
	private JButton btnAlterarCasa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlterarCasa frame = new AlterarCasa();
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
	public AlterarCasa() {
		setTitle("Altera Casa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 283, 172);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCondominio = new JLabel("Possui condom\u00EDnio:");
		lblCondominio.setBounds(15, 16, 149, 20);
		contentPane.add(lblCondominio);
		
		chckbxCondominio = new JCheckBox("Sim");
		chckbxCondominio.setBounds(195, 12, 64, 29);
		contentPane.add(chckbxCondominio);
		
		lblPiscina = new JLabel("Possui piscina:");
		lblPiscina.setBounds(15, 52, 111, 20);
		contentPane.add(lblPiscina);
		
		chckbxPiscina = new JCheckBox("Sim");
		chckbxPiscina.setBounds(195, 48, 64, 29);
		contentPane.add(chckbxPiscina);
		
		btnAlterarCasa = new JButton("Salvar");
		btnAlterarCasa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnAlterarCasa) {
					DadosEndereco endereco = new DadosEndereco();
					Endereco novoEndereco = new Endereco();
					DadosImovel imovel = new DadosImovel();
					Casa casa = new Casa(
						Integer.parseInt(
							CadastrarImovel.textCodigoImovel.getText()), 
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
							chckbxCondominio.isSelected(), 
							chckbxPiscina.isSelected());
					endereco.cadastrar(novoEndereco);
					imovel.cadastrar(casa);
					AlterarCasa.this.dispose();
			}
		}});
		btnAlterarCasa.setBounds(15, 88, 237, 29);
		contentPane.add(btnAlterarCasa);

	}
}
