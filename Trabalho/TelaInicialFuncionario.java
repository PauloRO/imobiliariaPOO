import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import java.awt.Font;

public class TelaInicialFuncionario extends JFrame {

	private JButton buttonConsultar;
	private JButton buttonAlterar;
	private JButton buttonRemover;
	private JButton buttonCadastro;
	private JLabel headerText;

	public TelaInicialFuncionario() {
		super("Tela Inicial de Funcionário");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(470, 140);
		setVisible(true);
		getContentPane().setLayout(null);
		TrataBotoes tratador = new TrataBotoes();

		buttonConsultar = new JButton("Consultar");
		buttonConsultar.setBounds(124, 54, 100, 23);
		getContentPane().add(buttonConsultar);
		buttonConsultar.addActionListener(tratador);

		buttonAlterar = new JButton("Alterar");
		buttonAlterar.setBounds(236, 54, 100, 23);
		getContentPane().add(buttonAlterar);
		buttonAlterar.addActionListener(tratador);

		buttonRemover = new JButton("Remover");
		buttonRemover.setBounds(348, 54, 100, 23);
		getContentPane().add(buttonRemover);
		buttonRemover.addActionListener(tratador);

		buttonCadastro = new JButton("Cadastrar");
		buttonCadastro.setBounds(12, 54, 100, 23);
		getContentPane().add(buttonCadastro);
		buttonCadastro.addActionListener(tratador);

		headerText = new JLabel("Clique na op\u00E7\u00E3o desejada");
		headerText.setFont(new Font("Tahoma", Font.PLAIN, 16));
		headerText.setHorizontalAlignment(SwingConstants.CENTER);
		headerText.setBounds(10, 11, 424, 32);
		getContentPane().add(headerText);
	}

	private class TrataBotoes implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == buttonConsultar) {
				TelaConsultaFuncionario telaConsultaFuncionario = new TelaConsultaFuncionario();
			} else if (e.getSource() == buttonAlterar) {
				TelaAlteraFuncionario telaAlteraFuncionario = new TelaAlteraFuncionario();
			} else if (e.getSource() == buttonRemover) {
				TelaRemocaoFuncionario telaRemocaoFuncionario = new TelaRemocaoFuncionario();
			} else if (e.getSource() == buttonCadastro) {
				TelaCadastroFuncionario telaCadastroFuncionario = new TelaCadastroFuncionario();
				
			}
		}
	}
}
