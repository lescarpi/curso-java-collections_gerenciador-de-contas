package br.com.alura;

public class TestaCursoComAluno {

    public static void main(String[] args) {

        Curso curso = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
        curso.adiciona(new Aula("Criando uma Aula", 20));
        curso.adiciona(new Aula("Modelando com Coleções", 22));

        Aluno a1 = new Aluno("Vinicius de Lima Garcia", 35741);
        curso.matricula(a1);
        curso.matricula(new Aluno("Gabriel Jesus de Oliveira", 69234));
        curso.matricula(new Aluno("Lucas Vequetini", 91845));
        curso.matricula(new Aluno("Matheus Rizzo", 10432));

        Aluno a2 = new Aluno("Vinicius de Lima Garcia", 35741);
        System.out.println(curso.isMatriculado(a2));
        System.out.println(a1.equals(a2));

    }

}
