package exerciciosManzano.para;
//Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100).

public class Exercicio03 {
    public static void main(String[] args){

        int somatoria = 0;

        for(int cont = 0; cont <= 100; cont++) {
            somatoria += cont;
            System.out.println(somatoria);
        }
    }
}
