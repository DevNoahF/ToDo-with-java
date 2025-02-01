import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        GerenciadorMetodos gerenciadorMetodos = new GerenciadorMetodos();

        while (true) {
            System.out.println("\nGerenciadorMetodos de Tarefas");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Remover tarefa");
            System.out.println("4. Editar Tarefa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha após o número

            switch (opcao) {

                case 1:
                    System.out.print("Digite o nome da tarefa: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    System.out.println("A tarefa foi concluída? (s/n)");
                    boolean concluida = scanner.nextLine().equalsIgnoreCase("s");
                    gerenciadorMetodos.adicionarTarefa(nome, descricao, concluida);
                    break;

                case 2:
                    gerenciadorMetodos.listarTarefa();
                    break;

                case 3:
                    System.out.print("Digite o número da tarefa a ser removida: ");
                    int numeroTarefa = scanner.nextInt();
                    gerenciadorMetodos.removerTarefa(numeroTarefa - 1);
                    break;

                case 4:
                    System.out.print("Digite o número da tarefa a ser editada: ");
                    int numeroTarefaEditar = scanner.nextInt();
                    scanner.nextLine();  // Consumir a nova linha após o número
                    System.out.print("Digite op nome que voce quer usar na nomeação:  ");
                    String nomeTarefaEditar = scanner.nextLine();
                    System.out.println("Digite a nova descrição:  ");
                    String descricaoTarefaEditar = scanner.nextLine();
                    System.out.println("A tarefa foi concluída? (s/n)");
                    boolean concluidaEditar = scanner.nextLine().equalsIgnoreCase("n");
                    gerenciadorMetodos.editarTarefa(numeroTarefaEditar - 1, nomeTarefaEditar, descricaoTarefaEditar, concluidaEditar);
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}