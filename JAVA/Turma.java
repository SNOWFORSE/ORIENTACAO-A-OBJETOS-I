public class Turma {
    private int nroTurma;
    private String nomeCurso;
    private int anoIngresso;
    private int qtdAlunos;
    private Aluno[] vetAlunos;

    public Turma(){
        this.vetAlunos = new Aluno[40];
    }

    public int getNroTurma(){
        return this.nroTurma;
    }

    public void setNroTurma(int n){
        this.nroTurma = n;
    }

    public String getNomeCurso(){
        return this.nomeCurso;
    }

    public void setNomeCurso(String nc){
        this.nomeCurso = nc;
    }

    public int getAnoIngesso(){
        return this.anoIngresso;
    }

    public void setAnoIngresso(int ai){
        this.anoIngresso = ai;
    }

    public int getQtdAlunos(){
        return this.qtdAlunos;
    }

    public void setQtdAlunos(int qa){
        this.qtdAlunos = qa;
    }

    public Aluno[] getAlunos(){
        return this.vetAlunos;
    }

    public void setAlunos(Aluno a){
        if(this.qtdAlunos < 40){
            this.vetAlunos[qtdAlunos] = a;
            this.qtdAlunos++;
    }
    }
}
