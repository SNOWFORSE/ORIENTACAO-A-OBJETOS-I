public class Voo {
    private float QtdPassageiros;
    private String HoraVoo;
    private String Origem;
    private String Destino;

    public float QtdPassageiros(){
        return this.QtdPassageiros;
    }
    public String HoraVoo(){
        return this.HoraVoo;
    }
    public String Origem(){
        return this.Origem;
    }
    public String Destino(){
        return this.Destino;
    }

    public void setQtdPassageiros(float q){
        this.QtdPassageiros = q;
    }
    public void HoraVoo(String h){
        this.HoraVoo = h;
    }
    public void Origem(String o){
        this.Origem = o;
    }
    public void Destino(String d){
        this.Destino = d;
    }
}


