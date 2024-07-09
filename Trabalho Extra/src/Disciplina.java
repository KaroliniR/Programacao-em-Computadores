import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private List<Estudante> turma;

    public Disciplina() {
        this.turma = new ArrayList<>();
    }

    public void gravar() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("estudantes.csv"))) {
            for (Estudante estudante : turma) {
                writer.write(estudante.getEstudanteCSV());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void carregaDados() {
        File file = new File("estudantes.csv");
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String linha;
                while ((linha = reader.readLine()) != null) {
                    Estudante estudante = new Estudante();
                    estudante.setEstudanteCSV(linha);
                    turma.add(estudante);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            //pré-cadastros
            turma.add(new Estudante("João Silva", "123.456.789-00", "20210001", 7.5, 8.0));
            turma.add(new Estudante("Maria Oliveira", "987.654.321-00", "20210002", 6.0, 6.5));
            turma.add(new Estudante("Pedro Santos", "111.222.333-00", "20210003", 5.0, 4.5));
            turma.add(new Estudante("Ana Costa", "444.555.666-00", "20210004", 9.0, 8.5));
            gravar(); 
        }
    }

    public void insereEstudante(Estudante estudante) {
        turma.add(estudante);
    }

    public void removerEstudante(String matricula) {
        turma.removeIf(estudante -> estudante.getMatricula().equals(matricula));
    }

    public Estudante consultarEstudante(String matricula) {
        for (Estudante estudante : turma) {
            if (estudante.getMatricula().equals(matricula)) {
                return estudante;
            }
        }
        return null;
    }

    public List<Estudante> listarEstudantes() {
        return new ArrayList<>(turma);
    }

    public List<Estudante> listarEstudantesComMediaAbaixoDe(double media) {
        List<Estudante> abaixoMedia = new ArrayList<>();
        for (Estudante estudante : turma) {
            if (estudante.calcularMedia() < media) {
                abaixoMedia.add(estudante);
            }
        }
        return abaixoMedia;
    }

    public List<Estudante> listarEstudantesComMediaAcimaDe(double media) {
        List<Estudante> acimaMedia = new ArrayList<>();
        for (Estudante estudante : turma) {
            if (estudante.calcularMedia() > media) {
                acimaMedia.add(estudante);
            }
        }
        return acimaMedia;
    }

    public double calcularMediaDaTurma() {
        double soma = 0;
        for (Estudante estudante : turma) {
            soma += estudante.calcularMedia();
        }
        return turma.isEmpty() ? 0 : soma / turma.size();
    }
}
