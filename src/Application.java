import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fridge fridge = new Fridge(new LinkedList<>());

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
        Recipe spanishPita = new Recipe("SPANISH PITA", new HashMap<Integer, WeightedIngredient>(), Level.MEDIUM);
        spanishPita.addIngrediantToRecipe(flour, 100);
        spanishPita.addIngrediantToRecipe(oil, 40);
        spanishPita.addIngrediantToRecipe(yogurt, 40);
        spanishPita.addIngrediantToRecipe(eggs, 4);
        spanishPita.addIngrediantToRecipe(bakingPowder, 6);


//        2.
        Recipe fastPiroshka = new Recipe("FAST PIROSHKA", new HashMap<Integer, WeightedIngredient>(), Level.BEGINNER);
        fastPiroshka.addIngrediantToRecipe(flour, 400);
        fastPiroshka.addIngrediantToRecipe(bakingPowder, 6);
        fastPiroshka.addIngrediantToRecipe(salt, 2);
        fastPiroshka.addIngrediantToRecipe(eggs, 1);
        fastPiroshka.addIngrediantToRecipe(yogurt, 40);
        fastPiroshka.addIngrediantToRecipe(cheese, 125);
        fastPiroshka.addIngrediantToRecipe(ham, 125);

//        3.
        Recipe muffin = new Recipe("MUFFIN", new HashMap<Integer, WeightedIngredient>(), Level.EASY);
        muffin.addIngrediantToRecipe(milk, 250);
        muffin.addIngrediantToRecipe(sugar, 30);
        muffin.addIngrediantToRecipe(salt, 10);
        muffin.addIngrediantToRecipe(oil, 50);
        muffin.addIngrediantToRecipe(flour, 1000);

//        4.
        Recipe honeyHeart = new Recipe("HONEY HEART", new HashMap<Integer, WeightedIngredient>(), Level.HARD);
        muffin.addIngrediantToRecipe(sugar, 200);
        muffin.addIngrediantToRecipe(flour, 400);
        muffin.addIngrediantToRecipe(milk, 200);
        muffin.addIngrediantToRecipe(jam, 100);
        muffin.addIngrediantToRecipe(oil, 20);

//        5.
        Recipe souffle = new Recipe("SOUFFLE", new HashMap<Integer, WeightedIngredient>(), Level.PRO);
        muffin.addIngrediantToRecipe(sugar, 190);
        muffin.addIngrediantToRecipe(flour, 300);
        muffin.addIngrediantToRecipe(chocolate, 200);
        muffin.addIngrediantToRecipe(margarine, 250);

//        6.
        Recipe cheeesecake = new Recipe("CHEESECAKE", new HashMap<Integer, WeightedIngredient>(), Level.HARD);
        muffin.addIngrediantToRecipe(plasmaBiscuit, 300);
        muffin.addIngrediantToRecipe(margarine, 150);
        muffin.addIngrediantToRecipe(creamCheese, 400);
        muffin.addIngrediantToRecipe(sugar, 100);
        muffin.addIngrediantToRecipe(cream, 250);
        muffin.addIngrediantToRecipe(sugar, 50);
        muffin.addIngrediantToRecipe(raspberries, 400);

//        7.
        Recipe scrambledEggs = new Recipe("SCRAMLED EGGS", new HashMap<Integer, WeightedIngredient>(), Level.EASY);
        muffin.addIngrediantToRecipe(eggs, 4);
        muffin.addIngrediantToRecipe(oil, 10);
        muffin.addIngrediantToRecipe(salt, 1);

//        8.
        Recipe sconesWithCheese = new Recipe("SCONES WITH CHEESE", new HashMap<Integer, WeightedIngredient>(), Level.HARD);
        muffin.addIngrediantToRecipe(milk, 200);
        muffin.addIngrediantToRecipe(sugar, 10);
        muffin.addIngrediantToRecipe(flour, 300);
        muffin.addIngrediantToRecipe(salt, 8);
        muffin.addIngrediantToRecipe(eggs, 1);

