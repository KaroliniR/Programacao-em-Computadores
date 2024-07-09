import java.util.Scanner;

public class GerenciadorDisciplina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Disciplina disciplina = new Disciplina();
        disciplina.carregaDados();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1) Cadastrar um novo estudante na disciplina de Inglês");
            System.out.println("2) Alterar dados de um estudante da disciplina");
            System.out.println("3) Remover um estudante da turma de Inglês");
            System.out.println("4) Consultar um estudante");
            System.out.println("5) Listar estudantes da turma de Inglês");
            System.out.println("6) Listar estudantes com média abaixo de 6.0");
            System.out.println("7) Listar estudantes com média acima de 6.0");
            System.out.println("8) Mostrar a média da turma");
            System.out.println("9) Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Matrícula: ");
                    String matricula = scanner.nextLine();
                    System.out.print("Nota 01: ");
                    double nota01 = scanner.nextDouble();
                    System.out.print("Nota 02: ");
                    double nota02 = scanner.nextDouble();
                    Estudante novoEstudante = new Estudante(nome, cpf, matricula, nota01, nota02);
                    disciplina.insereEstudante(novoEstudante);
                    break;
                case 2:
                    System.out.print("Matrícula do estudante a alterar: ");
                    String matriculaAlterar = scanner.nextLine();
                    Estudante estudanteAlterar = disciplina.consultarEstudante(matriculaAlterar);
                    if (estudanteAlterar != null) {
                        System.out.print("Novo Nome: ");
                        estudanteAlterar.setNome(scanner.nextLine());
                        System.out.print("Novo CPF: ");
                        estudanteAlterar.setCpf(scanner.nextLine());
                        System.out.print("Nova Nota 01: ");
                        estudanteAlterar.setNota01(scanner.nextDouble());
                        System.out.print("Nova Nota 02: ");
                        estudanteAlterar.setNota02(scanner.nextDouble());
                    } else {
                        System.out.println("Estudante não encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Matrícula do estudante a remover: ");
                    String matriculaRemover = scanner.nextLine();
                    disciplina.removerEstudante(matriculaRemover);
                    break;
                case 4:
                    System.out.print("Matrícula do estudante a consultar: ");
                    String matriculaConsultar = scanner.nextLine();
                    Estudante estudanteConsultar = disciplina.consultarEstudante(matriculaConsultar);
                    if (estudanteConsultar != null) {
                        System.out.println("Nome: " + estudanteConsultar.getNome());
                        System.out.println("CPF: " + estudanteConsultar.getCpf());
                        System.out.println("Matrícula: " + estudanteConsultar.getMatricula());
                        System.out.println("Nota 01: " + estudanteConsultar.getNota01());
                        System.out.println("Nota 02: " + estudanteConsultar.getNota02());
                        System.out.println("Média: " + estudanteConsultar.calcularMedia());
                    } else {
                        System.out.println("Estudante não encontrado.");
                    }
                    break;
                case 5:
                    for (Estudante estudante : disciplina.listarEstudantes()) {
                        System.out.println(estudante.getEstudanteCSV());
                    }
                    break;
                case 6:
                    for (Estudante estudante : disciplina.listarEstudantesComMediaAbaixoDe(6.0)) {
                        System.out.println(estudante.getEstudanteCSV());
                    }
                    break;
                case 7:
                    for (Estudante estudante : disciplina.listarEstudantesComMediaAcimaDe(6.0)) {
                        System.out.println(estudante.getEstudanteCSV());
                    }
                    break;
                case 8:
                    System.out.println("Média da turma: " + disciplina.calcularMediaDaTurma());
                    break;
                case 9:
                    disciplina.gravar();
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
