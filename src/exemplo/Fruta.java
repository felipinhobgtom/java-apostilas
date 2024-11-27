package exemplo;

public class Fruta {

    float preco = 2.44f;
    float peso = 1.9f;

    public static void main(String[] args) {
        Fruta banana = new Fruta();
        System.out.printf("Banana custa R$%.2f e pesa %.1fkg", banana.preco, banana.peso);
    }
}
