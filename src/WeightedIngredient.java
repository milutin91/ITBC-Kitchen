import java.util.Objects;

public class WeightedIngredient extends Ingredient implements Priceable {
    private double weightRecipe;
    private double weightFridge;
    private final double pricePerUnit;
    public WeightedIngredient(String name, double pricePerUnit) {
        super(name);
        this.pricePerUnit = pricePerUnit;
        int count = 0;
        for(var el: Database.dbAllIngrediants.values()){
            if(Objects.equals(el.getName(), super.getName())){
                count++;
            };
        }
        if(count == 0){
            Database.dbAllIngrediants.put(super.getId(),this);
        }
    }

    public double getWeightFridge() {
        return weightFridge;
    }

    public void setWeightFridge(double weightFridge) {
        this.weightFridge = weightFridge;
    }

    public double getWeightRecipe() {
        return weightRecipe;
    }

    public void setWeightRecipe(double weightRecipe) {
        this.weightRecipe = weightRecipe;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
    public double scaleWI(Double scale){
        double temp = 0;
        temp = Math.round((scale / 100 * this.getWeightRecipe()) * 100) / 100.0;
        return temp;
    }

    @Override
    public double getPrice() {
        return Math.round((weightRecipe * this.pricePerUnit) * 100) / 100.0;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + weightRecipe + "g/WHL\n";
    }
}
