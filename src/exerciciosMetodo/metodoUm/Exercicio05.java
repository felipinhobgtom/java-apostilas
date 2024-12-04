package exerciciosMetodo.metodoUm;

import java.util.Scanner;

public class Exercicio05 {
    public static void maiorNumero(int num1, int num2) {
        if (num1 < num2) {
            System.out.println(num2 + " é o maior número");
        } else {
            System.out.println(num1 + " é o maior número");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int numero1 = sc.nextInt();

        System.out.println("Digite o primeiro número");
        int numero2 = sc.nextInt();

        maiorNumero(numero1, numero2);
    }
}
