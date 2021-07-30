public class Produto {
    String nome;
    String descricao;
    Double valorCompra;
    Double porcentagemLucro;
    int qtdEstoque;

    Produto(){}

    Produto(String nome,String descricao,Double valorCompra,Double porcentagemLucro,int qtdEstoque){
        this.nome = nome;
        this.descricao = descricao;
        this.valorCompra = valorCompra;
        this.porcentagemLucro = porcentagemLucro;
        this.qtdEstoque = qtdEstoque;
    }

    public void setNome (String nome){
        this.nome = nome;
    }
    public void setDescricao (String descricao){
        this.descricao = descricao;
    }
    public void setValorCompra (Double valorCompra){
        this.valorCompra = valorCompra;
    }
    public void setPorcentagemLucro (Double porcentagemLucro){
        this.porcentagemLucro = porcentagemLucro;
    }
    public void setQtdEstoque (int qtdEstoque){
        this.qtdEstoque = qtdEstoque;
    }

    public String getNome () {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public Double getValorCompra() {
        return valorCompra;
    }
    public Double getPorcentagemLucro() {
        return porcentagemLucro;
    }
    public int getQtdEstoque() {
        return qtdEstoque;
    }
    public String imprimir(){
        return "\nAqui estão os dados do produto :\n" + "Nome :" + nome + "\nDescrição :" + descricao +
         "\nValor de compra :" + valorCompra+ "\nPorcentagem de lucro :" + porcentagemLucro + " %"+
         "\nQuantidade no estoque :" +  qtdEstoque + "\n\n";
    }
    

}
