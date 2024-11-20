package exemplo;

public class ExemploBreakWhile {
    public static void main(String[] args){
        int cont = 0;

        while(cont < 10){
            System.out.println(cont);
            cont++;
            if(cont == 4){
                break;
            }
        }
    }
}
