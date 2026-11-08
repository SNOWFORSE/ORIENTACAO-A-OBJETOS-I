/*Crie um programa que gere um arquivo csv com a lista de preços de venda (preco_venda.csv) dos produtos de uma loja:

-A lista de preços deve conter: código, nome produto, preço de venda

-O programa deve solicitar ao usuário a margem de lucro a ser aplicada aos produtos

-O formato do arquivo de entrada é: codigo, estoque, nome produto, preço de custo e categoria (para teste usar o arquivo preco_custo.csv)

-Solicitar ao usuário o nome do arquivo de entrada e de saída (em branco = nomes padrão)

-Gerar um segundo arquivo de saída (comprar.csv) com os itens com estoque inferior a 10 unidades*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class vendas_main {
    // leitor do teclado (System.in)
    BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

    // a margem fica guardada aqui para a opção 2 poder usar o valor digitado na opção 1
    float margem = 0;
    boolean margemDefinida = false; // só vira true depois que o usuário cadastrar a margem

    public static void main(String[] args) throws Exception {
        vendas_main objeto = new vendas_main();
        objeto.menu();
    }

    // lê o arquivo de entrada, grava a lista de preços de venda e a lista de itens para comprar
    public void lerArquivos(float margem, String arqEntrada, String arqSaida) throws Exception {
        BufferedReader ler = new BufferedReader(new FileReader(arqEntrada));
        BufferedWriter escrever = new BufferedWriter(new FileWriter(arqSaida));
        BufferedWriter escreverComprar = new BufferedWriter(new FileWriter("comprar.csv"));

        // cabeçalho do arquivo de saída (lista de preços)
        escrever.write("codigo;nome_produto;preco_venda");
        escrever.newLine();

        // cabeçalho do comprar.csv (mesmos campos do arquivo de entrada)
        escreverComprar.write("codigo;estoque;produto;preco_custo;categoria");
        escreverComprar.newLine();

        preco_custo pc1 = new preco_custo();
        preco_vendas pv1 = new preco_vendas();

        ler.readLine(); // pula a primeira linha (cabeçalho do arquivo de entrada)
        String linhaLeitura;
        int total = 0;
        int totalComprar = 0;

        while ((linhaLeitura = ler.readLine()) != null) {
            if (linhaLeitura.trim().isEmpty()) {
                continue; // ignora linha em branco
            }

            String[] campos = linhaLeitura.split(";");

            // guarda os dados da linha no objeto de preço de custo
            pc1.setCodigo(Integer.parseInt(campos[0].trim()));
            pc1.setEstoque(Integer.parseInt(campos[1].trim()));
            pc1.setProduto(campos[2].trim());
            // o preço vem com vírgula (9,90) e o Java precisa de ponto (9.90)
            pc1.setPrecoCusto(Float.parseFloat(campos[3].trim().replace(",", ".")));
            pc1.setCategoria(campos[4].trim());

            // preço de venda = custo + custo * margem / 100
            pv1.setCodigo(pc1.getCodigo());
            pv1.setProduto(pc1.getProduto());
            pv1.setPrecoVendas(pc1.getPrecoCusto() * (1 + (margem / 100f)));

            // %03d deixa o código com 3 dígitos (001) e %.2f deixa o preço com 2 casas
            String codigo = String.format("%03d", pv1.getCodigo());
            String preco = String.format("%.2f", pv1.getPrecoVendas()).replace(".", ",");

            escrever.write(codigo + ";" + pv1.getProduto() + ";" + preco);
            escrever.newLine();
            total++;

            // se o estoque for menor que 10, o item vai para o comprar.csv
            if (pc1.getEstoque() < 10) {
                String precoCusto = String.format("%.2f", pc1.getPrecoCusto()).replace(".", ",");

                escreverComprar.write(codigo + ";" + pc1.getEstoque() + ";" + pc1.getProduto()
                        + ";" + precoCusto + ";" + pc1.getCategoria());
                escreverComprar.newLine();
                totalComprar++;
            }
        }

        escrever.close(); // o close é o que garante que tudo foi gravado no arquivo
        escreverComprar.close();
        ler.close();

        System.out.println("Arquivo " + arqSaida + " gerado com " + total + " produtos.");
        System.out.println("Arquivo comprar.csv gerado com " + totalComprar + " produtos.");
    }

    public void menu() throws Exception {

        int op;
        String arqEntrada;
        String arqSaida;

        do {

            System.out.println("Escolha uma das opções: ");
            System.out.println("1) Cadastrar margem de lucro");
            System.out.println("2) Gerar lista de preços de venda");
            System.out.println("3) Sair");
            System.out.println("Escolha: ");
            op = Integer.parseInt(leitor.readLine().trim());

            switch (op) {
                case 1:
                    System.out.println("Digite a margem de lucro em % (ex: 30): ");
                    // aceita 30 ou 30,5
                    margem = Float.parseFloat(leitor.readLine().trim().replace(",", "."));
                    margemDefinida = true;
                    System.out.println("Margem de " + margem + "% cadastrada.");
                break;

                case 2:
                    if (margemDefinida) {
                        System.out.println("Nome do arquivo de entrada (Enter para preco_custo.csv): ");
                        arqEntrada = leitor.readLine().trim();
                        if (arqEntrada.isEmpty()) {
                            arqEntrada = "preco_custo.csv"; // nome padrão
                        }

                        System.out.println("Nome do arquivo de saída (Enter para preco_venda.csv): ");
                        arqSaida = leitor.readLine().trim();
                        if (arqSaida.isEmpty()) {
                            arqSaida = "preco_venda.csv"; // nome padrão
                        }

                        try {
                            lerArquivos(margem, arqEntrada, arqSaida);
                        } catch (Exception e) {
                            // por exemplo: arquivo de entrada não existe
                            System.out.println("Erro ao processar os arquivos: " + e.getMessage());
                        }
                    } else {
                        System.out.println("Cadastre a margem de lucro primeiro (opção 1)!");
                    }
                break;

                case 3:
                    System.out.println("Saindo...");
                break;

                default:
                    System.out.println("Opção inválida!");
                break;
            }

        } while (op != 3);
    }
}
