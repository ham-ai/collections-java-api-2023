package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<Palavras> palavrasSet;

    public ConjuntoPalavrasUnicas(){
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasSet.add(new Palavras(palavra));
    }

    public void removerPalavras(String palavra){
        Palavras palavrasRemover = null;

        for (Palavras p : palavrasSet){
            if(p.getPalavra() == palavra){
                palavrasRemover = p;
                break;
            }
        }
        palavrasSet.remove(palavrasRemover);
    }

    public void verificarPalavra(String palavra){
        for (Palavras p : palavrasSet){
            if(Objects.equals(p.getPalavra(), palavra)){
                System.out.println("A palavra '"+p.getPalavra()+"' está no conjunto!");
            }
            else{
                System.out.println("A palavra '"+palavra+"' que você procura não está nesse conjunto!");
            }
            break;
        }
    }

    public void exibirPalavras(){
        System.out.println(palavrasSet);
    }

    public static void main(String[] args) {
        //cria uma instância da classe Conjunto Palavras Unicas
        ConjuntoPalavrasUnicas conjuntoPalavras = new ConjuntoPalavrasUnicas();

        //Adicionando palavras ao conjunto
        conjuntoPalavras.adicionarPalavra("teste 1");
        conjuntoPalavras.adicionarPalavra("teste 2");
        conjuntoPalavras.adicionarPalavra("teste 3");
        conjuntoPalavras.adicionarPalavra("teste 4");
        conjuntoPalavras.adicionarPalavra("teste 5");

        //Removendo palavras do conjunto
        conjuntoPalavras.removerPalavras("teste 5");

        //Verificando palavras do conjunto
        conjuntoPalavras.verificarPalavra("teste 5");

        //Exibindo as palavras do conjunto
        conjuntoPalavras.exibirPalavras();

    }


}
