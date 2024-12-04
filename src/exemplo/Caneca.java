package exemplo;

public class Caneca {
    float preco;
    int capacidade;

    public Caneca() {
        preco = 10.5f;
        capacidade = 350;
    }

    public static void main(String[] args){
        Caneca caneca = new Caneca();

        System.out.println(caneca.capacidade);
        System.out.println(caneca.preco);
    }
}