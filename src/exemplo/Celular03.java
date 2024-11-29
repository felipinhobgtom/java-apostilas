package exemplo;

public class Celular03 {

    String marca = "Samsung";
    String modelo = "Galaxy Note 10";
    String nomeFabricante = "Samsung";
    int ano = 2019;
    float preco = 2900f;
    float tamanhoTela = 6.3f;
    int idCelular = 1;

    public static void main(String[] args){
        Celular03 xiaomo = new Celular03();
        Celular03 samsungo = new Celular03();
        // Criação de dois objetos utilizando a mesma classe.

        xiaomo.marca = "Xiaomi";
        xiaomo.modelo = "Redmi Note 12";
        xiaomo.nomeFabricante = "Xiaomi";
        xiaomo.ano = 2023;
        xiaomo.preco = 2300f;
        xiaomo.tamanhoTela = 6.79f;
        xiaomo.idCelular = 2;

        samsungo.marca= "Samsung";
        samsungo.modelo= "Galaxy Note 10";
        samsungo.nomeFabricante = "Samsung";
        samsungo.ano = 2019;
        samsungo.preco=2900f;
        samsungo.tamanhoTela=6.3f;
        samsungo.idCelular=1;
    }
}
