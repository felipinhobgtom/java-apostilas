package exemplo;

public class ExemploMetodo01 {
    public static void mensagem(){
        System.out.println("Pressionado o botão - 3");
        System.out.println("Navegação GPS");
    }

    public static void main(String[] args){
        mensagem();
        mensagem02();
        mensagem();
    }

    public static void mensagem02(){
        System.out.println("Pressionado o botão - 2");
        System.out.println("Rádio - FM");
    }
}
