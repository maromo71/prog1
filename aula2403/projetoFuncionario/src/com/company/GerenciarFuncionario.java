package com.company;

import com.company.view.formFuncionario;

import javax.swing.*;

public class GerenciarFuncionario {

    public static void main(String[] args) {
        JFrame tela = new JFrame();
        tela.setContentPane(
                new formFuncionario().getFuncionarioPanel());
        tela.setSize(700, 500);
        tela.setTitle("Cadastro de Funcionários");
        tela.setDefaultCloseOperation(
                WindowConstants.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }


}
