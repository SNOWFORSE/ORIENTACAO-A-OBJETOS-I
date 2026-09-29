public class ExemploHeranca {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Gustavo");
        p1.setEmail("henrique@gmail.com");
        p1.setIdade(19);

        Pessoa p2 = new Pessoa("Gustavo", "gustavo@gmail.com",  22);

        Aluno a1 = new Aluno();
        a1.setNome("Jona");
        a1.setEmail("joavnma@gmail.com");
        a1.setIdade(20);
        a1.setNota1(9.0f);

        Aluno a2 = new Aluno("Ana", "qwerty@asd.com", 21, 8.5f, 9.0f, 10.0f, 9.8f);
    }
}
