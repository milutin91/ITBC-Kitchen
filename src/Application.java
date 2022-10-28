import java.util.*;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fridge fridge = new Fridge(new LinkedList<>());
        Database database = new Database();

        WeightedIngredient flour = new WeightedIngredient("Flour", 0.25);                   //1
        WeightedIngredient sugar = new WeightedIngredient("Sugar", 0.103);                  //2
        WeightedIngredient salt = new WeightedIngredient("Salt", 0.055);                    //3
        WeightedIngredient yogurt = new WeightedIngredient("Yogurt", 0.11);                 //4
        WeightedIngredient eggs = new WeightedIngredient("Eggs", 18);                       //5
        WeightedIngredient bakingPowder = new WeightedIngredient("Baking powder", 1.9);     //6
        WeightedIngredient oil = new WeightedIngredient("Oil", 0.198);                      //7
        WeightedIngredient cheese = new WeightedIngredient("Cheese", 0.599);                //8
        WeightedIngredient ham = new WeightedIngredient("Ham", 0.699);                      //9
        WeightedIngredient milk = new WeightedIngredient("Milk", 0.12);                     //10
        WeightedIngredient jam = new WeightedIngredient("Jam", 0.399);                      //11
        WeightedIngredient chocolate = new WeightedIngredient("Chocolate", 1.79);           //12
        WeightedIngredient margarine = new WeightedIngredient("Margarine", 0.4);            //13
        WeightedIngredient plasmaBiscuit = new WeightedIngredient("Plasma biscuit", 0.9);   //14
        WeightedIngredient creamCheese = new WeightedIngredient("Cream cheese", 0.75);      //15
        WeightedIngredient cream = new WeightedIngredient("Cream", 0.5);                    //16
        WeightedIngredient raspberries = new WeightedIngredient("Rraspberries", 1);         //17

//        1.
        Recipe spanishPita = new Recipe("SPANISH PITA", Level.MEDIUM);
        spanishPita.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(1).getName(), Database.dbAllIngrediants.get(1).getPricePerUnit()), 100);
        spanishPita.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(7).getName(), Database.dbAllIngrediants.get(7).getPricePerUnit()), 40);
        spanishPita.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(4).getName(), Database.dbAllIngrediants.get(4).getPricePerUnit()), 40);
        spanishPita.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(5).getName(), Database.dbAllIngrediants.get(5).getPricePerUnit()), 4);
        spanishPita.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(6).getName(), Database.dbAllIngrediants.get(6).getPricePerUnit()), 6);

//        2.
        Recipe fastPiroshka = new Recipe("FAST PIROSHKA", Level.BEGINNER);
        fastPiroshka.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(1).getName(), Database.dbAllIngrediants.get(1).getPricePerUnit()), 400);
        fastPiroshka.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(6).getName(), Database.dbAllIngrediants.get(6).getPricePerUnit()), 6);
        fastPiroshka.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(3).getName(), Database.dbAllIngrediants.get(3).getPricePerUnit()), 2);
        fastPiroshka.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(5).getName(), Database.dbAllIngrediants.get(5).getPricePerUnit()), 1);
        fastPiroshka.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(4).getName(), Database.dbAllIngrediants.get(4).getPricePerUnit()), 40);
        fastPiroshka.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(8).getName(), Database.dbAllIngrediants.get(8).getPricePerUnit()), 125);
        fastPiroshka.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(9).getName(), Database.dbAllIngrediants.get(9).getPricePerUnit()), 125);

//        3.
        Recipe muffin = new Recipe("MUFFIN", Level.EASY);
        muffin.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(10).getName(), Database.dbAllIngrediants.get(10).getPricePerUnit()), 250);
        muffin.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(2).getName(), Database.dbAllIngrediants.get(2).getPricePerUnit()), 30);
        muffin.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(3).getName(), Database.dbAllIngrediants.get(3).getPricePerUnit()), 10);
        muffin.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(7).getName(), Database.dbAllIngrediants.get(7).getPricePerUnit()), 50);
        muffin.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(1).getName(), Database.dbAllIngrediants.get(1).getPricePerUnit()), 1000);

