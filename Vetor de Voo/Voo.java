public class Voo {
    private int idVoo;
    private String Hora;
    private String Data;
    private String Origem;
    private String Destino;
    private int QtdPassageiros;
    private Passageiro[] vetPassageiros;


//Método Getter
    public Voo(){
        this.vetPassageiros = new Passageiro[50];
        this.QtdPassageiros = 0;
    }
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
    public float getQtdPassageiros(){
        return this.QtdPassageiros;
    }

//Método Setter
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
    public void setQtdPassageiros(int q){
        this.QtdPassageiros = q;
    }
}


