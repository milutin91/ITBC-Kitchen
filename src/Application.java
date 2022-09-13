import java.util.*;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fridge fridge = new Fridge(new LinkedList<>());
        Database database = new Database();

        WeightedIngredient flour = new WeightedIngredient("Flour", 1000, 85);
        WeightedIngredient sugar = new WeightedIngredient("Sugar", 1000, 103);
        WeightedIngredient salt = new WeightedIngredient("Salt", 1000, 70);
        WeightedIngredient yogurt = new WeightedIngredient("Yogurt", 1000, 150);
        WeightedIngredient eggs = new WeightedIngredient("Eggs", 20, 18000);
        WeightedIngredient bakingPowder = new WeightedIngredient("Baking powder", 12, 2083.33);
        WeightedIngredient oil = new WeightedIngredient("Oil", 1000, 200);
        WeightedIngredient cheese = new WeightedIngredient("Cheese", 1000, 600);
        WeightedIngredient ham = new WeightedIngredient("Ham", 1000, 700);
        WeightedIngredient milk = new WeightedIngredient("Milk", 1000, 120);
        WeightedIngredient jam = new WeightedIngredient("Jam", 1000, 400);
        WeightedIngredient chocolate = new WeightedIngredient("Chocolate", 1000, 1600);
        WeightedIngredient margarine = new WeightedIngredient("Margarine", 1000, 400);
        WeightedIngredient plasmaBiscuit = new WeightedIngredient("Plasma biscuit", 1000, 900);
        WeightedIngredient creamCheese = new WeightedIngredient("Cream cheese", 1000, 750);
        WeightedIngredient cream = new WeightedIngredient("Cream", 1000, 500);
        WeightedIngredient raspberries = new WeightedIngredient("Rraspberries", 1000, 1000);


//        1.
        Recipe spanishPita = new Recipe("SPANISH PITA", new ArrayList<>(), Level.MEDIUM);
        spanishPita.addIngrediantToRecipe(flour, 100);
        spanishPita.addIngrediantToRecipe(oil, 40);
        spanishPita.addIngrediantToRecipe(yogurt, 40);
        spanishPita.addIngrediantToRecipe(eggs, 4);
        spanishPita.addIngrediantToRecipe(bakingPowder, 6);


//        2.
        Recipe fastPiroshka = new Recipe("FAST PIROSHKA", new ArrayList<>(), Level.BEGINNER);
        fastPiroshka.addIngrediantToRecipe(flour, 400);
        fastPiroshka.addIngrediantToRecipe(bakingPowder, 6);
        fastPiroshka.addIngrediantToRecipe(salt, 2);
        fastPiroshka.addIngrediantToRecipe(eggs, 1);
        fastPiroshka.addIngrediantToRecipe(yogurt, 40);
        fastPiroshka.addIngrediantToRecipe(cheese, 125);
        fastPiroshka.addIngrediantToRecipe(ham, 125);

//        3.
        Recipe muffin = new Recipe("MUFFIN", new ArrayList<>(), Level.EASY);
        muffin.addIngrediantToRecipe(milk, 250);
        muffin.addIngrediantToRecipe(sugar, 30);
        muffin.addIngrediantToRecipe(salt, 10);
        muffin.addIngrediantToRecipe(oil, 50);
        muffin.addIngrediantToRecipe(flour, 1000);

//        4.
        Recipe honeyHeart = new Recipe("HONEY HEART", new ArrayList<>(), Level.HARD);
        honeyHeart.addIngrediantToRecipe(sugar, 200);
        honeyHeart.addIngrediantToRecipe(flour, 400);
        honeyHeart.addIngrediantToRecipe(milk, 200);
        honeyHeart.addIngrediantToRecipe(jam, 100);
        honeyHeart.addIngrediantToRecipe(oil, 20);

