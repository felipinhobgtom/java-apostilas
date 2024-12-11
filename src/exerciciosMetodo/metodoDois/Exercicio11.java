package exerciciosMetodo.metodoDois;


import java.time.LocalDateTime;

public class Exercicio11{
    public String exibirHora(){
        int hora = LocalDateTime.now().getHour();
        int minuto = LocalDateTime.now().getMinute();
        String concat = hora + ":" + minuto;
        return concat;
    }

    public static void main(String[] args){
        Exercicio11 obj = new Exercicio11();

        System.out.println(obj.exibirHora());
    }
}
