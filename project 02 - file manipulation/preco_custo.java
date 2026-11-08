public class preco_custo {
    private int codigo;
    private int estoque;
    private String produto;
    private float precoCusto;
    private String categoria;



    //inicio dos métodos getter, servem para retornar o valor dos atributos no programa.
    public int getCodigo(){
        return this.codigo;
    }
    public int getEstoque(){
        return this.estoque;
    }
    public String getProduto(){
        return this.produto;
    }
    public float getPrecoCusto(){
        return this.precoCusto;
    }
    public String getCategoria(){
        return this.categoria;
    }

    //inicio dos métodos setter, servem para atribuir valores aos atributos no programa.
    public void setCodigo(int c){
        this.codigo = c;
    }
    public void setEstoque(int e){
        this.estoque = e;
    }
    public void setProduto(String p){
        this.produto = p;
    }
    public void setPrecoCusto(float pc){
        this.precoCusto = pc;
    }
    public void setCategoria(String ca){
        this.categoria = ca;
    }
}