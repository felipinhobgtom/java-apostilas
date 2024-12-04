package javaDesktop;

import java.awt.*;
import java.awt.event.WindowEvent;

public class JavaDesktop2 {
    JavaDesktop2(){

        Frame frame = new Frame();
        Label label = new Label("Demitidor de funcionário");
        Button botao = new Button("Demitir funcionário");
        TextField field = new TextField("");

        label.setBounds(20, 60, 800, 30);
        field.setBounds(20,100,100,30);
        botao.setBounds(100, 100, 120, 30);

        frame.add(botao);
        frame.add(label);
        frame.add(field);

        frame.setSize(400,300);
        frame.setTitle("Funcionários");

        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        JavaDesktop2 frameObj = new JavaDesktop2();

    }
}