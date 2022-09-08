import java.util.HashMap;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fridge fridge = new Fridge(new HashMap<>());

        WeightedIngredient flour = new WeightedIngredient("Flour", 1000, 85);
        WeightedIngredient sugar = new WeightedIngredient("Sugar",1000,103);
        WeightedIngredient salt = new WeightedIngredient("Salt",1000,70);
        WeightedIngredient yogurt = new WeightedIngredient("Yogurt",1000,150);
        WeightedIngredient eggs = new WeightedIngredient("Eggs",20 ,18000);
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
        fastPiroshka.addIngrediantToRecipe(eggs,1);
        fastPiroshka.addIngrediantToRecipe(yogurt,40);
        fastPiroshka.addIngrediantToRecipe(cheese,125);
        fastPiroshka.addIngrediantToRecipe(ham,125);

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
        muffin.addIngrediantToRecipe(plasmaBiscuit,300);
        muffin.addIngrediantToRecipe(margarine, 150);
        muffin.addIngrediantToRecipe(creamCheese, 400);
        muffin.addIngrediantToRecipe(sugar, 100);
        muffin.addIngrediantToRecipe(cream, 250);
        muffin.addIngrediantToRecipe(sugar, 50);
        muffin.addIngrediantToRecipe(raspberries, 400);

//        7.
        Recipe scrambledEggs = new Recipe("SCRAMLED EGGS", new HashMap<Integer, WeightedIngredient>(), Level.EASY);
        muffin.addIngrediantToRecipe(eggs,4);
        muffin.addIngrediantToRecipe(oil, 10);
        muffin.addIngrediantToRecipe(salt, 1);

//        8.
        Recipe sconesWithCheese = new Recipe("SCONES WITH CHEESE", new HashMap<Integer, WeightedIngredient>(), Level.HARD);
        muffin.addIngrediantToRecipe(milk,200);
        muffin.addIngrediantToRecipe(sugar, 10);
        muffin.addIngrediantToRecipe(flour, 300);
        muffin.addIngrediantToRecipe(salt, 8);
        muffin.addIngrediantToRecipe(eggs, 1);

//        9.
        Recipe pizzaDough = new Recipe("PIZZA DOUGH", new HashMap<Integer, WeightedIngredient>(), Level.PRO);
        muffin.addIngrediantToRecipe(flour, 300);
        muffin.addIngrediantToRecipe(oil,15);
        muffin.addIngrediantToRecipe(salt, 8);
        muffin.addIngrediantToRecipe(sugar, 8);

//        10.
        Recipe friedEggsWithHam = new Recipe("FRIED EGGS WITH HAM", new HashMap<Integer, WeightedIngredient>(), Level.MEDIUM);
        muffin.addIngrediantToRecipe(eggs, 3);
        muffin.addIngrediantToRecipe(oil,10);
        muffin.addIngrediantToRecipe(salt, 5);
        muffin.addIngrediantToRecipe(ham, 100);

        System.out.println("---Welcome to kitchen---\n");
        System.out.println("Please press: \n1. to add food\n2. to remove food");
        if(sc.nextInt() == 1){
            System.out.println("""
                    Add food:\s
                    1. Flour
                    2. Sugar
                    3. Salt
                    4. Yogurt
                    5. Eggs
                    6. Baking powder
                    7. Oil
                    8. Cheese
                    9. Ham
                    10. Milk
                    11. Jam
                    12. Chocolate
                    13. Margarine
                    14. Plasma biscuit
                    15. Cream cheese
                    16. Cream
                    17. Rraspberries""");
//            test github
        }
    }
}
