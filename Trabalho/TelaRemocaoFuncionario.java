import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class TelaRemocaoFuncionario extends JFrame {

	private DadosPessoa dadosFuncionario;
	private JTextField campoCpf;
	private JButton buttonCancelar;
	private JButton buttonConsultar;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	public TelaRemocaoFuncionario() {
		super("Tela de Remoção de Funcionário");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 140);
		setVisible(true);
		getContentPane().setLayout(null);
		TrataBotoes tratador = new TrataBotoes();
		dadosFuncionario = new DadosPessoa();

		buttonCancelar = new JButton("Cancelar");
		buttonCancelar.setBounds(38, 68, 89, 23);
		buttonCancelar.addActionListener(tratador);
		getContentPane().add(buttonCancelar);

		buttonConsultar = new JButton("Remover");
		buttonConsultar.setBounds(165, 68, 89, 23);
		buttonConsultar.addActionListener(tratador);
		getContentPane().add(buttonConsultar);

		lblNewLabel = new JLabel("CPF:");
		lblNewLabel.setBounds(56, 40, 46, 14);
		getContentPane().add(lblNewLabel);

		campoCpf = new JTextField();
		campoCpf.setBounds(141, 37, 100, 20);
		getContentPane().add(campoCpf);
		campoCpf.setColumns(10);

		lblNewLabel_1 = new JLabel("Digite o CPF do funcion\u00E1rio para remov\u00EA-lo:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 11, 274, 14);
		getContentPane().add(lblNewLabel_1);
	}

	private class TrataBotoes implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == buttonCancelar) {
				dispose();
			} else {
				if (!dadosFuncionario.excluir(campoCpf.getText()))
					JOptionPane.showMessageDialog(null, "CPF não encontrado!", "Erro na remoção",
							JOptionPane.OK_OPTION);
				else {
					// COMO TESTAR ISSO
					JOptionPane.showMessageDialog(null, "Funcionario removido com sucesso!", "Sucesso",
							JOptionPane.OK_OPTION);
					dadosFuncionario.salvaContatosBin();
				}
			}
		}
	}
}
