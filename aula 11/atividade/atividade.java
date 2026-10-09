import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class atividade {
        public static void main(String[] args) throws Exception {
            String arquivo = "pagina.html";
            BufferedWriter pagina = new BufferedWriter(new FileWriter(arquivo));
            pagina.write("<html><head><title>Tabela de Cores HTMl</title><meta http-equiv='Content-Type' content='text/html; charset=UTF-8'></head><body><p>&nbsp;</p><h2 align='center'>Tabela de Cores HTML</h2><table width='400' align='center border='1'><tr><th width='200' align='center'>Cor</th><th width='200' align='center'>Código Hexadecimal</th></tr></table></body></html>");
            pagina.readLine();
            pagina.close();
        }
        private void gerarCores() throws Exception {
            String[] hexa = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F",};

            for(int r = 0; r < hexe.length; r++) {
                for(int q = 0; q < hexa.length; q++) {
                    
                }
            }
        }
            
            

            
        }

