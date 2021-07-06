public abstract class Imovel {
	private int codigoImovel;
	private String dataConstrucao;
	private byte disponibilidade;
	private float areaMetrosQuadrados;
	private String bairro;
	private float valorSugerido;
	private float valorReal;
	private float taxaImobiliaria;
	private String data;
	private boolean venda;
	private boolean aluguel;
	private Endereco endereco;

	public Imovel() { }

	public Imovel(int codigoImovel, byte disponibilidade, String bairro) {
		setCodigoImovel(codigoImovel);
		setDisponibilidade(disponibilidade);
		setBairro(bairro);
	}
	
	public Imovel(int codigoImovel, String dataConstrucao, byte disponibilidade, float areaMetrosQuadrados,
			String bairro, float valorSugerido, float valorReal, float taxaImobiliaria, String data, boolean venda,
			boolean aluguel, Endereco endereco) {

		setCodigoImovel(codigoImovel);
		setDataConstrucao(dataConstrucao);
		setDisponibilidade(disponibilidade);
		setAreaMetrosQuadrados(areaMetrosQuadrados);
		setBairro(bairro);
		setValorSugerido(valorSugerido);
		setValorReal(valorReal);
		setTaxaImobiliaria(taxaImobiliaria);
		setData(data);
		setVenda(venda);
		setAluguel(aluguel);
	}
	
	public String toString() {
		return "Codigo do imovel: " + getCodigoImovel() + 
				"\nData da construção: " + getDataConstrucao() + 
				"\nDisponibilidade: " + getDisponibilidade() +
				"\nArea em m²: " + getAreaMetrosQuadrados() +
				"\nValor sugerido: " + getValorSugerido() +
				"\nValor real: " + getValorReal() +
				"\nTaxa imobiliaria: " + getTaxaImobiliaria() +
				"\nData: " + getData() +
				"\nVenda: " + isVenda() +
				"\nAluguel: " + isAluguel() +
				"\nBairro: " + getBairro();
	}

	public abstract double calculaIndiceVendaLocacao();

	public int getCodigoImovel() {
		return codigoImovel;
	}

	public boolean setCodigoImovel(int codigoImovel) {
		if (codigoImovel < 0)
			return false;
		
		this.codigoImovel = codigoImovel;
		return true;
	}

	public String getDataConstrucao() {
		//String data = dataConstrucao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return dataConstrucao;
	}

	public boolean setDataConstrucao(String dataConstrucao) {
		if (dataConstrucao == null)
			return false;

		this.dataConstrucao = dataConstrucao;
		return true;
	}

	public String getDisponibilidade() {
		if (disponibilidade == 1) {
			return "Ativo";
		}
		if (disponibilidade == 2) {
			return "Inativo";
		}
		if (disponibilidade == 3) {
			return "Em uso";
		} return "Erro!";
	}

	public boolean setDisponibilidade(byte disponibilidade) {
		if (disponibilidade != 1 && disponibilidade != 2 && disponibilidade != 3)
			return false;

		this.disponibilidade = disponibilidade;
		return true;
	}

	public float getAreaMetrosQuadrados() {
		return areaMetrosQuadrados;
	}

	public boolean setAreaMetrosQuadrados(float areaMetrosQuadrados) {
		if (areaMetrosQuadrados < 0)
			return false;

		this.areaMetrosQuadrados = areaMetrosQuadrados;
		return true;
	}

	public String getBairro() {
		return bairro;
	}

	public boolean setBairro(String bairro) {
		if (bairro.isEmpty())
			return false;

		this.bairro = bairro;
		return true;
	}

	public float getValorSugerido() {
		return valorSugerido;
	}

	public boolean setValorSugerido(float valorSugerido) {
		if (valorSugerido < 0)
			return false;

		this.valorSugerido = valorSugerido;
		return true;
	}

	public float getValorReal() {
		return valorReal;
	}

	public boolean setValorReal(float valorReal) {
		if (valorReal < 0)
			return false;

		this.valorReal = valorReal;
		return true;
	}

	public float getTaxaImobiliaria() {
		return taxaImobiliaria;
	}

	public boolean setTaxaImobiliaria(float taxaImobiliaria) {
		if (taxaImobiliaria < 0)
			return false;

		this.taxaImobiliaria = taxaImobiliaria;
		return true;
	}

	public String getData() {
		//String data = data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return data;
	}

	public boolean setData(String data) {
		if (data == null)
			return false;

		this.data = data;
		return true;
	}

	public boolean isVenda() {
		return venda;
	}

	public boolean setVenda(boolean venda) {
		if (venda != true && venda != false)
			return false;

		this.venda = venda;
		return true;
	}

	public boolean isAluguel() {
		return aluguel;
	}

	public boolean setAluguel(boolean aluguel) {
		if (aluguel != true && aluguel != false)
			return false;

		this.aluguel = aluguel;
		return true;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
