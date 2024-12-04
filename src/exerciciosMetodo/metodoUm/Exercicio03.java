package exerciciosMetodo.metodoUm;

import java.util.Scanner;

public class Exercicio03 {
    public static void somar(int num1, int num2) {
        int soma = num1 + num2;
        System.out.println(soma);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número.");
        int numero1 = sc.nextInt();

        System.out.println("Digite o segundo número");
        int numero2 = sc.nextInt();

        somar(numero1, numero2);
    }
}
