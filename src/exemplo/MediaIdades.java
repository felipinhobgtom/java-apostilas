package exemplo;

public class MediaIdades {
    public static void main(String[] args){
        int idades[] = {1,2,3,4,5,6,7,8,9,10,20,30,40,50,60,70,80,90};

        float media,somatorio = 0;
        int qntd = idades.length;

        for(int idade : idades){
            somatorio += idade;
        }

        media = somatorio / qntd;

        System.out.println("A média das idades é: " + media);
    }
}
