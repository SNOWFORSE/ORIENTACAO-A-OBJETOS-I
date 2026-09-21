import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SistemaCompanhia {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private Companhia c1 = new Companhia();

    public static void main(String[] args) throws Exception {
        SistemaCompanhia sistema = new SistemaCompanhia();
        sistema.inicializarCompanhia();
        sistema.menu();
    }

    private void inicializarCompanhia() throws Exception {
        System.out.println("=== CADASTRO DA COMPANHIA AÉREA ===");
        System.out.print("Digite o nome da Companhia: ");
        c1.setNomeCompanhia(reader.readLine());
        
        System.out.print("Digite o CNPJ da Companhia: ");
        c1.setCnpj(reader.readLine());
        System.out.println("Companhia registrada com sucesso!\n");
    }

    public void menu() throws Exception {
        String opcao = "";
        while (!opcao.equals("5")){
            System.out.println("\n==== MENU COMPANHIA: " + c1.getNomeCompanhia() + " ====");
            System.out.println("1 - Cadastrar um novo Vôo");
            System.out.println("2 - Listar todos os Vôos");
            System.out.println("3 - Consultar Vôo");
            System.out.println("4 - Cadastrar Passageiro em um Vôo");
            System.out.println("5 - Sair do Programa");
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
                    cadastrarPassageiro();
                    break;
                case "5":
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

        c1.setVoo(v1);
        System.out.println("Voo cadastrado com sucesso!");
    }

    private void cadastrarPassageiro() throws Exception {
        if (c1.getQtdVoo() == 0) {
            System.out.println("Nenhum voo cadastrado para adicionar passageiros.");
            return;
        }

        System.out.print("Digite o ID do Voo desejado: ");
        int idVoo = Integer.parseInt(reader.readLine());

        Voo vAlvo = null;
        for (int i = 0; i < c1.getQtdVoo(); i++) {
            Voo v = c1.getVoo(i);
            if (v.getIdVoo() == idVoo) {
                vAlvo = v;
                break;
            }
        }

        if (vAlvo == null) {
            System.out.println("Voo não encontrado.");
            return;
        }

        Passageiro p = new Passageiro();
        System.out.print("Digite o nome do passageiro: ");
        p.setNome(reader.readLine());

        System.out.print("Digite o sexo do passageiro: ");
        p.setSexo(reader.readLine());

        System.out.print("Digite a idade do passageiro: ");
        p.setIdade(Integer.parseInt(reader.readLine()));

        System.out.print("Digite a nacionalidade do passageiro: ");
        p.setNacionalidade(reader.readLine());

        vAlvo.setPassageiro(p);
        System.out.println("Passageiro cadastrado com sucesso no voo!");
    }

    private void listarVoo() throws Exception {
        System.out.println("\n=== COMPANHIA: " + c1.getNomeCompanhia() + " | CNPJ: " + c1.getCNPJ() + " ===");

        if (c1.getQtdVoo() == 0) {
            System.out.println("Nenhum voo cadastrado.");
            return;
        }
        for (int i = 0; i < c1.getQtdVoo(); i++) {
            Voo c2 = c1.getVoo(i);
            System.out.println("\nVoo " + (i + 1) + " [ID: " + c2.getIdVoo() + "]:");
            System.out.println("Origem: " + c2.getOrigem() + " | Destino: " + c2.getDestino());
            System.out.println("Data: " + c2.getData() + " | Hora: " + c2.getHora());
            

            System.out.println("Passageiros (" + c2.getQtdPassageiros() + "):");
            if (c2.getQtdPassageiros() == 0) {
                System.out.println("  - Nenhum passageiro neste voo.");
            } else {
			for (int j = 0; j < c2.getQtdPassageiros(); j++) {
				Passageiro p = c2.getPassageiro(j);
				System.out.println("  * " + p.getNome() 
					+ " | Sexo: " + p.getSexo() 
					+ " | Idade: " + p.getIdade() 
					+ " | Nacionalidade: " + p.getNacionalidade());
				}
			}
        }
    }

    private void consultarVoo() throws Exception {
        System.out.print("Digite o ID do Voo desejado: ");
        int idVoo = Integer.parseInt(reader.readLine());
        boolean encontrou = false;

        for (int i = 0; i < c1.getQtdVoo(); i++) {
            Voo v3 = c1.getVoo(i);
            if (v3.getIdVoo() == idVoo) {
                System.out.println("\nVoo Encontrado:");
                System.out.println("Origem: " + v3.getOrigem() + " | Destino: " + v3.getDestino());
                System.out.println("Data: " + v3.getData() + " | Hora: " + v3.getHora());
                System.out.println("Total de passageiros: " + v3.getQtdPassageiros());
                encontrou = true;
                break;
            }
        }
        if (!encontrou) {
            System.out.println("Voo com ID " + idVoo + " não foi encontrado.");
        }
    }
}
