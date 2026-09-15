public class Turma {
    private int nroTurma;
    private String nomeCurso;
    private int anoIngresso;
    private int qtdeAlunos;
    private Aluno[] vetAlunos;

    public Turma(){
        this.vetAlunos = new Aluno[40];
    }

    public int getNroTurma() {
        return nroTurma;
    }

    public void setNroTurma(int nroTurma) {
        this.nroTurma = nroTurma;
    }

        public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public int getQtdeAlunos() {
        return qtdeAlunos;
    }

    public Aluno getAluno(int pos){
        return this.vetAlunos[pos];
    }

    public void setAluno(Aluno a){
        if(this.qtdeAlunos < 40){
            this.vetAlunos[qtdeAlunos] = a;
            qtdeAlunos++;
        }
    }
}
