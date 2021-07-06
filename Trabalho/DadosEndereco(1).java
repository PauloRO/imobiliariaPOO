import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DadosEndereco {
	private static ArrayList<Endereco> vetEnderecos = new ArrayList<Endereco>();

	public void cadastrar(Endereco endereco) {
		if (DadosEndereco.vetEnderecos.add(endereco)) {
			System.out.println("Endereço cadastrado no sistema!");
			System.out.println("Total de endereços inseridos: " + DadosEndereco.vetEnderecos.size() + "\n");
		} else
			System.out.println("Erro ao cadastrar!");
	}

	public void listar() {
		for (Endereco endereco : DadosEndereco.vetEnderecos) {
			System.out.println(endereco + "\n");
		}
	}

	public Endereco buscar(String rua, String numero) {
		Endereco resultado = null;
		for (Endereco endereco : DadosEndereco.vetEnderecos) {
			if (endereco.getRua().equals(rua) && (endereco.getNumero().equals(numero))) {
				resultado = endereco;
				System.out.println(resultado);
				break;
			} else{
				System.out.println("EndereÃ§o nÃ£o encontrado!");
				break;
			}
		}
		return resultado;
	}

	public boolean excluir(String rua, String numero) {
		Endereco endereco = this.buscar(rua, numero);
		if (endereco != null) {
			DadosEndereco.vetEnderecos.remove(endereco);
			return true;
		}
		return false;
	}

	public void salvaContatosBin() {
		FileOutputStream fileWriter = null;
		ObjectOutputStream objWriter = null;

		try {
			fileWriter = new FileOutputStream("EnderecosBin");
			objWriter = new ObjectOutputStream(fileWriter);
			objWriter.writeObject(DadosEndereco.vetEnderecos.size() + "\n");
			for (Endereco endereco : DadosEndereco.vetEnderecos) {
				objWriter.writeObject(endereco.toString() + "\n");
			}
			System.out.println("Arquivo: \"EnderecosBin\" salvo com sucesso!");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fileWriter != null)
					fileWriter.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
