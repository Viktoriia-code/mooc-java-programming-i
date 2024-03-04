
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        
        while (true) {
            String identifier = scanner.nextLine();
            if (identifier.equals("")) {
                break;
            }
            
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            Item item = new Item(name, identifier);
            if (!items.contains(item)) {
                items.add(item);
            }
        }
        
        System.out.println("==Items==");
        for (Object item : items) {
            System.out.println(item);
        }
    }
}
