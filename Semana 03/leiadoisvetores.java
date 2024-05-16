import java.util.ArrayList;
import java.util.Scanner;

public class leiadoisvetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vetores de entrada
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];

        // Ler os valores do primeiro vetor
        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }

        // Ler os valores do segundo vetor
        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }

        // Criar vetor para a interseção
        ArrayList<Integer> intersecao = new ArrayList<>();

        // Verificar interseção e adicionar ao vetor
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (vetor1[i] == vetor2[j] && !intersecao.contains(vetor1[i])) {
                    intersecao.add(vetor1[i]);
                    break;
                }
            }
        }

        // Exibir vetor de interseção
        System.out.println("Vetor de interseção:");
        for (int num : intersecao) {
            System.out.println(num);
        }
    }
}
