import java.util.*;

public class Recipe implements Priceable {
    private final String name;
    public final ArrayList<WeightedIngredient> weightedIngredients = new ArrayList<>();
    private final Level level;

    public Recipe(String name, Level level) {

        this.name = name;
        this.level = level;
        Database.dbAllRecipes.add(this);
    }

    public String getName() {
        return name;
    }

    public Level getLevel() {
        return level;
    }

    //TODO Solve problem with changing recipe weight!
    public void addIngrediantToRecipe(WeightedIngredient weightedIngredient, double weight){
        if(this.weightedIngredients.contains(weightedIngredient)){
            for (var el: this.weightedIngredients){
                if(el.getName().equals(weightedIngredient.getName())){
                    el.setWeightRecipe(el.getWeightRecipe() + weight);
                }
            }
        }else{
            this.weightedIngredients.add(weightedIngredient);
            weightedIngredient.setWeightRecipe(weight);
        }
    }

    //TODO Implement when weight problem is solved!
    public Recipe createScaledRecipe(double percent) {
        for (WeightedIngredient el : this.weightedIngredients) {
            el.setWeightRecipe(Math.round((percent / 100 * el.getWeightRecipe()) * 100) / 100.0);
        }
        if(Database.scaledRecipes.contains(this)){
            System.out.println("Alredy exist!");
        }else{
            Database.scaledRecipes.add(this);
        }
        return new Recipe(this.name, this.level);
    }

    @Override
    public double getPrice() {
        double sum = 0;
        for (WeightedIngredient el : this.weightedIngredients){
            sum += el.getPrice();
        }
        return Math.round(sum * 100) / 100.0;
    }

    @Override
    public String toString() {
        return "Recipe name= " + this.name + ", Level= " + this.level + ", Price= " + this.getPrice() +
                "\nIngredients of " + this.name + ":\n" + this.weightedIngredients;
    }
}
