public class WeightedIngredient extends Ingredient implements Priceable {
    private double weightRecipe;
    private double weigthFridge;
    private final double pricePerUnit;

    public WeightedIngredient(String name, double weightRecipe, double pricePerUnit) {
        super(name);
        this.weightRecipe = weightRecipe;
        this.pricePerUnit = pricePerUnit;

        Database.dbAllIngrediants.add(this);
    }

    public double getWeigthFridge() {
        return weigthFridge;
    }

    public void setWeigthFridge(double weigthFridge) {
        this.weigthFridge = weigthFridge;
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
        return weightRecipe * (this.pricePerUnit / 1000);
    }

    @Override
    public String toString() {
        return super.toString() + " - weigth fridge- " + weigthFridge + " - weigth recipe- " + weightRecipe + "g(whole product)\n";
    }
}
