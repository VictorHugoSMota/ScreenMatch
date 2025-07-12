package curso02Oracle.Alura.alura;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int MinutosPorEpisodios;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodios() {
        return MinutosPorEpisodios;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.MinutosPorEpisodios = minutosPorEpisodios;
    }

    @Override
    public int getDuracaoEmMin() {
        return temporadas * episodiosPorTemporada * MinutosPorEpisodios;
    }
}
