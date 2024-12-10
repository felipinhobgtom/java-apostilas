package javaDesktop;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaDesktop3 {

    JavaDesktop3() {
        Frame frame = new Frame("Sistema de farmácia");
        MenuBar menubar = new MenuBar();

        Menu menu = new Menu("Produtos");
        Menu submenu = new Menu("Sub-menu");

        Menu menu2 = new Menu("Vendas");
        Menu submenu2 = new Menu("Sub-menu 2");

        MenuItem item1 = new MenuItem("Cadastro de produtos");
        MenuItem item2 = new MenuItem("Consulta de produtos");
        MenuItem item3 = new MenuItem("Controle de estoque");
        MenuItem item4 = new MenuItem("Promoções");
        MenuItem item5 = new MenuItem("Importação de produtos");

        MenuItem item6 = new MenuItem("Realizar vendas");
        MenuItem item7 = new MenuItem("Pesquisa de vendas");
        MenuItem item8 = new MenuItem("Histórico de vendas");
        MenuItem item9 = new MenuItem("Controle de devoluções");

        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        menu.add(item4);
        menu.add(item5);

        menu2.add(item6);
        menu2.add(item7);
        menu2.add(item8);
        menu2.add(item9);

        menubar.add(menu);
        menubar.add(menu2);

        frame.setMenuBar(menubar);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        new JavaDesktop3();
    }
}
