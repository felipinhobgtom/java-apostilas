package modifiers;

class Padrao {
    String fname = "Miguel";
    String lname = "Rivera";
    String email = "miguel@rivera.com";
    int age = 12;

    public static void main(String[] args){
        Padrao pessoa = new Padrao();

        System.out.println(pessoa.fname + pessoa.lname);
        System.out.println(pessoa.email);
        System.out.println(pessoa.age);
    }
}
