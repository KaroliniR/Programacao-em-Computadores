import java.util.Scanner;

public class BuscaMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo a matriz 5x5
        int[][] matriz = new int[5][5];

        // Lendo os valores da matriz
        System.out.println("Digite os valores da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Lendo o valor a ser buscado
        System.out.println("Digite o valor a ser buscado:");
        int valorBuscado = scanner.nextInt();

        // Flag para verificar se o valor foi encontrado
        boolean encontrado = false;

        // Buscando o valor na matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == valorBuscado) {
                    System.out.println("O valor " + valorBuscado + " foi encontrado na posição [" + i + "][" + j + "]");
                    encontrado = true;
                    break;
                }
            }
        }

        // Se o valor não foi encontrado
        if (!encontrado) {
            System.out.println("O valor " + valorBuscado + " não foi encontrado na matriz.");
        }
    }
}
