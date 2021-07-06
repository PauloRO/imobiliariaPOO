public class Apartamento extends Residencial {

	private int andar;
	private float valorCondominio;
	private boolean portaria;

	public Apartamento() {
	}

	public Apartamento(int codigoImovel, byte disponibilidade, String bairro, String descricao, int andar) {
		super(codigoImovel, disponibilidade, bairro, descricao);
		setAndar(andar);
	}
	
	public Apartamento(int andar, float valorCondominio, boolean portaria) {
		setAndar(andar);
		setValorCondominio(valorCondominio);
		setPortaria(portaria);
	}

	public Apartamento(int codigoImovel, String dataConstrucao, byte disponibilidade, float areaMetrosQuadrados, String bairro,
			float valorSugerido, float valorReal, float taxaImobiliaria, String data, boolean venda, boolean aluguel, Endereco endereco,
			int quantidadeQuartos, int quantidadeSuites, int quantidadeSalasEstar, int quantidadeSalasJantar, int numeroVagasGaragem,
			boolean possuiArmarioEmbutido, String descricao, int andar, float valorCondominio, boolean portaria) {

		super(codigoImovel, dataConstrucao, disponibilidade, areaMetrosQuadrados, bairro, valorSugerido, valorReal,
				taxaImobiliaria, data, venda, aluguel, endereco, quantidadeQuartos, quantidadeSuites, quantidadeSalasEstar,
				quantidadeSalasJantar, numeroVagasGaragem, possuiArmarioEmbutido, descricao);

		setAndar(andar);
		setValorCondominio(valorCondominio);
		setPortaria(portaria);
	}
	
	public String toString() {
		return "Código do imovel: " + getCodigoImovel() + 
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
				"\nAndar: " + getAndar() + 
				"\nValor do condomínio: " + getValorCondominio() + 
				"\nPortaria: " + isPortaria() +
				"\nBairro: " + getBairro();
	}

	public int getAndar() {
		return andar;
	}

	public boolean setAndar(int andar) {
		if (valorCondominio < 0)
			return false;

		this.andar = andar;
		return true;
	}

	public float getValorCondominio() {
		return valorCondominio;
	}

	public boolean setValorCondominio(float valorCondominio) {
		if (valorCondominio < 0.0)
			return false;

		this.valorCondominio = valorCondominio;
		return true;
	}

	public boolean isPortaria() {
		return portaria;
	}

	public boolean setPortaria(boolean portaria) {
		if (portaria != true && portaria != false)
			return false;

		this.portaria = portaria;
		return true;
	}

}
