import java.util.Scanner;

public class sete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        // Calculando o IMC
        double imc = peso / (altura * altura);

        // Verificando a condição
        String condicao;
        if (imc < 18.5) {
            condicao = "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 25) {
            condicao = "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            condicao = "Acima do peso";
        } else {
            condicao = "Obeso";
        }

        // Exibindo a condição
        System.out.println("Condição: " + condicao);
    }
}
