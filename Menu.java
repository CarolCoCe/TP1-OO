/* package codechef; // don't place package name! */

import java.util.*;

public class Menu
{
	public static void main (String[] args) 
	{
		int option;
        int qtdCliente;
        int qtdProduto;
        String nomeCliente;
        String endereco;
        String telefone;
		Cliente objCliente;

        String nomeProduto;
        String descricao;
        Double valorCompra;
        Double porcentagemLucro;
        int qtdEstoque;
        Produto objProduto;
        

		Scanner scanNum = new Scanner(System.in);
        Scanner scanString = new Scanner(System.in);
		

		do{
            exibirMenu();
            option = scanNum.nextInt();

            switch (option) {
                case 1: // cadastrar cliente
                    System.out.println("Quantos clientes serão cadastrados?");
                    qtdCliente = scanNum.nextInt();
                    while (qtdCliente != 0) {
                        System.out.println("Por favor, informe os seguintes dados");
                        System.out.println("Nome?");
                        nomeCliente = scanString.nextLine();

                        System.out.println("Endereço?");
                        endereco = scanString.nextLine();

                        System.out.println("Telefone?");
                        telefone = scanString.nextLine();
                        objCliente = new Cliente(nomeCliente,endereco,telefone);
                        ClientelaProduto.adicionarListaClientes(objCliente);
                        qtdCliente -- ;
                    }
                break;
    
                case 2://buscar cliente
                    System.out.println("Qual nome do cliente que você procura?");
                    String buscaCliente = scanString.nextLine();
                    System.out.println(ClientelaProduto.buscarCliente(buscaCliente));
                    if (!ClientelaProduto.buscarCliente(buscaCliente).equals("Cliente não encontrado\n")){
                    System.out.println("Deseja alterar os dados do cliente?\n pressione [s] para sim e qualquer outra tecla para não");
                    String alterarDados = scanString.nextLine();
                    if (alterarDados.equalsIgnoreCase("s")){
                        System.out.println("Digite os novos dados");
                        System.out.println("Novo nome?");
                        String novonomeCliente = scanString.nextLine();

                        System.out.println("Novo Endereço?");
                        String novoEndereco = scanString.nextLine();

                        System.out.println("Novo Telefone?");
                        String novoTelefone = scanString.nextLine();
                        ClientelaProduto.alterarDadosCliente(buscaCliente,novonomeCliente, novoEndereco, novoTelefone);
                    }
                    }
                    
                break;
    
                case 3:// cadastrar produto
                System.out.println("Quantos tipos de produtos serão cadastrados?");
                qtdProduto = scanNum.nextInt();
                while (qtdProduto != 0) {
                    System.out.println("Por favor, informe os seguintes dados");
                    System.out.println("Nome?");
                    nomeProduto = scanString.nextLine();

                    System.out.println("Descrição?");
                    descricao = scanString.nextLine();

                    System.out.println("Valor de compra?");
                    valorCompra = scanNum.nextDouble();

                    System.out.println("Porcentagem de lucro?");
                    porcentagemLucro = scanNum.nextDouble();

                    System.out.println("Quantidade no estoque?");
                    qtdEstoque = scanNum.nextInt();

                    objProduto = new Produto(nomeProduto,descricao,valorCompra,porcentagemLucro,qtdEstoque);
                    ClientelaProduto.adicionarListaProdutos(objProduto);
                    qtdProduto -- ;
                }
                break;
    
                case 4:
                System.out.println("Qual nome do produto que você procura?");
                    String buscaProduto = scanString.nextLine();
                    System.out.println(ClientelaProduto.buscarProduto(buscaProduto));
                    if (!ClientelaProduto.buscarProduto(buscaProduto).equals("Produto não encontrado\n")){
                        System.out.println("Deseja alterar os dados do produto?\n pressione [s] para sim e qualquer outra tecla para não");
                        String alterarDados = scanString.nextLine();
                        if (alterarDados.equalsIgnoreCase("s")){
                            System.out.println("Digite os novos dados");
                            System.out.println("Novo nome?");
                            String novonomeProduto = scanString.nextLine();
    
                            System.out.println("Descrição?");
                            String novaDescricao = scanString.nextLine();

                            System.out.println("Valor de compra?");
                            Double novoValorCompra = scanNum.nextDouble();

                            System.out.println("Porcentagem de lucro?");
                            Double novaPorcentagemLucro = scanNum.nextDouble();

                            System.out.println("Quantidade no estoque?");
                            int novaQtdEstoque = scanNum.nextInt();

                            ClientelaProduto.alterarDadosProduto(buscaProduto, novonomeProduto,novaDescricao, novoValorCompra, novaPorcentagemLucro, novaQtdEstoque);
                        }
                        }
                break;
    
                case 5:
                    System.out.println("Selecione um dos clientes cadastrados:\n");
                    System.out.println(ClientelaProduto.listarClientes());
                    String buscaVendaCliente = scanString.nextLine();
                    ClientelaProduto.buscarCliente(buscaVendaCliente);
                    
                    String finalizarVenda;
                    do{
                    System.out.println("Selecione um dos produtos cadastrados:\n");
                    System.out.println(ClientelaProduto.listarProdutos());
                    buscaVendaCliente = scanString.nextLine();
                    ClientelaProduto.buscarProduto(buscaVendaCliente);
                    System.out.println("Quanto produtos foram vendidos?\n");
                    int qtdVendida = scanNum.nextInt();
                    ClientelaProduto.venda(buscaVendaCliente, qtdVendida);
                    System.out.println("Deseja finalizar venda?\n pressione [n] para não e qualquer outra tecla para sim");
                    finalizarVenda = scanString.nextLine();
                    }while(finalizarVenda.equalsIgnoreCase("n"));
                    
                break;
    
                case 6:
                    System.out.println("Aqui está a lista dos produtos cadastrados:\n");
                    System.out.println(ClientelaProduto.listarProdutos());
                break;
    
                case 7:
                    System.exit(0);
                break;
    
                default:
                System.out.println("Comando não encontrado, por favor, tente outra vez");
            }
        }while(option != 7);
		

	}

    static void exibirMenu (){
        System.out.println("(Digite um número) Menu:");
		System.out.println("1- Cadastro de novo cliente.");
		System.out.println("2- Busca por cliente.");
        System.out.println("3- Cadastro de novo produto.");
		System.out.println("4- Busca por produto. ");
		System.out.println("5- Cadastro de venda");
		System.out.println("6- Mostrar produtos em estoque.");
		System.out.println("7- Sair.");
		
    }
	
}
