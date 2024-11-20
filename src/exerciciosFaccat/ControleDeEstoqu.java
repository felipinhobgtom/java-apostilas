package exerciciosFaccat;
import java.util.Scanner;

public class ControleDeEstoqu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade atual de estoque de um produto");
        int atual = sc.nextInt();

        System.out.println("Digite qual é a quantidade máxima de estoque");
        int maxima = sc.nextInt();

        System.out.println("Por fim, qual a quantidade mínima de estoque.");
        int minima = sc.nextInt();

        float media = (maxima+minima)/2;

        String msg = atual >= media ? "Não efetuar compra" : "Efetuar compra.";
        System.out.println(msg);
        sc.close();
    }
}
