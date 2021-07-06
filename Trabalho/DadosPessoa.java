import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DadosPessoa {
    private ArrayList<Pessoa> vetPessoas = new ArrayList<Pessoa>();

    public void cadastrar(Pessoa pessoa) {
        if (this.vetPessoas.add(pessoa)) {
            System.out.println("Pessoa cadastrada no sistema!");
            System.out.println("Total de pessoas inseridas: " + this.vetPessoas.size() + "\n");
        } else
            System.out.println("Erro ao cadastrar!");
    }

    public void listar() {
        for (Pessoa pessoa : this.vetPessoas) {
            System.out.println(pessoa + "\n");
        }
    }

    public Pessoa buscar(String cpf) {
        Pessoa resultado = null;
        for (Pessoa pessoa : this.vetPessoas) {
            if (pessoa.getCPF().equals(cpf)) {
                resultado = pessoa;
                System.out.println(resultado);
                break;
            } else{
                System.out.println("Pessoa não encontrada!");
                break;
            }
        }
        return resultado;
    }

    public boolean excluir(String cpf) {
        Pessoa pessoa = this.buscar(cpf);
        if (pessoa != null) {
            this.vetPessoas.remove(pessoa);
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
            objWriter.writeObject(this.vetPessoas.size() + "\n");
            for (Pessoa pessoa : this.vetPessoas) {
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
