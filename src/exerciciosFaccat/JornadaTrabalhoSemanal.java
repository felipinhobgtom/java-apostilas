package exerciciosFaccat;
import java.util.Scanner;

public class JornadaTrabalhoSemanal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int jornadatrabalho = 160;
        System.out.println("Digite quantas horas trabalhou no mês");
        int mes = sc.nextInt();

        System.out.println("Digite quanto recebe de salário por hora.");
        float salariohora = sc.nextInt();

        if(mes > jornadatrabalho){
            float horaextra = mes-jornadatrabalho;
            float salarioextra = horaextra*salariohora*1.5f;

            System.out.println("Salário com horas extras: R$"+(jornadatrabalho*salariohora)+salarioextra);
        }else{
            System.out.println("Salário sem horas extras: R$" + mes*salariohora);
        }

        sc.close();
    }
}
