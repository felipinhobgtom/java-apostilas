package exerciciosMetodo.metodoUm;

public class Exercicio10 {
    public float mediaAluno(float nota1, float nota2, float nota3){
        float media = (nota1+nota2+nota3)/3;
        return media;
    }

    public static void main(String[] args){
        Exercicio10 obj = new Exercicio10();

        System.out.println(obj.mediaAluno(6,6,6));
    }
}
