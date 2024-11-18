package exemplo;

public class ItemSubItem {
    public static void main(String[] args) {
        //

        for (int item = 1; item <= 2; item++) {
            System.out.printf("Item %d : %n", item);

            for (int subItem = 1; subItem <= 4; subItem++) {
                System.out.printf(" Sub-item: %d. %n", subItem);
            }
        }
    }
}
