package exemplo;

public class ExemploContinue {
    public static void main(String[] args){
        for(int cont = 0; cont < 10; cont++){
            if(cont < 4){
                continue;
            }
            System.out.println(cont);
        }
    }
}
