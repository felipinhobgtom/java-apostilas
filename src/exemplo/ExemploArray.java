package exemplo;

public class ExemploArray {
    public static void main(String[] args) {
        String[] carros = {"Volkswagen", "Fiat", "Toyota"};

        for (String cont:
             carros) {
            System.out.println(cont);
        }

        carros[2] = "Mitsubishi";

        String[] nomes = {"Carlos", "Jailson", "Júlio", "Davi"};
        System.out.println(carros.length + " carros na minha garagem");
        System.out.println(nomes.length + " pessoas no Senac.");
        System.out.println(carros[2]);
    }
}