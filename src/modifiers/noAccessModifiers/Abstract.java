package modifiers.noAccessModifiers;

abstract class Abstract {
    public String name = "John";
    public String lname = "Doe";
    public String email = "John@Doe";
    public int age = 24;

    public abstract void estudar();
}

class Estudante extends Abstract {
    public int graduacao = 2020;

    public void estudar() {
        System.out.println("Estudando o dia todo.");
    }
}
