package br.com.alura;

import java.nio.charset.Charset;
import java.util.*;

public class TesteVelocidadeSetList {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        Set<String> set = new HashSet<>();

        // Adicionando Strings aleatórias dentro de Set e List
        for (int i = 0; i < 10000; i++) {
            String str = geraStringAleatoria();
            lista.add(str);
            set.add(str);
        }

        // Gera String aleatória e verifica se a lista a contém
        long tempoInicial = System.currentTimeMillis(); // Marca o tempo inicial
        for (int i = 0; i < 100000; i++) {
            lista.contains(geraStringAleatoria());
        }
        long tempoFinal = System.currentTimeMillis(); // Marca o tempo final
        long tempoDecorrido = tempoFinal - tempoInicial;
        System.out.format("O tempo da lista para fazer 100 mil verificações dentre 10000 objetos foi %d millisegundos.%n", tempoDecorrido);

        // Gera String aleatória e verifica se o set a contém
        int iguais = 0;
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            if (set.contains(geraStringAleatoria())) {
                iguais++;
            }
        }
        tempoFinal = System.currentTimeMillis();
        tempoDecorrido = tempoFinal - tempoInicial;
        System.out.format("O tempo do set para fazer 100 mil verificações dentre 10000 objetos foi %d millisegundos.%n", tempoDecorrido);

        // Por curiosidade quantas String aleatórias de 5 caracteres eram iguais
        System.out.println(iguais + " Strings iguais");

    }

    public static String geraStringAleatoria() {
        int limiteEsquerda = 97; // letra 'a'
        int limiteDireita = 122; // letra 'z'
        int tamanhoString = 5;
        Random random = new Random();

        return random.ints(limiteEsquerda, limiteDireita + 1)
                .limit(tamanhoString)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

}
