package main.java.set.OperacoesBasicas;

import java.util.Objects;

public class Palavras {
    private String palavra;

    public Palavras(String nome) {
        this.palavra = nome;
    }

    public String getPalavra() {
        return palavra;
    }

    @Override
    public boolean equals(Object p) {
        if (this == p) return true;
        if (!(p instanceof Palavras palavras)) return false;
        return Objects.equals(getPalavra(), palavras.getPalavra());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPalavra());
    }

    @Override
    public String toString() {
        return "Palavras{" +
                "palavra='" + palavra + '\'' +
                '}';
    }
}
