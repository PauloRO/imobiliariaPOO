import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DadosPessoa {
	static ArrayList<Pessoa> vetPessoas = new ArrayList<Pessoa>();

	public void cadastrar(Pessoa pessoa) {
		if (vetPessoas.add(pessoa)) {
			System.out.println("Pessoa cadastrada no sistema!");
			System.out.println("Total de pessoas inseridas: " + vetPessoas.size() + "\n");
		} else
			System.out.println("Erro ao cadastrar!");
	}

	public void listar() {
		for (Pessoa pessoa : vetPessoas) {
			System.out.println(pessoa + "\n");
		}
	}

	public Pessoa buscar(String cpf) {
		Pessoa resultado = null;
		for (Pessoa pessoa : vetPessoas) {
			if (pessoa.getCPF().equals(cpf)) {
				resultado = pessoa;
				System.out.println(resultado);
				break;
			} 
		}
		return resultado;
	}
	

	public boolean excluir(String cpf) {
		Pessoa pessoa = this.buscar(cpf);
		if (pessoa != null) {
			vetPessoas.remove(pessoa);
			return true;
		}
		return false;
	}

	public void salvaContatosBin() {
		FileOutputStream fileWriter = null;
		ObjectOutputStream objWriter = null;

		try {
			fileWriter = new FileOutputStream("PessoasBin");
			objWriter = new ObjectOutputStream(fileWriter);
			objWriter.writeObject(vetPessoas.size() + "\n");
			for (Pessoa pessoa : vetPessoas) {
				objWriter.writeObject(pessoa.toString() + "\n");
			}
			System.out.println("Arquivo: \"PessoasBin\" salvo com sucesso!");
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
