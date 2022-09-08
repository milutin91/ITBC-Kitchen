import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Database {
    public static List<Recipe> dbAllRecipes = new LinkedList<>();

    public static List<WeightedIngredient> dbAllIngrediants = new LinkedList<>();

    public Database() {

    }

    public void addToRecipesDB(Recipe recipe) {
        int count = 0;
        for (var el : dbAllRecipes) {
            if (el.getName().equals(recipe.getName())) {
                count++;
            }
        }
        if (count == 0) {
            dbAllRecipes.add(recipe);
        } else {
            System.out.println(recipe.getName() + " alredy exsist");
        }
    }

    public void addToWIngrediantsDB(WeightedIngredient weightedIngredient) {
        int count = 0;
        for (var el : dbAllIngrediants) {
            if (el.getName().equals(weightedIngredient.getName())) {
                count++;
            }
        }
        if (count == 0) {
            dbAllIngrediants.add(weightedIngredient);
        } else {
            System.out.println(weightedIngredient.getName() + " alredy exsist");
        }
    }

    @Override
    public String toString() {
        return "Database{" +
                "dbAllRecipes=" + dbAllRecipes +
                "\n\n, dbAllIngrediants=" + dbAllIngrediants +
                '}';
    }
}
