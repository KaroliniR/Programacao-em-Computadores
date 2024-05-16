// Classe Conta
public class Conta {
    // Atributos
    private String titular;
    private String numeroConta;
    private String numeroAgencia;
    private float saldo;
    private String status; // "positivo" ou "negativo"
    private float percentual;

    // Construtor
    public Conta(String titular, String numeroConta, String numeroAgencia, float saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.saldo = saldo;
        this.status = saldo >= 0 ? "positivo" : "negativo";
        this.percentual = 1.0f;
    }

    // Método Saque
    public void saque(float valor) {
        this.saldo -= valor;
        this.atualizar();
    }

    // Método AlteraStatus
    public void alteraStatus() {
        this.status = this.saldo >= 0 ? "positivo" : "negativo";
    }

    // Método Deposito
    public void deposito(float valor) {
        this.saldo += valor;
        this.atualizar();
    }

    // Método atualizar
    public void atualizar() {
        this.saldo = this.saldo * this.percentual;
    }

    // Método transferePara
    public void transferePara(Conta destino, float valor) {
        this.saque(valor);
        destino.deposito(valor);
    }

    // Método toString
    @Override
    public String toString() {
        return "Titular: " + titular + ", Numero da Conta: " + numeroConta + ", Saldo: " + saldo + ", Status: "
                + status;
    }
}

// Classe ContaCorrente
public class ContaCorrente extends Conta {
    // Construtor
    public ContaCorrente(String titular, String numeroConta, String numeroAgencia, float saldo) {
        super(titular, numeroConta, numeroAgencia, saldo);
    }
}

// Classe ContaPoupanca
public class ContaPoupanca extends Conta {
    // Construtor
    public ContaPoupanca(String titular, String numeroConta, String numeroAgencia, float saldo) {
        super(titular, numeroConta, numeroAgencia, saldo);
        this.percentual = 1.005f;
    }
}

// Classe ContaInvestimento
public class ContaInvestimento extends Conta {
    // Construtor
    public ContaInvestimento(String titular, String numeroConta, String numeroAgencia, float saldo) {
        super(titular, numeroConta, numeroAgencia, saldo);
        this.percentual = 1.01f;
    }
}

// Classe TestaConta
public class TestaConta {
    public static void main(String[] args) {
        // Criando instâncias das contas
        Conta conta = new Conta("João", "12345", "001", 1000);
        ContaCorrente contaCorrente = new ContaCorrente("Maria", "67890", "002", 2000);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Carlos", "13579", "003", 3000);
        ContaInvestimento contaInvestimento = new ContaInvestimento("Ana", "24680", "004", 4000);

        // Realizando movimentações nas contas
        conta.saque(500);
        contaCorrente.deposito(100);
        contaPoupanca.saque(200);
        contaInvestimento.deposito(300);

        // Imprimindo saldo das contas
        System.out.println("Saldo da conta: " + conta);
        System.out.println("Saldo da conta corrente: " + contaCorrente);
        System.out.println("Saldo da conta poupança: " + contaPoupanca);
        System.out.println("Saldo da conta de investimento: " + contaInvestimento);
    }
}
