package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class TesteCurso {

    public static void main(String[] args) {

        Curso javaCollections = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaCollections.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaCollections.adiciona(new Aula("Criando uma Aula", 20));
        javaCollections.adiciona(new Aula("Modelando com Coleções", 22));

        List<Aula> aulasImutaveis = javaCollections.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulasMutaveis = new ArrayList<>(javaCollections.getAulas() );

        System.out.println(javaCollections);

    }

}
