public class Escola {
    private String nome;
    private String fone;
    private int qtdeTurmas;
    private Turma[] vetTurmas;

    public Escola(){
        this.vetTurmas = new Turma[20];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public int getQtdeTurmas() {
        return qtdeTurmas;
    }

    public Turma getTurma(int pos){
        return this.vetTurmas[pos];
    }

    public void setTurma(Turma t){
        if(this.qtdeTurmas < 20){
            this.vetTurmas[qtdeTurmas] = t;
            qtdeTurmas++;
        }
    }

}
