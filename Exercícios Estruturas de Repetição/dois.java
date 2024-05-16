import java.util.Scanner;

public class dois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Digite um número inteiro entre 1 e 10: ");
            numero = scanner.nextInt();
        } while (numero < 1 || numero > 10);

        System.out.println("Tabuada do " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
