import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class VerificarAdicionarNome {

    public static boolean nomeJaCadastrado(String nomeArquivo, String nome) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                if (linha.equalsIgnoreCase(nome)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void adicionarNome(String nomeArquivo, String nome) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo, true))) {
            writer.write(nome);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String nomeArquivo = "nomes.txt";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nome = scanner.nextLine();

        if (nomeJaCadastrado(nomeArquivo, nome)) {
            System.out.println("Nome já cadastrado.");
        } else {
            adicionarNome(nomeArquivo, nome);
            System.out.println("Nome adicionado.");
        }

        scanner.close();
    }
}
