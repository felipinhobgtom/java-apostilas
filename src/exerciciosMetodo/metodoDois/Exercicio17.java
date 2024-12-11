package exerciciosMetodo.metodoDois;

public class Exercicio17 {
    public int gerarNumeroAleatorio(){
        int random = (int) (Math.random() * 99) + 1;
        return random;
    }

    public static void main(String[] args){
        Exercicio17 obj = new Exercicio17();
        System.out.println(obj.gerarNumeroAleatorio());
    }
}
