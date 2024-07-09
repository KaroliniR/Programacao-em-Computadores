import java.util.Scanner;

public class ler10números {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.println("Digite 10 números diferentes:");

        for (int i = 0; i < 10; i++) {
            int numero;
            boolean repetido;

            do {
                System.out.print("Número " + (i + 1) + ": ");
                numero = scanner.nextInt();

                repetido = false;
                for (int j = 0; j < i; j++) {
                    if (vetor[j] == numero) {
                        repetido = true;
                        System.out.println("Número já digitado. Digite outro número.");
                        break;
                    }
                }
            } while (repetido);

            vetor[i] = numero;
        }

        System.out.println("Vetor final:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Vetor[" + i + "] = " + vetor[i]);
        }
    }
}
