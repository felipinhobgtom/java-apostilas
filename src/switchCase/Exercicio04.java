package switchCase;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma das 3 opções:\nA, B, C");
        String opcao = sc.next().toLowerCase();

        switch (opcao){
            case "a":
                System.out.println("Olá, mundo");
                break;
            case "b":
                System.out.println("Bem vindo ao Java");
                break;
            case "c":
                System.out.println("Sair do programa");
                break;
        }

        sc.close();
    }
}
