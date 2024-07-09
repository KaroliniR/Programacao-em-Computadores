import java.util.Scanner;

public class OperacoesMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo a matriz 3x6 para armazenar os valores reais
        double[][] matriz = new double[3][6];

        // Lendo os valores da matriz
        System.out.println("Digite os valores da matriz 3x6:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = scanner.nextDouble();
            }
        }

        // (a) Calculando a soma dos elementos das colunas ímpares (0-indexed)
        double somaColunasImpares = 0;
        for (int i = 0; i < 3; i++) {
            somaColunasImpares += matriz[i][1] + matriz[i][3] + matriz[i][5];
        }
        System.out.println("Soma dos elementos das colunas ímpares: " + somaColunasImpares);

        // (b) Calculando a média aritmética dos elementos da segunda e quarta colunas
        double somaSegundaColuna = 0;
        double somaQuartaColuna = 0;
        for (int i = 0; i < 3; i++) {
            somaSegundaColuna += matriz[i][1];
            somaQuartaColuna += matriz[i][3];
        }
        double mediaSegundaQuartaColuna = (somaSegundaColuna + somaQuartaColuna) / 6;
        System.out.println("Média aritmética da segunda e quarta colunas: " + mediaSegundaQuartaColuna);

        // (c) Substituindo os valores da sexta coluna pela soma dos valores das colunas
        // 1 e 2
        for (int i = 0; i < 3; i++) {
            matriz[i][5] = matriz[i][0] + matriz[i][1];
        }

        // (d) Imprimindo a matriz modificada
        System.out.println("Matriz modificada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
