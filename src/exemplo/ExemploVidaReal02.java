package exemplo;

public class ExemploVidaReal02 {

    public void acelerar(){
        System.out.println("Estou indo na maior velocidade possível!");
    }

    public void velocidadeMaxima(int max){
        System.out.printf("A velocidade máxima é: %dkm/h", max);
    }

    public static void main(String[] args){
        ExemploVidaReal02 carro = new ExemploVidaReal02();

        carro.acelerar();
        carro.velocidadeMaxima(180);
    }
}
