public abstract class Pessoa {
	private String nome;
	private String CPF;
	private String telefone;
	private Endereco endereco;

	private ValidaCpf validaCpf = new ValidaCpf();

	public Pessoa() {
	}

	public Pessoa(String nome, String CPF) {
		setNome(nome);
		setCPF(CPF);
		setTelefone(null);
	}

	public Pessoa(String nome, String CPF, String telefone, Endereco endereco) {
		setNome(nome);
		setCPF(CPF);
		setTelefone(telefone);
		setEndereco(endereco);
	}

	public String toString() {
		return "CPF: " + getCPF() + "\nNome: " + getNome() + "\nTelefone: " + getTelefone();
	}

	public String getNome() {
		return nome;
	}

	public boolean setNome(String nome) {
		if (nome.isEmpty())
			return false;

		this.nome = nome;
		return true;
	}

	public String getCPF() {
		return CPF;
	}

	public boolean setCPF(String CPF) {
		if (!validaCpf.validarCpf(CPF))
			return false;

		this.CPF = CPF;
		return true;
	}

	public String getTelefone() {
		return telefone;
	}

	public boolean setTelefone(String telefone) {
		if (telefone.length() < 11)
			return false;

		this.telefone = telefone;
		return true;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}