import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastroCorretor extends JFrame {

	private Corretor corretor;
	private DadosPessoa dadosCorretor;
	private JTextField campoVendasMes;
	private JLabel labelCursoFormacao;
	private JLabel labelDataIncio;
	private JCheckBox checkBoxCursoFormacao;
	private JLabel labelVendasMes;
	private JButton buttonCancelar;
	private JButton buttonConfirmar;
	private JLabel header;
	private JTextField campoDataInicio;

	public TelaCadastroCorretor() {
		super("Cadastro Corretor");
		TrataBotoes tratador = new TrataBotoes();
		setSize(290, 210);
		setVisible(true);
		setBounds(100, 100, 290, 210);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		corretor = new Corretor();
		dadosCorretor = new DadosPessoa();

		labelCursoFormacao = new JLabel("Possui curso de forma\u00E7\u00E3o:");
		labelCursoFormacao.setBounds(24, 38, 165, 14);
		getContentPane().add(labelCursoFormacao);

		labelDataIncio = new JLabel("Data In\u00EDcio:");
		labelDataIncio.setBounds(24, 64, 122, 14);
		getContentPane().add(labelDataIncio);

		corretor.setDataInicio();
		campoDataInicio = new JTextField(corretor.getDataInicio());
		campoDataInicio.setEditable(false);
		campoDataInicio.setHorizontalAlignment(SwingConstants.CENTER);
		campoDataInicio.setBounds(140, 61, 82, 20);
		getContentPane().add(campoDataInicio);

		checkBoxCursoFormacao = new JCheckBox("");
		checkBoxCursoFormacao.setBounds(195, 34, 21, 23);
		getContentPane().add(checkBoxCursoFormacao);

		labelVendasMes = new JLabel("Vendas no m\u00EAs:");
		labelVendasMes.setBounds(24, 89, 106, 14);
		getContentPane().add(labelVendasMes);

		campoVendasMes = new JTextField();
		campoVendasMes.setBounds(140, 89, 122, 20);
		getContentPane().add(campoVendasMes);
		campoVendasMes.setColumns(10);

		buttonCancelar = new JButton("Cancelar");
		buttonCancelar.setBounds(24, 128, 100, 23);
		getContentPane().add(buttonCancelar);

		buttonConfirmar = new JButton("Confirmar");
		buttonConfirmar.setBounds(148, 128, 100, 23);
		getContentPane().add(buttonConfirmar);
		buttonConfirmar.addActionListener(tratador);

		header = new JLabel("Dados do Corretor");
		header.setFont(new Font("Tahoma", Font.PLAIN, 15));
		header.setHorizontalAlignment(SwingConstants.CENTER);
		header.setBounds(11, 7, 252, 20);
		getContentPane().add(header);
	}

	private class TrataBotoes implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == buttonCancelar) {
				dispose();
			} else if (e.getSource() == buttonConfirmar) {
				if (!corretor.setVendasMes(Float.parseFloat(campoVendasMes.getText())))
					JOptionPane.showMessageDialog(null, "CEP inválido", "CEP inválido", JOptionPane.OK_OPTION);
				else {
					corretor.setNome(TelaCadastroFuncionario.campoNome.getText());
					corretor.setCPF(TelaCadastroFuncionario.campoCpf.getText());
					corretor.setTelefone(TelaCadastroFuncionario.campoTelefone.getText());
					Corretor.setSalarioBase(Float.parseFloat(TelaCadastroFuncionario.campoSalarioBase.getText()));
					corretor.setTelefoneContato(TelaCadastroFuncionario.campoTelefoneContato.getText());
					corretor.setTelefoneCelular(TelaCadastroFuncionario.campoTelefoneCelular.getText());
					corretor.setDataIngresso();
					corretor.setCargo(TelaCadastroFuncionario.campoCargo.getText());
					corretor.setLogin(TelaCadastroFuncionario.campoLogin.getText());
					corretor.setSenha(TelaCadastroFuncionario.campoSenha.getText());
					corretor.setEndereco(TelaCadastroFuncionario.funcionario.getEndereco());
					corretor.setSalarioFinal();
					corretor.setDataInicio();
					corretor.setCursoFormacao(checkBoxCursoFormacao.isSelected());
					dadosCorretor.cadastrar(corretor);
					dadosCorretor.listar();
					dadosCorretor.salvaContatosBin();
					JOptionPane.showMessageDialog(null, "Corretor cadastrado com sucesso!");
					dispose();
				}
			}
		}
	}
}
