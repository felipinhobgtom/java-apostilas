package exemplo;

public class ExemploBreak {
    public static void main(String[] args){

        for(int cont = 0; cont < 10; cont++){
            if(cont == 4){
                break;
            }
            System.out.println(cont);
        }
    }
}