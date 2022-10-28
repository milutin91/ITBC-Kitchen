public class Test {
    public static void main(String[] args) {
        WeightedIngredient flour = new WeightedIngredient("Flour", 0.25);
        WeightedIngredient sugar = new WeightedIngredient("Sugar",0.103);
        WeightedIngredient salt = new WeightedIngredient("Salt",0.055);
        WeightedIngredient yogurt = new WeightedIngredient("Yogurt",0.11);
        WeightedIngredient eggs = new WeightedIngredient("Eggs",18);
        WeightedIngredient bakingPowder = new WeightedIngredient("Baking powder", 1.9);
        WeightedIngredient oil = new WeightedIngredient("Oil", 0.198);
        WeightedIngredient cheese = new WeightedIngredient("Cheese", 0.599);
        WeightedIngredient ham = new WeightedIngredient("Ham", 0.699);
        WeightedIngredient milk = new WeightedIngredient("Milk", 0.12);
        WeightedIngredient jam = new WeightedIngredient("Jam", 0.399);
        WeightedIngredient chocolate = new WeightedIngredient("Chocolate", 1.79);
        WeightedIngredient margarine = new WeightedIngredient("Margarine", 0.4);
        WeightedIngredient plasmaBiscuit = new WeightedIngredient("Plasma biscuit", 0.9);
        WeightedIngredient creamCheese = new WeightedIngredient("Cream cheese", 0.75);
        WeightedIngredient cream = new WeightedIngredient("Cream", 0.5);
        WeightedIngredient raspberries = new WeightedIngredient("Rraspberries", 1);

//        1.
        Recipe spanishPita = new Recipe("SPANISH PITA", Level.MEDIUM);
        spanishPita.addIngrediantToRecipe(flour, 100);
        spanishPita.addIngrediantToRecipe(oil, 40);
        spanishPita.addIngrediantToRecipe(yogurt, 40);
        spanishPita.addIngrediantToRecipe(eggs, 4);
        spanishPita.addIngrediantToRecipe(bakingPowder, 6);
        spanishPita.addIngrediantToRecipe(new WeightedIngredient(flour.getName(), flour.getPricePerUnit()),500);

//        2.
        Recipe fastPiroshka = new Recipe("FAST PIROSHKA", Level.BEGINNER);
        fastPiroshka.addIngrediantToRecipe(flour, 400);
        fastPiroshka.addIngrediantToRecipe(bakingPowder, 6);
        fastPiroshka.addIngrediantToRecipe(salt, 2);
        fastPiroshka.addIngrediantToRecipe(eggs,1);
        fastPiroshka.addIngrediantToRecipe(yogurt,40);
        fastPiroshka.addIngrediantToRecipe(cheese,125);
        fastPiroshka.addIngrediantToRecipe(ham,125);

//        3.
        Recipe muffin = new Recipe("MUFFIN", Level.EASY);
        muffin.addIngrediantToRecipe(milk, 250);
        muffin.addIngrediantToRecipe(sugar, 30);
        muffin.addIngrediantToRecipe(salt, 10);
        muffin.addIngrediantToRecipe(oil, 50);
        muffin.addIngrediantToRecipe(flour, 1000);

//        4.
        Recipe honeyHeart = new Recipe("HONEY HEART", Level.HARD);
        honeyHeart.addIngrediantToRecipe(sugar, 200);
        honeyHeart.addIngrediantToRecipe(flour, 400);
        honeyHeart.addIngrediantToRecipe(milk, 200);
        honeyHeart.addIngrediantToRecipe(jam, 100);
        honeyHeart.addIngrediantToRecipe(oil, 20);

//        5.
        Recipe souffle = new Recipe("SOUFFLE", Level.PRO);
        souffle.addIngrediantToRecipe(sugar, 190);
        souffle.addIngrediantToRecipe(flour, 300);
        souffle.addIngrediantToRecipe(chocolate, 200);
        souffle.addIngrediantToRecipe(margarine, 250);

//        6.
        Recipe cheeesecake = new Recipe("CHEESECAKE", Level.HARD);
        cheeesecake.addIngrediantToRecipe(plasmaBiscuit,300);
        cheeesecake.addIngrediantToRecipe(margarine, 150);
        cheeesecake.addIngrediantToRecipe(creamCheese, 400);
        cheeesecake.addIngrediantToRecipe(sugar, 100);
        cheeesecake.addIngrediantToRecipe(cream, 250);
        cheeesecake.addIngrediantToRecipe(sugar, 50);
        cheeesecake.addIngrediantToRecipe(raspberries, 400);

//        7.
        Recipe scrambledEggs = new Recipe("SCRAMLED EGGS", Level.EASY);
        scrambledEggs.addIngrediantToRecipe(eggs,4);
        scrambledEggs.addIngrediantToRecipe(oil, 10);
        scrambledEggs.addIngrediantToRecipe(salt, 1);
        scrambledEggs.addIngrediantToRecipe(eggs,4);

//        8.
        Recipe sconesWithCheese = new Recipe("SCONES WITH CHEESE", Level.HARD);
        sconesWithCheese.addIngrediantToRecipe(milk,200);
        sconesWithCheese.addIngrediantToRecipe(sugar, 10);
        sconesWithCheese.addIngrediantToRecipe(flour, 300);
        sconesWithCheese.addIngrediantToRecipe(salt, 8);
        sconesWithCheese.addIngrediantToRecipe(eggs, 1);

//        9.
        Recipe pizzaDough = new Recipe("PIZZA DOUGH", Level.PRO);
        pizzaDough.addIngrediantToRecipe(flour, 300);
        pizzaDough.addIngrediantToRecipe(oil,15);
        pizzaDough.addIngrediantToRecipe(salt, 8);
        pizzaDough.addIngrediantToRecipe(sugar, 8);

//        10.
        Recipe friedEggsWithHam = new Recipe("FRIED EGGS WITH HAM", Level.MEDIUM);
        friedEggsWithHam.addIngrediantToRecipe(eggs, 3);
        friedEggsWithHam.addIngrediantToRecipe(oil,10);
        friedEggsWithHam.addIngrediantToRecipe(salt, 5);
        friedEggsWithHam.addIngrediantToRecipe(ham, 100);
    }
}
