import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Corretor extends Funcionario {

	private final static float comissao = 0.05f;
	private float vendasMes;
	private float salarioFinal;
	private LocalDate dataInicio;
	private boolean cursoFormacao;

	public Corretor() {
	}

	public Corretor(String nome, String CPF, String cargo, float vendasMes) {
		super(nome, CPF, cargo);
		setVendasMes(vendasMes);
		setSalarioFinal();
	}

	public Corretor(String nome, String telefone, String CPF, String telefoneContato, Endereco endereco,
					String telefoneCelular, LocalDate dataIngresso, String cargo, float salarioBase, String login,
					String senha, float vendasMes, LocalDate dataInicio, boolean cursoFormacao) {
		super(nome, telefone, CPF, endereco, telefoneContato, telefoneCelular, dataIngresso, cargo, salarioBase, login, senha);
		setVendasMes(vendasMes);
		setDataInicio();
		setCursoFormacao(cursoFormacao);
	}
	
	@Override
	public String toString() {
		return "CPF: " + getCPF() + ", Nome: " + getNome() + ", Telefone: " + getTelefone() + "\nEndereço: " + getEndereco() + "\nSalario base: " 
				+ getSalarioBase() + ", Telefone de Contato: " + getTelefoneContato() + ", Telefone celular: " + getTelefoneCelular() + ", Data ingresso: " 
				+ getDataIngresso() + "\nCargo: " + getCargo() + ", Login: " + getLogin() + ", Senha: " + getSenha() + ", Comissão: " + getComissao()
				+ "\nVendas do mês: " + getVendasMes() + ", Salário Final: " + getSalarioFinal() + ", Data início: " + getDataInicio() + ", Curso de formação: "
				+ isCursoFormacao();
	}

	public static float getComissao() {
		return Corretor.comissao;
	}

	public float getVendasMes() {
		return vendasMes;
	}

	public boolean setVendasMes(float vendasMes) {
		if (vendasMes < 0)
			return false;

		this.vendasMes = vendasMes;
		return true;
	}

	public void zeraVendasMes() {
		setVendasMes(0);
	}

	public String getDataInicio() {
		String data;
		if(dataInicio != null)
			data = dataInicio.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		else data = null;
		return data;
	}

	public boolean setDataInicio() {
		try {
			dataInicio = LocalDate.now();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isCursoFormacao() {
		return cursoFormacao;
	}

	public boolean setCursoFormacao(boolean cursoFormacao) {
		if (cursoFormacao != true && cursoFormacao != false)
			return false;

		this.cursoFormacao = cursoFormacao;
		return true;
	}

	public float getSalarioFinal() {
		return this.salarioFinal;
	}

	public void setSalarioFinal() {
		this.salarioFinal = getSalarioBase() + (comissao * vendasMes);
	}

}
