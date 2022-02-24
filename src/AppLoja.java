import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AppLoja {
    public static <vetorProdutos> void main(String[] args) throws InterruptedException, IOException {
        int opcao;
        Scanner in = new Scanner(System.in);
        ArrayList<Produto> produto = new ArrayList<>();
        ArrayList<Venda> venda = new ArrayList<>();
        
        do {
            System.out.println("\n****\nMENU\n****\n");
            System.out.println("1 - Incluir Produto");
            System.out.println("2 - Consultar Produto");
            System.out.println("3 - Listagem de Produtos");
            System.out.println("4 - Vendas por período - detalhado");
            System.out.println("5 - Realizar venda");
            System.out.println("0 - Sair\n");
            System.out.print("Opção: ");

            opcao = in.nextInt();
            in.nextLine(); // Tira o ENTER que ficou na entrada na instrução anterior

            if (opcao == 1) {
                                                
                //lendo código do produto
                System.out.println("Informe o código do produto: ");
                String codigo = in.nextLine ();
                
                // ler nome do Produto
                System.out.println("Informe o nome do Produto: ");
                String nome = in.nextLine ();

                // ler valor do Produto
                System.out.println("Informe o valor do Produto: ");
                String valor = in.nextLine ();

                // ler estoque do Produto
                System.out.println("Informe o estoque do Produto: ");
                String estoque = in.nextLine ();

                produto.add(new Produto (codigo,nome,valor,estoque));

                voltarMenu(in);
            
            } else if (opcao == 2) {
                
                // Exiba os produtos aqui
                System.out.println("Qual produto deseja consultar? ");
                String consulta = in.nextLine ();
                
                produto.stream()
                .filter(p -> p.getCodigo().equals(consulta))
                .forEach(System.out::println);
                                
                voltarMenu(in);
            
            } else if (opcao == 3) {
            
                // Exiba os produtos aqui
                System.out.println("Listagem dos Produtos Cadastrados\n");
                produto.stream()
                .forEach(System.out::println);
                System.out.println("\n");

                voltarMenu(in);
                
            } else if (opcao == 4) {
                System.out.println("Relatório de Vendas\n");
                System.out.println("Período de Emissão 2022\n");
                venda.stream()
                .forEach(System.out::println);
                               
                voltarMenu(in);
                continue;
            

                // Exiba as vendas aqui
            
            } else if (opcao == 5) {
                
                System.out.println("Realização de Venda\n");
                System.out.println("Produto que esta sendo vendido: ");
                String produtoVendido = in.nextLine();

                System.out.println("Data da venda: ");
                String dataVenda = in.nextLine();

                System.out.println("Quantidade que esta sendo vendido: ");
                int qtVendida = in.nextInt();

                System.out.println("Valor unitário do produto: ");
                int vlUnitario = in.nextInt();
                
                System.out.println(":::::Venda Completa::::::");
                in.nextLine();

                venda.add(new Venda (dataVenda,produtoVendido,qtVendida,vlUnitario));
                
                voltarMenu(in);
            
            }
            else if (opcao != 0) {
                System.out.println("\nOpção inválida!");
            }
        } while (opcao != 0);

        System.out.println("Fim do programa!");

        in.close();
    }

    private static void voltarMenu(Scanner in) throws InterruptedException, IOException {
        System.out.println("\nPressione ENTER para voltar ao menu.");
        in.nextLine();

        // Limpa toda a tela, deixando novamente apenas o menu
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            System.out.print("\033[H\033[2J");
        
        System.out.flush();
    }
}