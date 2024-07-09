class Ponto {
    private double x;
    protected double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }
}

class Circulo extends Ponto {
    private double raio;

    public Circulo(double x, double y, double raio) {
        super(x, y);
        this.raio = raio;
    }

    public double area() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    public double getRaio() {
        return this.raio;
    }

    // Método para acessar y da classe Ponto
    public double getYDoPonto() {
        return this.y;
    }
}

class Teste {
    public void testarAcesso() {
        Circulo circulo = new Circulo(3, 4, 5);

        // Acesso aos atributos privados e protegidos da classe Ponto dentro da classe
        // Circulo
        System.out.println("Coordenada x do ponto: " + circulo.getX()); // Acesso ao atributo privado x
        System.out.println("Coordenada y do ponto: " + circulo.getYDoPonto()); // Acesso ao atributo protegido y
        System.out.println("Raio do círculo: " + circulo.getRaio()); // Acesso ao atributo privado raio
    }
}

public class ponto {
    public static void main(String[] args) {
        Teste teste = new Teste();
        teste.testarAcesso();
    }
}
