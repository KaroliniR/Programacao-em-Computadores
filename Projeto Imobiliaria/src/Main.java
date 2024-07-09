import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Imobiliaria imobiliaria = new Imobiliaria();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1 - Cadastro de um novo imóvel");
            System.out.println("2 - Listagem de todos os imóveis");
            System.out.println("3 - Listagem dos imóveis que atende uma determinada condição");
            System.out.println("4 - Exclusão de Imóveis");
            System.out.println("5 - Alteração de Imóveis");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha

            switch (opcao) {
                case 1:
                    cadastrarImovel(imobiliaria, scanner);
                    break;
                case 2:
                    imobiliaria.listarImoveis();
                    break;
                case 3:
                    listarImoveisCondicao(imobiliaria, scanner);
                    break;
                case 4:
                    excluirImovel(imobiliaria, scanner);
                    break;
                case 5:
                    alterarImovel(imobiliaria, scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void cadastrarImovel(Imobiliaria imobiliaria, Scanner scanner) {
        System.out.print("Código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha

        System.out.print("Área Construída: ");
        float areaConstruida = scanner.nextFloat();

        System.out.print("Área Total: ");
        float areaTotal = scanner.nextFloat();

        System.out.print("Número de Quartos: ");
        int numeroQuartos = scanner.nextInt();

        System.out.print("Tipo (0 - Casa, 1 - Apartamento): ");
        int tipo = scanner.nextInt();

        System.out.print("Preço: ");
        float preco = scanner.nextFloat();
        scanner.nextLine(); // Consome a nova linha

        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("Bairro: ");
        String bairro = scanner.nextLine();

        Endereco endereco = new Endereco(cidade, bairro);
        Imovel imovel = new Imovel(codigo, areaConstruida, areaTotal, numeroQuartos, tipo, preco, endereco);
        imobiliaria.cadastrarImovel(imovel);
    }

    private static void listarImoveisCondicao(Imobiliaria imobiliaria, Scanner scanner) {
        System.out.println("Listar por condição:");
        System.out.println("1 - Tipo do imóvel (Casa ou Apartamento)");
        System.out.println("2 - Disponíveis em uma determinada cidade");
        System.out.println("3 - Disponíveis em um determinado bairro de uma determinada cidade");
        System.out.println("4 - Pertencentes a uma determinada faixa de preço");
        System.out.println("5 - Número mínimo de quartos desejado");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha
 
        switch (opcao) {
            case 1:
                System.out.print("Tipo (0 - Casa, 1 - Apartamento): ");
                int tipo = scanner.nextInt();
                List<Imovel> imoveisPorTipo = imobiliaria.buscarImoveisPorTipo(tipo);
                imprimirListaImoveis(imoveisPorTipo);
                break;
            case 2:
                System.out.print("Cidade: ");
                String cidade = scanner.nextLine();
                List<Imovel> imoveisPorCidade = imobiliaria.buscarImoveisPorCidade(cidade);
                imprimirListaImoveis(imoveisPorCidade);
                break;
            case 3:
                System.out.print("Cidade: ");
                cidade = scanner.nextLine();
                System.out.print("Bairro: ");
                String bairro = scanner.nextLine();
                List<Imovel> imoveisPorBairroECidade = imobiliaria.buscarImoveisPorBairroECidade(bairro, cidade);
                imprimirListaImoveis(imoveisPorBairroECidade);
                break;
            case 4:
                System.out.print("Preço mínimo: ");
                float precoMin = scanner.nextFloat();
                System.out.print("Preço máximo: ");
                float precoMax = scanner.nextFloat();
                List<Imovel> imoveisPorFaixaDePreco = imobiliaria.buscarImoveisPorFaixaDePreco(precoMin, precoMax);
                imprimirListaImoveis(imoveisPorFaixaDePreco);
                break;
            case 5:
                System.out.print("Número mínimo de quartos: ");
                int numeroMinQuartos = scanner.nextInt();
                List<Imovel> imoveisPorNumeroDeQuartos = imobiliaria.buscarImoveisPorNumeroDeQuartos(numeroMinQuartos);
                imprimirListaImoveis(imoveisPorNumeroDeQuartos);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private static void excluirImovel(Imobiliaria imobiliaria, Scanner scanner) {
        System.out.print("Código do imóvel a ser excluído: ");
        int codigo = scanner.nextInt();
        boolean excluido = imobiliaria.excluirImovel(codigo);
        if (excluido) {
            System.out.println("Imóvel excluído com sucesso.");
        } else {
            System.out.println("Imóvel não encontrado.");
        }
    }

    private static void alterarImovel(Imobiliaria imobiliaria, Scanner scanner) {
        System.out.print("Código do imóvel a ser alterado: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha

        System.out.print("Nova Área Construída: ");
        float areaConstruida = scanner.nextFloat();

        System.out.print("Nova Área Total: ");
        float areaTotal = scanner.nextFloat();

        System.out.print("Novo Número de Quartos: ");
        int numeroQuartos = scanner.nextInt();

        System.out.print("Novo Tipo (0 - Casa, 1 - Apartamento): ");
        int tipo = scanner.nextInt();

        System.out.print("Novo Preço: ");
        float preco = scanner.nextFloat();
        scanner.nextLine(); // Consome a nova linha

        System.out.print("Nova Cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("Novo Bairro: ");
        String bairro = scanner.nextLine();

        Endereco endereco = new Endereco(cidade, bairro);
        Imovel novoImovel = new Imovel(codigo, areaConstruida, areaTotal, numeroQuartos, tipo, preco, endereco);

        boolean alterado = imobiliaria.alterarImovel(codigo, novoImovel);
        if (alterado) {
            System.out.println("Imóvel alterado com sucesso.");
        } else {
            System.out.println("Imóvel não encontrado.");
        }
    }

    private static void imprimirListaImoveis(List<Imovel> imoveis) {
        if (imoveis.isEmpty()) {
            System.out.println("Nenhum imóvel encontrado.");
        } else {
            for (Imovel imovel : imoveis) {
                System.out.println(imovel);
            }
        }
    }
}
