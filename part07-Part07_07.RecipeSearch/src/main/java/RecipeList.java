import java.util.ArrayList;

public class RecipeList {
    private ArrayList<Recipe> recipes;
    
    public RecipeList() {
        this.recipes = new ArrayList<>();
    }
    
    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }
    
    public void printRecipes() {
        for (Recipe recipe: this.recipes) {
            System.out.println(recipe);
        }
    }
    
    public void searchByName(String name){
        System.out.println("Recipes:");
        for (Recipe recipe: this.recipes) {
            if (recipe.getName().contains(name)) {
                System.out.println(recipe);
            }
        }
    }
    
    public void searchByCookingTime(int time) {
        System.out.println("Recipes:");
        for (Recipe recipe: this.recipes) {
            if (recipe.getTime() <= time) {
                System.out.println(recipe);
            }
        }
    }
    
    public void searchByIngredient(String ingredient) {
        System.out.println("Recipes:");
        for (Recipe recipe: this.recipes) {
            System.out.println(recipe.getIngredients());
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
}
