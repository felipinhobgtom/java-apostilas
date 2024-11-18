package switchCase;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = 0;

        do {
            System.out.println("Digite a sua idade,");
            idade = sc.nextInt();

            if (idade < 0) {
                System.out.println("Idade inválida.");
            }
        } while (idade < 0);

        switch (idade) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("É uma criança");
                break;
        }

        sc.close();
    }
}
