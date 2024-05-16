import java.util.Scanner;

public class Dois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sexo da pessoa (M para masculino, F para feminino): ");
        char sexo = scanner.nextLine().toUpperCase().charAt(0);

        System.out.print("Digite o estado civil da pessoa: ");
        String estadoCivil = scanner.nextLine().toUpperCase();

        if (sexo == 'F' && estadoCivil.equals("CASADA")) {
            System.out.print("Digite o tempo de casamento em anos: ");
            int tempoCasada = scanner.nextInt();
            System.out.println(nome + " está casada há " + tempoCasada + " anos.");
        } else {
            System.out.println(nome + " não está enquadrada na condição de sexo feminino casada.");
        }
    }
}
