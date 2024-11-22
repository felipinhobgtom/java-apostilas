package exemplo;

public class ArrayMultidimensional03 {
    public static void main(String[] args) {
        int numeros[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};

        for (int i = 0; i < numeros[0].length; i++) {
            for (int c = 0; c < numeros[1].length; c++) {
                System.out.println(numeros[i][c]);
            }
        }
    }
}
