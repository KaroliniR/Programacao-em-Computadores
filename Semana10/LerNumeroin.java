import java.util.*;

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

    public void aumentarSalario(double porcentagem) {
        salario += salario * porcentagem / 100.0;
    }

    @Override
    public String toString() {
        return id + ", " + nome + ", " + String.format("%.2f", salario);
    }
}

public class LerNumeroin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionários serão registrados? ");
        int N = sc.nextInt();

        List<Funcionario> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            System.out.println();
            System.out.println("Funcionário #" + (i + 1) + ":");

            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.println("Id já existente! Tente novamente:");
                id = sc.nextInt();
            }

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Salário: ");
            double salario = sc.nextDouble();

            Funcionario emp = new Funcionario(id, nome, salario);

            list.add(emp);
        }

        System.out.println();
        System.out.print("Digite o id do funcionário que terá aumento de salário : ");
        int idsalary = sc.nextInt();

        Integer pos = position(list, idsalary);

        if (pos == null) {
            System.out.println("Este id não existe!");
        } else {
            System.out.print("Digite a porcentagem de aumento: ");
            double percent = sc.nextDouble();
            list.get(pos).aumentarSalario(percent);
        }

        System.out.println();
        System.out.println("Lista de funcionários:");
        for (Funcionario emp : list) {
            System.out.println(emp);
        }

        sc.close();
    }

    public static Integer position(List<Funcionario> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Funcionario> list, int id) {
        Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
