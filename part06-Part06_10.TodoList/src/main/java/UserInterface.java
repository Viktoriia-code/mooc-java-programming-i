import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.print("To add: ");
                String task = scanner.nextLine();
                this.todoList.add(task);
            } else if (command.equals("list")) {
                this.todoList.print();
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int number = Integer.parseInt(scanner.nextLine());
                this.todoList.remove(number);
            }
        }
    }
}
