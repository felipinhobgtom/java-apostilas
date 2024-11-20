package exerciciosManzano.para;
// Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de
// 1 até 500

public class Exercicio04 {
    public static void main(String[] args){

        int somatoria = 0;
        for(int cont = 0; cont <= 500; cont++){

            if(cont % 2 == 0){
                somatoria += cont;
                System.out.println(somatoria);
            }
        }
    }
}
