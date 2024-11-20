package exerciciosManzano.para;
import java.util.Scanner;

// Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer.

public class Exercicio02 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para efetuar a tabuada.");
        int num = sc.nextInt();

        for(int cont = 1; cont <= 10; cont++){
            System.out.println(num + "x" + cont + " = " + num*cont);
        }
    }
}