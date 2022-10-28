import java.util.*;

public class Fridge {
    private final LinkedList<WeightedIngredient> weightedIngredients;

    public Fridge(LinkedList<WeightedIngredient> weightedIngredients) {
        this.weightedIngredients = weightedIngredients;
    }

    public void fillFridge(){
        for (var el: Database.dbAllIngrediants.values()){
            this.addToFridge(el, Math.round((Math.random() * (501)) * 100) / 100.0);
        }
    }
    public void addToFridge(WeightedIngredient weightedIngredient, double weigth) {
        if (this.weightedIngredients.contains(weightedIngredient)) {
            for (var el : this.weightedIngredients) {
                if (Objects.equals(el.getName(), weightedIngredient.getName())) {
                    el.setWeightFridge(el.getWeightFridge() + weigth);
                    break;
                }
            }
        } else {
            this.weightedIngredients.add(weightedIngredient);
            for (var el : this.weightedIngredients) {
                if (Objects.equals(el.getName(), weightedIngredient.getName())) {
                    el.setWeightFridge(el.getWeightFridge() + weigth);
                    break;
                }
            }
        }
    }

    public void addToFridge() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Choose ingredients:\n" + Decoration.returnLine(18));
        TreeMap<Integer, WeightedIngredient> sorted = new TreeMap<>();
        sorted.putAll(Database.dbAllIngrediants);
        for (Map.Entry<Integer, WeightedIngredient> entry : sorted.entrySet())
            System.out.println(" " + entry.getKey() + ". " +
                    entry.getValue().getName());
        System.out.println(Decoration.returnLine(18));
        while(!sc.hasNextInt()){
            System.out.println("Input is not valid! Enter number!");
            sc.nextLine();
        }
        int choice = sc.nextInt();
        for (Map.Entry<Integer, WeightedIngredient> entry : sorted.entrySet())
            if(entry.getKey() == choice){
                System.out.println(" Weight?\n" + Decoration.returnLine(7));
                addToFridge(entry.getValue(), sc.nextInt());
            };
    }

    public void removeFromFridge(WeightedIngredient weightedIngredient, double weigth) {
        if (this.weightedIngredients.contains(weightedIngredient)) {
            if (weigth >= weightedIngredient.getWeightFridge()) {
                this.weightedIngredients.remove(weightedIngredient);
                System.out.println(" " + weightedIngredient.getName() + " is removed!\n" + Decoration.returnLine(25) + "\n");
            } else {
                weightedIngredient.setWeightFridge(weightedIngredient.getWeightFridge() - weigth);
            }
        } else {
            System.out.println("Alredy doesnt exist in fridge");
        }
    }

    public void removeFromFridge(){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println(" Reduce weight:\n" + Decoration.returnLine(19));
        for (var el : this.weightedIngredients) {
            count++;
            System.out.println(" " + count + ". " + el.getName());
        }
        System.out.println(Decoration.returnLine(19));
        int choice = sc.nextInt();
        count = 0;
        for (int i = 0; i < weightedIngredients.size(); i++) {
            count++;
            if (count == choice) {
                System.out.println("Weight?");
                removeFromFridge(weightedIngredients.get(choice-1), sc.nextInt());
                break;
            }
        }
    }

    public boolean canMakeMeal(Recipe recipe) {
            int countIngredients = 0;
            int checkWeight = 0;
            for (WeightedIngredient elRecipe : recipe.weightedIngredients) {
                for (WeightedIngredient elFridge : this.weightedIngredients) {
                    if (elRecipe.getName().equals(elFridge.getName())) {
                        if (elRecipe.getWeightRecipe() > elFridge.getWeightFridge()) {
                            checkWeight++;
                        }
                        countIngredients++;
                    }
                }
        }
        return countIngredients == recipe.weightedIngredients.size() && checkWeight == 0;
    }

    public void makeMeal(Recipe recipe) {
        if (this.canMakeMeal(recipe)) {
            for (WeightedIngredient elFridge : this.weightedIngredients) {
                for (WeightedIngredient elRecipe : recipe.weightedIngredients) {
                    if (Objects.equals(elFridge.getName(), elRecipe.getName())) {
                        this.removeFromFridge(elFridge, elRecipe.getWeightRecipe());
                    }
                }
            }
            System.out.println("Meal made successfully! Smells delicious!\n");
        } else {
            System.out.println("Cant make this meal");
        }
    }
    public boolean canCreateScaledRecipe(Recipe recipe, double percent) {
        int countIngredients = 0;
        int checkWeight = 0;
        for (WeightedIngredient el : recipe.weightedIngredients) {
            for (WeightedIngredient elFridge: this.weightedIngredients){
                if(Objects.equals(el.getName(), elFridge.getName())){
                    if(el.scaleWI(percent) > elFridge.getWeightFridge()){
                        checkWeight++;
                    }
                    countIngredients++;
                }
            }
        }
        return countIngredients == recipe.weightedIngredients.size() && checkWeight == 0;
    }
    public void createScaledRecipe(Recipe recipe, double percent) {
            if(canCreateScaledRecipe(recipe, percent)){
                for (WeightedIngredient elFridge : this.weightedIngredients) {
                    for (WeightedIngredient elRecipe : recipe.weightedIngredients) {
                        if (Objects.equals(elFridge.getName(), elRecipe.getName())) {
                            this.removeFromFridge(elFridge, elRecipe.scaleWI(percent));
                        }
                    }
                }
                System.out.println("Meal made successfully! Smells delicious!\n");
            } else {
                System.out.println("Cant make this meal");
            }
    }

    @Override
    public String toString() {
        if (this.weightedIngredients.isEmpty()) {
            return " Fridge is empty!!!\n" + Decoration.returnLine(18);

        } else {
            StringBuilder builder = new StringBuilder();
            for(var el: this.weightedIngredients){
                builder.append(" * ").append(el.getName()).append(" --> ").append(el.getWeightFridge()).append("\n");
            }
            String text = builder.toString();
            return " Fridge ingrediants:\n" + Decoration.returnLine(30) + "\n" + text + Decoration.returnLine(30) + "\n";
        }
    }
}
