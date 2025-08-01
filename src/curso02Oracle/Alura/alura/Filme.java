package curso02Oracle.Alura.alura;

import curso02Oracle.Alura.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    // Construtor
    public Filme(String nome, int anoDeLancamneto) {
        super(nome, anoDeLancamneto);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}