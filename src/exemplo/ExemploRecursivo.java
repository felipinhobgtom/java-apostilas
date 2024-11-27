package exemplo;

public class ExemploRecursivo {
    public static void main(String[] args) {
        int fatorialSum = soma(10);
        System.out.println(fatorialSum);
    }

    public static int soma(int max) {
        if (max > 0) {
            return max + soma(max - 1);

        }else{
            return 0;
        }
    }
}
