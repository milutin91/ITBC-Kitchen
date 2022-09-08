import java.util.HashMap;
import java.util.List;

public class Recipe implements Priceable {
    private String name;
    public HashMap<Integer, WeightedIngredient> weightedIngredientHashMap;
    private Level level;


    public Recipe(String name, HashMap<Integer, WeightedIngredient> weightedIngredientHashMap, Level level) {

        this.name = name;
        this.weightedIngredientHashMap = weightedIngredientHashMap;
        this.level = level;
        Database.dbAllRecipes.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public void addIngrediantToRecipe(WeightedIngredient weightedIngredient, double weigth){
        weightedIngredient.setWeight(weigth);
//        weightedIngredient.setPricePerUnit(price);
        this.weightedIngredientHashMap.put(weightedIngredient.getId(), new WeightedIngredient(weightedIngredient));
    }

    public void removeIngrediantFromRecipe(WeightedIngredient weightedIngredient) {
        this.weightedIngredientHashMap.remove(weightedIngredient.getId(), weightedIngredient);
    }

    public Recipe getScaledRecipe(double percent) {
        new Recipe(this.name, this.weightedIngredientHashMap, this.level);
        for (WeightedIngredient el : this.weightedIngredientHashMap.values()) {
            el.setWeight(percent / 100 * el.getWeight());
        }
        return new Recipe(this.name, this.weightedIngredientHashMap, this.level);
    }

    @Override
    public double getPrice() {
        double sum = 0;
        for (WeightedIngredient el : this.weightedIngredientHashMap.values()){
            sum += el.getPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Recipe name= " + name +
                "\nIngredients of " + name + ":\n" + weightedIngredientHashMap;
    }
}
