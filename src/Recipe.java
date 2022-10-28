import java.util.*;

public class Recipe implements Priceable {
    private static int count = 1;
    private final int id;
    private final String name;
    public ArrayList<WeightedIngredient> weightedIngredients;
    private final Level level;

    public Recipe(String name, Level level) {

        this.id = count++;
        this.name = name;
        this.level = level;
        Database.dbAllRecipes.put(this.id, this);
        weightedIngredients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Level getLevel() {
        return level;
    }

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
        StringBuilder builder = new StringBuilder();
        for(var el: this.weightedIngredients){
            builder.append("\t* ").append(el);
        }
        String text = builder.toString();
        return this.name + " - " + this.getPrice() + " RSD\n" +
                Decoration.returnLine(50) + "\n" + text + Decoration.returnLine(50) + "\n";
    }
}
