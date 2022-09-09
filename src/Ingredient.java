public abstract class Ingredient implements Priceable {
    private static int count = 1;

    private int id;
    private String name;

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

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
