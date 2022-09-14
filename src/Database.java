import java.util.*;
import java.util.stream.Collectors;

public class Database {
    public static List<Recipe> dbAllRecipes = new LinkedList<>();
    public static List<Recipe> scaledRecipes = new LinkedList<>();
    public static List<Recipe> favouriteRecipes = new LinkedList<>();
    public static List<WeightedIngredient> dbAllIngrediants = new LinkedList<>();
    public List<Recipe> filterSortRecipes = new ArrayList<>();

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
            System.out.println("--------------------------------------");
            for (var el: filterSortRecipes){
                System.out.println(el.getName() + "-->" + el.getPrice());
            }
            System.out.println("--------------------------------------\n");
        }
    }
    public void filterLevel(Level level){
        filterSortRecipes = Database.dbAllRecipes.stream()
                .filter(recipe -> recipe.getLevel().equals(level)).toList();
        System.out.println("--------------------------------------");
        for (var el: filterSortRecipes){
            System.out.println(el.getName() + "-->" + el.getLevel());
        }
        System.out.println("--------------------------------------\n");

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
            System.out.println("--------------------------------------");
            for (var el: filterSortRecipes){
                System.out.println(el.getName() + "-->" + el.getLevel() + "-->" + el.getPrice());
            }
            System.out.println("--------------------------------------\n");
        }
    }
    public void sortRecipesLevelIncrease(){
        filterSortRecipes = Database.dbAllRecipes.stream()
                .sorted(Comparator.comparing(Recipe::getLevel))
                .collect(Collectors.toList());
        System.out.println("--------------------------------------");
        for (var el: filterSortRecipes){
            System.out.println(el.getName() + "-->" + el.getLevel());
        }
        System.out.println("--------------------------------------\n");
    }
    public void sortRecipesLevelDecrease(){
        filterSortRecipes = Database.dbAllRecipes.stream()
                .sorted(Comparator.comparing(Recipe::getLevel).reversed())
                .collect(Collectors.toList());
        System.out.println("--------------------------------------");
        for (var el: filterSortRecipes){
            System.out.println(el.getName() + "-->" + el.getLevel());
        }
        System.out.println("--------------------------------------\n");
    }
    public void sortRecipesPriceIncrease(){
        filterSortRecipes = Database.dbAllRecipes.stream()
                .sorted(Comparator.comparing(Recipe::getPrice))
                .collect(Collectors.toList());
        System.out.println("--------------------------------------");
        for (var el: filterSortRecipes){
            System.out.println(el.getName() + "-->" + el.getPrice());
        }
        System.out.println("--------------------------------------\n");
    }
    public void sortRecipesPriceDecrease(){
        filterSortRecipes = Database.dbAllRecipes.stream()
                .sorted(Comparator.comparing(Recipe::getPrice).reversed())
                .collect(Collectors.toList());
        System.out.println("--------------------------------------");
        for (var el: filterSortRecipes){
            System.out.println(el.getName() + "-->" + el.getPrice());
        }
        System.out.println("--------------------------------------\n");
    }
    public void addFavourites(){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("--------------------------------------");
        for (var el : dbAllRecipes) {
            count++;
            System.out.println(count + ". " + el.getName());
        }
        System.out.println("--------------------------------------\n");
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
        if(favouriteRecipes.isEmpty()){
            System.out.println("You don't have favourites!");
        }else{
            System.out.println("--------------------------------------");
            for (Recipe favouriteRecipe : favouriteRecipes) {
                count++;
                System.out.println(count + ". " + favouriteRecipe.getName());
            }
            System.out.println("--------------------------------------\n");
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
            System.out.println("--------------------------------------");
            for (var el : favouriteRecipes) {
                if (money > el.getPrice()) {
                    System.out.println(el.getName());
                }
            }
            System.out.println("--------------------------------------\n");
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
