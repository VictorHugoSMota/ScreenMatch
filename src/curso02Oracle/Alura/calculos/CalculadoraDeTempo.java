package curso02Oracle.Alura.calculos;

import curso02Oracle.Alura.alura.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f){
//        this.tempoTotal += f.getDuracaoEmMin();
//    }
//
//    public void inclui(Serie s){
//        this.tempoTotal += s.getDuracaoEmMin();
//    }

    public  void inclui(Titulo titulo){
        System.out.println();
        this.tempoTotal =+ titulo.getDuracaoEmMin();
    }
}
