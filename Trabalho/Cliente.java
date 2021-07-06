
public class Cliente extends Pessoa {
	private String email;
	private String sexo;
	private String estadoCivil;
	private String profissao;

	public Cliente() {
	}

	public Cliente(String nome, String cpf, String telefone, Endereco endereco, String email) {
		super(nome, cpf, telefone, endereco);
		setEmail(email);
	}

	public Cliente(String nome, String cpf, String telefone, Endereco endereco, String email, String sexo, String estadoCivil,
			String profissao) {
		super(nome, cpf, telefone, endereco);
		setCPF(cpf);
		setNome(nome);
		setTelefone(telefone);
		setEmail(email);
		setSexo(sexo);
		setEstadoCivil(estadoCivil);
		setProfissao(profissao);
	}

	public String getEmail() {
		return email;
	}

	public boolean setEmail(String email) {
		if (email.isEmpty())
			return false;

		this.email = email;
		return true;
	}

	public String getSexo() {
		return sexo;
	}

	public boolean setSexo(String sexo) {
		if (sexo.isEmpty())
			return false;

		this.sexo = sexo;
		return true;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public boolean setEstadoCivil(String estadoCivil) {
		if (estadoCivil.isEmpty())
			return false;

		this.estadoCivil = estadoCivil;
		return true;
	}

	public String getProfissao() {
		return profissao;
	}

	public boolean setProfissao(String profissao) {
		if (profissao.isEmpty())
			return false;

		this.profissao = profissao;
		return true;
	}

}
