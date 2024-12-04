package exerciciosMetodo.metodoUm;

import java.util.Scanner;

public class Exercicio04 {
    public static void multiplicar(int num1, int num2){
        float produto = num1*num2;
        System.out.println(produto);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int numero1 = sc.nextInt();

        System.out.println("Digite o segundo número");
        int numero2 = sc.nextInt();

        multiplicar(numero1, numero2);
    }
}
