public class Residencial extends Imovel {

	private int quantidadeQuartos;
	private int quantidadeSuites;
	private int quantidadeSalasEstar;
	private int quantidadeSalasJantar;
	private int numeroVagasGaragem;
	private boolean possuiArmarioEmbutido;
	private String descricao;

	public Residencial() {
	}

	public Residencial(int codigoImovel, byte disponibilidade, String bairro, String descricao) {
		super(codigoImovel, disponibilidade, bairro);
		setDescricao(descricao);
	}
	
	public Residencial(int quantidadeQuartos, int quantidadeSuites, int quantidadeSalasEstar, int quantidadeSalasJantar, 
			int numeroVagasGaragem, boolean possuiArmarioEmbutido, String descricao) {
		setQuantidadeQuartos(quantidadeQuartos);
		setQuantidadeSuites(quantidadeSuites);
		setQuantidadeSalasEstar(quantidadeSalasEstar);
		setQuantidadeSalasJantar(quantidadeSalasJantar);
		setNumeroVagasGaragem(numeroVagasGaragem);
		setPossuiArmarioEmbutido(possuiArmarioEmbutido);
		setDescricao(descricao);
	}
	
	public Residencial(int codigoImovel, String dataConstrucao, byte disponibilidade, float areaMetrosQuadrados,
			String bairro, float valorSugerido, float valorReal, float taxaImobiliaria, String data, boolean venda,
			boolean aluguel, Endereco endereco, int quantidadeQuartos, int quantidadeSuites, int quantidadeSalasEstar, 
			int quantidadeSalasJantar, int numeroVagasGaragem, boolean possuiArmarioEmbutido, String descricao) {

		super(codigoImovel, dataConstrucao, disponibilidade, areaMetrosQuadrados, bairro, valorSugerido, valorReal,
				taxaImobiliaria, data, venda, aluguel, endereco);

		setQuantidadeQuartos(quantidadeQuartos);
		setQuantidadeSuites(quantidadeSuites);
		setQuantidadeSalasEstar(quantidadeSalasEstar);
		setQuantidadeSalasJantar(quantidadeSalasJantar);
		setNumeroVagasGaragem(numeroVagasGaragem);
		setPossuiArmarioEmbutido(possuiArmarioEmbutido);
		setDescricao(descricao);
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
				"\nQuantidade de quartos: " + getQuantidadeQuartos() + 
				"\nQuantidade de suítes: " + getQuantidadeSuites() +
				"\nQuantidade de salas de estar: " + getQuantidadeSalasEstar() +
				"\nQuantidade de salar de jantar: " + getQuantidadeSalasJantar() +
				"\nNúmero de vagas de garagem: " + getNumeroVagasGaragem() +
				"\nPossui armário embutido: " + isPossuiArmarioEmbutido() +
				"\nDescrição: " + getDescricao() + 
				"\nBairro: " + getBairro();
	}

