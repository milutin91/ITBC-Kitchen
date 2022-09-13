import java.util.*;
import java.util.stream.Collectors;

public class Database {
    public static List<Recipe> dbAllRecipes = new LinkedList<>();
    public static List<Recipe> favouriteRecipes = new LinkedList<>();
    public static List<WeightedIngredient> dbAllIngrediants = new LinkedList<>();
    public List<Recipe> filterSortRecipes = new ArrayList<>();

//    public void addToRecipesDB(Recipe recipe) {
//        int count = 0;
//        for (var el : dbAllRecipes) {
//            if (el.getName().equals(recipe.getName())) {
//                count++;
//            }
//        }
//        if (count == 0) {
//            dbAllRecipes.add(recipe);
//        } else {
//            System.out.println(recipe.getName() + " alredy exsist");
//        }
//    }

//    public void addToWIngrediantsDB(WeightedIngredient weightedIngredient) {
//        int count = 0;
//        for (var el : dbAllIngrediants) {
//            if (el.getName().equals(weightedIngredient.getName())) {
//                count++;
//            }
//        }
//        if (count == 0) {
//            dbAllIngrediants.add(weightedIngredient);
//        } else {
//            System.out.println(weightedIngredient.getName() + " alredy exsist");
//        }
//    }
//    public void addToFridge(int choice, Fridge fridge){
//        Scanner sc = new Scanner(System.in);
//        int count = 0;
//        for (var el : dbAllIngrediants) {
//            count++;
//            System.out.println(count + ". " + el.getName());
//        }
//        choice = sc.nextInt();
//        for (var el : dbAllIngrediants) {
//            if (choice == el.getId()) {
//                System.out.println("Weight?");
//                fridge.addToFridge(el, sc.nextInt());
//            }
//        }
//    }
    public void filterMoney(double money){
        filterSortRecipes = Database.dbAllRecipes.stream()
                .filter(recipe -> recipe.getPrice() <= (money)).toList();
        int count = 0;
        for (var el: filterSortRecipes){
            if(money > el.getPrice()){
                count++;
            }
        }
        if(count == 0){
            System.out.println("You can't make anythig");
        }else{
            System.out.println("You can make: ");
            for (var el: filterSortRecipes){
                System.out.println(el.getName() + "-->" + el.getPrice());
            }
        }
    }
    public void filterLevel(Level level){
        filterSortRecipes = Database.dbAllRecipes.stream()
                .filter(recipe -> recipe.getLevel().equals(level)).toList();
        for (var el: filterSortRecipes){
            System.out.println(el.getName() + "-->" + el.getLevel());
        }
    }
    public void filterMoneyLevel(double money, Level level){
        filterSortRecipes = Database.dbAllRecipes.stream()
                .filter(recipe -> recipe.getLevel().equals(level))
                .filter(recipe -> recipe.getPrice() <= (money)).toList();
        int count = 0;
        for (var el: filterSortRecipes){
            if(money > el.getPrice()){
                count++;
            }
        }
        if(count == 0){
            System.out.println("You can't make anything!");
        }else{
            System.out.println("You can make " + level.toString() + ": ");
            for (var el: filterSortRecipes){
                System.out.println(el.getName() + "-->" + el.getLevel() + "-->" + el.getPrice());
            }
        }
    }
    public void sortRecipesLevelIncrease(){
        filterSortRecipes = Database.dbAllRecipes.stream()
                .sorted(Comparator.comparing(Recipe::getLevel))
                .collect(Collectors.toList());
        for (var el: filterSortRecipes){
            System.out.println(el.getName() + "-->" + el.getLevel());
        }
        System.out.println();
    }
    public void sortRecipesLevelDecrease(){
        filterSortRecipes = Database.dbAllRecipes.stream()
                .sorted(Comparator.comparing(Recipe::getLevel).reversed())
                .collect(Collectors.toList());
        for (var el: filterSortRecipes){
            System.out.println(el.getName() + "-->" + el.getLevel());
        }
        System.out.println();
    }
    public void sortRecipesMoneyIncrease(){
        filterSortRecipes = Database.dbAllRecipes.stream()
                .sorted(Comparator.comparing(Recipe::getPrice))
                .collect(Collectors.toList());
        for (var el: filterSortRecipes){
            System.out.println(el.getName() + "-->" + el.getPrice());
        }
    }
    public void sortRecipesMoneyDecrease(){
        filterSortRecipes = Database.dbAllRecipes.stream()
                .sorted(Comparator.comparing(Recipe::getPrice).reversed())
                .collect(Collectors.toList());
        for (var el: filterSortRecipes){
            System.out.println(el.getName() + "-->" + el.getPrice());
        }
    }
    public void addFavourites(){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (var el : dbAllRecipes) {
            count++;
            System.out.println(count + ". " + el.getName());
        }
        count = 0;
        int choice = sc.nextInt();
        for (var el : dbAllRecipes) {
            count++;
            if (count == choice) {
                if(favouriteRecipes.contains(el)){
                    System.out.println( el.getName() + " alredy exist in favourites");
                }else{
                    favouriteRecipes.add(el);
                }
            }
        }
    }
    public void removeFavourites(){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (Recipe favouriteRecipe : favouriteRecipes) {
            count++;
            System.out.println(count + ". " + favouriteRecipe.getName());
        }
        count = 0;
        int choice = sc.nextInt();
        for (int i = 0; i < favouriteRecipes.size(); i++) {
            count++;
            if (count == choice) {
                favouriteRecipes.remove(favouriteRecipes.get(i));
            }
        }
    }
    public void filterFavouriteMoney(double money){
        int count = 0;
        for (var el : favouriteRecipes) {
            if (money > el.getPrice()) {
                count++;
            }
        }
        if(count == 0){
            System.out.println("You can't make anything, you are broke!\n");
        }else{
            System.out.println("You can make:");
            for (var el : favouriteRecipes) {
                if (money > el.getPrice()) {
                    System.out.println(el.getName());
                }
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Database{" +
                "dbAllRecipes=" + dbAllRecipes +
                "\n\n, dbAllIngrediants=" + dbAllIngrediants +
                '}';
    }
}
