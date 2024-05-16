import java.util.Scanner;

public class AnaliseNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo a matriz 10x3 para armazenar as notas dos alunos
        double[][] notas = new double[10][3];

        // Lendo as notas dos alunos
        System.out.println("Digite as notas dos alunos (10 alunos, 3 provas):");
        for (int i = 0; i < 10; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Nota da prova " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }

        // Contadores para os diferentes critérios de pior nota
        int piorNotaProva1 = 0;
        int piorNotaProva2 = 0;
        int piorNotaProva3 = 0;

        // Verificando a pior nota de cada aluno
        for (int i = 0; i < 10; i++) {
            double piorNota = notas[i][0]; // Inicialmente, assumimos que a pior nota é da prova 1
            for (int j = 1; j < 3; j++) {
                if (notas[i][j] < piorNota) {
                    piorNota = notas[i][j];
                }
            }
            // Incrementando os contadores com base na pior nota do aluno
            if (piorNota == notas[i][0]) {
                piorNotaProva1++;
            } else if (piorNota == notas[i][1]) {
                piorNotaProva2++;
            } else {
                piorNotaProva3++;
            }
        }

        // Exibindo os resultados
        System.out.println("Número de alunos cuja pior nota foi na prova 1: " + piorNotaProva1);
        System.out.println("Número de alunos cuja pior nota foi na prova 2: " + piorNotaProva2);
        System.out.println("Número de alunos cuja pior nota foi na prova 3: " + piorNotaProva3);
    }
}
