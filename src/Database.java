import java.util.*;
import java.util.stream.Collectors;

public class Database {
    public static HashMap<Integer, Recipe> dbAllRecipes = new HashMap<>();
    public static HashMap<Integer, WeightedIngredient> dbAllIngrediants = new HashMap<>();
    public static List<Recipe> favouriteRecipes = new LinkedList<>();
    public List<Recipe> filterSortRecipes = new ArrayList<>();

    public void filterMoney(double money){
        filterSortRecipes = Database.dbAllRecipes.values().stream()
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
            System.out.println("You can make:\n" + Decoration.returnLine(45));
            for (var el: filterSortRecipes){
                System.out.println("\t* " + el.getName() + "-->" + el.getPrice() + "RSD");
            }
            System.out.println(Decoration.returnLine(45));
        }
    }
    public void filterLevel(Level level){
        filterSortRecipes = Database.dbAllRecipes.values().stream()
                .filter(recipe -> recipe.getLevel().equals(level)).toList();
        System.out.println(Decoration.returnLine(45));
        for (var el: filterSortRecipes){
            System.out.println("\t* " + el.getName() + " --> " + el.getLevel());
        }
        System.out.println(Decoration.returnLine(45) + "\n");

    }
    public void filterMoneyLevel(double money, Level level){
        filterSortRecipes = Database.dbAllRecipes.values().stream()
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
            System.out.println(Decoration.returnLine(55));
            for (var el: filterSortRecipes){
                System.out.println("\t* " + el.getName() + " --> " + el.getLevel() + " --> " + el.getPrice() + "RSD");
            }
            System.out.println(Decoration.returnLine(55) + "\n");
        }
    }
    public void sortRecipesLevelIncrease(){
        filterSortRecipes = Database.dbAllRecipes.values().stream()
                .sorted(Comparator.comparing(Recipe::getLevel))
                .collect(Collectors.toList());
        System.out.println(Decoration.returnLine(45));
        for (var el: filterSortRecipes){
            System.out.println("\t* " + el.getName() + " --> " + el.getLevel());
        }
        System.out.println(Decoration.returnLine(45) + "\n");
    }
    public void sortRecipesLevelDecrease(){
        filterSortRecipes = Database.dbAllRecipes.values().stream()
                .sorted(Comparator.comparing(Recipe::getLevel).reversed())
                .collect(Collectors.toList());
        System.out.println(Decoration.returnLine(45));
        for (var el: filterSortRecipes){
            System.out.println("\t* " + el.getName() + " -- >" + el.getLevel());
        }
        System.out.println(Decoration.returnLine(45) + "\n");
    }
    public void sortRecipesPriceIncrease(){
        filterSortRecipes = Database.dbAllRecipes.values().stream()
                .sorted(Comparator.comparing(Recipe::getPrice))
                .collect(Collectors.toList());
        System.out.println(Decoration.returnLine(45));
        for (var el: filterSortRecipes){
            System.out.println("\t* " + el.getName() + " --> " + el.getPrice() + "RSD");
        }
        System.out.println(Decoration.returnLine(45) + "\n");
    }
    public void sortRecipesPriceDecrease(){
        filterSortRecipes = Database.dbAllRecipes.values().stream()
                .sorted(Comparator.comparing(Recipe::getPrice).reversed())
                .collect(Collectors.toList());
        System.out.println(Decoration.returnLine(45));
        for (var el: filterSortRecipes){
            System.out.println("\t* " + el.getName() + " -- >" + el.getPrice() + "RSD");
        }
        System.out.println(Decoration.returnLine(45) + "\n");
    }

    public static void scanRecipeDatabase(){
        TreeMap<Integer, Recipe> sorted = new TreeMap<>();
        sorted.putAll(dbAllRecipes);
        for (Map.Entry<Integer, Recipe> entry : sorted.entrySet())
            System.out.println(" " + entry.getKey() + ". " + entry.getValue());
    }
    public void addFavourites(){
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, Recipe> sorted = new TreeMap<>();
        sorted.putAll(dbAllRecipes);
        System.out.println(" Choose your favourite:\n" + Decoration.returnLine(46));
        for (Map.Entry<Integer, Recipe> entry : sorted.entrySet())
            System.out.println("\t" + entry.getKey() + ". " + entry.getValue().getName());
        System.out.println(Decoration.returnLine(46));
        int choice = sc.nextInt();
        for (Map.Entry<Integer, Recipe> entry : sorted.entrySet())
            if(entry.getKey() == choice){
                if(favouriteRecipes.contains(entry.getValue())){
                    System.out.println(" " + entry.getValue().getName() + " alredy exist in favourites!\n");
                }else{
                    favouriteRecipes.add(entry.getValue());
                }
            };

    }
    public void removeFavourites(){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        if(favouriteRecipes.isEmpty()){
            System.out.println(" You don't have favourites!");
        }else{
            System.out.println(" Choose what to remove:\n" + Decoration.returnLine(46));
            for (Recipe favouriteRecipe : favouriteRecipes) {
                count++;
                System.out.println("\t" + count + ". " + favouriteRecipe.getName());
            }
            System.out.println(Decoration.returnLine(46) + "\n");
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
            System.out.println(" You can't make anything, you are broke!\n");
        }else{
            System.out.println(" You can make:\n" + Decoration.returnLine(46));
            for (var el : favouriteRecipes) {
                if (money > el.getPrice()) {
                    System.out.println("\t* " + el.getName());
                }
            }
            System.out.println(Decoration.returnLine(46) + "\n");
        }
    }
}
