package exemplo;

public class ExemploArray04 {
    public static void main(String[] args) {
        int numero[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};

        for(int[] linha : numero){
            for(int coluna : linha){
                System.out.println(coluna);
            }
        }
    }
}