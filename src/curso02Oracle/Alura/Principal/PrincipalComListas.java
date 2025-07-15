package curso02Oracle.Alura.Principal;

import curso02Oracle.Alura.alura.Filme;
import curso02Oracle.Alura.alura.Serie;
import curso02Oracle.Alura.alura.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meufilme1 = new Filme("O poderoso Chefão", 1970);
        meufilme1.avalia(8);
        Filme meufilme2 = new Filme("Avatar",2023);
        meufilme2.avalia(6);
        var filmeDoPaulo = new Filme("DogVille", 2003);
        filmeDoPaulo.avalia(7);
        Serie lost = new Serie("lost",2000);

        Filme f1 = filmeDoPaulo;

        ArrayList<Titulo> Lista = new ArrayList<>();
        Lista.add(filmeDoPaulo);
        Lista.add(meufilme1);
        Lista.add(meufilme2);
        Lista.add(lost);

        for (Titulo item: Lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenaão");
        System.out.println(buscaPorArtista);

        Collections.sort(Lista);
        System.out.println("Lista de titulos ordenados: ");
        System.out.println(Lista);
        Lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: ");
        System.out.println(Lista);
    }
}
