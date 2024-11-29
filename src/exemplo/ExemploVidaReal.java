package exemplo;

public class ExemploVidaReal {

    static void nota(){
        System.out.println("Todos alunos recebem nota.");
    }

    public void advertencia(String props){
        String nome = props;
        System.out.printf("O aluno %s recebeu uma advertência por mau comportamento.", nome);
    }

    public static void main(String[] args) {
        nota();

        ExemploVidaReal aluno = new ExemploVidaReal();
        aluno.advertencia("Gregory");
    }
}
