public class preco_vendas {
    private int codigo;
    private String produto;
    private float precoVendas;;

    
    public int getCodigo(){
        return this.codigo;
    }
    public String getProduto(){
        return this.produto;   
    }
    public float getPrecoVendas(){
        return this.precoVendas;   
    }

    public void setCodigo(int c){
        this.codigo = c;
    }
    public void setProduto(String p){
        this.produto = p;
    }
    public void setPrecoVendas(float pv){
        this.precoVendas = pv;
    }
}