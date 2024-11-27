package exemplo;
import java.util.Scanner;

public class CondicaoEmMetodos {

    static void verificarIdade(int idade){
        if(idade < 18){
            System.out.println("Acesso negado - você não possui idade o suficiente");
        }else{
            System.out.println("Acesso garantido - você possui a idade necessária");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = sc.nextInt();

        verificarIdade(idade);

        sc.close();
    }
}
