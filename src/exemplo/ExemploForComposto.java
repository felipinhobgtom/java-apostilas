package exemplo;

public class ExemploForComposto {
    public static void main(String[] args) {
        for (int minuto = 0; minuto <= 60; minuto++) {
            System.out.printf("%d minutos. %n",minuto);

            for(int segundo = 0; segundo <= 60; segundo++){
                System.out.printf("%d minutos, %d segundos. %n", minuto, segundo);
            }
        }
    }
}