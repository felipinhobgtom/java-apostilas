package exerciciosMetodo.metodoUm;

import java.util.Scanner;

public class Exercicio05 {
    public int maiorNumero(int num1, int num2) {
        if (num1 < num2) {
            return num2;
        } else {
            return num1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exercicio05 obj = new Exercicio05();

        System.out.println("Digite o primeiro número");
        int numero1 = sc.nextInt();

        System.out.println("Digite o primeiro número");
        int numero2 = sc.nextInt();

        System.out.println("O maior número é o: "+obj.maiorNumero(numero1, numero2));
    }
}
