package exemplo;

public class Caneta {

    private String modelo;
    private String marca;
    private String cor;

    public Caneta(String _modelo, String _marca, String _cor){
        this.modelo = _modelo;
        this.marca = _marca;
        this.cor = _cor;
    }

    public static void main(String[] args){
        Caneta caneta = new Caneta("Esferográfica", "Bic", "Azul");
        System.out.println("Modelo: " + caneta.modelo);
        System.out.println("Marca: " + caneta.marca);
        System.out.println("Cor: " + caneta.cor);
    }
}
