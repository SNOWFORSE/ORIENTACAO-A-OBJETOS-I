public class Companhia {
    private String nomeCompanhia;
    private String cnpj;
    private int qtdVoo;
    private Voo[] vetVoo;

// Método Get
    public Companhia(){
        this.vetVoo = new Voo[10];
        this.qtdVoo = 0;
    }
    public String getNomeCompanhia(){
        return this.nomeCompanhia;
    }
    public String getCNPJ(){
        return this.cnpj;
    }
    public float getQtdVoo(){
        return this.qtdVoo;
    }
    public Voo getVoo(int posicao){
        if (posicao >= 0 && posicao < this.qtdVoo) {
            return this.vetVoo[posicao];
        }
        return null;
    }

// Método Set
    public void setNomeCompanhia(String nc){
        this.nomeCompanhia = nc;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public void setQtdVoo(int qtdvoo){
        this.qtdVoo = qtdvoo;
    }
    public void setVoo(Voo v){
        if(this.qtdVoo < 10){
            this.vetVoo[qtdVoo] = v;
            qtdVoo++;
        }else {
            System.out.println("Limite de voos atingido!");
        }
    }
}
