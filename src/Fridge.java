import java.util.*;

public class Fridge {
    private final LinkedList<WeightedIngredient> weightedIngredients;

    public Fridge(LinkedList<WeightedIngredient> weightedIngredients) {
        this.weightedIngredients = weightedIngredients;
    }

    public LinkedList<WeightedIngredient> getWeightedIngredients() {
        return weightedIngredients;
    }

    public void addToFridge(WeightedIngredient weightedIngredient, double weigth) {
        if (this.weightedIngredients.contains(weightedIngredient)) {
            for (var el : this.weightedIngredients) {
                if (Objects.equals(el.getName(), weightedIngredient.getName())) {
                    el.setWeigthFridge(el.getWeigthFridge() + weigth);
                    break;
                }
            }
        } else {
            this.weightedIngredients.add(weightedIngredient);
            for (var el : this.weightedIngredients) {
                if (Objects.equals(el.getName(), weightedIngredient.getName())) {
                    el.setWeigthFridge(el.getWeigthFridge() + weigth);
                    break;
                }
            }
        }
    }

    public void addToFridge() {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("---------------------");
        for (var el : Database.dbAllIngrediants) {
            count++;
            System.out.println(count + ". " + el.getName());
        }
        System.out.println("---------------------");
        int choice = sc.nextInt();
        for (var el : Database.dbAllIngrediants) {
            if (choice == el.getId()) {
                System.out.println("Weight?\n-------");
                addToFridge(el, sc.nextInt());
            }
        }

    }

    public void removeFromFridge(WeightedIngredient weightedIngredient, double weigth) {
        if (this.weightedIngredients.contains(weightedIngredient)) {
            if (weigth >= weightedIngredient.getWeigthFridge()) {
                this.weightedIngredients.remove(weightedIngredient);
                System.out.println(weightedIngredient.getName() + " is removed\n-------------------------");
            } else {
                weightedIngredient.setWeigthFridge(weightedIngredient.getWeigthFridge() - weigth);
            }
        } else {
            System.out.println("Alredy doesnt exist in fridge");
        }
    }
    public void removeFromFridge(){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("---------------------");

        for (var el : this.weightedIngredients) {
            count++;
            System.out.println(count + ". " + el.getName());
        }
        System.out.println("---------------------");
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

    //
    public boolean canMakeMeal(Recipe recipe) {
        boolean flag = false;
            int countIngrediants = 0;
            int checkWeigth = 0;
            for (WeightedIngredient elRecipe : recipe.weightedIngredients) {
                for (WeightedIngredient elFridge : this.weightedIngredients) {
                    if (elRecipe.getName().equals(elFridge.getName())) {
                        if (elRecipe.getWeightRecipe() > elFridge.getWeigthFridge()) {
                            checkWeigth++;
                        }
                        countIngrediants++;
                    }
                }
        }
        return countIngrediants == recipe.weightedIngredients.size() && checkWeigth == 0;
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
            System.out.println("Meal made successfully");
        } else {
            System.out.println("Cant make this meal");
        }
    }

//    public void printIngrediantsFridge() {
//        if (this.weightedIngredients.isEmpty()) {
//            System.out.println("Fridge is empty");
//        } else {
//            int count = 0;
//            for (var el : this.weightedIngredients) {
//                count++;
//                System.out.println(count + ". " + el.getName());
//            }
//        }
//    }

    @Override
    public String toString() {
        if (this.weightedIngredients.isEmpty()) {
            return "Fridge is empty!\n----------------";

        } else {
            return "Fridge ingrediants:\n-------------------\n" + this.weightedIngredients + "\n";
        }
    }
}
