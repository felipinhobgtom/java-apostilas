package exemplo;

public class ArrayMultidimensional02 {
    public static void main(String[] args){
        int numeros[][] = {{1,2,3,4},{5,6,7}};
        System.out.println(numeros[1][1]);

        numeros[1][1] = 12;
        System.out.println(numeros[1][1]);
    }
}