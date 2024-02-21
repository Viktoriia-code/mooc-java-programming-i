
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int summa = 0;
        int numbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }
            
            if (number > 0) {
                summa = summa + number;
                numbers = numbers + 1;
            }
        }
        if (summa > 0) {
            System.out.println((double)summa/numbers);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
