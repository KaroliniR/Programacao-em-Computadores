import java.util.Scanner;

class MedidaRetangulo {
    private double largura;
    private double altura;

    public MedidaRetangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public double calcularDiagonal() {
        return Math.sqrt(largura * largura + altura * altura);
    }
}

public class Retangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a largura do retângulo:");
        double largura = obterEntradaPositiva(scanner);

        System.out.println("Digite a altura do retângulo:");
        double altura = obterEntradaPositiva(scanner);

        Retangulo retangulo = new Retangulo(largura, altura);

        double area = retangulo.calcularArea();
        double perimetro = retangulo.calcularPerimetro();
        double diagonal = retangulo.calcularDiagonal();

        System.out.println("Área do retângulo: " + area);
        System.out.println("Perímetro do retângulo: " + perimetro);
        System.out.println("Diagonal do retângulo: " + diagonal);

        scanner.close();
    }

    public static double obterEntradaPositiva(Scanner scanner) {
        double numero;
        do {
            while (!scanner.hasNextDouble()) {
                System.out.println("Por favor, insira um número válido.");
                scanner.next();
            }
            numero = scanner.nextDouble();
            if (numero <= 0) {
                System.out.println("Por favor, insira um número positivo.");
            }
        } while (numero <= 0);
        return numero;
    }
}
