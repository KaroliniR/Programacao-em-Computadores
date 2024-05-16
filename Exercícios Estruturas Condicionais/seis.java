import java.util.Scanner;

public class seis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor inteiro: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor inteiro: ");
        int valor2 = scanner.nextInt();

        System.out.print("Digite o terceiro valor inteiro: ");
        int valor3 = scanner.nextInt();

        // Encontrando o maior valor
        int maior = valor1;
        if (valor2 > maior) {
            maior = valor2;
        }
        if (valor3 > maior) {
            maior = valor3;
        }

        // Encontrando o menor valor
        int menor = valor1;
        if (valor2 < menor) {
            menor = valor2;
        }
        if (valor3 < menor) {
            menor = valor3;
        }

        // Encontrando o valor do meio
        int meio = valor1 + valor2 + valor3 - maior - menor;

        // Exibindo em ordem decrescente
        System.out.println("Em ordem decrescente: " + maior + ", " + meio + ", " + menor);
    }
}
