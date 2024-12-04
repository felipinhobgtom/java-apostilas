package modifiers.modifiersAtributosMetodosConstrutores;

public class Person {
    protected String fname = "Don";
    protected String lname = "Hidalgo";
    protected String email = "Don@Hidalgo.com";
    protected int age = 68;
}

class Student extends Person {
    private int anoGraduacao = 2030;

    public static void main(String[] args) {
        Student estudante = new Student();

        System.out.println(estudante.fname + estudante.lname);
        System.out.println(estudante.email);
        System.out.println(estudante.age);
        System.out.println(estudante.anoGraduacao);
    }
}