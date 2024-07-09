import java.util.Scanner;

public class tres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro maior que 1: ");
        int N = scanner.nextInt();

        System.out.println("Números de 1 até " + N + ":");

        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
    }
}
