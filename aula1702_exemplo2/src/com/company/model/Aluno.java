package com.company.model;

public class Aluno {
    //atributos
    private int ra;
    private String nome;
    private String email;
    private String curso;

    //construtor gerado
    public Aluno(int ra, String nome, String email, String curso) {
        this.ra = ra;
        this.nome = nome;
        this.email = email;
        this.curso = curso;
    }

    public Aluno(int ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public Aluno(){

    }

    //gerando getter and setter


    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n"
                + "Email: " + email + "\n"
                + "Curso: " + curso + "\n"
                + "RA: " + ra + "\n";
    }

    public void matricular(){
        System.out.println("Aluno de RA " + ra);
        System.out.println("foi matriculado com SUCESSO");
    }

    public void cancelarMatricula(){
        System.out.println("O aluno " + nome + " teve a matrícula cancelada");
    }
}
