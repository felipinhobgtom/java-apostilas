package exemplo;

public class Celular {
    String marca, modelo, nomeFabricante;
    int ano;
    float preco, tamanhoTela;

    public static void main(String[] args){
        Celular nokia = new Celular();

        nokia.marca = "Apple";
        nokia.modelo = "Iphone 16";
        nokia.nomeFabricante = "Apple";
        nokia.ano = 2023;
        nokia.tamanhoTela = 6.12f;
        nokia.preco = 5700;

        System.out.println("A marca desse Iphone: " + nokia.marca);
        System.out.println("O modelo desse Iphone: " + nokia.modelo);
        System.out.println("O fabricante desse Iphone: " + nokia.nomeFabricante);
        System.out.println("O ano desse Iphone: " + nokia.ano);
        System.out.println("O tamanho da tela desse Iphone: " + nokia.tamanhoTela);
        System.out.println("O preço desse Iphone: " + nokia.preco);
    }
}
