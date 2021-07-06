import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class CadastrarSalaComercial extends JFrame {

	private JPanel contentPane;
	private JTextField textQuantidadeBanheiros;
	private JLabel lblQuantidadeComodos;
	private JTextField textQuantidadeComodos;
	private JLabel lblPortaria;
	private JButton btnCadastrarSalaComercial;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarSalaComercial frame = new CadastrarSalaComercial();
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
	public CadastrarSalaComercial() {
		setTitle("Cadastro Sala Comercial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 338, 172);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblQuantidadeBanheiros = new JLabel("Quantidade de banheiros:");
		lblQuantidadeBanheiros.setBounds(15, 16, 187, 20);
		contentPane.add(lblQuantidadeBanheiros);
		
		textQuantidadeBanheiros = new JTextField();
		textQuantidadeBanheiros.setBounds(217, 13, 84, 26);
		contentPane.add(textQuantidadeBanheiros);
		textQuantidadeBanheiros.setColumns(10);
				
		lblQuantidadeComodos = new JLabel("Quantidade de c\u00F4modos:");
		lblQuantidadeComodos.setBounds(15, 52, 187, 20);
		contentPane.add(lblQuantidadeComodos);
		
		textQuantidadeComodos = new JTextField();
		textQuantidadeComodos.setBounds(217, 49, 84, 26);
		contentPane.add(textQuantidadeComodos);
		textQuantidadeComodos.setColumns(10);
		
		btnCadastrarSalaComercial = new JButton("Salvar");
		btnCadastrarSalaComercial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnCadastrarSalaComercial) {
					DadosEndereco endereco = new DadosEndereco();
					Endereco novoEndereco = new Endereco();
					
					DadosImovel imovel = new DadosImovel();
					SalaComercial salaComercial = new SalaComercial(
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
							Integer.parseInt(textQuantidadeBanheiros.getText()), 
							Integer.parseInt(textQuantidadeComodos.getText()));
					endereco.cadastrar(novoEndereco);
					imovel.cadastrar(salaComercial);
					CadastrarSalaComercial.this.dispose();
					
					UIManager.put("OptionPane.minimumSize", new Dimension(220, 200));
					JOptionPane.showMessageDialog(null, salaComercial.toString() + novoEndereco.toString(), "Dados cadastrados:", JOptionPane.PLAIN_MESSAGE);
			}
		}});
		btnCadastrarSalaComercial.setBounds(15, 88, 286, 29);
		contentPane.add(btnCadastrarSalaComercial);
	}

}
