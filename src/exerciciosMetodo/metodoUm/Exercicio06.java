package exerciciosMetodo.metodoUm;

public class Exercicio06 {
    public boolean verificador(int num){
        return num % 2 == 0;
    }

    public static void main(String[] args){
        Exercicio06 obj = new Exercicio06();
        System.out.println(obj.verificador(2));
    }
}
