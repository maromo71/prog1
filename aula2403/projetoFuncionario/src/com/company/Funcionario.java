package com.company;

public class Funcionario {
    private int matricula;
    private String nome;
    private String setor;
    private double salario;
    private String email;
    private boolean ativo;

    public void bonificar(double valor){
        if(valor <=0){
            throw new IllegalArgumentException(
                    "Valor inválido para bonificação"
            );
        }
        salario += valor;
    }

    @Override
    public String toString() {
        return  "Matrícula: " + matricula + "\n" +
                "Nome: " + nome + "\n" +
                "Setor: " + setor + "\n" +
                "Salário: " + salario + "\n" +
                "Email: " + email + "\n";
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
