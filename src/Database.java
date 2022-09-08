import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Database {
    public List<Recipe> dbAllRecipes = new LinkedList<>();

    public List<WeightedIngredient> dbAllIngrediants = new LinkedList<>();

    public Database() {

    }

    public void addToRecipesDB (Recipe recipe){
        if(dbAllRecipes.contains(recipe)){
            System.out.println(recipe.getName() + " Alredy exist");
        }else {
            dbAllRecipes.add(recipe);
        }
    }

    public void addToWIngrediantsDB (WeightedIngredient weightedIngredient){
        if(dbAllIngrediants.contains(weightedIngredient)){
            System.out.println(weightedIngredient.getName() + " Alredy exist");
        }else {
            dbAllIngrediants.add(weightedIngredient);
        }
    }

    public List<Recipe> getDbAllRecipes() {
        return dbAllRecipes;
    }

    public void setDbAllRecipes(List<Recipe> dbAllRecipes) {
        this.dbAllRecipes = dbAllRecipes;
    }

    @Override
    public String toString() {
        return "Database{" +
                "dbAllRecipes=" + dbAllRecipes +
                "\n\n, dbAllIngrediants=" + dbAllIngrediants +
                '}';
    }
}