//        5.
        Recipe souffle = new Recipe("SOUFFLE", new ArrayList<>(), Level.PRO);
        souffle.addIngrediantToRecipe(sugar, 190);
        souffle.addIngrediantToRecipe(flour, 300);
        souffle.addIngrediantToRecipe(chocolate, 200);
        souffle.addIngrediantToRecipe(margarine, 250);

//        6.
        Recipe cheeesecake = new Recipe("CHEESECAKE", new ArrayList<>(), Level.HARD);
        cheeesecake.addIngrediantToRecipe(plasmaBiscuit, 300);
        cheeesecake.addIngrediantToRecipe(margarine, 150);
        cheeesecake.addIngrediantToRecipe(creamCheese, 400);
        cheeesecake.addIngrediantToRecipe(sugar, 100);
        cheeesecake.addIngrediantToRecipe(cream, 250);
        cheeesecake.addIngrediantToRecipe(sugar, 50);
        cheeesecake.addIngrediantToRecipe(raspberries, 400);

//        7.
        Recipe scrambledEggs = new Recipe("SCRAMBLED EGGS", new ArrayList<>(), Level.EASY);
        scrambledEggs.addIngrediantToRecipe(eggs, 4);
        scrambledEggs.addIngrediantToRecipe(oil, 10);
        scrambledEggs.addIngrediantToRecipe(salt, 1);

//        8.
        Recipe sconesWithCheese = new Recipe("SCONES WITH CHEESE", new ArrayList<>(), Level.HARD);
        sconesWithCheese.addIngrediantToRecipe(milk, 200);
        sconesWithCheese.addIngrediantToRecipe(sugar, 10);
        sconesWithCheese.addIngrediantToRecipe(flour, 300);
        sconesWithCheese.addIngrediantToRecipe(salt, 8);
        sconesWithCheese.addIngrediantToRecipe(eggs, 1);

//        9.
        Recipe pizzaDough = new Recipe("PIZZA DOUGH", new ArrayList<>(), Level.PRO);
        pizzaDough.addIngrediantToRecipe(flour, 300);
        pizzaDough.addIngrediantToRecipe(oil, 15);
        pizzaDough.addIngrediantToRecipe(salt, 8);
        pizzaDough.addIngrediantToRecipe(sugar, 8);

