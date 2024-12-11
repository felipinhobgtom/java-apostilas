package exerciciosMetodo.metodoDois;

public class Exercicio16 {
    public boolean ehPrimo(int numero){
        if(numero <= 1){
            return false;
        }

        for(int cont = 2; cont <= Math.sqrt(numero); cont++){
            if(numero % cont == 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        Exercicio16 obj = new Exercicio16();
        System.out.println(obj.ehPrimo(6));
    }
}
