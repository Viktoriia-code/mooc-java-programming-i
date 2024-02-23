
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        int longest = 0;
        String longestName = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            if (parts[0].length() > longest) {
                longest = parts[0].length();
                longestName = parts[0];
            }
            sum += Integer.valueOf(parts[1]);
            number += 1;
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + ((double)sum / number));

    }
}
