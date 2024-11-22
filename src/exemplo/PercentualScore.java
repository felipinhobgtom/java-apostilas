package exemplo;

public class PercentualScore {
    public static void main(String[] args) {
        int pontuacaoMaxima = 500;
        int pontuacaoAtual = 423;

        float percentual = (float) pontuacaoAtual / pontuacaoMaxima * 100.0f;

        System.out.println("Seu percentual foi de: " + percentual + "%");
    }
}
