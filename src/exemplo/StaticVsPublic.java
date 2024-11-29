package exemplo;

public class StaticVsPublic {

    static void metodoStatic(){
        System.out.println("Métodos estáticos podem ser chamadas sem criar objetos");
    }

    public void metodoPublico(){
        System.out.println("Métodos públicos são chamados apenas criando objetos");
    }

    public static void main(String[] args){
        metodoStatic();

        StaticVsPublic objeto = new StaticVsPublic();
        objeto.metodoPublico();
    }
}
