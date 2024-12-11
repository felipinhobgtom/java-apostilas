package exerciciosMetodo.metodoDois;

public class Exercicio20 {
    public float calcularHipotenusa(float cateto1, float cateto2){
        float hipotenusa = (float) Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        return hipotenusa;
    }

    public static void main(String[] args){
        Exercicio20 obj = new Exercicio20();
        System.out.println(obj.calcularHipotenusa(3,4));
    }
}
