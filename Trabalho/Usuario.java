
public class Usuario extends Cliente {

	// implementar algo diferente em usuario pra ficar diferente de cliente

	public Usuario () {}

	public Usuario (String nome, String cpf, String telefone, Endereco endereco, String email) {
		super(nome, cpf, telefone, endereco, email);
	}

	public Usuario(String cpf, String nome, String telefone, Endereco endereco, String email, String sexo, String estadoCivil,
			String profissao) {
		super(cpf, nome, telefone, endereco, email, sexo, estadoCivil, profissao);
	}
}