//        4.
        Recipe honeyHeart = new Recipe("HONEY HEART", Level.HARD);
        honeyHeart.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(2).getName(), Database.dbAllIngrediants.get(2).getPricePerUnit()), 200);
        honeyHeart.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(1).getName(), Database.dbAllIngrediants.get(1).getPricePerUnit()), 400);
        honeyHeart.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(10).getName(), Database.dbAllIngrediants.get(10).getPricePerUnit()), 200);
        honeyHeart.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(11).getName(), Database.dbAllIngrediants.get(11).getPricePerUnit()), 100);
        honeyHeart.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(7).getName(), Database.dbAllIngrediants.get(7).getPricePerUnit()), 20);

//        5.
        Recipe souffle = new Recipe("SOUFFLE", Level.PRO);
        souffle.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(2).getName(), Database.dbAllIngrediants.get(2).getPricePerUnit()), 190);
        souffle.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(1).getName(), Database.dbAllIngrediants.get(1).getPricePerUnit()), 300);
        souffle.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(12).getName(), Database.dbAllIngrediants.get(12).getPricePerUnit()), 200);
        souffle.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(13).getName(), Database.dbAllIngrediants.get(13).getPricePerUnit()), 250);

//        6.
        Recipe cheeesecake = new Recipe("CHEESECAKE", Level.HARD);
        cheeesecake.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(14).getName(), Database.dbAllIngrediants.get(14).getPricePerUnit()), 300);
        cheeesecake.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(13).getName(), Database.dbAllIngrediants.get(13).getPricePerUnit()), 150);
        cheeesecake.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(15).getName(), Database.dbAllIngrediants.get(15).getPricePerUnit()), 400);
        cheeesecake.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(2).getName(), Database.dbAllIngrediants.get(2).getPricePerUnit()), 100);
        cheeesecake.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(16).getName(), Database.dbAllIngrediants.get(16).getPricePerUnit()), 250);
        cheeesecake.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(2).getName(), Database.dbAllIngrediants.get(2).getPricePerUnit()), 50);
        cheeesecake.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(17).getName(), Database.dbAllIngrediants.get(17).getPricePerUnit()), 400);

//        7.
        Recipe scrambledEggs = new Recipe("SCRAMBLED EGGS", Level.EASY);
        scrambledEggs.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(5).getName(), Database.dbAllIngrediants.get(5).getPricePerUnit()), 4);
        scrambledEggs.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(7).getName(), Database.dbAllIngrediants.get(7).getPricePerUnit()), 10);
        scrambledEggs.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(3).getName(), Database.dbAllIngrediants.get(3).getPricePerUnit()), 1);

//        8.
        Recipe sconesWithCheese = new Recipe("SCONES WITH CHEESE", Level.HARD);
        sconesWithCheese.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(10).getName(), Database.dbAllIngrediants.get(10).getPricePerUnit()), 200);
        sconesWithCheese.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(2).getName(), Database.dbAllIngrediants.get(2).getPricePerUnit()), 10);
        sconesWithCheese.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(1).getName(), Database.dbAllIngrediants.get(1).getPricePerUnit()), 300);
        sconesWithCheese.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(3).getName(), Database.dbAllIngrediants.get(3).getPricePerUnit()), 8);
        sconesWithCheese.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(5).getName(), Database.dbAllIngrediants.get(5).getPricePerUnit()), 1);

//        9.
        Recipe pizzaDough = new Recipe("PIZZA DOUGH", Level.PRO);
        pizzaDough.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(1).getName(), Database.dbAllIngrediants.get(1).getPricePerUnit()), 300);
        pizzaDough.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(7).getName(), Database.dbAllIngrediants.get(7).getPricePerUnit()), 15);
        pizzaDough.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(3).getName(), Database.dbAllIngrediants.get(3).getPricePerUnit()), 8);
        pizzaDough.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(2).getName(), Database.dbAllIngrediants.get(2).getPricePerUnit()), 8);

