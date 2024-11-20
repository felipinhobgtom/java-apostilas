package exerciciosFaccat;
import java.util.Scanner;

public class SalarioNovoComissai {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o seu salário fixo");
        float salarioFixo = sc.nextFloat();

        System.out.println("Digite qual foi o seu total de vendas.");
        float totalVendas = sc.nextFloat();

        float salarioNovo = 0;

        if(totalVendas <= 1500){
            salarioNovo = salarioFixo + (totalVendas * 1.03f);
        }else{
            salarioNovo = salarioFixo + (totalVendas * 1.05f);
        }

        System.out.printf("O seu novo salário é de: R$%.2f", salarioNovo);
    }
}
