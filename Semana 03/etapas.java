public class etapas {
    public static void main(String[] args) {
        // (a) Criando o vetor A e atribuindo os valores
        int[] A = { 1, 0, 5, -2, -5, 7 };

        // (b) Calculando a soma de A[0], A[1] e A[5]
        int soma = A[0] + A[1] + A[5];
        System.out.println("A soma de A[0], A[1] e A[5] é: " + soma);

        // (c) Modificando o valor de A na posição 4 para 100
        A[4] = 100;

        // (d) Mostrando cada valor do vetor A
        System.out.println("Valores do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.println("A[" + i + "] = " + A[i]);
        }
    }
}
