package exerciciosMetodo.metodoUm;

public class Exercicio09 {
    public String concatenarString(String texto1, String texto2){
        return texto1+texto2;
    }

    public static void main(String[] args){
        Exercicio09 obj = new Exercicio09();

        System.out.println(obj.concatenarString("bosta", "mole"));
    }
}
