package exemplo;

public class ExemploMetodoComPassagemDeDoisParametrosComRetorno {

    static int soma(int numero, int numero1){
        return numero+numero1;
    }

    public static void main(String[] args){
        System.out.println("A soma dos dois números é: " + soma(12,45));
    }
}
