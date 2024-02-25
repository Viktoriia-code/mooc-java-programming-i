
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int strings = 0;
        
        while (true) {
            String userString = scanner.nextLine();
            if (userString.equals("end")) {
                break;
            }
            
            strings += 1;
        }
        
        System.out.println(strings);
    }
}
