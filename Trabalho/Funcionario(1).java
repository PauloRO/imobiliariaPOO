import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario extends Pessoa {
	private static float salarioBase;
	private String telefoneContato;
	private String telefoneCelular;
	private LocalDate dataIngresso;
	private String cargo;
	private String login;
	private String senha;
	private Endereco endereco;

	public Funcionario() {
	}

	public Funcionario(String nome, String CPF, String cargo) {
		super(nome, CPF);
		setCargo(cargo);
	}

	public Funcionario(String nome, String CPF, String telefone, Endereco endereco, String telefoneContato, String telefoneCelular,
					   LocalDate dataIngresso, String cargo, float salarioBase, String login, String senha) {
		super(nome, CPF, telefone, endereco);
		setTelefoneContato(telefoneContato);
		setTelefoneCelular(telefoneCelular);
		setDataIngresso(dataIngresso);
		setCargo(cargo);
		setSalarioBase(salarioBase);
		setLogin(login);
		setSenha(senha);
	}

	public String getTelefoneContato() {
		return telefoneContato;
	}

	public boolean setTelefoneContato(String telefoneContato) {
		if (telefoneContato.isEmpty())
			return false;

		this.telefoneContato = telefoneContato;
		return true;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public boolean setTelefoneCelular(String telefoneCelular) {
		if (telefoneCelular.isEmpty())
			return false;

		this.telefoneCelular = telefoneCelular;
		return true;
	}

	public String getDataIngresso() {
		String data = dataIngresso.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return data;
	}

	public void setDataIngresso(LocalDate dataIngresso) {
		this.dataIngresso = dataIngresso;
	}

	public String getCargo() {
		return cargo;
	}

	public boolean setCargo(String cargo) {
		if (cargo.isEmpty())
			return false;

		this.cargo = cargo;
		return true;
	}

	public static float getSalarioBase() {
		return Funcionario.salarioBase;
	}

	public static boolean setSalarioBase(float salarioBase) {
		if (salarioBase < 0)
			return false;

		Funcionario.salarioBase = salarioBase;
		return true;
	}

	public float getSalario() {
		return Funcionario.salarioBase;
	}

	public String getLogin() {
		return login;
	}

	public boolean setLogin(String login) {
		if (login.isEmpty())
			return false;

		this.login = login;
		return true;
	}

	public String getSenha() {
		return senha;
	}

	public boolean setSenha(String senha) {
		if (senha.length() < 6)
			return false;

		this.senha = senha;
		return true;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
