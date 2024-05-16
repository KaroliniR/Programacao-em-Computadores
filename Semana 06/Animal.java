// Classe Animal
public class Animal {
    // Atributos
    private String nome;
    protected String especie;
    protected String familia;
    private int idade;

    // Construtor
    public Animal(String nome, String especie, String familia, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.familia = familia;
        this.idade = idade;
    }

    // Método alimentar
    public String alimentar() {
        return "Alimentou na classe Animal";
    }
}

// Classe Mamifero (subclasse de Animal)
public class Mamifero extends Animal {
    // Atributo adicional
    private String tipoPelagem;

    // Construtor
    public Mamifero(String nome, String especie, String familia, int idade, String tipoPelagem) {
        super(nome, especie, familia, idade);
        this.tipoPelagem = tipoPelagem;
    }

    // Sobrescrita do método alimentar
    @Override
    public String alimentar() {
        return "Alimentou na classe Mamífero";
    }
}

// Classe Ave (subclasse de Animal)
public class Ave extends Animal {
    // Atributo adicional
    private String tipoDeBico;

    // Construtor
    public Ave(String nome, String especie, String familia, int idade, String tipoDeBico) {
        super(nome, especie, familia, idade);
        this.tipoDeBico = tipoDeBico;
    }

    // Sobrescrita do método alimentar
    @Override
    public String alimentar() {
        return "Alimentou na classe Ave";
    }

    // Método específico para Ave
    public String voar() {
        return "Voando...";
    }
}

// Classe de teste
public class Teste {
    public static void main(String[] args) {
        // Criando um mamífero e uma ave
        Mamifero cachorro = new Mamifero("Rex", "Canis lupus familiaris", "Canidae", 5, "Pelo curto");
        Ave passaro = new Ave("Pardal", "Passer domesticus", "Passeridae", 2, "Bico pequeno");

        // Testando o método alimentar de cada animal
        System.out.println(cachorro.alimentar()); // Alimentou na classe Mamífero
        System.out.println(passaro.alimentar()); // Alimentou na classe Ave

        // Testando o método voar específico da classe Ave
        System.out.println(passaro.voar()); // Voando...
    }
}
