package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TesteStream {

    public static void main(String[] args) {

        List<Aula> aulas = new ArrayList<>();
        aulas.add(new Aula("Python", 45));
        aulas.add(new Aula("JavaScript", 150));
        aulas.add(new Aula("Java 8", 113));
        aulas.add(new Aula("C", 55));

        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);

        System.out.println(aulas.stream()
                .filter(a -> a.getTempo() >= 100)
                .mapToInt(a -> a.getTempo())
                .sum());

        aulas.stream()
                .filter(a -> a.getTempo() < 50)
                .findAny()
                .ifPresent(System.out::println);

        List<Aula> aulasTituloGrande = aulas.stream()
                .filter(a -> a.getTitulo().length() > 6)
                .collect(Collectors.toList());
        System.out.println(aulasTituloGrande);

    }

}
