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
		setDataInicio(dataInicio);
		setCursoFormacao(cursoFormacao);
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
		String data = dataInicio.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return data;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
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
