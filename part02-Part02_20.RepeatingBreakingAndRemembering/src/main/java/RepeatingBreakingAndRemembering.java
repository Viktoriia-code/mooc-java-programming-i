
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give numbers:");
        int sum = 0;
        int numbers = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }

            sum += input;
            numbers++;
            
            if (input % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + ((double)sum/numbers));
        System.out.println("Even: " + evenNumbers);
        System.out.println("Odd: " + oddNumbers);
    }
}
