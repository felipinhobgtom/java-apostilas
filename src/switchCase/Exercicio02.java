package switchCase;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        float num1 = sc.nextFloat();

        System.out.println("Digite o segundo número");
        float num2 = sc.nextFloat();

        System.out.println("Agora, digite o operador matemático:\n+, -, *, /");
        var operador = sc.next();

        switch (operador) {
            case "*":
                System.out.println("A multiplicação dos dois números é: " + (num1 * num2));
                break;
            case "+":
                System.out.println("A soma dos dois números é: " + (num1 + num2));
                break;
            case "-":
                System.out.println("A subtração dos dois números é: " + (num1 - num2));
                break;
            case "/":
                System.out.println("A divisão dos dois números é: " + (num1 / num2));
                break;
            default:
                System.out.println("Não corresponde a nenhum dos operadores");
                break;
        }

        sc.close();
    }
}
