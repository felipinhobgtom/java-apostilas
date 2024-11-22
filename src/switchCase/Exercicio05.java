package switchCase;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma nota de 0-10.");
        int nota = sc.nextInt();

        switch (nota) {
            case 0:
            case 1:
            case 2:
                System.out.println("Grade: F");
                break;
            case 3:
            case 4:
                System.out.println("Grade: D");
                break;
            case 5:
            case 6:
                System.out.println("Grade: C");
                break;
            case 7:
            case 8:
                System.out.println("Grade: B");
                break;
            case 9:
            case 10:
                System.out.println("Grade: A");
                break;
            default:
                System.out.println("Nota inválida");
                break;
        }

        sc.close();
    }
}