//        9.
        Recipe pizzaDough = new Recipe("PIZZA DOUGH", new HashMap<Integer, WeightedIngredient>(), Level.PRO);
        muffin.addIngrediantToRecipe(flour, 300);
        muffin.addIngrediantToRecipe(oil, 15);
        muffin.addIngrediantToRecipe(salt, 8);
        muffin.addIngrediantToRecipe(sugar, 8);

//        10.
        Recipe friedEggsWithHam = new Recipe("FRIED EGGS WITH HAM", new HashMap<Integer, WeightedIngredient>(), Level.MEDIUM);
        muffin.addIngrediantToRecipe(eggs, 3);
        muffin.addIngrediantToRecipe(oil, 10);
        muffin.addIngrediantToRecipe(salt, 5);
        muffin.addIngrediantToRecipe(ham, 100);

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
                    0. Leave kitchen""");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Goodbye");
                    flag = false;
                    break;
//            case 3:
//            case 4:
//            case 5:
//            case 6
//            case 7:
//            case 8:
//        }

//                System.out.println("1. Add ingrediant\n2. Remove ingrediant\n0. Go back");
//            System.out.println("""
//                    Add food:\s
//                    1. Flour
//                    2. Sugar
//                    3. Salt
//                    4. Yogurt
//                    5. Eggs
//                    6. Baking powder
//                    7. Oil
//                    8. Cheese
//                    9. Ham
//                    10. Milk
//                    11. Jam
//                    12. Chocolate
//                    13. Margarine
//                    14. Plasma biscuit
//                    15. Cream cheese
//                    16. Cream
//                    17. Rraspberries""");
                case 1:
                    System.out.println(fridge);
                    System.out.println();
                    boolean flag2 = true;
                    while (flag2) {
                        System.out.println("1. Add ingrediant\n2. Take ingrediant\n0. Go back");
                        choice = sc.nextInt();
                        switch (choice) {
                            case 0:
                                flag2 = false;
                                break;
                            case 1:
                                fridge.addToFridge();
//                                int count = 0;
//                                for (var el : Database.dbAllIngrediants) {
//                                    count++;
//                                    System.out.println(count + ". " + el.getName());
//                                }
//                                choice = sc.nextInt();
//                                for (var el : Database.dbAllIngrediants) {
//                                    if (choice == el.getId()) {
//                                        System.out.println("Weight?");
//                                        fridge.addToFridge(el, sc.nextInt());
//                                    }
//                                }
                                break;
                            case 2:
                                fridge.removeFromFridge();
                                break;
                            default:
                                System.out.println("Choose again!");
                                break;
//                                int count = 0;
//                                for (var el : fridge.getWeightedIngredients()) {
//                                    count++;
//                                    System.out.println(count + ". " + el.getName());
//                                }
//                                choice = sc.nextInt();
//
//                                count = 0;
//                                for (int i = 0; i < fridge.getWeightedIngredients().size(); i++) {
//                                    count++;
//                                    if (count == choice) {
//                                        System.out.println("Weight?");
//                                        fridge.removeFromFridge(fridge.getWeightedIngredients().get(choice-1), sc.nextInt());
//                                        break;
//                                    }
//                                }
                        }
                        System.out.println(fridge);
                    }
                    break;
                case 2:
                    boolean flag3 = true;
                    while (flag3){
                        System.out.println("""
                    Please press:\s
                    1. Which recipes do you have ingrediants for
                    2. Which scaled recipes do you have ingrediants for
                    3. Make meal
                    0. Go back""");
                        choice = sc.nextInt();
                        switch (choice){
                            case 0:
                                flag3 = false;
                                break;
                            case 1:

                            case 2:
                            case 3:
                        }
                    }
                default:
                    System.out.println("Choose again!");
                    break;
            }
        }
    }
}
