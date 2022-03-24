package com.company.view;

import com.company.Funcionario;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class formFuncionario {
    private JPanel funcionarioPanel;
    private JTextField txtMatricula;
    private JButton btnProcurar;
    private JTextField txtNome;
    private JTextField txtSetor;
    private JTextField txtSalario;
    private JTextField txtEmail;
    private JButton btnBonificar;
    private JButton btnInativar;
    private JButton btnListar;
    private JButton btnSalvar;
    private List<Funcionario> listaFuncionario =
            new ArrayList<>();

    public JPanel getFuncionarioPanel() {
        return funcionarioPanel;
    }
}
