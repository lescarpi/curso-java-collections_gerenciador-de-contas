package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteListaDeAula {

    public static void main(String[] args) {

        Aula a1 = new Aula("Revisando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de objetos", 17);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        List<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);

        System.out.println("Ordenação por ordem alfabética dos títulos");
        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println("Ordenação por tempo");
        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);

    }

}
