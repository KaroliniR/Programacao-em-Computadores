import java.util.ArrayList;
import java.util.Scanner;

class Funcionario {
    private int id;
    private String nome;
    private double salario;

    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double percentual) {
        salario += salario * (percentual / 100);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Digite o número de funcionários: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o ID do funcionário: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
            System.out.print("Digite o nome do funcionário: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o salário do funcionário: ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha

            // Verifica se o ID já existe
            if (funcionarios.stream().anyMatch(func -> func.getId() == id)) {
                System.out.println("Erro: ID já existe. Digite um ID único.");
                return;
            }

            funcionarios.add(new Funcionario(id, nome, salario));
        }

        System.out.print("\nDigite o ID do funcionário que terá o salário aumentado: ");
        int idAumento = scanner.nextInt();
        System.out.print("Digite o percentual de aumento do salário: ");
        double percentualAumento = scanner.nextDouble();

        // Verifica se o ID existe na lista de funcionários
        Funcionario funcionarioEncontrado = null;
        for (Funcionario func : funcionarios) {
            if (func.getId() == idAumento) {
                funcionarioEncontrado = func;
                break;
            }
        }

        if (funcionarioEncontrado == null) {
            System.out.println("Erro: Funcionário com ID informado não encontrado.");
            return;
        }

        // Aumenta o salário do funcionário encontrado
        funcionarioEncontrado.aumentarSalario(percentualAumento);

        // Mostra a listagem atualizada dos funcionários
        System.out.println("\nListagem atualizada dos funcionários:");
        for (Funcionario func : funcionarios) {
            System.out.println("ID: " + func.getId() + ", Nome: " + func.getNome() + ", Salário: " + func.getSalario());
        }
    }
}
