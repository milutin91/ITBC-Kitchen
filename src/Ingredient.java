public abstract class Ingredient implements Priceable {
    private static int count = 1;

    private final int id;
    private final String name;

    public Ingredient(String name) {
        this.id = count++;
        this.name = name;
    }
    public Ingredient(Ingredient ingredient){
        this.id = ingredient.id;
        this.name = ingredient.name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
