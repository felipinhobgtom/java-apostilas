package exerciciosMetodo.metodoUm;

public class Exercicio08 {
    public float calcularFatorial(int num){

        if(num<0){
            throw new IllegalArgumentException("O número deve ser positivo.");
        }

        int fatorial = 1;
        for(int cont = 1; cont <= num; cont++){
            fatorial *= cont;
        }

        return fatorial;
    }

    public static void main(String[] args){
        Exercicio08 obj = new Exercicio08();

        System.out.println(obj.calcularFatorial(4));
    }
}
