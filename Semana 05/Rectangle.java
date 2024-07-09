import java.util.Scanner;

public class Rectangle {
    // Atributos
    private double width;
    private double height;

    // Construtor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Método para calcular a área do retângulo
    public double calculateArea() {
        return width * height;
    }

    // Método para calcular o perímetro do retângulo
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    // Método para calcular a diagonal do retângulo
    public double calculateDiagonal() {
        return Math.sqrt(width * width + height * height);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando a entrada do usuário para a largura e altura do retângulo
        System.out.print("Entre com a largura e a altura do retângulo (separados por espaço): ");
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();

        // Criando um objeto retângulo com os valores fornecidos
        Rectangle rectangle = new Rectangle(width, height);

        // Calculando e exibindo a área, perímetro e diagonal do retângulo
        System.out.println("ÁREA = " + rectangle.calculateArea());
        System.out.println("PERÍMETRO = " + rectangle.calculatePerimeter());
        System.out.println("DIAGONAL = " + rectangle.calculateDiagonal());

        scanner.close();
    }
}