	@Override
	public double calculaIndiceVendaLocacao() {
		double indiceFinal = 0.0;
		int indicesDosPesos[] = { 0, 0, 0, 0, 0, 0, 0 }; // Ã­ndice tem como mÃ¡ximo 7

		// cÃ¡lculo do peso de AreaMetrosQuadrados - indicesDosPesos[0]
		if (getAreaMetrosQuadrados() < 30)
			indicesDosPesos[0] = 2;
		else if (getAreaMetrosQuadrados() >= 30 && getAreaMetrosQuadrados() <= 50)
			indicesDosPesos[0] = 7;
		else
			indicesDosPesos[0] = 1;

		// cÃ¡lculo do peso de valorReal para vendas - indicesDosPesos[1]
		if ((isVenda() && !isAluguel()) && getValorReal() <= 200000)
			indicesDosPesos[1] = 5;
		else if (((isVenda() && !isAluguel()) && getValorReal() > 200000)
				&& ((isVenda() && !isAluguel()) && getValorReal() <= 500000))
			indicesDosPesos[1] = 4;
		else
			indicesDosPesos[1] = 1;

		// cÃ¡lculo do peso de valorReal para aluguÃ©is - indicesDosPesos[1]
		if ((!isVenda() && isAluguel()) && getValorReal() <= 2500)
			indicesDosPesos[1] = 5;
		else if (((!isVenda() && isAluguel()) && getValorReal() > 2500)
				&& ((!isVenda() && isAluguel()) && getValorReal() <= 5000))
			indicesDosPesos[1] = 4;
		else
			indicesDosPesos[1] = 1;

		// cÃ¡lculo do peso da relaÃ§Ã£o de valorReal com valorSugerido -
		// indicesDosPesos[2]
		if (getValorSugerido() == getValorReal())
			indicesDosPesos[2] = 6;
		else if ((getValorSugerido() > getValorReal()) && (getValorSugerido() < (getValorReal() * 1.5)))
			indicesDosPesos[2] = 3;
		else
			indicesDosPesos[2] = 1;

		// cÃ¡lculo do peso qtdQuartos - indicesDosPesos[3]
		if (quantidadeQuartos == 1)
			indicesDosPesos[3] = 2;
		if (quantidadeQuartos > 1 && quantidadeQuartos < 4)
			indicesDosPesos[3] = 7;
		else
			indicesDosPesos[3] = 1;

		// cÃ¡lculo do peso qtdSuites - indicesDosPesos[4]
		if (quantidadeSuites == 1)
			indicesDosPesos[4] = 4;
		if (quantidadeSuites > 1 && quantidadeSuites < 4)
			indicesDosPesos[4] = 5;
		else
			indicesDosPesos[4] = 1;

		// cÃ¡lculo do peso numVagasGaragem - indicesDosPesos[5]
		if (numeroVagasGaragem == 1)
			indicesDosPesos[5] = 6;
		if (numeroVagasGaragem == 2)
			indicesDosPesos[5] = 3;
		else
			indicesDosPesos[5] = 1;

		// cÃ¡lculo do peso possuiArmario - indicesDosPesos[6]
		if (possuiArmarioEmbutido)
			indicesDosPesos[6] = 7;
		else
			indicesDosPesos[6] = 3;

		for (int numero : indicesDosPesos) {
			indiceFinal += numero;
		}

		return indiceFinal / indicesDosPesos.length;
	}

	public int getQuantidadeQuartos() {
		return quantidadeQuartos;
	}

	public boolean setQuantidadeQuartos(int quantidadeQuartos) {
		if (quantidadeQuartos < 0)
			return false;

		this.quantidadeQuartos = quantidadeQuartos;
		return true;
	}

	public int getQuantidadeSuites() {
		return quantidadeSuites;
	}

	public boolean setQuantidadeSuites(int quantidadeSuites) {
		if (quantidadeQuartos < 0)
			return false;

		this.quantidadeSuites = quantidadeSuites;
		return true;
	}

	public int getQuantidadeSalasEstar() {
		return quantidadeSalasEstar;
	}

	public boolean setQuantidadeSalasEstar(int quantidadeSalasEstar) {
		if (quantidadeSalasEstar < 0)
			return false;

		this.quantidadeSalasEstar = quantidadeSalasEstar;
		return true;
	}

	public int getQuantidadeSalasJantar() {
		return quantidadeSalasJantar;
	}

	public boolean setQuantidadeSalasJantar(int quantidadeSalasJantar) {
		if (quantidadeSalasJantar < 0)
			return false;

		this.quantidadeSalasJantar = quantidadeSalasJantar;
		return true;
	}

	public int getNumeroVagasGaragem() {
		return numeroVagasGaragem;
	}

	public boolean setNumeroVagasGaragem(int numeroVagasGaragem) {
		if (numeroVagasGaragem < 0)
			return false;

		this.numeroVagasGaragem = numeroVagasGaragem;
		return true;
	}

	public boolean isPossuiArmarioEmbutido() {
		return possuiArmarioEmbutido;
	}

	public boolean setPossuiArmarioEmbutido(boolean possuiArmarioEmbutido) {
		if (possuiArmarioEmbutido != true && possuiArmarioEmbutido != false)
			return false;

		this.possuiArmarioEmbutido = possuiArmarioEmbutido;
		return true;
	}

	public String getDescricao() {
		return descricao;
	}

	public boolean setDescricao(String descricao) {
		if (descricao.isEmpty())
			return false;

		this.descricao = descricao;
		return true;
	}

}
