import java.io.BufferedWriter;
import java.io.FileWriter;

public class ExEscritaArquivo {

    public static void main(String[] args) throws Exception{
        String nomeArgSaida = "arqSaida.csv";
        BufferedWriter arqGravacao = new BufferedWriter( new FileWriter(nomeArgSaida));

        String linha = "Produto;Preço;Estoque";
        arqGravacao.write(linha);

        arqGravacao.newLine();
        String nomeProduto = "Mouse Dell d310";
        String preco = "119,25";
        String estoque = "7";
        linha = nomeProduto + ";" + preco + ";" + estoque;
        arqGravacao.write(linha);

        
        arqGravacao.newLine();
        nomeProduto = "Notebook Acer";
        preco = "3200,00";
        estoque = "7";
        linha = nomeProduto + ";" + preco + ";" + estoque;
        arqGravacao.write(linha);
        
        arqGravacao.newLine();
        nomeProduto = "Monitor LG UltraGear";
        preco = "500,00";
        estoque = "43";
        linha = nomeProduto + ";" + preco + ";" + estoque;
        arqGravacao.write(linha);

        arqGravacao.close();
    }
}