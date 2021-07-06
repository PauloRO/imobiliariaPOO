import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class TelaConsultaFuncionario extends JFrame {

	private DadosPessoa dadosFuncionario;
	private JTextField campoCpf;
	private JButton buttonCancelar;
	private JButton buttonConsultar;
	private JLabel lblNewLabel;
	private JLabel headerText;

	public TelaConsultaFuncionario() {
		super("Consulta de Funcionário");
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

		buttonConsultar = new JButton("Consultar");
		buttonConsultar.setBounds(165, 68, 89, 23);
		buttonConsultar.addActionListener(tratador);
		getContentPane().add(buttonConsultar);

		lblNewLabel = new JLabel("CPF:");
		lblNewLabel.setBounds(56, 40, 46, 14);
		getContentPane().add(lblNewLabel);

		campoCpf = new JTextField();
		campoCpf.setBounds(140, 37, 100, 20);
		getContentPane().add(campoCpf);
		campoCpf.setColumns(10);

		headerText = new JLabel("Digite o CPF do funcion\u00E1rio para consultar:");
		headerText.setHorizontalAlignment(SwingConstants.CENTER);
		headerText.setBounds(10, 11, 274, 14);
		getContentPane().add(headerText);
	}

	private class TrataBotoes implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == buttonCancelar) {
				dispose();
			} else {
				if (dadosFuncionario.buscar(campoCpf.getText()) == null)
					JOptionPane.showMessageDialog(null, "CPF não encontrado!", "Erro na busca", JOptionPane.OK_OPTION);
				else
					JOptionPane.showMessageDialog(null, dadosFuncionario.buscar(campoCpf.getText()).toString(),
							"Resultado", JOptionPane.OK_OPTION);
			}
		}
	}
}
