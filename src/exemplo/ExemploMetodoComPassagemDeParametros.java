package exemplo;

public class ExemploMetodoComPassagemDeParametros {

    static void nomeFilho(String name, int idade){

        System.out.printf("O nome do filho é: %s, sua idade atual é: %d %n",name, idade);
    }

    public static void main(String[] args){
        nomeFilho("Jailson", 39);
        nomeFilho("Luiz", 18);
    }
}
