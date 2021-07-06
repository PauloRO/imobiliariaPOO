import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class TelaCadastroFuncionario extends JFrame {

	static Funcionario funcionario;
	static DadosPessoa dadosFuncionario;
	
	static JLabel labelNome;
	static JTextField campoNome;
	static JLabel labelTelefone;
	static JTextField campoTelefone;
	static JLabel labelCpf;
	static JTextField campoCpf;
	static JLabel labelTelefoneContato;
	static JTextField campoTelefoneContato;
	static JLabel labelTelefoneCelular;
	static JTextField campoTelefoneCelular;
	static JLabel labelDataIngresso;
	static JTextField campoDataIngresso;
	static JLabel labelCargo;
	static JLabel labelSalarioBase;
	static JTextField campoSalarioBase;
	static JLabel labelLogin;
	static JTextField campoLogin;
	static JLabel labelSenha;
	static JTextField campoSenha;
	static JButton buttonCancelar;
	static JButton buttonCadastrar;
	static JTextField campoCargo;
	static JButton buttonCadastrarEndereco;

	public TelaCadastroFuncionario() {
		super("Cadastro de Funcionário");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 280);
		setVisible(true);
		getContentPane().setLayout(null);
		TrataBotoes tratador = new TrataBotoes();
		funcionario = new Funcionario();
		
		dadosFuncionario = new DadosPessoa();

		labelNome = new JLabel("Nome: ");
		labelNome.setBounds(10, 14, 57, 14);
		getContentPane().add(labelNome);
		campoNome = new JTextField(30);
		campoNome.setBounds(100, 11, 200, 20);
		getContentPane().add(campoNome);

		labelTelefone = new JLabel("Telefone: ");
		labelTelefone.setBounds(10, 39, 57, 14);
		getContentPane().add(labelTelefone);
		campoTelefone = new JTextField(12);
		campoTelefone.setBounds(100, 39, 116, 20);
		getContentPane().add(campoTelefone);
		campoCpf = new JTextField(11);
		campoCpf.setBounds(361, 11, 108, 20);
		getContentPane().add(campoCpf);

		labelTelefoneContato = new JLabel("Tel. Contato: ");
		labelTelefoneContato.setBounds(10, 70, 82, 14);
		getContentPane().add(labelTelefoneContato);
		campoTelefoneContato = new JTextField(12);
		campoTelefoneContato.setBounds(100, 70, 117, 20);
		getContentPane().add(campoTelefoneContato);

		labelTelefoneCelular = new JLabel("Celular: ");
		labelTelefoneCelular.setBounds(227, 39, 83, 14);
		getContentPane().add(labelTelefoneCelular);
		campoTelefoneCelular = new JTextField(12);
		campoTelefoneCelular.setBounds(334, 36, 135, 20);
		getContentPane().add(campoTelefoneCelular);

		labelDataIngresso = new JLabel("Data de Ingresso: ");
		labelDataIngresso.setBounds(227, 70, 102, 14);
		getContentPane().add(labelDataIngresso);
		
		funcionario.setDataIngresso();
		campoDataIngresso = new JTextField(funcionario.getDataIngresso());
		campoDataIngresso.setEditable(false);
		campoDataIngresso.setHorizontalAlignment(SwingConstants.CENTER);
		campoDataIngresso.setBounds(334, 67, 82, 20);
		getContentPane().add(campoDataIngresso);

		labelCargo = new JLabel("Cargo: ");
		labelCargo.setBounds(10, 99, 57, 14);
		getContentPane().add(labelCargo);

		labelSalarioBase = new JLabel("Salario base: ");
		labelSalarioBase.setBounds(227, 96, 83, 14);
		getContentPane().add(labelSalarioBase);
		campoSalarioBase = new JTextField(15);
		campoSalarioBase.setBounds(334, 93, 135, 20);
		getContentPane().add(campoSalarioBase);

		labelLogin = new JLabel("Login: ");
		labelLogin.setBounds(10, 124, 57, 14);
		getContentPane().add(labelLogin);
		campoLogin = new JTextField(15);
		campoLogin.setBounds(100, 124, 117, 20);
		getContentPane().add(campoLogin);

		labelSenha = new JLabel("Senha: ");
		labelSenha.setBounds(227, 124, 83, 14);
		getContentPane().add(labelSenha);
		campoSenha = new JPasswordField(15);
		campoSenha.setBounds(334, 121, 135, 20);
		getContentPane().add(campoSenha);

		buttonCancelar = new JButton("Cancelar");
		buttonCancelar.addActionListener(tratador);
		buttonCancelar.setBounds(91, 207, 110, 23);
		getContentPane().add(buttonCancelar);

		buttonCadastrar = new JButton("Cadastrar");
		buttonCadastrar.addActionListener(tratador);
		buttonCadastrar.setBounds(292, 207, 110, 23);
		getContentPane().add(buttonCadastrar);

		labelCpf = new JLabel("CPF: ");
		labelCpf.setBounds(311, 14, 40, 14);
		getContentPane().add(labelCpf);

		campoCargo = new JTextField(12);
		campoCargo.setBounds(100, 96, 117, 20);
		getContentPane().add(campoCargo);

		buttonCadastrarEndereco = new JButton("Cadastrar Endere\u00E7o");
		buttonCadastrarEndereco.setBounds(172, 165, 150, 23);
		getContentPane().add(buttonCadastrarEndereco);
		buttonCadastrarEndereco.addActionListener(tratador);
	}

	private class TrataBotoes implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == buttonCancelar) {
				dispose();
			} else if (e.getSource() == buttonCadastrarEndereco) {
				TelaEndereco telaEndereco = new TelaEndereco();
			} else {
				if (!funcionario.setNome(campoNome.getText()))
					JOptionPane.showMessageDialog(null, "Nome inválido", "Nome inválido", JOptionPane.OK_OPTION);
				else if (!funcionario.setCPF(campoCpf.getText()))
					JOptionPane.showMessageDialog(null, "CPF inválido", "CPF inválido", JOptionPane.OK_OPTION);
				else if (!funcionario.setTelefone(campoTelefone.getText()))
					JOptionPane.showMessageDialog(null, "Telefone inválido", "Telefone inválido",
							JOptionPane.OK_OPTION);
				else if (!funcionario.setTelefoneCelular(campoTelefoneCelular.getText()))
					JOptionPane.showMessageDialog(null, "Celular inválido", "Celular inválido", JOptionPane.OK_OPTION);
				else if (!funcionario.setTelefoneContato(campoTelefoneContato.getText()))
					JOptionPane.showMessageDialog(null, "Tel. contato inválido", "Tel. contato inválido",
							JOptionPane.OK_OPTION);
				else if (!funcionario.setCargo(campoCargo.getText()))
					JOptionPane.showMessageDialog(null, "Cargo inválido", "Cargo inválido", JOptionPane.OK_OPTION);
				else if (!Funcionario.setSalarioBase(Float.parseFloat(campoSalarioBase.getText())))
					JOptionPane.showMessageDialog(null, "Salário base inválido", "Salário base inválido",
							JOptionPane.OK_OPTION);
				else if (!funcionario.setLogin(campoLogin.getText()))
					JOptionPane.showMessageDialog(null, "Login inválido", "Login inválido", JOptionPane.OK_OPTION);
				else if (!funcionario.setSenha(campoSenha.getText()))
					JOptionPane.showMessageDialog(null, "Senha inválida", "Senha inválida", JOptionPane.OK_OPTION);
				else {
					funcionario.setEndereco(TelaEndereco.endereco);
					if (campoCargo.getText().toLowerCase().equals("corretor")) {
						TelaCadastroCorretor telaCadastroCorretor = new TelaCadastroCorretor();
						dispose();
					} else {
						dadosFuncionario.cadastrar(funcionario);
						dadosFuncionario.listar();
						dadosFuncionario.salvaContatosBin();
						JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso!");
						dispose();
					}
				}
			}
		}
	}
}
