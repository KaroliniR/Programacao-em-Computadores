import java.util.Scanner;

public class oito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do produto: R$");
        double preco = scanner.nextDouble();

        System.out.println("Escolha a condição de pagamento:");
        System.out.println("1 - À vista em dinheiro ou cheque (10% de desconto)");
        System.out.println("2 - À vista no cartão de crédito (15% de desconto)");
        System.out.println("3 - Em duas vezes (sem juros)");
        System.out.println("4 - Em duas vezes (com juros de 10%)");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        double precoFinal;

        switch (opcao) {
            case 1:
                precoFinal = preco - (preco * 0.10);
                break;
            case 2:
                precoFinal = preco - (preco * 0.15);
                break;
            case 3:
                precoFinal = preco;
                break;
            case 4:
                precoFinal = preco * 1.10;
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("Preço final a ser pago: R$" + precoFinal);
    }
}
