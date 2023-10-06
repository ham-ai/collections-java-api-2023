package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){

        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();

        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        //Criando uma instância da classe AgendaContatos
        AgendaContatos agendaContatos = new AgendaContatos();

        //Exibindo os contatos no conjunto (deve estar vazio)
        agendaContatos.exibirContatos();

        //Adicionando contatos à agenda
        agendaContatos.adicionarContato("João", 3334);
        agendaContatos.adicionarContato("Clara", 1243);
        agendaContatos.adicionarContato("Carlos", 9521);
        agendaContatos.adicionarContato("Joana", 4020);
        agendaContatos.adicionarContato("Maria", 5837);
        agendaContatos.adicionarContato("Marcos", 2649);
        agendaContatos.adicionarContato("Maria Fernanda", 2109);
        agendaContatos.adicionarContato("Maria Paula", 3315);
        agendaContatos.adicionarContato("Maria Clara", 6549);
        agendaContatos.adicionarContato("Maria", 70215);

        //Exibindo contatos na agenda
        agendaContatos.exibirContatos();

        //Pesquisando contatos pelo nome
         System.out.println(agendaContatos.pesquisarPorNome("Maria"));

        //Atualizando o número de um contato
        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Marcos", 48653);
        System.out.println("Contato atualizado: " + contatoAtualizado);

        //Exibindo os contatos atualizados na agenda
        System.out.println("Contatos atualizados na agenda após atualização: ");
        agendaContatos.exibirContatos();

    }

}
