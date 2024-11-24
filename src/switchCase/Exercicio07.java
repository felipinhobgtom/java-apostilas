package switchCase;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu salário");
        float salario = sc.nextFloat();
        float imposto = 0;

        switch ((int) (salario / 1500)) {
            case 0:
                imposto = salario * 0.05f;
                break;
            case 1:
                if (salario <= 3000) {
                    imposto = salario * 0.10f;
                    break;
                }
            default:
                imposto = salario * 0.15f;
                break;
        }

        System.out.printf("o imposto a ser pago é: R$%.2f", imposto);
        sc.close();
    }
}
