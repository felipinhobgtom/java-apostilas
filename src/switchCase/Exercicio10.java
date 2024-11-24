package switchCase;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para fazer seu fatorial.");
        int numero = sc.nextInt();

        if(numero < 0){
            System.out.println("Número negativo.");
        }else{
            int resultado = 1;

            for(int cont = 1; cont <= numero; cont++){
                switch(cont > 0 ? 1 : 0){
                    case 1:
                        resultado *= cont;
                        break;
                    default:
                        break;
                }
            }

            System.out.printf("O fatorial de %d é %d", numero, resultado);
        }

        sc.close();
    }
}
