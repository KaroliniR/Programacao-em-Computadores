import java.util.Scanner;

public class cinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int resultado;

        if (numero % 2 == 0) {
            resultado = numero * 5;
        } else {
            resultado = numero * 7;
        }

        System.out.println("O resultado da operação é: " + resultado);
    }
}
