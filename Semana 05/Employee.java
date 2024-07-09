import java.util.Scanner;

public class Employee {
    // Atributos
    private String name;
    private double grossSalary;
    private double tax;

    // Construtor
    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    // Método para calcular o salário líquido do funcionário
    public double netSalary() {
        return grossSalary - tax;
    }

    // Método para aumentar o salário do funcionário com base em uma porcentagem
    public void increaseSalary(double percentage) {
        grossSalary += (grossSalary * percentage) / 100.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando os dados do funcionário
        System.out.print("Nome do funcionário: ");
        String name = scanner.nextLine();

        System.out.print("Salário bruto: ");
        double grossSalary = scanner.nextDouble();

        System.out.print("Imposto: ");
        double tax = scanner.nextDouble();

        // Criando um objeto funcionário com os dados fornecidos
        Employee employee = new Employee(name, grossSalary, tax);

        // Exibindo os dados do funcionário
        System.out.println("\nDados do funcionário:");
        System.out.println("Nome: " + employee.name);
        System.out.println("Salário líquido: " + employee.netSalary());

        scanner.close();
    }
}
