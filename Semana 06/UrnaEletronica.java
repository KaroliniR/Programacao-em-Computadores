import java.util.Arrays;

public class UrnaEletronica {
    // Atributos
    private int votosBrancos;
    private int votosNulos;
    private int[] votosCandidatos;
    private boolean urnaFechada;

    // Construtor
    public UrnaEletronica(int numeroCandidatos) {
        this.votosBrancos = 0;
        this.votosNulos = 0;
        this.votosCandidatos = new int[numeroCandidatos];
        this.urnaFechada = false;
    }

    // Método para registrar voto em branco
    public void votarBranco() {
        if (!urnaFechada) {
            votosBrancos++;
        } else {
            System.out.println("A urna está fechada. Não é possível votar.");
        }
    }

    // Método para registrar voto nulo
    public void votarNulo() {
        if (!urnaFechada) {
            votosNulos++;
        } else {
            System.out.println("A urna está fechada. Não é possível votar.");
        }
    }

    // Método para registrar voto para um candidato específico
    public void votarCandidato(int numeroCandidato) {
        if (!urnaFechada) {
            if (numeroCandidato >= 0 && numeroCandidato < votosCandidatos.length) {
                votosCandidatos[numeroCandidato]++;
            } else {
                System.out.println("Número de candidato inválido.");
            }
        } else {
            System.out.println("A urna está fechada. Não é possível votar.");
        }
    }

    // Método para fechar a urna
    public void fecharUrna() {
        urnaFechada = true;
    }

    // Método para exibir os resultados da votação
    public void exibirResultados() {
        System.out.println("Resultados da votação:");
        System.out.println("Votos em branco: " + votosBrancos);
        System.out.println("Votos nulos: " + votosNulos);
        System.out.println("Votos por candidato:");
        for (int i = 0; i < votosCandidatos.length; i++) {
            System.out.println("Candidato " + i + ": " + votosCandidatos[i]);
        }
    }

    public static void main(String[] args) {
        // Criando uma urna eletrônica com 5 candidatos
        UrnaEletronica urna = new UrnaEletronica(5);

        // Simulando votação
        urna.votarCandidato(0);
        urna.votarCandidato(1);
        urna.votarCandidato(2);
        urna.votarBranco();
        urna.votarNulo();
        urna.votarCandidato(0);
        urna.votarCandidato(0);
        urna.votarCandidato(3);
        urna.votarCandidato(2);
        urna.votarNulo();

        // Fechando a urna e exibindo os resultados
        urna.fecharUrna();
        urna.exibirResultados();
    }
}
