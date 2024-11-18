package exerciciosFaccat;
import java.util.Locale;
import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome");
        String nome = sc.next();

        System.out.println("Digite sua altura em metros.");
        float altura = sc.nextFloat();

        System.out.println("Você é do sexo masculino ou feminino? \n Digite 'm' para masculino e 'f' para feminino");
        String sexo = sc.next().toLowerCase();

        float pesoIdeal = 0;

        if(sexo.equals('m')){
            pesoIdeal = (72.7f * altura) - 58;
        }else{
            pesoIdeal = (62.1f * altura) - 44.7f;
        }

        System.out.printf("%s, o seu peso ideal seria de: %.2f kg", nome, pesoIdeal);
    }
}
