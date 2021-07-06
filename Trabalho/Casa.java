public class Casa extends Residencial{

	private boolean condominio;
	private boolean piscina;

	public Casa() {
	}

	public Casa(int codigoImovel, byte disponibilidade, String bairro, String descricao, boolean condominio) {
		super(codigoImovel, disponibilidade, bairro, descricao);
		setCondominio(condominio);
	}
	
	public Casa(boolean condominio, boolean piscina) {
		setCondominio(condominio);
		setPiscina(piscina);
	}

	public Casa(int codigoImovel, String dataConstrucao, byte disponibilidade, float areaMetrosQuadrados, String bairro,
				float valorSugerido, float valorReal, float taxaImobiliaria, String data, boolean venda, boolean aluguel,
				Endereco endereco, int quantidadeQuartos, int quantidadeSuites, int quantidadeSalasEstar, int quantidadeSalasJantar, 
				int numeroVagasGaragem, boolean possuiArmarioEmbutido, String descricao, boolean condominio, boolean piscina) {

		super(codigoImovel, dataConstrucao, disponibilidade, areaMetrosQuadrados, bairro, valorSugerido, valorReal,
				taxaImobiliaria, data, venda, aluguel, endereco, quantidadeQuartos, quantidadeSuites, quantidadeSalasEstar,
				quantidadeSalasJantar, numeroVagasGaragem, possuiArmarioEmbutido, descricao);

		setCondominio(condominio);
		setPiscina(piscina);
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
				"\nCondominio: " + isCondominio() + 
				"\nPiscina: " + isPiscina() +
				"\nBairro: " + getBairro();
	}

	public boolean isCondominio() {
		return condominio;
	}

	public boolean setCondominio(boolean condominio) {
		if (condominio != true && condominio != false)
			return false;

		this.condominio = condominio;
		return true;
	}

	public boolean isPiscina() {
		return piscina;
	}

	public boolean setPiscina(boolean piscina) {
		if (piscina != true && piscina != false)
			return false;

		this.piscina = piscina;
		return true;
	}

}
