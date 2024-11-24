package switchCase;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha a temperatura que deseja converter.\nF - para Fahrenheit\nC - para Celsius");
        var choice = sc.next().toLowerCase();

        float celsius = 0;
        float fahrenheit = 0;

        switch (choice) {
            case "f":
                System.out.println("Digite a temperatura Celsius para virar Fahrenheit");
                celsius = sc.nextFloat();
                fahrenheit = celsius * 1.8f + 32;
                System.out.printf("Sua temperatura em fahrenheit é: %.1fFº", fahrenheit);
                break;
            case "c":
                System.out.println("Digite a temperatura em Fahrenheit para virar Celsius");
                fahrenheit = sc.nextFloat();
                celsius = (fahrenheit - 32) * 5 / 9;
                System.out.printf("Sua temperatura em celsius é: %.1fCº", celsius);
        }
        sc.close();
    }
}
