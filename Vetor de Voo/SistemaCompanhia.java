import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SistemaCompanhia {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private Companhia c1 = new Companhia();


    public static void main(String[] args) throws Exception {
        SistemaCompanhia sistema = new SistemaCompanhia();
        sistema.menu();
    }

    public void menu() throws Exception {
        String opcao = "";
            while (!opcao.equals("4")){
                System.out.println("\n==== MENU COMPANHIA ====");
                System.out.println("1 - Cadastrar um novo Vôo");
                System.out.println("2 - Listar todos os Vôos");
                System.out.println("3 - Consultar Vôo");
                System.out.println("4 - Sair do Programa");
                System.out.print("Escolha uma opção: ");

                opcao = this.reader.readLine();

                switch (opcao){
                    case "1":
                        cadastrarVoo();
                        break;
                    case "2":
                        listarVoo();
                        break;
                    case "3":
                        consultarVoo();
                        break;
                    case "4":
                        System.out.println("Saindo do Programa!");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            }
    }

    private void cadastrarVoo() throws Exception {
        Voo v1 = new Voo();

        System.out.println("Digite qual a origem do Vôo: ");
        v1.setOrigem(reader.readLine());

        System.out.println("Digite qual o Destino do Vôo: ");
        v1.setDestino(reader.readLine());
        
        System.out.println("Digite qual a Data do Vôo: ");
        v1.setData(reader.readLine());

        System.out.println("Digite qual a Hora do Vôo: ");
        v1.setHora(reader.readLine());

        c1.setVoo(v1); // Serve para adicionar o voo cadastrados à companhia
        System.out.println("Voo cadastrado com sucesso!");

    }

    private void listarVoo() throws Exception {
        if (c1.getQtdVoo() == 0) {
            System.out.println("Nenhum voo cadastrado.");
            return;
        }
        for (int i = 0; i < c1.getQtdVoo(); i++) {
            Voo c2 = c1.getVoo(i);
            System.out.println("\nVoo " + (i + 1) + ":");
            System.out.println("ID: " + c2.getIdVoo());
            System.out.println("Origem: " + c2.getOrigem());
            System.out.println("Destino: " + c2.getDestino());
            System.out.println("Data: " + c2.getData());
            System.out.println("Hora: " + c2.getHora());
        
        }
    }

    private void consultarVoo() throws Exception {
        System.out.print("Digite o ID do Voo desejado: ");
        int idVoo = Integer.parseInt(reader.readLine());
        boolean encontrou = false;

        for (int i = 0; i < c1.getQtdVoo(); i++) {
            Voo v3 = c1.getVoo(i);
            if (v3.getIdVoo() == idVoo) {
                String consulta = "Origem: " + v3.getOrigem()
                        + " | Destino: " + v3.getDestino()
                        + " | Data: " + v3.getData()
                        + " | Hora: " + v3.getHora();
                System.out.println(consulta);
                encontrou = true;
                break;
            }
        }
        if (!encontrou) {
            System.out.println("Voo com ID " + idVoo + " não foi encontrado.");
        }
    }
}