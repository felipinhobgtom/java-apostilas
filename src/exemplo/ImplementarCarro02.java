package exemplo;

public class ImplementarCarro02 {
    public static void main(String[] args) {
        Carro02 golzin = new Carro02();

        System.out.println(golzin.nome);
        System.out.println(golzin.marca);
        System.out.println(golzin.preco);

        Carro02 polo = new Carro02();
        polo.nome = "Polo";
        polo.marca = "Volkswagen";
        polo.preco = 92000f;

        String teste = String.valueOf(polo.preco);
        System.out.println(teste);
    }
}