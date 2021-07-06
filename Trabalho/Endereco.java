
public class Endereco {
	private String rua;
	private String numero;
	private String complemento;
	private String CEP;
	private String cidade;

	public Endereco() {
	}

	public Endereco(String rua, String numero, String CEP, String cidade) {
		this(rua, numero, "", CEP, cidade);
	}

	public Endereco(String rua, String numero, String complemento, String CEP, String cidade) {
		super();
		setRua(rua);
		setNumero(numero);
		setComplemento(complemento);
		setCEP(CEP);
		setCidade(cidade);
	}

	public String toString() {
		return "\nRua: " + getRua() + 
				"\nNº: " + getNumero() + 
				"\nComplemento: " + getComplemento() + 
				"\nCEP: " + getCEP() +
				"\nCidade: " + getCidade();
	}

	public String getRua() {
		return rua;
	}

	public boolean setRua(String rua) {
		if (rua.isEmpty())
			return false;

		this.rua = rua;
		return true;
	}

	public String getNumero() {
		return numero;
	}

	public boolean setNumero(String numero) {
		if (numero.isEmpty())
			return false;

		this.numero = numero;
		return true;
	}

	public String getComplemento() {
		return complemento;
	}

	public boolean setComplemento(String complemento) {
		if (complemento.isEmpty())
			return false;

		this.complemento = complemento;
		return true;
	}

	public String getCEP() {
		return CEP;
	}

	public boolean setCEP(String CEP) {
		if (CEP == null || CEP.length() != 8)
			return false;

		this.CEP = CEP;
		return true;
	}

	public String getCidade() {
		return cidade;
	}

	public boolean setCidade(String cidade) {
		if (cidade.isEmpty())
			return false;

		this.cidade = cidade;
		return true;
	}
}
