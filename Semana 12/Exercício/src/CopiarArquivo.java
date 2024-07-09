import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopiarArquivo {

    public static void copiarArquivo(String arquivoOrigem, String arquivoDestino) {
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoOrigem));
             BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoDestino))) {

            String linha;
            while ((linha = reader.readLine()) != null) {
                writer.write(linha);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        copiarArquivo("nomes.txt", "nomes_copiados.txt");
    }
}
