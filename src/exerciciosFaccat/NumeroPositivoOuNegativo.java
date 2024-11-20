package exerciciosFaccat;
import java.util.Scanner;

public class NumeroPositivoOuNegativo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = sc.nextInt();

        String msg = numero < 0 ? "Esse número é negativo." : "Esse número é positivo.";

        System.out.println(msg);
        sc.close();
    }
}
