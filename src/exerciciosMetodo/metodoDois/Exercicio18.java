package exerciciosMetodo.metodoDois;

public class Exercicio18 {
    public float converterCelsiusParaFahrenheit(int celsius){
        float fahrenheit = (celsius * 9/5) + 32;
        return fahrenheit;
    }

    public static void main(String[] args){
        Exercicio18 obj = new Exercicio18();
        System.out.println(obj.converterCelsiusParaFahrenheit(100));
    }
}
