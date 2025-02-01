public interface MetodosInterface {

    public void listarTarefa();


    public void adicionarTarefa(String nome);

    public void removerTarefa(int index);

    public void editarTarefa(int index, String nome, String descricao, boolean concluida);


    public void adicionarTarefa(String nome, String descricao, boolean concluida);
}
