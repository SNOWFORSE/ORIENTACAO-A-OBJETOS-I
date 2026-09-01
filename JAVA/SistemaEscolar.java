import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SistemaEscolar {
    BufferedReader reader;
    Escola e1;

    public static void main(String[] args) throws Exception{
        SistemaEscolar se = new SistemaEscolar();
        se.e1 = new Escola();

        se.reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Digite o nome da escola: ");
        se.e1.setNome(se.reader.readLine());

        System.out.println("Telefone: ");
        se.e1.setFone(se.reader.readLine());

        se.menu();

    }
    
    private void menu()throws Exception{
        String opcao = "";
        while (opcao.equals("4")) {
            System.out.println("-----------------------------");
            System.out.println("[1] Cadastrar nova Turma");
            System.out.println("[2] Listar Turmas Existentes");
            System.out.println("[3] Consultar uma Turma");
            System.out.println("[4] Sair");
            System.out.println("-----------------------------");
            opcao = this.reader.readLine();

            switch (opcao) {
                case "1":
                    //this.cadastrarTurma();
                    break;
                case "2":
                    //this.listarTurmas();
                    break;
                case "3":
                    //this.consultarTurma();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void cadastrarTurma() throws Exception{
        Turma t = new Turma();
        System.out.println("CADASTRO DE TURMA");
        System.out.println("Nro da Turma: ");

        //String num = reader.readLine();
        //int nroInt = Integer.parseInt(num);
        //t.setNroTurma(nroInt);
        t.setNroTurma(Integer.parseInt(reader.readLine()));

        System.out.println("Nome do Curso: ");
        t.setNomeCurso(reader.readLine());
        System.out.println("Ano de Ingresso: ");
        t.setAnoIngresso(Integer.parseInt(reader.readLine()));

        System.out.println("----- Alunos -----");
        for(int i = 0; i < 40; i++){
            System.out.println("Nome do Aluno: ");
            String nome = reader.readLine();
            if(nome.equals("")){
                break;
            }
            Aluno aluno = new Aluno();
            aluno.setNome(nome);
            System.out.println("Matrícula: ");
            aluno.setMatricula(reader.readLine());

            System.out.println("Nota 1: ");
            aluno.setNota1(Float.parseFloat(reader.readLine()));

            System.out.println("Nota 2: ");
            aluno.setNota2(Float.parseFloat(reader.readLine()));

            System.out.println("Nota 3: ");
            aluno.setNota3(Float.parseFloat(reader.readLine()));

            System.out.println("Nota 4: ");
            aluno.setNota4(Float.parseFloat(reader.readLine()));

            t.setAlunos(aluno);
        }
        e1.setTurma(t);
    }
}
