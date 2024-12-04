package modifiers.noAccessModifiers;

public class Second {
    public static void main(String[] args) {
        Estudante aluno = new Estudante();

        System.out.println(aluno.name + " " + aluno.lname);
        System.out.println(aluno.age + " anos");
        System.out.println(aluno.email);
        System.out.println("Será graduado em: " + aluno.graduacao);
        aluno.estudar();
    }
}