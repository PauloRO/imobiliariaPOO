public class SalaComercial extends Imovel {
	
	private int quantidadeBanheiros;
	private int quantidadeComodos;

	public SalaComercial() {
	}

	public SalaComercial(int codigoImovel, byte disponibilidade, String bairro, int quantidadeComodos) {
		super(codigoImovel, disponibilidade, bairro);
		setQuantidadeComodos(quantidadeComodos);
	}
	
	public SalaComercial(int quantidadeBanheiros, int quantidadeComodos) {
		setQuantidadeBanheiros(quantidadeBanheiros);
		setQuantidadeComodos(quantidadeComodos);
	}

	public SalaComercial(int codigoImovel, String dataConstrucao, byte disponibilidade, float areaMetrosQuadrados,
			String bairro, float valorSugerido, float valorReal, float taxaImobiliaria, String data, boolean venda,
			boolean aluguel, Endereco endereco, int quantidadeBanheiros, int quantidadeComodos) {

		super(codigoImovel, dataConstrucao, disponibilidade, areaMetrosQuadrados, bairro, valorSugerido, valorReal,
				taxaImobiliaria, data, venda, aluguel, endereco);

		setQuantidadeBanheiros(quantidadeBanheiros);
		setQuantidadeComodos(quantidadeComodos);
	}
	
	public String toString() {
		return "C�digo do imovel: " + getCodigoImovel() + 
				"\nData da constru��o: " + getDataConstrucao() + 
				"\nDisponibilidade: " + getDisponibilidade() +
				"\nArea em m�: " + getAreaMetrosQuadrados() +
				"\nValor sugerido: " + getValorSugerido() +
				"\nValor real: " + getValorReal() +
				"\nTaxa imobiliaria: " + getTaxaImobiliaria() +
				"\nData: " + getData() +
				"\nVenda: " + isVenda() +
				"\nAluguel: " + isAluguel() +
				"\nQuantidade de banheiros: " + getQuantidadeBanheiros() + 
				"\nQuantidade de comodos: " + getQuantidadeComodos() + 
				"\nBairro: " + getBairro();
	}

	@Override
	public double calculaIndiceVendaLocacao() {
		double indiceFinal = 0.0;
		int indicesDosPesos[] = { 0, 0, 0, 0, 0 }; // índice tem como máximo 7

		// cálculo do peso de AreaMetrosQuadrados - indicesDosPesos[0]
		if (getAreaMetrosQuadrados() < 30)
			indicesDosPesos[0] = 2;
		else if (getAreaMetrosQuadrados() >= 30 && getAreaMetrosQuadrados() <= 50)
			indicesDosPesos[0] = 7;
		else
			indicesDosPesos[0] = 1;

		// cálculo do peso de valorReal para vendas - indicesDosPesos[1]
		if ((isVenda() && !isAluguel()) && getValorReal() <= 200000)
			indicesDosPesos[1] = 5;
		else if (((isVenda() && !isAluguel()) && getValorReal() > 200000)
				&& ((isVenda() && !isAluguel()) && getValorReal() <= 500000))
			indicesDosPesos[1] = 4;
		else
			indicesDosPesos[1] = 1;

		// cálculo do peso de valorReal para aluguéis - indicesDosPesos[1]
		if ((!isVenda() && isAluguel()) && getValorReal() <= 2500)
			indicesDosPesos[1] = 5;
		else if (((!isVenda() && isAluguel()) && getValorReal() > 2500)
				&& ((!isVenda() && isAluguel()) && getValorReal() <= 5000))
			indicesDosPesos[1] = 4;
		else
			indicesDosPesos[1] = 1;

		// cálculo do peso da relação de valorReal com valorSugerido -
		// indicesDosPesos[2]
		if (getValorSugerido() == getValorReal())
			indicesDosPesos[2] = 6;
		else if ((getValorSugerido() > getValorReal()) && (getValorSugerido() < (getValorReal() * 1.5)))
			indicesDosPesos[2] = 3;
		else
			indicesDosPesos[2] = 1;

		// cálculo do peso de qtdBanheiros - indicesDosPesos[3]
		if (quantidadeBanheiros < 2)
			indicesDosPesos[3] = 2;
		else if (quantidadeBanheiros >= 2 && quantidadeBanheiros < 5)
			indicesDosPesos[3] = 7;
		else
			indicesDosPesos[3] = 1;

		// cálculo do peso de qtdComodos - indicesDosPesos[4]
		if (quantidadeComodos < 3)
			indicesDosPesos[4] = 2;
		else if (quantidadeComodos >= 3 && quantidadeComodos < 6)
			indicesDosPesos[4] = 7;
		else
			indicesDosPesos[4] = 1;

		for (int numero : indicesDosPesos) {
			indiceFinal += numero;
		}

		return indiceFinal / indicesDosPesos.length;
	}

	public int getQuantidadeBanheiros() {
		return quantidadeBanheiros;
	}

	public boolean setQuantidadeBanheiros(int quantidadeBanheiros) {
		if (quantidadeBanheiros < 0)
			return false;

		this.quantidadeBanheiros = quantidadeBanheiros;
		return true;
	}

	public int getQuantidadeComodos() {
		return quantidadeComodos;
	}

	public boolean setQuantidadeComodos(int quantidadeComodos) {
		if (quantidadeComodos < 0)
			return false;

		this.quantidadeComodos = quantidadeComodos;
		return true;
	}
	
	

}
