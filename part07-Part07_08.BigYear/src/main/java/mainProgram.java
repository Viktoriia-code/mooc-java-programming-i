
import java.util.Scanner;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdsList birdsList = new BirdsList();
        
        while (true) {
            System.out.println("?");
            String command = scan.nextLine().toLowerCase();
            
            if (command.equals("quit")) {
                break;
            }
            
            if (command.equals("add")) {
                System.out.println("Name: ");
                String name = scan.nextLine();
                System.out.println("Name in Latin: ");
                String nameLatin = scan.nextLine();
                Bird bird = new Bird(name, nameLatin);
                birdsList.addBird(bird);
            } else if (command.equals("all")) {
                birdsList.printBirds();
            } else if (command.equals("one")) {
                System.out.println("Bird?");
                String name = scan.nextLine();
                birdsList.searchByName(name);
            } else if (command.equals("observation")) {
                System.out.println("Bird?");
                String name = scan.nextLine();
                birdsList.addObservation(name);
            }
        }
    }

}
