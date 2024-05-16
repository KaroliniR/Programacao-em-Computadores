// Classe Ponto
public class Ponto {
    // Atributos
    protected double x;
    protected double y;

    // Construtor
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Métodos getters e setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

// Classe Circulo
public class Circulo {
    // Atributos
    private Ponto centro;
    private double raio;

    // Construtor
    public Circulo(Ponto centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }

    // Métodos getters e setters
    public Ponto getCentro() {
        return centro;
    }

    public void setCentro(Ponto centro) {
        this.centro = centro;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    // Método para acessar os atributos da classe Ponto dentro da classe Circulo
    public void acessarAtributosPonto() {
        // Podemos acessar os atributos x e y da classe Ponto diretamente
        System.out.println("Coordenada x do ponto dentro do círculo: " + centro.x);
        System.out.println("Coordenada y do ponto dentro do círculo: " + centro.y);
    }
}
