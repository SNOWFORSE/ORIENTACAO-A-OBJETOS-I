public class Passageiro {
    private String Nome;
    private float Idade;
    private String Sexo;
    private String Nacionalidade;
    private String Passaporte;
    private String IdPassageiros;
    

    public String getNome(){
        return this.Nome;
    }
    public float getIdade(){
        return this.Idade;
    }
    public String getSexo(){
        return this.Sexo;
    }
    public String getNacionalidade(){
        return this.Nacionalidade;
    }
    public String getPassaporte(){
        return this.Passaporte;
    }
    public String getIdPassageiros(){
        return this.IdPassageiros;
    }

    public void setNome(String n){
        this.Nome = n;
    }
    public void setIdade(float i){
        this.Idade = i;
    }
    public void setSexo(String s){
        this.Sexo = s;
    }
    public void setNacionalidade(String n){
        this.Sexo = n;
    }
    public void setPassaporte(String p){
        this.Sexo = p;
    }
    public void setIdPassageiro(String id){
        this.Sexo = id;
    }
}
