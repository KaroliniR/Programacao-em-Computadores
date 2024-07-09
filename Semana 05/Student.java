import java.util.Scanner;

public class Student {
    // Atributos
    private String name;
    private double firstQuarter;
    private double secondQuarter;
    private double thirdQuarter;

    // Construtor
    public Student(String name, double firstQuarter, double secondQuarter, double thirdQuarter) {
        this.name = name;
        this.firstQuarter = firstQuarter;
        this.secondQuarter = secondQuarter;
        this.thirdQuarter = thirdQuarter;
    }

    // Método para calcular a nota final do aluno no ano
    public double finalGrade() {
        return firstQuarter * 0.3 + secondQuarter * 0.35 + thirdQuarter * 0.35;
    }

    // Método para verificar se o aluno está aprovado
    public String status() {
        double minimumGrade = 60.0;
        double finalGrade = finalGrade();

        if (finalGrade >= minimumGrade) {
            return "PASS";
        } else {
            double missingPoints = minimumGrade - finalGrade;
            return "FAILED. Missing points: " + missingPoints;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando os dados do aluno
        System.out.print("Nome do aluno: ");
        String name = scanner.nextLine();

        System.out.print("Nota do primeiro trimestre: ");
        double firstQuarter = scanner.nextDouble();

        System.out.print("Nota do segundo trimestre: ");
        double secondQuarter = scanner.nextDouble();

        System.out.print("Nota do terceiro trimestre: ");
        double thirdQuarter = scanner.nextDouble();

        // Criando um objeto aluno com os dados fornecidos
        Student student = new Student(name, firstQuarter, secondQuarter, thirdQuarter);

        // Exibindo a nota final do aluno e seu status (aprovado ou reprovado)
        System.out.println("\nNota final do aluno: " + student.finalGrade());
        System.out.println("Status do aluno: " + student.status());

        scanner.close();
    }
}
