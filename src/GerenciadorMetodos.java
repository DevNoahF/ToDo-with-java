import java.util.ArrayList;

public class GerenciadorMetodos extends Tarefa implements MetodosInterface {

    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(String nome){
        tarefas.add(new Tarefa(nome));
    }

    @Override
    public void listarTarefa() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada");
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + "-> " + tarefas.get(i));
            }
        }
    }

    @Override
    public void removerTarefa(int index){
        if (index >= 0 && index < tarefas.size()) {
            tarefas.remove(index);
            System.out.println("Tarefa removida com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    @Override
    public void editarTarefa(int index, String nome, String descricao, boolean concluida){
        if (index >= 0 && index < tarefas.size()) {
            tarefas.get(index).setNome(nome);
            tarefas.get(index).setDescricao(descricao);
            tarefas.get(index).setConcluida(concluida);
            System.out.println("Tarefa editada com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    @Override
    public void adicionarTarefa(String nome, String descricao, boolean concluida){
        tarefas.add(new Tarefa(nome, descricao, concluida));
    }


}
