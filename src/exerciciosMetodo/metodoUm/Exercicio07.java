package exerciciosMetodo.metodoUm;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio07 {
    public String obterData(){
        Date data = new Date();
        SimpleDateFormat formatadorDia = new SimpleDateFormat("dd");
        SimpleDateFormat formatadorMes = new SimpleDateFormat("MM");
        SimpleDateFormat formatadorAno = new SimpleDateFormat("yyyy");

        String dia = formatadorDia.format(data);
        String mes = formatadorMes.format(data);
        String ano = formatadorAno.format(data);

        return dia + "/" + mes + "/" + ano;
    }

    public static void main(String[] args){
        Exercicio07 obj = new Exercicio07();
        System.out.println(obj.obterData());
    }
}
