package com.company;



import com.company.model.Aluno;

import java.util.Scanner;

public class GerenciarEscola {

    public static void main(String[] args) {
	    // precisamos cadastrar dois alunos
        //matricular estes dois alunos
        //cancelar a matricula do segundo
        Scanner input = new Scanner(System.in);
        Aluno aluno1, aluno2;
        aluno1 = new Aluno();
        aluno2 = new Aluno();
        entrarDados(input, aluno1);
        entrarDados(input, aluno2);
        //mostrar os dois alunos
        System.out.println(aluno1);
        System.out.println();
        System.out.println(aluno2);
    }

    private static void entrarDados(Scanner input, Aluno aluno) {
        System.out.println("Digite o RA do aluno: ");
        aluno.setRa(Integer.parseInt(input.nextLine()));
        System.out.println("Digite o nome do aluno: ");
        aluno.setNome(input.nextLine());
        System.out.println("Digite o email do aluno: ");
        aluno.setEmail(input.nextLine());
        System.out.println("Digite o curso do aluno: ");
        aluno.setCurso(input.nextLine());
    }
}
