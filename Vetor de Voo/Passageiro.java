public class Passageiro {
    private String nome;
    private int idade;
    private String sexo;
    private String nacionalidade;
    private String passaporte;
    private String cpf;
    
//Método Getters
    public String getNome(){
        return this.nome;
    }
    public float getIdade(){
        return this.idade;
    }
    public String getSexo(){
        return this.sexo;
    }
    public String getNacionalidade(){
        return this.nacionalidade;
    }
    public String getPassaporte(){
        return this.passaporte;
    }
    public String getCPF(){
        return this.cpf;
    }


//Método Setters
    public void setNome(String n){
        this.nome = n;
    }
    public void setIdade(int i){
        this.idade = i;
    }
    public void setSexo(String s){
        this.sexo = s;
    }
    public void setNacionalidade(String n){
        this.nacionalidade = n;
    }
    public void setPassaporte(String p){
        this.passaporte = p;
    }
    public void setCPF(String c){
        this.cpf = c;
    }
}
