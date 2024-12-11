package exerciciosMetodo.metodoDois;

public class Exercicio19 {
    public StringBuilder inverterString(String texto){
        StringBuilder invert = new StringBuilder();
        invert.append(texto);
        invert.reverse();
        return invert;
    }

    public static void main(String[] args){
        Exercicio19 obj = new Exercicio19();
        System.out.println(obj.inverterString("Teste"));
    }
}
