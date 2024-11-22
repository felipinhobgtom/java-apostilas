package exemplo;

public class ArrayNomes {
    public static void main(String[] args) {
        String[] nome = {"João", "Pedro", "Matheus", "Carlos"};
        String[] sobrenome = {"Henrique", "Chaves", "Silva", "Santos"};

        int[] idades = {1,2,3,4,5,6,7,8,9};

        for(int i:idades){
            System.out.println(i);
        }

        System.out.println(nome[1] + " " + sobrenome[0]);
    }
}
