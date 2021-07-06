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
		setDataIngresso();
		setCargo(cargo);
		setSalarioBase(salarioBase);
		setLogin(login);
		setSenha(senha);
	}
	
	@Override
	public String toString() {
		return "CPF: " + getCPF() + ", Nome: " + getNome() + ", Telefone: " + getTelefone() + "\nEndereço: " + getEndereco() + "\nSalario base: " 
				+ getSalarioBase() + ", Telefone de Contato: " + getTelefoneContato() + ", Telefone celular: " + getTelefoneCelular() + ", Data ingresso: " 
				+ getDataIngresso() + "\nCargo: " + getCargo() + ", Login: " + getLogin() + ", Senha: " + getSenha() ;
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
		String data;
		if(dataIngresso != null)
			data = dataIngresso.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		else data = null;
		return data;
	}

	public boolean setDataIngresso() {
		try {
			dataIngresso = LocalDate.now();
			return true;
		} catch (Exception e) {
			return false;
		}
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
