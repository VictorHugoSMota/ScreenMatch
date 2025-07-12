package curso02Oracle.Alura;

import curso02Oracle.Alura.alura.Episodio;
import curso02Oracle.Alura.alura.Filme;
import curso02Oracle.Alura.alura.Serie;
import curso02Oracle.Alura.calculos.CalculadoraDeTempo;
import curso02Oracle.Alura.calculos.FiltroRecomendacao;

public class Principal {
    public static void main(String[] args) {
        Filme meufilme1 = new Filme();
        meufilme1.setNome("O poderoso Chefão");
        meufilme1.setAnoDeLancamento(1970);
        meufilme1.setDuracaoEmMin(180);
        System.out.println("Duração do filme: " + meufilme1.getDuracaoEmMin());

        meufilme1.exibeFichaTecnica();
        meufilme1.avalia(8);
        meufilme1.avalia(5);
        meufilme1.avalia(10);
        System.out.println("Total de avaliações: "+meufilme1.getTotalAvaliacao());
        System.out.println(meufilme1.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodios((40));
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMin());

        Filme meufilme2 = new Filme();
        meufilme2.setNome("Avatar");
        meufilme2.setAnoDeLancamento(2023);
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



    }
}
