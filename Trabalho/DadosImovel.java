import java.awt.Dimension;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class DadosImovel {

    static ArrayList<Imovel> vetImoveis = new ArrayList<Imovel>();

    public void cadastrar(Imovel imovel) {
        if (vetImoveis.add(imovel)) {
            UIManager.put("OptionPane.minimumSize", new Dimension(120, 100));
			JOptionPane.showMessageDialog(null, "Imóvel cadastrado no sistema!\nTotal de imóveis inseridos: " + vetImoveis.size() + "\n");
        }
    }

    public void listar() {
        for (Imovel imovel : vetImoveis) {
            UIManager.put("OptionPane.minimumSize", new Dimension(220, 200));
			JOptionPane.showMessageDialog(null, imovel.toString(), "Dados encontrados:", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public Imovel buscar(int codigoImovel) {
        Imovel resultado = null;
        for (Imovel imovel : vetImoveis) {
            if (imovel.getCodigoImovel() == codigoImovel) {
                resultado = imovel;
                UIManager.put("OptionPane.minimumSize", new Dimension(220, 200));
				JOptionPane.showMessageDialog(null, resultado.toString(), "Dados encontrados:", JOptionPane.PLAIN_MESSAGE);
			}
        }
        return resultado;
    }

    public boolean excluir(int codigoImovel) {
    	for (Imovel imovel : vetImoveis) {
            if (imovel.getCodigoImovel() == codigoImovel) {
                vetImoveis.remove(imovel);
                UIManager.put("OptionPane.minimumSize", new Dimension(120, 100));
				JOptionPane.showMessageDialog(null, "Imóvel removido com sucesso!");
                return true;        
			}
    	} return false;
    }

    public void salvaContatosBin() {
        FileOutputStream fileWriter = null;
        ObjectOutputStream objWriter = null;

        try {
            fileWriter = new FileOutputStream("ImoveisBin");
            objWriter = new ObjectOutputStream(fileWriter);
            objWriter.writeObject(vetImoveis.size() + "\n");
            for (Imovel imovel : vetImoveis) {
                objWriter.writeObject(imovel.toString() + "\n");
            }
            System.out.println("Arquivo: \"ImoveisBin\" salvo com sucesso!");
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

