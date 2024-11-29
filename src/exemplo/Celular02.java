package exemplo;

public class Celular02 {

    String marca = "Samsung";
    String modelo = "Galaxy Note 10";
    String nomeFabricante = "Samsung";
    int ano = 2019;
    float preco = 2.900f;
    float tamanhoTela = 6.3f;
    int idCelular = 1;

    public static void main(String[] args){
        Celular02 samsungo = new Celular02();

        // Reatribuição de valores de objetos

        samsungo.marca = "Xiaomi";
        samsungo.modelo = "Redmi Note 12";
        samsungo.nomeFabricante = "Xiaomi";
        samsungo.ano = 2023;
        samsungo.preco = 2300f;
        samsungo.tamanhoTela = 6.79f;
        samsungo.idCelular = 2;
    }
}
