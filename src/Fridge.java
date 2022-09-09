import java.util.*;

public class Fridge {
    private final LinkedList<WeightedIngredient> weightedIngredients;

    public Fridge(LinkedList<WeightedIngredient> weightedIngredients) {
        this.weightedIngredients = weightedIngredients;
    }
//    public Fridge(){
//
//    }


    public LinkedList<WeightedIngredient> getWeightedIngredients() {
        return weightedIngredients;
    }

    public void addToFridge(WeightedIngredient weightedIngredient, double weigth) {
        if (this.weightedIngredients.contains(weightedIngredient)) {
            for (var el : this.weightedIngredients) {
                if (el == weightedIngredient) {
                    weightedIngredient.setWeight(weightedIngredient.getWeight() + weigth);
                }
            }
//            for (int key : this.weightedIngredientHashMap.keySet()){
//                if (key == weightedIngredient.getId()){
//                    weightedIngredient.setWeight(weightedIngredient.getWeight() + weigth);
//                }
//            }
        } else {
            this.weightedIngredients.add(weightedIngredient);
//            for(int key : this.weightedIngredientHashMap.keySet()){
//                if(key == weightedIngredient.getId())
            weightedIngredient.setWeight(weigth);
//            }
//            weightedIngredient.setWeight(weigth);
        }
    }

    public void addToFridge() {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (var el : Database.dbAllIngrediants) {
            count++;
            System.out.println(count + ". " + el.getName());
        }
        int choice = sc.nextInt();
        for (var el : Database.dbAllIngrediants) {
            if (choice == el.getId()) {
                System.out.println("Weight?");
                addToFridge(el, sc.nextInt());
            }
        }
    }

    public void removeFromFridge(WeightedIngredient weightedIngredient, double weigth) {
        if (this.weightedIngredients.contains(weightedIngredient)) {
//            for (int key : this.weightedIngredientHashMap.keySet()) {
//                if (key == weightedIngredient.getId()) {
//                    if (weigth > weightedIngredient.getWeight()) {
//                        this.weightedIngredientHashMap.remove(weightedIngredient.getId());
//                    } else {
//                        weightedIngredient.setWeight(weightedIngredient.getWeight() - weigth);
//                    }
//                }
//            }
            if (weigth >= weightedIngredient.getWeight()) {
                this.weightedIngredients.remove(weightedIngredient);
                System.out.println("Ingrediant " + weightedIngredient.getName() + " removed");
            } else {
                weightedIngredient.setWeight(weightedIngredient.getWeight() - weigth);
            }
        } else {
            System.out.println("Alredy doesnt exist in fridge");
        }
    }
    public void removeFromFridge(){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (var el : this.weightedIngredients) {
            count++;
            System.out.println(count + ". " + el.getName());
        }
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
        for (WeightedIngredient elRecipe : recipe.weightedIngredientHashMap.values()) {
            for (WeightedIngredient elFridge : weightedIngredients) {
                if (Objects.equals(elRecipe.getName(), elFridge.getName())) {
                    if (elRecipe.getWeight() > elFridge.getWeight()) {
                        checkWeigth++;
                    }
                    countIngrediants++;
                }
            }
        }
        return countIngrediants == recipe.weightedIngredientHashMap.size() && checkWeigth == 0;
    }

    public void makeMeal(Recipe recipe) {
        if (this.canMakeMeal(recipe)) {
            for (WeightedIngredient elFridge : this.weightedIngredients) {
                for (WeightedIngredient elRecipe : recipe.weightedIngredientHashMap.values()) {
                    if (Objects.equals(elFridge.getName(), elRecipe.getName())) {
                        this.removeFromFridge(elFridge, elRecipe.getWeight());
                    }
                }
            }
            System.out.println("Meal made successfully");
        } else {
            System.out.println("Cant make this meal");
        }
    }

    public int ingrediantsNumber() {
        return this.weightedIngredients.size();
    }


    public void printIngrediantsFridge() {
        if (this.weightedIngredients.isEmpty()) {
            System.out.println("Fridge is empty");
        } else {
            int count = 0;
            for (var el : this.weightedIngredients) {
                count++;
                System.out.println(count + ". " + el.getName());
            }
        }
    }

    @Override
    public String toString() {
        if (this.weightedIngredients.isEmpty()) {
            return "Fridge is empty";

        } else {
            return "Fridge ingrediants\n" + this.weightedIngredients + "\n";
        }
    }
}
