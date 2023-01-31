package br.com.alura;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate copaDoMundo = LocalDate.of(2026, Month.JULY, 10);

        Period periodo = Period.between(now, copaDoMundo);
        System.out.format("Faltam %d anos, %d meses e %d dias para a copa.%n", periodo.getYears(), periodo.getMonths(), periodo.getDays());

        LocalDate proximaCopa = copaDoMundo.plusYears(4);
        System.out.println(proximaCopa);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String valorFormatado = proximaCopa.format(formatador);
        System.out.println(valorFormatado);

    }

}
