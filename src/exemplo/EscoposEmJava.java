package exemplo;

public class EscoposEmJava {
    public static void main(String[] args){

        // Exemplo de escopo:
        var teste = "teste de escopo";
        if(teste.equals("teste de escopo")){ // bloco de código
            int numero = 0; // variavel sendo declarada dentro do bloco de código.

        }

        // fora do bloco de código em que a variável foi declarada, só é possivel utilizá-la no contexto em que está situada0

        System.out.println( /* numero */ ); // vai dar pau
    }
}
