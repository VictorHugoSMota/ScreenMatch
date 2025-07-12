package curso02Oracle.Alura.alura;

import curso02Oracle.Alura.calculos.Classificavel;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacao;
    private int duracaoEmMin;

    // METODO ACESSOR
    public int getTotalAvaliacao(){
        return totalAvaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getDuracaoEmMin() {
        return duracaoEmMin;
    }

    public void setDuracaoEmMin(int duracaoEmMin) {
        this.duracaoEmMin = duracaoEmMin;
    }

    // METODOS DE UM CLASSE
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: "+ nome);
        System.out.println("Ano de lançamneto: "+ anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacao ++;
    }
    public double pegaMedia() {
        return somaDasAvaliacoes/totalAvaliacao;
    }
}
