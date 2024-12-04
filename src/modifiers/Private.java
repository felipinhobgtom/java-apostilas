package modifiers;

public class Private {
    private String name = "Felipe";
    private String lname = "Barros";
    private String email = "felipinhobgouveia@gmail.com";
    private int age = 17;

    public static void main(String[] args){
        Private obj = new Private();

        System.out.println(obj.name + obj.lname);
        System.out.println(obj.email);
        System.out.println(obj.age);



    }
}
