package exemplo;

public class ExemploSobrecargaMetodo {

    static int sobrecarga(int x,int y){
        return x+y;
    }

    static float sobrecarga(float x,float y){
        return x+y;
    }

    public static void main(String[] args){
        int somaInteiro = sobrecarga(12,34);
        float somaFloat = sobrecarga(12.9f,24.333f);
        System.out.println("int: " + somaInteiro);
        System.out.println("float: " + somaFloat);
    }
}
