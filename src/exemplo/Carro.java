package exemplo;

public class Carro {
    public int idCarro;
    public String nome;
    public String marca;


    Carro(int _idCarro, String _nome, String _marca) {
        this.idCarro = _idCarro;
        this.nome = _nome;
        this.marca = _marca;
    }

    public void info() {
        System.out.println("Id do carro" + this.idCarro);
        System.out.println("Nome do carro: " + this.nome);
        System.out.println("Marca do carro: " + this.marca);
    }
}