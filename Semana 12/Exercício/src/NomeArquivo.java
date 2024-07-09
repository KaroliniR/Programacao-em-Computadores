import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NomeArquivo {

    private String nomeArquivo;

    public NomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void lerNomes() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Digite um nome (ou 'SAIR' para encerrar): ");
                String nome = scanner.nextLine();
                if (nome.equalsIgnoreCase("SAIR")) {
                    break;
                }
                writer.write(nome);
                writer.newLine();
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void lerArquivo() {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            System.out.println("Conteúdo do arquivo:");
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        NomeArquivo arquivo = new NomeArquivo("nomes.txt");
        arquivo.lerNomes();
        arquivo.lerArquivo();
    }
}
