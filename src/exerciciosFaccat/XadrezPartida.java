package exerciciosFaccat;
import java.util.Scanner;

public class XadrezPartida {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite que horas a partida de xadrez começou");
        int inicio = sc.nextInt();

        System.out.println("Digite quando essa partida acabou.");
        int fim = sc.nextInt();

        int duracao = inicio-fim;

        if(duracao == 0 || duracao == 24){
            System.out.println("A duração máxima é de 1 dia.");
        }else{
            System.out.printf("Sua partida durou %d horas.",duracao);
        }
    }
}
