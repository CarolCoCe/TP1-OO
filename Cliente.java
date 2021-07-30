public class Cliente {
    String nome;
    String endereco;
    String telefone;

    Cliente(){}

    Cliente(String nome,String endereco, String telefone){
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public void setNome (String nome){
        this.nome = nome;
    }
    public void setTelefone (String telefone){
        this.telefone = telefone;
    }
    public void setEndereco (String endereco){
        this.endereco = endereco;
    }

    public String getNome () {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public String imprimir(){
        return "\nAqui estão os dados do cliente :\n" + "Nome :" + nome + 
        "\nEndereço :" + endereco + "\nTelefone :" + telefone + "\n\n";
    }
    
}