//        10.
        Recipe friedEggsWithHam = new Recipe("FRIED EGGS WITH HAM", new ArrayList<>(), Level.MEDIUM);
        friedEggsWithHam.addIngrediantToRecipe(eggs, 3);
        friedEggsWithHam.addIngrediantToRecipe(oil, 10);
        friedEggsWithHam.addIngrediantToRecipe(salt, 5);
        friedEggsWithHam.addIngrediantToRecipe(ham, 100);

        int choice;

        System.out.println("---Welcome to kitchen---\n");
        boolean flag = true;
        while (flag) {
            System.out.println("""
                    Please press:\s
                    1. Open Fridge
                    2. Make a meal
                    3. Filter recipes
                    4. Sorting recipes
                    5. Favourite recipes
                    0. Leave kitchen""");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Goodbye");
                    flag = false;
                    break;
                case 1:
                    System.out.println(fridge);
                    System.out.println();
                    boolean flag2 = true;
                    while (flag2) {
                        System.out.println("""
                                Choose what to do:\s
                                1. Add ingrediant
                                2. Take ingrediant
                                0. Go back""");
                        choice = sc.nextInt();
                        switch (choice) {
                            case 0:
                                flag2 = false;
                                break;
                            case 1:
                                fridge.addToFridge();
                                break;
                            case 2:
                                fridge.removeFromFridge();
                                break;
                            default:
                                System.out.println("Choose again!");
                                break;
                        }
                        System.out.println(fridge);
                    }
                    break;
                case 2:
                    boolean flag3 = true;
                    while (flag3) {
                        System.out.println("""
                                Choose what to do:\s
                                1. Which recipes do you have ingrediants for
                                2. Which scaled recipes do you have ingrediants for
                                3. Make meal
                                0. Go back""");
                        choice = sc.nextInt();
                        switch (choice) {
                            case 0:
                                flag3 = false;
                                break;
                            case 1:
                                int count = 0;
                                for (var el : Database.dbAllRecipes) {
                                    if (fridge.canMakeMeal(el)) {
                                        count++;
                                    }
                                }
                                if (count == 0) {
                                    System.out.println("You can' t make any meal!");
                                } else {
                                    for (var el : Database.dbAllRecipes) {
                                        if (fridge.canMakeMeal(el)) {
                                            System.out.println(el.getName() + el.weightedIngredients);
                                        }
                                    }
                                }
                                break;
                            case 2:
                                break;
                            case 3:
                                count = 0;
                                for (var el : Database.dbAllRecipes) {
                                    if (fridge.canMakeMeal(el)) {
                                        count++;
                                    }
                                }
                                if (count == 0) {
                                    System.out.println("You can' t make any meal!");
                                } else {
                                    count = 0;
                                    for (var el : Database.dbAllRecipes) {
                                        if (fridge.canMakeMeal(el)) {
                                            count++;
                                            System.out.println(count + ". " + el.getName());
                                        }
                                    }
                                }
                                count = 0;
                                choice = sc.nextInt();
                                for (var el : Database.dbAllRecipes) {
                                    if (fridge.canMakeMeal(el)) {
                                        count++;
                                        if (choice == count) {
                                            fridge.makeMeal(el);
                                        }
                                    }
                                }
                                break;
                            default:
                                System.out.println("Choose again!");
                                break;
                        }
                    }
                    break;
                case 3:
                    boolean flag4 = true;
                    while (flag4) {
                        System.out.println("""
                                Choose what to do:\s
                                1. Check all recipes for specified money
                                2. Check all recipes with specified level
                                3. Combo of 1 and 2
                                0. Go back""");
                        choice = sc.nextInt();
                        switch (choice) {
                            case 0:
                                flag4 = false;
                                break;
                            case 1:
                                boolean flag5 = true;
                                while (flag5) {
                                    System.out.println("""
                                            Filter by money:\s
                                            1. Filter by money
                                            0. Go back""");
                                    choice = sc.nextInt();
                                    switch (choice) {
                                        case 0:
                                            flag5 = false;
                                            break;
                                        case 1:
                                            System.out.println("Filter by money: ");
                                            System.out.println("How much money do you have?");
                                            double money = sc.nextDouble();
                                            database.filterMoney(money);
                                            break;
                                        default:
                                            System.out.println("Choose again!");
                                            break;
                                    }
                                }
                                break;
                            case 2:
                                boolean flag6 = true;
                                while (flag6) {
                                    System.out.println("""
                                            Filter by level:\s
                                            1. Begginer
                                            2. Easy
                                            3. Medium
                                            4. Hard
                                            5. Pro
                                            0. Go back""");
                                    choice = sc.nextInt();
                                    switch (choice) {
                                        case 0:
                                            flag6 = false;
                                            break;
                                        case 1:
                                            database.filterLevel(Level.BEGINNER);
                                            break;
                                        case 2:
                                            database.filterLevel(Level.EASY);
                                            break;
                                        case 3:
                                            database.filterLevel(Level.MEDIUM);
                                            break;
                                        case 4:
                                            database.filterLevel(Level.HARD);
                                            break;
                                        case 5:
                                            database.filterLevel(Level.PRO);
                                            break;
                                        default:
                                            System.out.println("Choose again!");
                                            break;
                                    }
                                }
                                break;
                            case 3:
                                boolean flag7 = true;
                                while (flag7) {
                                    System.out.println("""
                                            Filter by level and money:\s
                                            1. Begginer
                                            2. Easy
                                            3. Medium
                                            4. Hard
                                            5. Pro
                                            0. Go back""");
                                    choice = sc.nextInt();
                                    switch (choice) {
                                        case 0:
                                            flag7 = false;
                                            break;
                                        case 1:
                                            System.out.println("How much money do you have?");
                                            double money = sc.nextDouble();
                                            database.filterMoneyLevel(money, Level.BEGINNER);
                                            break;
                                        case 2:
                                            System.out.println("How much money do you have?");
                                            money = sc.nextDouble();
                                            database.filterMoneyLevel(money, Level.EASY);
                                            break;
                                        case 3:
                                            System.out.println("How much money do you have?");
                                            money = sc.nextDouble();
                                            database.filterMoneyLevel(money, Level.MEDIUM);
                                            break;
                                        case 4:
                                            System.out.println("How much money do you have?");
                                            money = sc.nextDouble();
                                            database.filterMoneyLevel(money, Level.HARD);
                                            break;
                                        case 5:
                                            System.out.println("How much money do you have?");
                                            money = sc.nextDouble();
                                            database.filterMoneyLevel(money, Level.PRO);
                                            break;
                                        default:
                                            System.out.println("Choose again!");
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 4:
                    boolean flag8 = true;
                    while (flag8) {
                        System.out.println("""
                                Choose what to do:\s
                                1. Sort recipe by level
                                2. Sort recipe by price
                                0. Go back""");
                        choice = sc.nextInt();
                        switch (choice) {
                            case 0:
                                flag8 = false;
                                break;
                            case 1:
                                boolean flag9 = true;
                                while (flag9) {
                                    System.out.println("""
                                            Choose what to do:\s
                                            1. Sort level EASY --> PRO
                                            2. Sort level PRO --> EASY
                                            0. Go back""");
                                    choice = sc.nextInt();
                                    switch (choice) {
                                        case 0:
                                            flag9 = false;
                                            break;
                                        case 1:
                                            database.sortRecipesLevelIncrease();
                                            break;
                                        case 2:
                                            database.sortRecipesLevelDecrease();
                                            break;
                                        default:
                                            System.out.println("Choose again!");
                                            break;
                                    }
                                }
                                break;
                            case 2:
                                boolean flag10 = true;
                                while (flag10) {
                                    System.out.println("""
                                            Choose what to do:\s
                                            1. Sort price LOW --> HIGH
                                            2. Sort price HIGH --> LOW
                                            0. Go back""");
                                    choice = sc.nextInt();
                                    switch (choice) {
                                        case 0:
                                            flag10 = false;
                                            break;
                                        case 1:
                                            database.sortRecipesMoneyIncrease();
                                            break;
                                        case 2:
                                            database.sortRecipesMoneyDecrease();
                                            break;
                                        default:
                                            System.out.println("Choose again!");
                                            break;
                                    }
                                }
                                break;
                            default:
                                System.out.println("Choose again!");
                                break;
                        }
                    }
                    break;
                case 5:
                    boolean flag11 = true;
                    while (flag11) {
                        if (Database.favouriteRecipes.isEmpty()){
                            System.out.println("You don't have favourites!");
                        } else {
                            System.out.println("Your favourites:");
                        }
                        int count = 0;
                        for (var el : Database.favouriteRecipes) {
                            count++;
                            System.out.println(count + ". " + el.getName());
                        }
                        System.out.println();
                        System.out.println("""
                                Choose what to do:\s
                                1. Add to favourites
                                2. Remove from favourites
                                3. Favourite recipes for specified money
                                0. Go back""");
                        choice = sc.nextInt();
                        switch (choice) {
                            case 0:
                                flag11 = false;
                                break;
                            case 1:
                                database.addFavourites();
                                break;
                            case 2:
                                database.removeFavourites();
                                break;
                            case 3:
                                if (Database.favouriteRecipes.isEmpty()){
                                }else{
                                    System.out.println("How much money do u have?");
                                    double money = sc.nextDouble();

                                    database.filterFavouriteMoney(money);
                                }
                                break;
                            default:
                                System.out.println("Choose again!");
                                break;
                        }
                    }
                    break;
            }
        }
    }
}