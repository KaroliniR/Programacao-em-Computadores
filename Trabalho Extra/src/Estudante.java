import java.util.StringJoiner;

public class Estudante {
    private String nome;
    private String cpf;
    private String matricula;
    private double nota01;
    private double nota02;

    public Estudante() {}

    public Estudante(String nome, String cpf, String matricula, double nota01, double nota02) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.nota01 = nota01;
        this.nota02 = nota02;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota01() {
        return nota01;
    }

    public void setNota01(double nota01) {
        this.nota01 = nota01;
    }

    public double getNota02() {
        return nota02;
    }

    public void setNota02(double nota02) {
        this.nota02 = nota02;
    }

    public double calcularMedia() {
        return (nota01 + nota02) / 2.0;
    }

    public String getEstudanteCSV() {
        StringJoiner joiner = new StringJoiner(",");
        joiner.add(nome).add(cpf).add(matricula).add(String.valueOf(nota01)).add(String.valueOf(nota02));
        return joiner.toString();
    }

    public void setEstudanteCSV(String linha) {
        String[] campos = linha.split(",");
        this.nome = campos[0];
        this.cpf = campos[1];
        this.matricula = campos[2];
        this.nota01 = Double.parseDouble(campos[3]);
        this.nota02 = Double.parseDouble(campos[4]);
    }
}