//        10.
        Recipe friedEggsWithHam = new Recipe("FRIED EGGS WITH HAM", Level.MEDIUM);
        friedEggsWithHam.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(5).getName(), Database.dbAllIngrediants.get(5).getPricePerUnit()), 3);
        friedEggsWithHam.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(7).getName(), Database.dbAllIngrediants.get(7).getPricePerUnit()), 10);
        friedEggsWithHam.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(3).getName(), Database.dbAllIngrediants.get(3).getPricePerUnit()), 5);
        friedEggsWithHam.addIngrediantToRecipe(new WeightedIngredient(Database.dbAllIngrediants.get(9).getName(), Database.dbAllIngrediants.get(9).getPricePerUnit()), 100);

        int choice;

        System.out.println(" ".repeat(17) + "/" + "-".repeat(22) + "\\" + "\n " + "*".repeat(15) +
                "| WELCOME TO THE KITCHEN |" + "*".repeat(15) + "\n" + " ".repeat(17) + "\\" +
                "-".repeat(22) + "/\n");
        boolean flag = true;
        while (flag) {
            System.out.println(" Please press:\n" + Decoration.returnLine(56));
            System.out.println("""
                        \t1. Menu
                        \t2. Open Fridge
                        \t3. Make a meal
                        \t4. Filter recipes
                        \t5. Sorting recipes
                        \t6. Favourite recipes
                        \t0. Leave kitchen
                        """ + Decoration.returnLine(56));
            System.out.println("\n");

            while(!sc.hasNextInt()){  //TODO Find better solution!
                System.out.println("Input is not valid! Enter number!");
                sc.nextLine();
            }
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("GOODBYE!");
                    flag = false;
                    break;
                case 1:
                    Database.scanRecipeDatabase();
                    break;
                case 2:
                    System.out.println(fridge);
                    System.out.println();
                    boolean flag2 = true;
                    while (flag2) {
                        System.out.println(" Choose what to do:\n" + Decoration.returnLine(56));
                        System.out.println("""
                                    \t1. Add ingrediant
                                    \t2. Take ingrediant
                                    \t3. Generate random ingredients
                                    \t0. Go back
                                    """ + Decoration.returnLine(56));
                        while(!sc.hasNextInt()){
                            System.out.println("Input is not valid! Enter number!");
                            sc.nextLine();
                        }
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
                            case 3:
                                fridge.fillFridge();
                                break;
                            default:
                                System.out.println("Choose again!");
                                break;
                        }
                        System.out.println(fridge);
                    }
                    break;
                case 3:  //TODO Create functions from this cases!
                    boolean flag3 = true;
                    while (flag3) {
                        System.out.println(" Choose what to do:\n" + Decoration.returnLine(56));
                        System.out.println("""
                                    \t1. Which recipes do you have ingrediants for?
                                    \t2. Which scaled recipes do you have ingrediants for?
                                    \t3. Make meal
                                    \t4. Make scaled meal
                                    \t0. Go back
                                    """ + Decoration.returnLine(56));
                        while(!sc.hasNextInt()){
                            System.out.println("Input is not valid! Enter number!");
                            sc.nextLine();
                        }
                        choice = sc.nextInt();
                        switch (choice) {
                            case 0:
                                flag3 = false;
                                break;
                            case 1:
                                int count = 0;
                                for (var el : Database.dbAllRecipes.values()) {
                                    if (fridge.canMakeMeal(el)) {
                                        count++;
                                    }
                                }
                                if (count == 0) {
                                    System.out.println("You can' t make any meal!");
                                } else {
                                    System.out.println("\nYou can make:\n" + Decoration.returnLine(35));
                                    for (var el : Database.dbAllRecipes.values()) {
                                        if (fridge.canMakeMeal(el)) {
                                            System.out.println("\t* " + el.getName());
                                        }
                                    }
                                    System.out.println(Decoration.returnLine(35) + "\n");
                                }
                                break;
                            case 2:
                                count = 0;
                                System.out.println("Please enter scale:\n");
                                double percent = sc.nextDouble();
                                for (var el : Database.dbAllRecipes.values()) {
                                    if (fridge.canCreateScaledRecipe(el, percent)) {
                                        count++;
                                    }
                                }
                                if (count == 0) {
                                    System.out.println("You can' t make any meal!");
                                } else {
                                    System.out.println("\nYou can make:\n" + Decoration.returnLine(35));
                                    for (var el : Database.dbAllRecipes.values()) {
                                        if (fridge.canCreateScaledRecipe(el, percent)) {
                                            System.out.println("\t* " + el.getName());
                                        }
                                    }
                                    System.out.println(Decoration.returnLine(35) + "\n");
                                }
                                break;
                            case 3:
                                count = 0;
                                for (var el : Database.dbAllRecipes.values()) {
                                    if (fridge.canMakeMeal(el)) {
                                        count++;
                                    }
                                }
                                if (count == 0) {
                                    System.out.println("You can' t make any meal!");
                                } else {
                                    count = 0;
                                    for (var el : Database.dbAllRecipes.values()) {
                                        if (fridge.canMakeMeal(el)) {
                                            count++;
                                            System.out.println(count + ". " + el.getName());
                                        }
                                    }
                                }
                                count = 0;
                                while(!sc.hasNextInt()){
                                    System.out.println("Input is not valid! Enter number!");
                                    sc.nextLine();
                                }
                                choice = sc.nextInt();
                                for (var el : Database.dbAllRecipes.values()) {
                                    if (fridge.canMakeMeal(el)) {
                                        count++;
                                        if (choice == count) {
                                            fridge.makeMeal(el);
                                        }
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("Enter scale:\n");
                                percent = sc.nextDouble();
                                count = 0;
                                for (var el : Database.dbAllRecipes.values()) {
                                    if (fridge.canCreateScaledRecipe(el, percent)) {
                                        count++;
                                    }
                                }
                                if (count == 0) {
                                    System.out.println("You can' t make any meal!");
                                } else {
                                    count = 0;
                                    for (var el : Database.dbAllRecipes.values()) {
                                        if (fridge.canCreateScaledRecipe(el, percent)) {
                                            count++;
                                            System.out.println(count + ". " + el.getName());
                                        }
                                    }
                                }
                                count = 0;
                                while(!sc.hasNextInt()){
                                    System.out.println("Input is not valid! Enter number!");
                                    sc.nextLine();
                                }
                                choice = sc.nextInt();
                                for (var el : Database.dbAllRecipes.values()) {
                                    if (fridge.canCreateScaledRecipe(el, percent)) {
                                        count++;
                                        if (choice == count) {
                                            fridge.createScaledRecipe(el, percent);
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
                case 4:
                    boolean flag4 = true;
                    while (flag4) {
                        System.out.println(" Choose what to do:\n" + Decoration.returnLine(56));
                        System.out.println("""
                                    \t1. Check all recipes for specified money
                                    \t2. Check all recipes with specified level
                                    \t3. Combo of 1 and 2
                                    \t0. Go back
                                    """ + Decoration.returnLine(56));
                        while(!sc.hasNextInt()){
                            System.out.println("Input is not valid! Enter number!");
                            sc.nextLine();
                        }
                        choice = sc.nextInt();
                        switch (choice) {
                            case 0:
                                flag4 = false;
                                break;
                            case 1:
                                boolean flag5 = true;
                                while (flag5) {
                                    System.out.println(" Filter by money:\n" + Decoration.returnLine(35));
                                    System.out.println("""
                                                \t1. Filter by money
                                                \t0. Go back
                                                """ + Decoration.returnLine(35));
                                    while(!sc.hasNextInt()){
                                        System.out.println("Input is not valid! Enter number!");
                                        sc.nextLine();
                                    }
                                    choice = sc.nextInt();
                                    switch (choice) {
                                        case 0:
                                            flag5 = false;
                                            break;
                                        case 1:
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
                                    System.out.println(" Filter by level:\n" + Decoration.returnLine(35));
                                    System.out.println("""
                                                \t1. Begginer
                                                \t2. Easy
                                                \t3. Medium
                                                \t4. Hard
                                                \t5. Pro
                                                \t0. Go back
                                                """ + Decoration.returnLine(35));
                                    while(!sc.hasNextInt()){
                                        System.out.println("Input is not valid! Enter number!");
                                        sc.nextLine();
                                    }
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
                                    System.out.println(" Filter by level and money:\n" + Decoration.returnLine(45));
                                    System.out.println("""
                                                \t1. Begginer
                                                \t2. Easy
                                                \t3. Medium
                                                \t4. Hard
                                                \t5. Pro
                                                \t0. Go back
                                                """ + Decoration.returnLine(45));
                                    while(!sc.hasNextInt()){
                                        System.out.println("Input is not valid! Enter number!");
                                        sc.nextLine();
                                    }
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
                case 5:
                    boolean flag8 = true;
                    while (flag8) {
                        System.out.println(" Choose what to do:\n" + Decoration.returnLine(35));
                        System.out.println("""
                                    \t1. Sort recipe by level
                                    \t2. Sort recipe by price
                                    \t0. Go back
                                    """ + Decoration.returnLine(35));
                        while(!sc.hasNextInt()){
                            System.out.println("Input is not valid! Enter number!");
                            sc.nextLine();
                        }
                        choice = sc.nextInt();
                        switch (choice) {
                            case 0:
                                flag8 = false;
                                break;
                            case 1:
                                boolean flag9 = true;
                                while (flag9) {
                                    System.out.println(" Choose what to do:\n" + Decoration.returnLine(35));
                                    System.out.println("""
                                                \t1. Sort level EASY --> PRO
                                                \t2. Sort level PRO --> EASY
                                                \t0. Go back
                                                """ + Decoration.returnLine(35));
                                    while(!sc.hasNextInt()){
                                        System.out.println("Input is not valid! Enter number!");
                                        sc.nextLine();
                                    }
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
                                    System.out.println(" Choose what to do:\n" + Decoration.returnLine(35));
                                    System.out.println("""
                                                \t1. Sort price LOW --> HIGH
                                                \t2. Sort price HIGH --> LOW
                                                \t0. Go back
                                                """ + Decoration.returnLine(35));
                                    while(!sc.hasNextInt()){
                                        System.out.println("Input is not valid! Enter number!");
                                        sc.nextLine();
                                    }
                                    choice = sc.nextInt();
                                    switch (choice) {
                                        case 0:
                                            flag10 = false;
                                            break;
                                        case 1:
                                            database.sortRecipesPriceIncrease();
                                            break;
                                        case 2:
                                            database.sortRecipesPriceDecrease();
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
                case 6:
                    boolean flag11 = true;
                    while (flag11) {
                        if (Database.favouriteRecipes.isEmpty()) {
                            System.out.println(" You don't have favourites!\n");
                        } else {
                            System.out.println(" Your favourites:");
                            System.out.println(Decoration.returnLine(46));
                            for (var el : Database.favouriteRecipes) {

                                System.out.println("\t* " + el.getName());
                            }
                            System.out.println(Decoration.returnLine(46) + "\n");
                        }
                        System.out.println(" Choose what to do:\n" + Decoration.returnLine(46));
                        System.out.println("""
                                    \t1. Add to favourites
                                    \t2. Remove from favourites
                                    \t3. Favourite recipes for specified money
                                    \t0. Go back
                                    """ + Decoration.returnLine(46));
                        while(!sc.hasNextInt()){
                            System.out.println("Input is not valid! Enter number!");
                            sc.nextLine();
                        }
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
                                if (Database.favouriteRecipes.isEmpty()) {
                                } else {
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
                default:
                    System.out.println("Choose again!");
                    break;
            }
        }
    }
}