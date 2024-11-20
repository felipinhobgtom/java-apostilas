package exerciciosManzano.para;
//Apresentar todos os valores numéricos inteiros ímpares situados na faixa de 0 a 20. Para verificar
//se o número é ímpar, efetuar dentro da malha a verificação lógica desta condição com a instrução
//, perguntando se o número é ímpar; sendo, mostre-o; não sendo, passe para o próximo passo.

public class Exercicio05 {
    public static void main(String[] args){
        for(int cont = 0; cont <= 20; cont++){
            if(cont % 2 != 0){
                System.out.println(cont);
            }
        }
    }
}
