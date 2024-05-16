import java.time.LocalDate;

public class Funcionario {
    // Atributos
    private String nome;
    private String matricula;
    private double salario;
    private LocalDate dataAdmissao;
    private String cpf;

    // Construtor
    public Funcionario(String nome, String matricula, double salario, LocalDate dataAdmissao, String cpf) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.cpf = cpf;
    }

    // Método para receber aumento
    public void receberAumento(double aumento) {
        this.salario += aumento;
    }

    // Método para calcular o ganho bruto anual
    public double calcularGanhoBrutoAnual() {
        return this.salario * 12;
    }

    // Método para calcular o imposto pago pelo funcionário no decorrer de um ano
    public double calcularImposto() {
        double imposto = 0;
        double salarioAnual = calcularGanhoBrutoAnual();
        double salarioBase = salarioAnual;

        // Calculando imposto de INSS
        imposto += salarioBase * 0.11;
        salarioBase -= imposto;

        // Calculando imposto de IR se o salário for maior que R$ 2.500,00
        if (salarioBase > 2500) {
            imposto += (salarioBase - 2500) * 0.175;
        }

        return imposto;
    }

    // Método para calcular o ganho líquido mensal
    public double calcularGanhoLiquidoMensal() {
        double descontoINSS = this.salario * 0.11;
        double descontoIR = 0;

        if (this.salario > 2500) {
            descontoIR = (this.salario - 2500) * 0.175;
        }

        return this.salario - descontoINSS - descontoIR;
    }

    // Método para calcular o ganho líquido anual
    public double calcularGanhoLiquidoAnual() {
        return calcularGanhoBrutoAnual() - calcularImposto();
    }

    // Getters e Setters
    // Implementação dos métodos getter e setter

    // Representação UML:
    // Classe: Funcionario
    // -------------------
    // - nome: String
    // - matricula: String
    // - salario: double
    // - dataAdmissao: LocalDate
    // - cpf: String
    // -------------------
    // + Funcionario(nome: String, matricula: String, salario: double, dataAdmissao:
    // LocalDate, cpf: String)
    // + receberAumento(aumento: double): void
    // + calcularGanhoBrutoAnual(): double
    // + calcularImposto(): double
    // + calcularGanhoLiquidoMensal(): double
    // + calcularGanhoLiquidoAnual(): double
    // + getters e setters para todos os atributos
}
