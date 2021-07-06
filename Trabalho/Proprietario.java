import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Proprietario extends Cliente {
	private LocalDate dataCadastro;

	public Proprietario() {
	}

	public Proprietario(String nome, String cpf, String telefone, Endereco endereco, String email, LocalDate dataCadastro) {
		super(nome, cpf, telefone, endereco, email);
		setDataCadastro(dataCadastro);
	}

	public Proprietario(String cpf, String nome, String telefone, Endereco endereco, String email, String sexo, String estadoCivil,
			String profissao) {
		super(cpf, nome, telefone, endereco, email, sexo, estadoCivil, profissao);
	}

	public String getDataCadastro() {
		String data = dataCadastro.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return data;
	}

	public boolean setDataCadastro(LocalDate dataCadastro) {
		if (dataCadastro == null)
			return false;

		this.dataCadastro = dataCadastro;
		return true;
	}
}
