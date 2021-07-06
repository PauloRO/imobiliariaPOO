import javax.swing.JFrame;
import javax.swing.JTextField;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class TelaAlteraEndereco extends JFrame {

	static JLabel headerText;
	static JTextField campoRua;
	static JLabel labelRua;
	static JLabel labelNumero;
	static JTextField campoNumero;
	static JLabel labelComplemento;
	static JTextField campoComplemento;
	static JLabel labelCep;
	static JTextField campoCep;
	static JLabel labelCidade;
	static JTextField campoCidade;
	static JButton buttonCancelar;
	static JButton buttonConfirmar;
	static Endereco endereco;
	static DadosEndereco dadosEndereco;
	static Funcionario funcionario;
	static DadosPessoa dadosFuncionario;

	public TelaAlteraEndereco() {
		super("Endereço");
		setTitle("Alterar Endere\u00E7o");
		TrataBotoes tratador = new TrataBotoes();
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(360, 230);
		setVisible(true);
		getContentPane().setLayout(null);
		dadosFuncionario = new DadosPessoa();
		funcionario = (Funcionario) dadosFuncionario.buscar(TelaAlteraFuncionario.campoCpfBusca.getText());
		endereco = new Endereco(funcionario.getEndereco().getRua(), funcionario.getEndereco().getNumero(),
				funcionario.getEndereco().getComplemento(), funcionario.getEndereco().getCEP(),
				funcionario.getEndereco().getCidade());
		dadosEndereco = new DadosEndereco();

		campoRua = new JTextField(endereco.getRua());
		campoRua.setText(endereco.getRua());
		campoRua.setBounds(47, 86, 177, 20);
		getContentPane().add(campoRua);
		campoRua.setColumns(10);

		headerText = new JLabel("Endereço");
		headerText.setFont(new Font("Tahoma", Font.PLAIN, 18));
		headerText.setBounds(141, 11, 72, 24);
		getContentPane().add(headerText);

		labelRua = new JLabel("Rua:");
		labelRua.setBounds(10, 89, 46, 14);
		getContentPane().add(labelRua);

		labelNumero = new JLabel("N\u00FAmero:");
		labelNumero.setBounds(234, 89, 58, 14);
		getContentPane().add(labelNumero);

		campoNumero = new JTextField(endereco.getNumero());
		campoNumero.setText(endereco.getNumero());
		campoNumero.setBounds(290, 86, 46, 20);
		getContentPane().add(campoNumero);
		campoNumero.setColumns(10);

		labelComplemento = new JLabel("Complemento:");
		labelComplemento.setBounds(10, 120, 86, 14);
		getContentPane().add(labelComplemento);

		campoComplemento = new JTextField(endereco.getComplemento());
		campoComplemento.setText(endereco.getComplemento());
		campoComplemento.setColumns(10);
		campoComplemento.setBounds(97, 117, 239, 20);
		getContentPane().add(campoComplemento);

		labelCep = new JLabel("CEP:");
		labelCep.setBounds(10, 58, 58, 14);
		getContentPane().add(labelCep);

		campoCep = new JTextField(endereco.getCEP());
		campoCep.setText(endereco.getCEP());
		campoCep.setColumns(10);
		campoCep.setBounds(47, 55, 103, 20);
		getContentPane().add(campoCep);

		labelCidade = new JLabel("Cidade:");
		labelCidade.setBounds(166, 58, 46, 14);
		getContentPane().add(labelCidade);

		campoCidade = new JTextField(endereco.getCidade());
		campoCidade.setText(endereco.getCidade());
		campoCidade.setBounds(213, 55, 123, 20);
		getContentPane().add(campoCidade);
		campoCidade.setColumns(10);

		buttonCancelar = new JButton("Cancelar");
		buttonCancelar.setBounds(44, 148, 110, 23);
		getContentPane().add(buttonCancelar);
		buttonCancelar.addActionListener(tratador);

		buttonConfirmar = new JButton("Confirmar");
		buttonConfirmar.setBounds(198, 148, 110, 23);
		getContentPane().add(buttonConfirmar);
		buttonConfirmar.addActionListener(tratador);
	}

	private class TrataBotoes implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == buttonCancelar) {
				dispose();
			} else if (e.getSource() == buttonConfirmar) {
				if (!TelaEndereco.endereco.setCEP(campoCep.getText()))
					JOptionPane.showMessageDialog(null, "CEP inválido", "CEP inválido", JOptionPane.OK_OPTION);
				else if (!TelaEndereco.endereco.setCidade(campoCidade.getText()))
					JOptionPane.showMessageDialog(null, "Cidade inválida", "Cidade inválida", JOptionPane.OK_OPTION);
				else if (!TelaEndereco.endereco.setRua(campoRua.getText()))
					JOptionPane.showMessageDialog(null, "Rua inválida", "Rua inválida", JOptionPane.OK_OPTION);
				else if (!TelaEndereco.endereco.setNumero(campoNumero.getText()))
					JOptionPane.showMessageDialog(null, "Numero inválido", "Numero inválido", JOptionPane.OK_OPTION);
				else if (!TelaEndereco.endereco.setComplemento(campoComplemento.getText()))
					JOptionPane.showMessageDialog(null, "Complemento inválido", "Complemento inválido",
							JOptionPane.OK_OPTION);
				else {
					dadosEndereco.excluir(endereco.getRua(), endereco.getNumero());
					dadosEndereco.cadastrar(endereco);
					dadosEndereco.listar();
					dadosEndereco.salvaContatosBin();
					dispose();
				}

			}
		}
	}
}
