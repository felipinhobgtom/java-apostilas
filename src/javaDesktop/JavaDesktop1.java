package javaDesktop;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaDesktop1 extends Frame {

    JavaDesktop1() {
        Button botao = new Button("Me clique!");

        botao.setBounds(50,100,80,30);
        add(botao);

        setSize(300,300);
        setTitle("Exemplo de Java AWT");

        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
    }


    public static void main(String[] args){
        JavaDesktop1 frame = new JavaDesktop1();
    }
}