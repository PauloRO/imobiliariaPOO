import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DadosTransacao {
	private ArrayList<Transacao> vetTransacoes = new ArrayList<Transacao>();

	public void cadastrar(Transacao transacao) {
		if (this.vetTransacoes.add(transacao)) {
			System.out.println("Transação cadastrada no sistema!");
			System.out.println("Total de transações inseridas: " + this.vetTransacoes.size()  + "\n");
		} else
			System.out.println("Erro ao cadastrar!");
	}

	public void listar() {
		for (Transacao transacao : this.vetTransacoes) {
			System.out.println(transacao + "\n");
		}
	}

	public Transacao buscar(int numeroContrato) {
		Transacao resultado = null;
		for (Transacao transacao : this.vetTransacoes) {
			if (transacao.getNumeroContrato() == numeroContrato) {
				resultado = transacao;
				System.out.println(resultado);
				break;
			} else{
				System.out.println("Transação não encontrada!");
				break;
			}
		}
		return resultado;
	}

	public boolean excluir(int numeroContrato) {
		Transacao transacao = this.buscar(numeroContrato);
		if (transacao != null) {
			this.vetTransacoes.remove(transacao);
			return true;
		}
		return false;
	}

	public void salvaContatosBin() {
		FileOutputStream fileWriter = null;
		ObjectOutputStream objWriter = null;

		try {
			fileWriter = new FileOutputStream("TransacoesBin");
			objWriter = new ObjectOutputStream(fileWriter);
			objWriter.writeObject(this.vetTransacoes.size() + "\n");
			for (Transacao transacao : this.vetTransacoes) {
				objWriter.writeObject(transacao.toString() + "\n");
			}
			System.out.println("Arquivo: \"TransacoesBin\" salvo com sucesso!");
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
