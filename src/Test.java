import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
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
//        WeightedIngredient flour = new WeightedIngredient("Flour", 1000, 85);
//        WeightedIngredient sugar = new WeightedIngredient("Sugar",1000,103);
//        WeightedIngredient salt = new WeightedIngredient("Salt",70);
//        WeightedIngredient yogurt = new WeightedIngredient("Yogurt",1000,150);
//        WeightedIngredient eggs = new WeightedIngredient("Eggs",18000);
//        WeightedIngredient bakingPowder = new WeightedIngredient("Baking powder", 12, 2083.33);
//        WeightedIngredient oil = new WeightedIngredient("Oil", 200);
//        WeightedIngredient cheese = new WeightedIngredient("Cheese", 1000, 600);
//        WeightedIngredient ham = new WeightedIngredient("Ham", 1000, 700);
//        WeightedIngredient milk = new WeightedIngredient("Milk", 1000, 120);
//        WeightedIngredient jam = new WeightedIngredient("Jam", 1000, 400);
//        WeightedIngredient chocolate = new WeightedIngredient("Chocolate", 1000, 1600);
//        WeightedIngredient margarine = new WeightedIngredient("Margarine", 1000, 400);
//        WeightedIngredient plasmaBiscuit = new WeightedIngredient("Plasma biscuit", 1000, 900);
//        WeightedIngredient creamCheese = new WeightedIngredient("Cream cheese", 1000, 750);
//        WeightedIngredient cream = new WeightedIngredient("Cream", 1000, 500);
//        WeightedIngredient raspberries = new WeightedIngredient("Rraspberries", 1000, 1000);


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
        fastPiroshka.addIngrediantToRecipe(eggs,1);
        fastPiroshka.addIngrediantToRecipe(yogurt,40);
        fastPiroshka.addIngrediantToRecipe(cheese,125);
        fastPiroshka.addIngrediantToRecipe(ham,125);

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
//
////        5.
        Recipe souffle = new Recipe("SOUFFLE", new ArrayList<>(), Level.PRO);
        souffle.addIngrediantToRecipe(sugar, 190);
        souffle.addIngrediantToRecipe(flour, 300);
        souffle.addIngrediantToRecipe(chocolate, 200);
        souffle.addIngrediantToRecipe(margarine, 250);
//
////        6.
        Recipe cheeesecake = new Recipe("CHEESECAKE", new ArrayList<>(), Level.HARD);
        cheeesecake.addIngrediantToRecipe(plasmaBiscuit,300);
        cheeesecake.addIngrediantToRecipe(margarine, 150);
        cheeesecake.addIngrediantToRecipe(creamCheese, 400);
        cheeesecake.addIngrediantToRecipe(sugar, 100);
        cheeesecake.addIngrediantToRecipe(cream, 250);
        cheeesecake.addIngrediantToRecipe(sugar, 50);
        cheeesecake.addIngrediantToRecipe(raspberries, 400);
//
//
////        7.
        Recipe scrambledEggs = new Recipe("SCRAMLED EGGS", new ArrayList<>(), Level.EASY);
        scrambledEggs.addIngrediantToRecipe(eggs,4);
        scrambledEggs.addIngrediantToRecipe(oil, 10);
        scrambledEggs.addIngrediantToRecipe(salt, 1);
        scrambledEggs.addIngrediantToRecipe(eggs,4);
//
////        8.
        Recipe sconesWithCheese = new Recipe("SCONES WITH CHEESE", new ArrayList<>(), Level.HARD);
        sconesWithCheese.addIngrediantToRecipe(milk,200);
        sconesWithCheese.addIngrediantToRecipe(sugar, 10);
        sconesWithCheese.addIngrediantToRecipe(flour, 300);
        sconesWithCheese.addIngrediantToRecipe(salt, 8);
        sconesWithCheese.addIngrediantToRecipe(eggs, 1);

//        9.
        Recipe pizzaDough = new Recipe("PIZZA DOUGH", new ArrayList<>(), Level.PRO);
        pizzaDough.addIngrediantToRecipe(flour, 300);
        pizzaDough.addIngrediantToRecipe(oil,15);
        pizzaDough.addIngrediantToRecipe(salt, 8);
        pizzaDough.addIngrediantToRecipe(sugar, 8);

//        10.
        Recipe friedEggsWithHam = new Recipe("FRIED EGGS WITH HAM", new ArrayList<>(), Level.MEDIUM);
        friedEggsWithHam.addIngrediantToRecipe(eggs, 3);
        friedEggsWithHam.addIngrediantToRecipe(oil,10);
        friedEggsWithHam.addIngrediantToRecipe(salt, 5);
        friedEggsWithHam.addIngrediantToRecipe(ham, 100);

        Fridge fridge = new Fridge(new LinkedList<>());
////        fridge.isEmpty();
//        System.out.println(fridge);
//        System.out.println(Database.dbAllRecipes);
//        System.out.println(scrambledEggs);
//        fridge.addToFridge(salt, 50);
//        System.out.println(fridge);
//
//
//        fridge.addToFridge(oil, 20);
//        System.out.println(Database.dbAllRecipes);
//        System.out.println(scrambledEggs);
        System.out.println("spanishPita " + spanishPita.getPrice());
        System.out.println("fastPiroshka " + fastPiroshka.getPrice());
        System.out.println("muffin " + muffin.getPrice());
        System.out.println("honeyHeart " + honeyHeart.getPrice());
        System.out.println("souffle " + souffle.getPrice());
        System.out.println("cheeesecake " + cheeesecake.getPrice());
        System.out.println("scrambledEggs " + scrambledEggs.getPrice());
        System.out.println("sconesWithCheese " + sconesWithCheese.getPrice());
        System.out.println("pizzaDough " + pizzaDough.getPrice());
        System.out.println("friedEggsWithHam " + friedEggsWithHam.getPrice());

//        Database d1 = new Database();
//        d1.addToWIngrediantsDB(flour);
//        d1.addToWIngrediantsDB(sugar);
//        d1.addToWIngrediantsDB(salt);
//        d1.addToWIngrediantsDB(yogurt);
//        System.out.println(d1);

//        Fridge fridge = new Fridge(new HashMap<>());
//        fridge.addToFridge(eggs,20);
//        fridge.addToFridge(eggs,20);
//        fridge.removeFromFridge(eggs,39);
//        System.out.println(fridge);
    }
}
