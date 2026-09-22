public class Voo {
    private static int contadorId = 1;
    private int idVoo;
    private String Hora;
    private String Data;
    private String Origem;
    private String Destino;
    

    private Passageiro[] vetPassageiros = new Passageiro[50];
    private int qtdPassageiros = 0;

    public Voo() {
        this.idVoo = contadorId++;
    }

    // Métodos Getter
    public int getIdVoo(){
        return this.idVoo;
    }
    public String getHora(){
        return this.Hora;
    }
    public String getData(){
        return this.Data;
    }
    public String getOrigem(){
        return this.Origem;
    }
    public String getDestino(){
        return this.Destino;
    }
    public int getQtdPassageiros(){
        return this.qtdPassageiros;
    }

    // Métodos Setter
    public void setidvoo(int i){
        this.idVoo = i;
    }
    public void setHora(String h){
        this.Hora = h;
    }
    public void setData(String dt){
        this.Data = dt;
    }
    public void setOrigem(String o){
        this.Origem = o;
    }
    public void setDestino(String d){
        this.Destino = d;
    }
    
    public void setPassageiro(Passageiro p) {
        if (this.qtdPassageiros < 50) {
            this.vetPassageiros[this.qtdPassageiros] = p;
            this.qtdPassageiros++;
        } else {
            System.out.println("Limite de passageiros no voo atingido!");
        }
    }

    public Passageiro getPassageiro(int posicao) {
        if (posicao >= 0 && posicao < this.qtdPassageiros) {
            return this.vetPassageiros[posicao];
        }
        return null;
    }
}
