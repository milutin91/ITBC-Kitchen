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
//        Database.
    }
    public Recipe(Recipe recipe) {

        this.name = recipe.getName();
        this.weightedIngredients = recipe.getWeightedIngredients();
        this.level = recipe.getLevel();
//        Database.
    }


    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public Level getLevel() {
        return level;
    }

//    public void setLevel(Level level) {
//        this.level = level;
//    }

    public ArrayList<WeightedIngredient> getWeightedIngredients() {
        return weightedIngredients;
    }

    public void addIngrediantToRecipe(WeightedIngredient weightedIngredient, double weigth){
        if(this.weightedIngredients.contains(weightedIngredient)){
            for (var el: this.weightedIngredients){
                if(el.getName().equals(weightedIngredient.getName())){
                    el.setWeight(el.getWeight() + weigth);
                }
            }
        }else{
            this.weightedIngredients.add(weightedIngredient);
            weightedIngredient.setWeight(weigth);
//        weightedIngredient.setPricePerUnit(price);
        }
    }

    public void removeIngrediantFromRecipe(WeightedIngredient weightedIngredient) {
        this.weightedIngredients.remove(weightedIngredient);
    }

    public Recipe getScaledRecipe(double percent) {
        new Recipe(this.name, this.weightedIngredients, this.level);
        for (WeightedIngredient el : this.weightedIngredients) {
            el.setWeight(percent / 100 * el.getWeight());
        }
        return new Recipe(this.name, this.weightedIngredients, this.level);
    }

    @Override
    public double getPrice() {
        double sum = 0;
        for (WeightedIngredient el : this.weightedIngredients){
            sum += el.getPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Recipe name= " + this.name + ", Level= " + this.level + ", Price= " + this.getPrice() +
                "\nIngredients of " + this.name + ":\n" + weightedIngredients;
    }
}
