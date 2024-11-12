package hospital;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RepositorioPaciente repo = new RepositorioPaciente();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Adicionar Paciente");
            System.out.println("2. Atualizar Paciente");
            System.out.println("3. Excluir Paciente");
            System.out.println("4. Listar Pacientes");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consumir nova linha
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Peso: ");
                    double peso = scanner.nextDouble();
                    System.out.print("Altura: ");
                    double altura = scanner.nextDouble();
                    System.out.print("Sexo (1 para Masculino, 2 para Feminino): ");
                    int sexo = scanner.nextInt();

                    Paciente paciente = new Paciente(id, nome, peso, altura, sexo);
                    repo.adicionarPaciente(paciente);
                    break;

                case 2:
                    System.out.print("ID do paciente a atualizar: ");
                    int idUpdate = scanner.nextInt();
                    scanner.nextLine(); // Consumir nova linha
                    System.out.print("Novo nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Novo peso: ");
                    double novoPeso = scanner.nextDouble();
                    System.out.print("Nova altura: ");
                    double novaAltura = scanner.nextDouble();
                    System.out.print("Novo sexo (1 para Masculino, 2 para Feminino): ");
                    int novoSexo = scanner.nextInt();

                    repo.atualizarPaciente(idUpdate, novoNome, novoPeso, novaAltura, novoSexo);
                    break;

                case 3:
                    System.out.print("ID do paciente a excluir: ");
                    int idRemove = scanner.nextInt();
                    repo.excluirPaciente(idRemove);
                    break;

                case 4:
                    repo.listarPacientes();
                    break;

                case 5:
                    System.out.println("Encerrando o sistema...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
