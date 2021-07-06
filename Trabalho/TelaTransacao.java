import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class TelaTransacao extends JFrame {

	private DadosImovel dadosImovel;
	private DadosPessoa dadosPessoa;
	private DadosTransacao dadosTransacao;
	private Transacao transacao;
	private JLabel header;
	private JLabel labelNumContrato;
	private JTextField campoNumContrato;
	private JLabel labelData;
	private JTextField campoData;
	private JLabel labelFormaDePagamento;
	private JLabel labelCodigoImovel;
	private JTextField campoCodigoImovel;
	private JLabel labelCpfCliente;
	private JTextField campoCpfCliente;
	private JLabel labelCpfCorretor;
	private JTextField campoCpfCorretor;
	private JButton buttonCancelar;
	private JButton buttonConfirmar;
	private JComboBox<String> comboBox;

	public TelaTransacao() {
		super("Efetuar Transação");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(270, 290);
		setVisible(true);
		setResizable(false);
		getContentPane().setLayout(null);
		TrataBotoes tratador = new TrataBotoes();
		transacao = new Transacao();
		dadosImovel = new DadosImovel();
		dadosPessoa = new DadosPessoa();
		dadosTransacao = new DadosTransacao();

		header = new JLabel("Digite as informa\u00E7\u00F5es da transa\u00E7\u00E3o:");
		header.setFont(new Font("Tahoma", Font.PLAIN, 15));
		header.setBounds(10, 11, 424, 19);
		getContentPane().add(header);

		labelNumContrato = new JLabel("N\u00FAmero do Contrato:");
		labelNumContrato.setBounds(10, 49, 125, 14);
		getContentPane().add(labelNumContrato);

		campoNumContrato = new JTextField();
		campoNumContrato.setBounds(145, 46, 100, 20);
		getContentPane().add(campoNumContrato);
		campoNumContrato.setColumns(10);

		labelData = new JLabel("Data:");
		labelData.setBounds(10, 77, 46, 14);
		getContentPane().add(labelData);

		transacao.setDataDaTransacao();
		campoData = new JTextField(transacao.getDataDaTransacao());
		campoData.setBounds(52, 74, 86, 20);
		getContentPane().add(campoData);
		campoData.setColumns(10);

		labelFormaDePagamento = new JLabel("Forma de Pagamento:");
		labelFormaDePagamento.setBounds(10, 106, 125, 14);
		getContentPane().add(labelFormaDePagamento);

		comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] { "Cartao", "Boleto", "Dinheiro" }));
		comboBox.setBounds(145, 102, 100, 22);
		getContentPane().add(comboBox);

		labelCodigoImovel = new JLabel("C\u00F3digo do Im\u00F3vel:");
		labelCodigoImovel.setBounds(10, 135, 112, 14);
		getContentPane().add(labelCodigoImovel);

		campoCodigoImovel = new JTextField();
		campoCodigoImovel.setBounds(114, 132, 131, 20);
		getContentPane().add(campoCodigoImovel);
		campoCodigoImovel.setColumns(10);

		labelCpfCliente = new JLabel("CPF do cliente:");
		labelCpfCliente.setBounds(10, 160, 112, 14);
		getContentPane().add(labelCpfCliente);

		campoCpfCliente = new JTextField();
		campoCpfCliente.setColumns(10);
		campoCpfCliente.setBounds(114, 157, 131, 20);
		getContentPane().add(campoCpfCliente);

		labelCpfCorretor = new JLabel("CPF do corretor:");
		labelCpfCorretor.setBounds(10, 185, 112, 14);
		getContentPane().add(labelCpfCorretor);

		campoCpfCorretor = new JTextField();
		campoCpfCorretor.setColumns(10);
		campoCpfCorretor.setBounds(114, 182, 131, 20);
		getContentPane().add(campoCpfCorretor);

		buttonCancelar = new JButton("Cancelar");
		buttonCancelar.setBounds(14, 222, 110, 23);
		getContentPane().add(buttonCancelar);
		buttonCancelar.addActionListener(tratador);

		buttonConfirmar = new JButton("Confirmar");
		buttonConfirmar.setBounds(138, 222, 110, 23);
		getContentPane().add(buttonConfirmar);
		buttonConfirmar.addActionListener(tratador);
	}

	private class TrataBotoes implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == buttonCancelar) {
				dispose();
			} else {
				if (!transacao.setNumeroContrato(Integer.parseInt(campoNumContrato.getText())))
					JOptionPane.showMessageDialog(null, "Número de contrato inválido", "Número de contrato inválido",
							JOptionPane.OK_OPTION);
				else if (!transacao.setFormaDePagamento(comboBox.getName()))
					JOptionPane.showMessageDialog(null, "Método de pagamento inválido", "Método de pagamento inválido",
							JOptionPane.OK_OPTION);
				else if (!transacao.setImovel(dadosImovel.buscar(Integer.parseInt(campoCodigoImovel.getText()))))
					JOptionPane.showMessageDialog(null, "Imóvel não encontrado", "Imóvel não encontrado",
							JOptionPane.OK_OPTION);
				else if (!transacao.setUsuario((Usuario) dadosPessoa.buscar(campoCpfCliente.getText())))
					JOptionPane.showMessageDialog(null, "Cliente não encontrado", "Cliente não encontrado",
							JOptionPane.OK_OPTION);
				else if (!transacao.setCorretor((Corretor) dadosPessoa.buscar(campoCpfCliente.getText())))
					JOptionPane.showMessageDialog(null, "Cliente não encontrado", "Cliente não encontrado",
							JOptionPane.OK_OPTION);
				else {
					dadosTransacao.cadastrar(transacao);
					dadosTransacao.salvaContatosBin();
					JOptionPane.showMessageDialog(null, "Transação realizada com sucesso!");
					dispose();
				}
			}
		}
	}
}
