package br.com.alura;

public class Aluno {

    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String toString() {
        return String.format("[O aluno %s tem %d anos]", nome, idade);
    }

}
