package javaDesktop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JavaDesktopGPT extends JFrame {

    // Componentes
    private JTextField campoUsuario;
    private JPasswordField campoSenha;
    private JButton botaoLogin;

    public JavaDesktopGPT() {
        // Definindo o título da janela
        setTitle("Tela de Login");

        // Configuração da janela
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela

        // Layout do painel
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(3, 2, 10, 10)); // Layout de grid

        // Criando os componentes
        JLabel labelUsuario = new JLabel("Usuário:");
        campoUsuario = new JTextField();

        JLabel labelSenha = new JLabel("Senha:");
        campoSenha = new JPasswordField();

        botaoLogin = new JButton("Login");

        // Adicionando componentes ao painel
        painel.add(labelUsuario);
        painel.add(campoUsuario);
        painel.add(labelSenha);
        painel.add(campoSenha);
        painel.add(botaoLogin);

        // Adicionando o painel à janela
        add(painel, BorderLayout.CENTER);

        // Ação do botão de login
        botaoLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                String senha = new String(campoSenha.getPassword());

                if (usuario.equals("admin") && senha.equals("1234")) {
                    JOptionPane.showMessageDialog(JavaDesktopGPT.this, "Login bem-sucedido!");
                    // Aqui você pode abrir outra tela ou realizar outra ação
                } else {
                    JOptionPane.showMessageDialog(JavaDesktopGPT.this, "Usuário ou senha inválidos.");
                }
            }
        });
    }

    public static void main(String[] args) {
        // Criar a tela de login
        JavaDesktopGPT tela = new JavaDesktopGPT();
        tela.setVisible(true);
    }
}
