package exerciciosFaccat;

import java.util.Scanner;

public class MaiorDosTresNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        do {
            System.out.println("Digite o primeiro número");
            num1 = sc.nextInt();

            System.out.println("Digite o segundo número");
            num2 = sc.nextInt();

            System.out.println("Digite o terceiro número");
            num3 = sc.nextInt();

            if (num1 == num2 || num2 == num3 || num1 == num3) {
                System.out.println("Não pode repetir os números");
            }

        } while (num1 == num2 || num2 == num3 || num1 == num3);

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.printf("O número %d é o maior.", num1);
            } else {
                System.out.printf("O número %d é o maior.", num3);
            }
        }else if(num2 > num3){
            System.out.printf("O número %d é o maior.", num2);
        }else{
            System.out.printf("O número %d é o maior.", num3);
        }

        sc.close();
    }
}
