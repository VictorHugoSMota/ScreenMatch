package curso02Oracle.Alura.alura;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacao;
    private int duracaoEmMin;

    public Titulo(String nome, int anoDeLancamneto) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamneto;
    }

    // Criando Construtores
    public String toString(){
        return this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }

    // METODO ACESSOR
    public int getTotalAvaliacao(){
        return totalAvaliacao;
    }

    public void setNome(String nome, int anoDeLancamneto) {
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

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
