import java.util.ArrayList;

public class ClientelaProduto {
    
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Produto> produtos = new ArrayList<>();
    
    public static ArrayList<Cliente> getListaClientes(){
        return clientes;
    }
    public static ArrayList<Produto> getListaProdutos(){
        return produtos;
    }

    public static void adicionarListaClientes(Cliente e){
        clientes.add(e);
    }
    public static void adicionarListaProdutos(Produto l){
        produtos.add(l);
    }

    public static String buscarCliente(String nome){
        int clienteAchado = 0;
        String saida = "";
        for (Cliente e : clientes){
            if (e.nome.equalsIgnoreCase(nome)){
                clienteAchado += 1;
                saida += e.imprimir() + "\n";
            }
        }
        if (clienteAchado == 0){
            saida += "Cliente não encontrado\n";
        }
        return saida ;
    }
    public static String buscarProduto(String nome){
        int produtoAchado = 0;
        String saida = "";
        for (Produto l : produtos){
            if (l.nome.equalsIgnoreCase(nome)){
                produtoAchado += 1;
                saida += l.imprimir() + "\n";
            }
        }
        if (produtoAchado == 0){
            saida += "Produto não encontrado\n";
        }
        return saida ;
    }
    public static void alterarDadosCliente(String nomeAntigo,String novoNome,String novoEndereco,String novoTelefone){
        for (Cliente e : clientes){
            if (e.nome.equalsIgnoreCase(nomeAntigo)){
                e.setNome(novoNome);
                e.setEndereco(novoEndereco);
                e.setTelefone(novoTelefone);
            }
        }
    }
    public static void alterarDadosProduto(String nomeAntigo,String novoNome,String descricao,Double valorCompra,Double porcentagemLucro,int qtdEstoque){
        for (Produto l : produtos){
            if (l.nome.equalsIgnoreCase(nomeAntigo)){
                l.setNome(novoNome);
                l.setDescricao(descricao);
                l.setValorCompra(valorCompra);
                l.setPorcentagemLucro(porcentagemLucro);
                l.setQtdEstoque(qtdEstoque);
            }
        }
    }

    public static String listarClientes(){
        int clienteAchado = 0;
        String saida = "";
        for (Cliente e : clientes){
                clienteAchado += 1;
                saida += e.imprimir() + "\n";
           
        }
        if (clienteAchado == 0){
            saida += "Não foi encontrado nenhum cliente\n";
        }
        return saida ;
    }

    public static String listarProdutos(){
        int produtoAchado = 0;
        String saida = "";
        for (Produto l : produtos){
            if(l.qtdEstoque>0){
                produtoAchado += 1;
                saida += l.imprimir() + "\n";
            }
        }
        if (produtoAchado == 0){
            saida += "Não foi encontrado nenhum produto\n";
        }
        return saida ;
    }
    public static String venda(String nome, int qtdVendida){
        
        int produtoAchado = 0;
        String saida = "";
        for (Produto l : produtos){
            if (l.nome.equalsIgnoreCase(nome)){
                produtoAchado += 1;
                l.setQtdEstoque(l.qtdEstoque - qtdVendida);
                saida += "Venda realizada com sucesso";
            }
        }
        if (produtoAchado == 0){
            saida += "Produto não encontrado\n";
        }
        return saida ;
    }



}
