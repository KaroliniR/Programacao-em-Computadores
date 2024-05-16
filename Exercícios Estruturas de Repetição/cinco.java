import java.util.Scanner;

public class cinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int TOTAL_NUMEROS = 10;
        int soma = 0;

        for (int i = 1; i <= TOTAL_NUMEROS; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        double media = (double) soma / TOTAL_NUMEROS;
        System.out.println("A média dos números digitados é: " + media);
    }
}
