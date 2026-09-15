import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExemploVet1 {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in)
        );

        //declara um vetor de int já atribuindo os valores
        int vetValores[] = {2, 5, 7, 3, 1, 8, 0};
        System.out.println("vetValores[0] " + vetValores[0]);

        //declara um vetor de String com 12 posições
        String meses[] = new String[12];
        meses[0] = "Janeiro";
		meses[1] = "Fevereiro";
		meses[2] = "Março";
		meses[3] = "Abril";
		meses[4] = "Maio";
		meses[5] = "Junho";
		meses[6] = "Julho";
		meses[7] = "Agosto";
		meses[8] = "Setembro";
		meses[9] = "Outubro";
		meses[10] = "Novembro";
		meses[11] = "Dezembro";

        int num = -1;
        while (num != 0) {
            System.out.println("Informe o nro do mês ou 0 para sair");
            num = Integer.parseInt(reader.readLine());
            if(num > 0 && num <=12){
                System.out.println("O mês é " + meses[num -1]);
            }
        }
    }
}
