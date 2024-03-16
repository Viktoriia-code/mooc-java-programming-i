import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.simpleDictionary = dictionary;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                break;
            } else if (command.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                
                this.simpleDictionary.add(word, translation);
            } else if (command.equals("search")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                
                String translation = this.simpleDictionary.translate(word);
                if (translation == null) {
                    System.out.println("Word " + word + " was not found");
                } else {
                    System.out.println("Translation: " + translation);
                }
            } else {
                System.out.println("Unknown command");
            }
        }
        System.out.println("Bye bye!");
    }
}
