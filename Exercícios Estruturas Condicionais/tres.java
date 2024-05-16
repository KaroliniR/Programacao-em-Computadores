import java.util.Scanner;

public class tres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        int C;

        if (A == B) {
            C = A + B;
            System.out.println("Os valores são iguais. A soma de A e B é: " + C);
        } else {
            C = A * B;
            System.out.println("Os valores são diferentes. A multiplicação de A por B é: " + C);
        }
    }
}
