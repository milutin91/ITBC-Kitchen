import java.util.*;

public class Recipe implements Priceable {
    private final String name;
    public final ArrayList<WeightedIngredient> weightedIngredients;
    private final Level level;



    public Recipe(String name, ArrayList<WeightedIngredient> weightedIngredients, Level level) {

        this.name = name;
        this.weightedIngredients = weightedIngredients;
        this.level = level;
        Database.dbAllRecipes.add(this);
    }
//    public Recipe(Recipe recipe) {
//
//        this.name = recipe.getName();
//        this.weightedIngredients = recipe.getWeightedIngredients();
//        this.level = recipe.getLevel();
//    }


    public String getName() {
        return name;
    }

    public Level getLevel() {
        return level;
    }

    public ArrayList<WeightedIngredient> getWeightedIngredients() {
        return weightedIngredients;
    }

    public void addIngrediantToRecipe(WeightedIngredient weightedIngredient, double weigth){
        if(this.weightedIngredients.contains(weightedIngredient)){
            for (var el: this.weightedIngredients){
                if(el.getName().equals(weightedIngredient.getName())){
                    el.setWeightRecipe(el.getWeightRecipe() + weigth);
                }
            }
        }else{
            this.weightedIngredients.add(weightedIngredient);
            weightedIngredient.setWeightRecipe(weigth);
        }
    }

    public void removeIngrediantFromRecipe(WeightedIngredient weightedIngredient) {
        this.weightedIngredients.remove(weightedIngredient);
    }

    public Recipe getScaledRecipe(double percent) {
        new Recipe(this.name, this.weightedIngredients, this.level);
        for (WeightedIngredient el : this.weightedIngredients) {
            el.setWeightRecipe(percent / 100 * el.getWeightRecipe());
        }
        return new Recipe(this.name, this.weightedIngredients, this.level);
    }

    @Override
    public double getPrice() {
        double sum = 0;
        for (WeightedIngredient el : this.weightedIngredients){
            sum += el.getPrice();
        }
        return Math.round(sum * 100) / 100.0;
//        return sum;
    }

    @Override
    public String toString() {
        return "Recipe name= " + this.name + ", Level= " + this.level + ", Price= " + this.getPrice() +
                "\nIngredients of " + this.name + ":\n" + this.weightedIngredients;
    }
}
