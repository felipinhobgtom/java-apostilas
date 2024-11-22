package switchCase;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Restaurante: escolha sua bebiba:\n1-Café\n2-Chá\n3-Suco\n4-Refrigerante.");
        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println("O café será entregue.");
                break;
            case 2:
                System.out.println("O chá será entregue.");
                break;
            case 3:
                System.out.println("O suco será entregue.");
                break;
            case 4:
                System.out.println("O refrigerante será entregue.");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        sc.close();
    }
}
