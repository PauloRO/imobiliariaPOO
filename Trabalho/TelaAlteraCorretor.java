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

public class TelaAlteraCorretor extends JFrame {

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

	public TelaAlteraCorretor() {
		super("Cadastro Corretor");
		setTitle("Alterar Dados do Corretor");
		TrataBotoes tratador = new TrataBotoes();
		setSize(290, 210);
		setVisible(true);
		setBounds(100, 100, 290, 210);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		dadosCorretor = new DadosPessoa();
		corretor = new Corretor();

		labelCursoFormacao = new JLabel("Possui curso de formaçãoo:");
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

		labelVendasMes = new JLabel("Vendas no mês:");
		labelVendasMes.setBounds(24, 89, 106, 14);
		getContentPane().add(labelVendasMes);

		campoVendasMes = new JTextField(String.valueOf(corretor.getVendasMes()));
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
					JOptionPane.showMessageDialog(null, "Vendas no mês inválida", "Vendas no mês inválida", JOptionPane.OK_OPTION);
				else {
					dadosCorretor.excluir(TelaAlteraFuncionario.campoCpfBusca.getText());
					corretor.setNome(TelaCadastroFuncionario.funcionario.getNome());
					corretor.setCPF(TelaCadastroFuncionario.funcionario.getCPF());
					corretor.setTelefone(TelaCadastroFuncionario.funcionario.getTelefone());
					Corretor.setSalarioBase(TelaCadastroFuncionario.funcionario.getSalarioBase());
					corretor.setTelefoneContato(TelaCadastroFuncionario.funcionario.getTelefoneContato());
					corretor.setTelefoneCelular(TelaCadastroFuncionario.funcionario.getTelefoneCelular());
					corretor.setDataIngresso();
					corretor.setCargo(TelaCadastroFuncionario.funcionario.getCargo());
					corretor.setLogin(TelaCadastroFuncionario.funcionario.getLogin());
					corretor.setSenha(TelaCadastroFuncionario.funcionario.getSenha());
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
