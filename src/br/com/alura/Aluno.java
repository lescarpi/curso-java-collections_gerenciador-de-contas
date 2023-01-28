package br.com.alura;

public class Aluno {

    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula) {
        if (nome == null) {
            throw new NullPointerException("Nome não pode ser nulo!");
        }
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public boolean equals(Object obj) {
        Aluno outro = (Aluno) obj;
        return this.nome.equals(((Aluno) obj).nome);
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }

    public String toString() {
        return String.format("[Aluno %s, número de matrícula: %d]", nome, numeroMatricula);
    }

}
