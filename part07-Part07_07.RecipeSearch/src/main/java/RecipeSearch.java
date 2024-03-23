import java.nio.file.Paths;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("File to read: ");
        String file = scanner1.nextLine();
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            RecipeList recipeList = new RecipeList();
            String name = null;
            int cookingTime = -1;
            ArrayList<String> ingredients = new ArrayList();
            while (true) {
                String line = scanner.nextLine();

                if (name == null) {
                    name = line;
                } else if (cookingTime == -1) {
                    cookingTime = Integer.parseInt(line);
                } else if (line.isEmpty()) {
                    Recipe recipe = new Recipe(name,cookingTime,new ArrayList<>(ingredients));
                    recipeList.addRecipe(recipe);
                    name = null;
                    cookingTime = -1;
                    ingredients.clear();
                    continue;
                } else {
                    ingredients.add(line);
                }
                
                if (!scanner.hasNextLine()) {
                    Recipe recipe = new Recipe(name,cookingTime,new ArrayList<>(ingredients));
                    recipeList.addRecipe(recipe);
                    break;
                }
            }

            System.out.println("Commands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");

            while (true) {
                System.out.println("Enter command: ");
                String command = scanner1.nextLine();
                if (command.equals("stop")) {
                    break;
                } else if (command.equals("list")) {
                    recipeList.printRecipes();
                } else if (command.equals("find name")) {
                    System.out.println("Searched word: ");
                    String searchedWord = scanner1.nextLine();
                    recipeList.searchByName(searchedWord);
                } else if (command.equals("find cooking time")) {
                    System.out.println("Max cooking time: ");
                    Integer searchedTime = Integer.parseInt(scanner1.nextLine());
                    recipeList.searchByCookingTime(searchedTime);
                } else if (command.equals("find ingredient")) {
                    System.out.println("Ingredient: ");
                    String searchedIngredient = scanner1.nextLine();
                    recipeList.searchByIngredient(searchedIngredient);
                }
            } 
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
