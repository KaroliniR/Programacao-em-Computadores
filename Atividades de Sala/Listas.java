import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void Run() {
        // Criação da lista
        List<String> cores = new ArrayList<>();

        // adicionando cores elementos
        cores.add("Azul");
        cores.add("Verde");
        cores.add("Amarelo");
        cores.add("Vermelho");
        cores.add("Laranja");

        // removendo elementos
        cores.remove("Laranja");

        // adicionendo elementos
        System.out.printf("numero de cores: %d\n", cores.size());
        System.out.printf("Primeira cor: %d\n", cores.get(0));
        System.out.printf("Ultima cor: %d\n", cores.get(cores.size() - 1));

    }
}