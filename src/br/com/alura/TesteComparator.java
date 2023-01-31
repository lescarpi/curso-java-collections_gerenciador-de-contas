package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteComparator {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("banana");
        lista.add("maca");
        lista.add("uva");
        lista.add("jabuticaba");
        System.out.println(lista);

        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(String::length));
        System.out.println(lista);

        lista.forEach(System.out::println);

        lista.replaceAll(s -> {
            String primeira = s.substring(0, 1);
            String resto = s.substring(1);
            return primeira.toUpperCase().concat(resto);
        });
        System.out.println(lista);

    }

}
