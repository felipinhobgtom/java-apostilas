package exerciciosFaccat;
import java.util.Scanner;

public class CalculoComissaoSalarial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

            System.out.println("Digite seu salário fixo.");
            float salarioFixo = sc.nextFloat();

            System.out.println("Digite o valor efetuado das suas vendas");
            float vendas = sc.nextFloat();

            float comissao = 0;

            if(vendas <= 1500){
                comissao = vendas * 1.03f;
            }else{
                comissao = (vendas*1.03f)*1.05f;
            }

            System.out.printf("O salário total desse funcionário é de: R$%.2f",salarioFixo+comissao);

        sc.close();
    }
}
