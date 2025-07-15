package curso02Oracle.Alura.Principal;

import curso02Oracle.Alura.alura.Episodio;
import curso02Oracle.Alura.alura.Filme;
import curso02Oracle.Alura.alura.Serie;
import curso02Oracle.Alura.calculos.CalculadoraDeTempo;
import curso02Oracle.Alura.calculos.FiltroRecomendacao;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meufilme1 = new Filme("O poderoso Chefão", 1970);
// Contrutores        meufilme1.setNome("O poderoso Chefão");
// Constutores       meufilme1.setAnoDeLancamento(1970);
        meufilme1.setDuracaoEmMin(180);
        System.out.println("Duração do filme: " + meufilme1.getDuracaoEmMin());

        meufilme1.exibeFichaTecnica();
        meufilme1.avalia(8);
        meufilme1.avalia(5);
        meufilme1.avalia(10);
        System.out.println("Total de avaliações: "+meufilme1.getTotalAvaliacao());
        System.out.println(meufilme1.pegaMedia());

        Serie lost = new Serie("lost",2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodios((40));
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMin());

        Filme meufilme2 = new Filme("Avatar",2023);
        meufilme2.setDuracaoEmMin(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meufilme1);
        calculadora.inclui(meufilme2);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meufilme1);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme("DogVille", 2003);
//        filmeDoPaulo.setNome("DogVille");
//        filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.setDuracaoEmMin(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meufilme1);
        listaDeFilmes.add(meufilme2);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme da lista " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
    }
}
