package exerciciosFaccat;
import java.util.Scanner;

public class SaldoDebitoCredito {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da conta");
        String conta = sc.next();

        System.out.println("Qual o seu saldo atual");
        float saldoHolder = sc.nextFloat();

        System.out.println("Digite quanto de débito possui.");
        float debito = sc.nextFloat();

        System.out.println("Digite quanto de crédito possui.");
        float credito = sc.nextFloat();

        float saldo = (saldoHolder - debito) + credito;

        if(saldo < 0){
            System.out.printf("Saldo negativo. R$%.2f",saldo);
        }else{
            System.out.printf("Saldo positivo. R$%.2f",saldo);
        }
    }
}
