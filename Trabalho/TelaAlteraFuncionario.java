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

public class TelaAlteraFuncionario extends JFrame {

	static Funcionario funcionario;
	static DadosPessoa dadosFuncionario;
	static Endereco endereco;
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
	static JTextField campoCpfBusca;
	static JButton buttonBuscar;
	static JLabel labelHeader;
	static JButton buttonCadastrarEndereco;

	public TelaAlteraFuncionario() {
		super("Alteração de dados do Funcionário");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 325);
		setVisible(true);
		getContentPane().setLayout(null);
		TrataBotoes tratador = new TrataBotoes();
		funcionario = new Funcionario();
		endereco = new Endereco();
		dadosFuncionario = new DadosPessoa();

		labelNome = new JLabel("Nome: ");
		labelNome.setBounds(10, 59, 57, 14);
		getContentPane().add(labelNome);
		campoNome = new JTextField();
		campoNome.setBounds(101, 56, 200, 20);
		getContentPane().add(campoNome);

		labelTelefone = new JLabel("Telefone: ");
		labelTelefone.setBounds(10, 87, 57, 14);
		getContentPane().add(labelTelefone);
		campoTelefone = new JTextField();
		campoTelefone.setBounds(101, 87, 116, 20);
		getContentPane().add(campoTelefone);
		campoCpf = new JTextField();
		campoCpf.setBounds(361, 56, 108, 20);
		getContentPane().add(campoCpf);

		labelTelefoneContato = new JLabel("Tel. Contato: ");
		labelTelefoneContato.setBounds(10, 118, 82, 14);
		getContentPane().add(labelTelefoneContato);
		campoTelefoneContato = new JTextField();
		campoTelefoneContato.setBounds(101, 118, 117, 20);
		getContentPane().add(campoTelefoneContato);

		labelTelefoneCelular = new JLabel("Celular: ");
		labelTelefoneCelular.setBounds(227, 87, 83, 14);
		getContentPane().add(labelTelefoneCelular);
		campoTelefoneCelular = new JTextField();
		campoTelefoneCelular.setBounds(334, 84, 135, 20);
		getContentPane().add(campoTelefoneCelular);

		labelDataIngresso = new JLabel("Data de Ingresso: ");
		labelDataIngresso.setBounds(227, 118, 102, 14);
		getContentPane().add(labelDataIngresso);

		funcionario.setDataIngresso();
		campoDataIngresso = new JTextField(funcionario.getDataIngresso());
		campoDataIngresso.setEditable(false);
		campoDataIngresso.setHorizontalAlignment(SwingConstants.CENTER);
		campoDataIngresso.setBounds(334, 115, 82, 20);
		getContentPane().add(campoDataIngresso);

		labelCargo = new JLabel("Cargo: ");
		labelCargo.setBounds(10, 147, 57, 14);
		getContentPane().add(labelCargo);

		labelSalarioBase = new JLabel("Salario base: ");
		labelSalarioBase.setBounds(227, 144, 83, 14);
		getContentPane().add(labelSalarioBase);
		campoSalarioBase = new JTextField();
		campoSalarioBase.setBounds(334, 141, 135, 20);
		getContentPane().add(campoSalarioBase);

		labelLogin = new JLabel("Login: ");
		labelLogin.setBounds(10, 172, 57, 14);
		getContentPane().add(labelLogin);
		campoLogin = new JTextField();
		campoLogin.setBounds(101, 172, 117, 20);
		getContentPane().add(campoLogin);

		labelSenha = new JLabel("Senha: ");
		labelSenha.setBounds(227, 172, 83, 14);
		getContentPane().add(labelSenha);
		campoSenha = new JPasswordField();
		campoSenha.setBounds(334, 169, 135, 20);
		getContentPane().add(campoSenha);

		buttonCancelar = new JButton("Cancelar");
		buttonCancelar.addActionListener(tratador);
		buttonCancelar.setBounds(88, 252, 110, 23);
		getContentPane().add(buttonCancelar);

		buttonCadastrar = new JButton("Salvar");
		buttonCadastrar.addActionListener(tratador);
		buttonCadastrar.setBounds(286, 252, 110, 23);
		getContentPane().add(buttonCadastrar);

		labelCpf = new JLabel("CPF: ");
		labelCpf.setBounds(311, 59, 40, 14);
		getContentPane().add(labelCpf);

		campoCargo = new JTextField();
		campoCargo.setBounds(101, 144, 117, 20);
		getContentPane().add(campoCargo);

		labelHeader = new JLabel("Digite o CPF do funcion\u00E1rio:");
		labelHeader.setBounds(10, 21, 172, 14);
		getContentPane().add(labelHeader);

		campoCpfBusca = new JTextField();
		campoCpfBusca.setBounds(180, 18, 108, 20);
		getContentPane().add(campoCpfBusca);
		campoCpfBusca.setColumns(10);

		buttonBuscar = new JButton("Buscar");
		buttonBuscar.setBounds(327, 17, 89, 23);
		getContentPane().add(buttonBuscar);
		buttonBuscar.addActionListener(tratador);

		buttonCadastrarEndereco = new JButton("Alterar Endere\u00E7o");
		buttonCadastrarEndereco.setBounds(167, 203, 150, 23);
		getContentPane().add(buttonCadastrarEndereco);
		buttonCadastrarEndereco.addActionListener(tratador);
	}

	private class TrataBotoes implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == buttonCancelar) {
				dispose();
			} else if (e.getSource() == buttonCadastrarEndereco) {
				TelaAlteraEndereco telaAlteraEndereco = new TelaAlteraEndereco();
			} else if (e.getSource() == buttonBuscar) {
				funcionario = (Funcionario) dadosFuncionario.buscar(campoCpfBusca.getText());
				if (funcionario == null)
					JOptionPane.showMessageDialog(null, "Funcionário não encontrado", "Funcionário não encontrado",
							JOptionPane.OK_OPTION);
				else {
					campoNome.setText(funcionario.getNome());
					campoCpf.setText(funcionario.getCPF());
					campoSalarioBase.setText(String.valueOf(Funcionario.getSalarioBase()));
					campoTelefone.setText(funcionario.getTelefone());
					campoTelefoneCelular.setText(funcionario.getTelefoneCelular());
					campoTelefoneContato.setText(funcionario.getTelefoneContato());
					campoDataIngresso.setText(funcionario.getDataIngresso());
					campoCargo.setText(funcionario.getCargo());
					campoLogin.setText(funcionario.getLogin());
					campoSenha.setText(funcionario.getSenha());
				}
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
						TelaAlteraCorretor telaAlteraCadastroCorretor = new TelaAlteraCorretor();
						dispose();
					} else {
						dadosFuncionario.excluir(campoCpfBusca.getText());
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
