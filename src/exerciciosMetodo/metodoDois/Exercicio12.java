package exerciciosMetodo.metodoDois;

public class Exercicio12 {
    public float imprimirQuadrado(int num){
        float quadrado = (float) Math.pow(num, 2);
        return quadrado;
    }

    public static void main(String[] args){
        Exercicio12 obj = new Exercicio12();
        System.out.println(obj.imprimirQuadrado(5));
    }
}
