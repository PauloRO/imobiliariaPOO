import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transacao {
	private int numeroContrato;
	private LocalDate dataDaTransacao;
	private String formaDePagamento;
	private Imovel imovel;
	private Usuario clienteUsuario;
	private Corretor corretor;

	public Transacao() {
	}

	public Transacao(int numeroContrato, LocalDate dataDaTransacao, Imovel imovel, Usuario usuario) {
		setNumeroContrato(numeroContrato);
		setDataDaTransacao();
		setImovel(imovel);
		setUsuario(usuario);
	}

	public Transacao(int numeroContrato, LocalDate dataDaTransacao, String formaDePagamento, Imovel imovel, Usuario usuario, Corretor corretor) {
		setNumeroContrato(numeroContrato);
		setDataDaTransacao();
		setFormaDePagamento(formaDePagamento);
		setImovel(imovel);
		setUsuario(usuario);
		setCorretor(corretor);
	}

	public String toString() {
		return "Número do contrato: " + getNumeroContrato() + "\nData da transação: " + getDataDaTransacao();
	}

	public int getNumeroContrato() {
		return numeroContrato;
	}

	public boolean setNumeroContrato(int numeroContrato) {
		if (numeroContrato < 0)
			return false;

		this.numeroContrato = numeroContrato;
		return true;
	}

	public String getDataDaTransacao() {
		String data = dataDaTransacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return data;
	}

	public boolean setDataDaTransacao() {
		try {
			dataDaTransacao = LocalDate.now();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public boolean setFormaDePagamento(String formaDePagamento) {
		if (formaDePagamento.isEmpty())
			return false;

		this.formaDePagamento = formaDePagamento;
		return true;
	}

	public Imovel getImovel() {
		return imovel;
	}

	public boolean setImovel(Imovel imovel) {
		if (imovel == null)
			return false;

		this.imovel = imovel;
		return true;
	}

	public Usuario getClienteUsuario() {
		return clienteUsuario;
	}

	public boolean setUsuario(Usuario clienteUsuario) {
		if (clienteUsuario == null)
			return false;

		this.clienteUsuario = clienteUsuario;
		return true;
	}
	
	public Corretor getCorretor() {
		return corretor;
	}

	public boolean setCorretor(Corretor corretor) {
		if (corretor == null)
			return false;
		
		this.corretor = corretor;
		return true;
	}

	public boolean efetuarTransacao(Imovel imovel, Corretor corretor, String formaDePagamento, int numeroContrato) {
		if (imovel == null || corretor == null || formaDePagamento.isEmpty() || numeroContrato < 0)
			return false;

		imovel.setVenda(false);
		imovel.setAluguel(false);
		imovel.setDisponibilidade((byte) 3);
		corretor.setVendasMes(imovel.getValorSugerido());
		setFormaDePagamento(formaDePagamento);
		setDataDaTransacao();
		setNumeroContrato(numeroContrato);
		return true;
	}

	
}
