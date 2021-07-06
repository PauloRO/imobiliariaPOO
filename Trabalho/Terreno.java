import java.time.LocalDate;

public class Terreno extends Imovel {
	private float largura;
	private float comprimento;
	private boolean possuiAclive;
	private boolean possuiDeclive;

	public Terreno() {
	}

	public Terreno(int codigoImovel, byte disponibilidade, String bairro, float largura, float comprimento) {
		super(codigoImovel, disponibilidade, bairro);
		setLargura(largura);
		setComprimento(comprimento);
	}

	public Terreno(int codigoImovel, String dataConstrucao, byte disponibilidade, float areaMetrosQuadrados, String bairro,
				   float valorSugerido, float valorReal, float taxaImobiliaria, String data, boolean venda, boolean aluguel,
				   Endereco endereco, float largura, float comprimento, boolean possuiAclive, boolean possuiDeclive) {

		super(codigoImovel, dataConstrucao, disponibilidade, areaMetrosQuadrados, bairro, valorSugerido, valorReal,
				taxaImobiliaria, data, venda, aluguel, endereco);

		setLargura(largura);
		setComprimento(comprimento);
		setPossuiAclive(possuiAclive);
		setPossuiDeclive(possuiDeclive);
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
				"\nLargura: " + getLargura() + 
				"\nComprimento: " + getComprimento() + 
				"\nPossui aclive: " + isPossuiAclive() + 
				"\nPossui declive: " + isPossuiDeclive() + 
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

		// cálculo do peso da área - índicesDosPesos[3]
		double area = largura * comprimento;
		if (area < 200)
			indicesDosPesos[3] = 2;
		else if (area >= 200 && area < 500)
			indicesDosPesos[3] = 7;
		else
			indicesDosPesos[3] = 1;

		// cálculo do peso se possuiAcliveDeclive - índicesDosPesos[4]
		if (!possuiAclive)
			indicesDosPesos[4] = 7;
		else
			indicesDosPesos[4] = 3;

		for (int numero : indicesDosPesos) {
			indiceFinal += numero;
		}

		return indiceFinal / indicesDosPesos.length;
	}

	public float getLargura() {
		return largura;
	}

	public boolean setLargura(float largura) {
		if (largura < 0)
			return false;

		this.largura = largura;
		return true;
	}

	public float getComprimento() {
		return comprimento;
	}

	public boolean setComprimento(float comprimento) {
		if (comprimento < 0)
			return false;

		this.comprimento = comprimento;
		return true;
	}

	public boolean isPossuiAclive() {
		return possuiAclive;
	}

	public boolean setPossuiAclive(boolean possuiAclive) {
		if (possuiAclive != true && possuiAclive!= false)
			return false;

		this.possuiAclive = possuiAclive;
		return true;
	}

	public boolean isPossuiDeclive() {
		return possuiDeclive;
	}

	public boolean setPossuiDeclive(boolean possuiDeclive) {
		if (possuiDeclive != true && possuiDeclive != false)
			return false;

		this.possuiDeclive = possuiDeclive;
		return true;
	}
}
