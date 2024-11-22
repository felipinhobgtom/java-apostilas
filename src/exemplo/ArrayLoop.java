package exemplo;

public class ArrayLoop {
    public static void main(String[] args){
        String[] veiculos = {"Fusca", "Moto"};

        for(int cont = 0; cont < veiculos.length; cont++){
            System.out.println(veiculos[cont]);
        }

        System.out.println(veiculos.length + " veículos estão em minha garagem");
    }
}
