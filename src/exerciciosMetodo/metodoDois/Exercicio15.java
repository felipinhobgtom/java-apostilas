package exerciciosMetodo.metodoDois;

import java.util.Scanner;

public class Exercicio15 {
    public int menorNumero(int numero1, int numero2, int numero3) {
        int menorDosNumeros = 0;
        if (numero1 < numero2 && numero1 < numero3) {
            menorDosNumeros = numero1;
        } else if (numero2 < numero1 && numero2 < numero3) {
            menorDosNumeros = numero2;
        } else if (numero3 < numero1 && numero3 < numero2) {
            menorDosNumeros = numero3;
        }
        return menorDosNumeros;
    }

    public static void main(String[] args) {
        Exercicio15 obj = new Exercicio15();
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o primeiro numero");
        int num1 = sc.nextInt();
        System.out.println("digite o segundo numero");
        int num2 = sc.nextInt();
        System.out.println("digit o tercero nimero");
        int num3 = sc.nextInt();

        System.out.println(obj.menorNumero(num1, num2, num3));
    }
}