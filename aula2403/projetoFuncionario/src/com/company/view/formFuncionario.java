package com.company.view;

import com.company.Funcionario;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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

    public formFuncionario() {
        btnProcurar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(listaFuncionario.size()>0){
                    int proc = Integer.parseInt(txtMatricula.getText());
                    Funcionario f = buscarFuncionarioNaLista(proc);
                    txtMatricula.setText(Integer.toString(proc));
                    txtNome.setText(f.getNome());
                    txtEmail.setText(f.getEmail());
                    txtSetor.setText(f.getSetor());
                    txtSalario.setText(Double.toString(f.getSalario()));
                }
            }
        });
        btnSalvar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int proc = Integer.parseInt(txtMatricula.getText());
                Funcionario f = buscarFuncionarioNaLista(proc);
                if(f==null){
                    f = new Funcionario();
                    manterFuncionario(f);
                    listaFuncionario.add(f);
                    JOptionPane.showMessageDialog(null,
                            "Cadastrado com sucesso",
                            "Funcionario",
                            JOptionPane.INFORMATION_MESSAGE);
                }else{
                    manterFuncionario(f);
                    JOptionPane.showMessageDialog(null,
                            "Funcionário alterado com sucesso",
                            "Funcionario",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                limparFormulario();
            }
        });
        btnListar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Dados dos Funcionários: \n\n");
                for (Funcionario f : listaFuncionario){
                    sb.append(f.toString());
                }
                JOptionPane.showMessageDialog(null,
                        sb.toString(),
                        "Funcionários",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    private void manterFuncionario(Funcionario f) {
        f.setMatricula(Integer.parseInt(txtMatricula.getText()));
        f.setNome(txtNome.getText());
        f.setEmail(txtEmail.getText());
        f.setSetor(txtSetor.getText());
        f.setSalario(Double.parseDouble(txtSalario.getText()));
    }

    private Funcionario buscarFuncionarioNaLista(int proc) {
        for(Funcionario f : listaFuncionario){
            if(f.getMatricula()==proc){
                return f;
            }
        }
        return null;
    }

    private void limparFormulario() {
        txtMatricula.setText("");
        txtNome.setText("");
        txtSetor.setText("");
        txtSalario.setText("");
        txtEmail.setText("");
        txtMatricula.requestFocus();
    }

    public JPanel getFuncionarioPanel() {
        return funcionarioPanel;
    }
}
