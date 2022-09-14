public class WeightedIngredient extends Ingredient implements Priceable {
    private double weightRecipe;
    private double weightFridge;
    private final double pricePerUnit;

    public WeightedIngredient(String name, double pricePerUnit) {
        super(name);
        this.pricePerUnit = pricePerUnit;
        Database.dbAllIngrediants.add(this);
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

    @Override
    public double getPrice() {
        return Math.round((weightRecipe * this.pricePerUnit) * 100) / 100.0;
    }

    @Override
    public String toString() {
        return super.toString() + " - weigth fridge- " + weightFridge + " - weigth recipe- " + weightRecipe + "g(whole product)\n";
    }
}
