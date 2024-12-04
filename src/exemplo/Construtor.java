package exemplo;

public class Construtor {

    private int numero;

    public Construtor(int x) {
        this.numero = x;
    }

    public static void main(String[] args) {
        Construtor exemplo = new Construtor(12);
        System.out.println("Número digitado: " + exemplo.numero);

    }
}
