import java.io.BufferedReader;
import java.io.FileReader;

public class ExLeituraArquivo {
    public static void main(String[] args) throws Exception {
        String nomeArgEntrada = "arqEntrada.csv";
        BufferedReader arqLeitura = new BufferedReader( new FileReader(nomeArgEntrada));

        String linha;
        while ((linha = arqLeitura.readLine()) != null) {
            System.out.println(linha);
        }
        arqLeitura.close();

        //mostrando somente 1 campo
        arqLeitura = new BufferedReader(new FileReader(nomeArgEntrada));
        linha = arqLeitura.readLine();
        while ((linha = arqLeitura.readLine()) != null) {
            String[] vetCampos = linha.split(";");
            System.out.println("Aluno: " + vetCampos[0]);
        }

    }
}