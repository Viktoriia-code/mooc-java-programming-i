
import java.util.Scanner;

public class NumberAndSumOfNumbers {

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
            
            summa = summa + number;
            numbers = numbers + 1;
        }
        System.out.println("Number of numbers: " + numbers);
        System.out.println("Sum of the numbers: " + summa);
    }
}
