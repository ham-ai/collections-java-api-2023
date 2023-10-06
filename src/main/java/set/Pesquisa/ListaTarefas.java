package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> tarefaSet;
    public ListaTarefas(){
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
            Tarefa tarefaRemovida = null;

            for (Tarefa t : tarefaSet){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaRemovida = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaRemovida);
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluida = new HashSet<>();

        for (Tarefa t : tarefaSet){
            if (t.isConcluida()){
                tarefasConcluida.add(t);
            }
        }
        return tarefasConcluida;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        for (Tarefa t : tarefaSet){
            if (!t.isConcluida()){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){

        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        Tarefa marcarPendente = null;

        for (Tarefa t : tarefaSet){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(false);
                marcarPendente = t;
                break;
            }
        }

        if (marcarPendente != null){
            if (marcarPendente.isConcluida()){
            marcarPendente.setConcluida(false);
            }
        }
        else{
            System.out.println("Tarefa não encontrada na lista.");
        }
    }

    public void limparListaTarefas(){
        if (tarefaSet.isEmpty()){
            System.out.println("A lista já está vazia!");
        }
        else{
            tarefaSet.clear();
        }
    }

    public static void main(String[] args) {
    //Criando uma instância da classe ListaTarefas
    ListaTarefas listaTarefas = new ListaTarefas();

    //Exibindo as tarefas no conjunto (vazio)
    listaTarefas.exibirTarefas();

    //Adicionando tarefas na lista de tarefas (conjunto)
    listaTarefas.adicionarTarefa("Tarefa 1");
    listaTarefas.adicionarTarefa("Tarefa 2");
    listaTarefas.adicionarTarefa("Tarefa 3");
    listaTarefas.adicionarTarefa("Tarefa 4");
    listaTarefas.adicionarTarefa("Tarefa 5");

    //Exibindo as tarefas no conjunto
    listaTarefas.exibirTarefas();


    //Marcando a tarefa como concluída
    listaTarefas.marcarTarefaConcluida("Tarefa 5");
    listaTarefas.marcarTarefaConcluida("Tarefa 2");
    listaTarefas.marcarTarefaConcluida("Tarefa 3");
    listaTarefas.marcarTarefaConcluida("tarefa 1");

    listaTarefas.exibirTarefas();

    //Marcando a tarefa como pendente
    listaTarefas.marcarTarefaPendente("tarefa 5");

    //Contando o número de tarefas
    System.out.println("Número total de tarefas no conjunto: "+listaTarefas.contarTarefas());

    //Obtendo tarefas pendentes
    System.out.println("Tarefas pendentes: "+listaTarefas.obterTarefasPendentes());

    //Obtendo tarefas concluídas no conjunto
    System.out.println("Tarefas concluídas: "+listaTarefas.obterTarefasConcluidas());

    //Removendo tarefas do conjunto
    listaTarefas.removerTarefa("tarefa 5");
    listaTarefas.removerTarefa("tarefa 2");
    listaTarefas.removerTarefa("tarefa 1");
    listaTarefas.exibirTarefas();

    //Limpando o conjunto de tarefas
    listaTarefas.limparListaTarefas();
    listaTarefas.exibirTarefas();
    }
}
