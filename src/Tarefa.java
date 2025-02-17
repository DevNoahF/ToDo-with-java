public class Tarefa {

    private String nome;
    private String descricao;
    private boolean concluida;

    public Tarefa() {
    }


    public Tarefa(String nome, String descricao, boolean concluida) {
        this.nome = nome;
        this.descricao = descricao;
        this.concluida = concluida;
    }

    public Tarefa(String nome) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "Tarefa:  " +
                " nome: " + nome +
                " | descricao: " + descricao +
                " | concluida: " + concluida ;
    }



}
