package switchCase;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Classificações etárias do filme:\nG\nPG\nPG-13\nR");
        var opcao = sc.next().toLowerCase();

        switch (opcao) {
            case "g":
                System.out.println("G - Classificação livre para todas idades.");
                break;
            case "pg":
                System.out.println("PG - Para maiores de 10 anos.");
                break;
            case "pg-13":
                System.out.println("PG-13 - Para maiores de 13 anos.");
                break;
            case "r":
                System.out.println("R - Para maiores de 18 anos.");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        sc.close();
    }
}
