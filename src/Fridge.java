import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class Fridge {
    private final HashMap<Integer, WeightedIngredient> weightedIngredientHashMap;

    public Fridge(HashMap<Integer, WeightedIngredient> weightedIngredientHashMap) {
        this.weightedIngredientHashMap = weightedIngredientHashMap;
    }
//    public Fridge(){
//
//    }


    public void addToFridge(WeightedIngredient weightedIngredient, double weigth){
        if(this.weightedIngredientHashMap.containsKey(weightedIngredient.getId())){
            for (int key : this.weightedIngredientHashMap.keySet()){
                if (key == weightedIngredient.getId()){
                    weightedIngredient.setWeight(weightedIngredient.getWeight() + weigth);
                }
            }
        } else {
            this.weightedIngredientHashMap.put(weightedIngredient.getId(), weightedIngredient);
//            for(int key : this.weightedIngredientHashMap.keySet()){
//                if(key == weightedIngredient.getId())
                    weightedIngredient.setWeight(weigth);
//            }
//            weightedIngredient.setWeight(weigth);
        }
    }

    public void removeFromFridge(WeightedIngredient weightedIngredient, double weigth) {
        if (this.weightedIngredientHashMap.containsKey(weightedIngredient.getId())) {
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
                this.weightedIngredientHashMap.remove(weightedIngredient.getId());
                System.out.println("Ingrediant " + weightedIngredient.getName() + " removed");
            } else {
                weightedIngredient.setWeight(weightedIngredient.getWeight() - weigth);
            }
        }else {
            System.out.println("Alredy doesnt exist in fridge");
        }
    }
//
    public boolean canMakeMeal(Recipe recipe) {
        boolean flag = false;
        int countIngrediants = 0;
        int checkWeigth = 0;
        for (WeightedIngredient elRecipe : recipe.weightedIngredientHashMap.values()) {
            for (WeightedIngredient elFridge : weightedIngredientHashMap.values()) {
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
    public void makeMeal(Recipe recipe){
        if(this.canMakeMeal(recipe)){
            for (WeightedIngredient elFridge : this.weightedIngredientHashMap.values()){
                for (WeightedIngredient elRecipe : recipe.weightedIngredientHashMap.values()){
                    if(Objects.equals(elFridge.getName(), elRecipe.getName())){
                        this.removeFromFridge(elFridge, elRecipe.getWeight());
                    }
                }
            }
            System.out.println("Meal made successfully");
        } else {
            System.out.println("Cant make this meal");
        }
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "weightedIngredients=" + weightedIngredientHashMap +
                '}';
    }
}
