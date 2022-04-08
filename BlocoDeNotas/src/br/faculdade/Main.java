package br.faculdade;

import br.faculdade.view.MyNotepad;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JFrame tela = new JFrame("Meu Bloco de Notas");
        tela.setContentPane(new MyNotepad().getFrmPanel());
        tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        tela.setSize(500,500);
        tela.setVisible(true);
    }
}
