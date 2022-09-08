public class WeightedIngredient extends Ingredient implements Priceable {
    private double weight;
    private final double pricePerUnit;

    public WeightedIngredient(String name, double weight, double pricePerUnit) {
        super(name);
        this.weight = weight;
        this.pricePerUnit = pricePerUnit;
    }
    public  WeightedIngredient(WeightedIngredient weightedIngredient){
        super(weightedIngredient.getName());
        this.weight = weightedIngredient.weight;
        this.pricePerUnit = weightedIngredient.pricePerUnit;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

//    public void setPricePerUnit(double pricePerUnit) {
//        this.pricePerUnit = pricePerUnit;
//    }

    @Override
    public double getPrice() {
        return weight * (this.pricePerUnit / 1000);
    }

    @Override
    public String toString() {
        return super.toString() + " wigth-" + weight + " price-" + pricePerUnit;
    }
}
