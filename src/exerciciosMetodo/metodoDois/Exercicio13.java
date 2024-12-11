package exerciciosMetodo.metodoDois;

public class Exercicio13 {
    public String calcularAreaRetangulo(float altura, float largura){
        String msg = "";
        if(altura==largura){
            msg = "Não é um retângulo, mas toma aqui a área: " + altura * largura;

        }else{
            msg = "A área do seu retângulo é: " + altura*largura;
        }
        return msg;
    }

    public static void main(String[] args){
        Exercicio13 obj = new Exercicio13();
        System.out.println(obj.calcularAreaRetangulo(15,5));
    }
}
