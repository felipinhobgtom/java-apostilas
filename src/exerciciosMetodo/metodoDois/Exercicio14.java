package exerciciosMetodo.metodoDois;

public class Exercicio14 {
    public double areaCirculo(float raio){
        double area = Math.PI*Math.pow(raio, 2);
        return area;
    }

    public static void main(String[] args){
        Exercicio14 obj = new Exercicio14();
        System.out.printf("A área do seu círculo é: %.2f ", obj.areaCirculo(3));
    }
}
