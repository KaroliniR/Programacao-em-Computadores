import java.util.Scanner;

public class quatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        long fatorial1 = calcularFatorial(numero1);
        long fatorial2 = calcularFatorial(numero2);

        System.out.println("O fatorial de " + numero1 + " é: " + fatorial1);
        System.out.println("O fatorial de " + numero2 + " é: " + fatorial2);
    }

    public static long calcularFatorial(int numero) {
        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
