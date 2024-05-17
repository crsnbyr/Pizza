import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define recipes for different cultures
        Map<String, Map<String, List<Recipe>>> recipes = new HashMap<>();


        // Chinese recipes
        Map<String, List<Recipe>> chineseRecipes = new HashMap<>();
        chineseRecipes.put("breakfast", Arrays.asList(
                new Recipe("Chinese Scallion Pancakes", Arrays.asList("flour", "scallions", "oil"), 20, "Savory pancakes made with flour and scallions.")
        ));
        chineseRecipes.put("brunch", Arrays.asList(
                new Recipe("Dim Sum", Arrays.asList("dumplings", "buns", "shrimp balls"), 30, "Assorted bite-sized Chinese dishes, often served with tea.")
        ));
        chineseRecipes.put("lunch", Arrays.asList(
                new Recipe("General Tso's Chicken", Arrays.asList("chicken", "soy sauce", "sugar"), 25, "A popular Chinese-American dish featuring deep-fried chicken in a sweet and spicy sauce."),
                new Recipe("Hot and Sour Soup", Arrays.asList("tofu", "mushrooms", "bamboo shoots", "vinegar"), 20, "A tangy and spicy soup made with tofu, mushrooms, and other ingredients.")
        ));
        chineseRecipes.put("dinner", Arrays.asList(
                new Recipe("Kung Pao Chicken", Arrays.asList("chicken", "peanuts", "vegetables"), 25, "A spicy stir-fry dish made with chicken, peanuts, and vegetables."),
                new Recipe("Sweet and Sour Pork", Arrays.asList("pork", "pineapple", "bell peppers"), 30, "A classic Chinese dish featuring crispy pork in a tangy sweet and sour sauce.")
        ));
        recipes.put("chinese", chineseRecipes);

        // American recipes
        Map<String, List<Recipe>> americanRecipes = new HashMap<>();
        americanRecipes.put("breakfast", Arrays.asList(
                new Recipe("Pancakes", Arrays.asList("flour", "milk", "eggs", "baking powder"), 15, "Fluffy pancakes served with butter and syrup.")
        ));
        americanRecipes.put("brunch", Arrays.asList(
                new Recipe("Avocado Toast", Arrays.asList("bread", "avocado", "lemon juice", "salt"), 10, "Mashed avocado on toasted bread, often served with additional toppings like eggs or tomatoes.")
        ));
        americanRecipes.put("lunch", Arrays.asList(
                new Recipe("Cheeseburger", Arrays.asList("ground beef", "cheese", "lettuce", "tomato", "bun"), 20, "An iconic American sandwich featuring a beef patty topped with cheese and vegetables."),
                new Recipe("Macaroni and Cheese", Arrays.asList("macaroni", "cheese", "milk", "butter"), 30, "A creamy and cheesy pasta dish loved by both kids and adults.")
        ));
        americanRecipes.put("dinner", Arrays.asList(
                new Recipe("Grilled Steak", Arrays.asList("steak", "salt", "pepper", "oil"), 20, "Juicy steak seasoned and grilled to perfection."),
                new Recipe("BBQ Ribs", Arrays.asList("pork ribs", "BBQ sauce", "spices"), 60, "Slow-cooked ribs glazed with barbecue sauce.")
        ));
        recipes.put("american", americanRecipes);

        // Italian recipes
        Map<String, List<Recipe>> italianRecipes = new HashMap<>();
        italianRecipes.put("breakfast", Arrays.asList(
                new Recipe("Frittata", Arrays.asList("eggs", "cheese", "vegetables"), 20, "An Italian omelette made with eggs and various fillings.")
        ));
        italianRecipes.put("brunch", Arrays.asList(
                new Recipe("Bruschetta", Arrays.asList("bread", "tomatoes", "garlic", "olive oil"), 15, "Toasted bread topped with diced tomatoes, garlic, and olive oil.")
        ));
        italianRecipes.put("lunch", Arrays.asList(
                new Recipe("Spaghetti Carbonara", Arrays.asList("spaghetti", "bacon", "eggs", "Parmesan cheese"), 20, "A classic Italian pasta dish made with eggs, cheese, and pancetta or bacon."),
                new Recipe("Caprese Salad", Arrays.asList("tomatoes", "mozzarella cheese", "basil", "olive oil"), 10, "A simple salad made with tomatoes, mozzarella cheese, and fresh basil leaves.")
        ));
        italianRecipes.put("dinner", Arrays.asList(
                new Recipe("Margherita Pizza", Arrays.asList("pizza dough", "tomatoes", "mozzarella cheese", "basil"), 15, "A simple yet delicious pizza topped with tomatoes, cheese, and fresh basil leaves."),
                new Recipe("Chicken Alfredo", Arrays.asList("chicken", "fettuccine pasta", "cream sauce"), 25, "Creamy pasta dish made with chicken, fettuccine, and Alfredo sauce.")
        ));
        recipes.put("italian", italianRecipes);
        // Japanese recipes
        Map<String, List<Recipe>> japaneseRecipes = new HashMap<>();
        japaneseRecipes.put("breakfast", Arrays.asList(
                new Recipe("Tamagoyaki", Arrays.asList("eggs", "soy sauce", "sugar"), 15, "A sweet and savory Japanese omelette."),
                new Recipe("Miso Soup", Arrays.asList("miso paste", "tofu", "seaweed"), 10, "A traditional Japanese soup made with fermented soybean paste.")
        ));
        japaneseRecipes.put("brunch", Arrays.asList(
                new Recipe("Okonomiyaki", Arrays.asList("flour", "cabbage", "bacon", "eggs"), 25, "A savory Japanese pancake containing a variety of ingredients."),
                new Recipe("Onigiri", Arrays.asList("rice", "seaweed", "filling of choice"), 20, "A Japanese rice ball often filled with pickled plum, fish, or other ingredients.")
        ));
        japaneseRecipes.put("lunch", Arrays.asList(
                new Recipe("Tonkatsu", Arrays.asList("pork cutlet", "flour", "egg", "panko breadcrumbs"), 30, "A breaded and deep-fried pork cutlet, often served with cabbage and tonkatsu sauce."),
                new Recipe("Udon Noodle Soup", Arrays.asList("udon noodles", "broth", "green onions", "tempura"), 20, "A hot noodle soup made with thick wheat noodles and various toppings.")
        ));
        japaneseRecipes.put("dinner", Arrays.asList(
                new Recipe("Sushi", Arrays.asList("rice", "fish", "seaweed"), 30, "A traditional Japanese dish made with vinegared rice and various ingredients."),
                new Recipe("Ramen", Arrays.asList("noodles", "broth", "egg", "pork"), 45, "A popular noodle soup dish originating from Japan.")
        ));
        recipes.put("japanese", japaneseRecipes);

        // Gather user preferences
        System.out.println("Welcome to the Recipe App!");
        System.out.println("What meal are you planning? (Breakfast, Brunch, Lunch, Dinner): ");
        String mealChoice = scanner.nextLine().toLowerCase();
        System.out.println("What culture are you interested in? (Japanese, Chinese, American, Italian, etc.): ");
        String cultureChoice = scanner.nextLine().toLowerCase();

        // Filter recipes based on user choices
        Map<String, List<Recipe>> cultureRecipes = recipes.getOrDefault(cultureChoice, Collections.emptyMap());
        List<Recipe> filteredRecipes = cultureRecipes.getOrDefault(mealChoice, Collections.emptyList());

        // Display filtered recipes
        if (filteredRecipes.isEmpty()) {
            System.out.println("Sorry, no recipes found for the selected culture and meal.");
        } else {
            System.out.println("Here are the recipes for " + cultureChoice + " " + mealChoice + ":");
            for (int i = 0; i < filteredRecipes.size(); i++) {
                System.out.println((i+1) + ". " + filteredRecipes.get(i).getName());
            }
            System.out.println("Would you like to select a recipe (enter its number) or get a random one? (Y/N)");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("Y")) {
                System.out.println("Enter the number of the recipe you'd like to view: ");
                int recipeNumber = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                if (recipeNumber >= 1 && recipeNumber <= filteredRecipes.size()) {
                    Recipe selectedRecipe = filteredRecipes.get(recipeNumber - 1);
                    displayRecipe(selectedRecipe);
                    // Check if user wants to select another recipe or if they like it
                    // Add functionality to handle allergies
                } else {
                    System.out.println("Invalid recipe number. Please try again.");
                }
            } else {
                // Generate a random recipe
                Random random = new Random();
                Recipe randomRecipe = filteredRecipes.get(random.nextInt(filteredRecipes.size()));
                displayRecipe(randomRecipe);
                // Check if user wants to select another recipe or if they like it
                // Add functionality to handle allergies
            }
        }
    }

    static void displayRecipe(Recipe recipe) {
        System.out.println("Recipe: " + recipe.getName());
        System.out.println("Ingredients: " + recipe.getIngredients());
        System.out.println("Cooking Time: " + recipe.getCookingTime() + " minutes");
        System.out.println("Description: " + recipe.getDescription());
        System.out.println(" __       ___,.-------..__        __");
        System.out.println("//\\ _,-''                `'--._ //\\");
        System.out.println("\\ ;'                           `: //");
        System.out.println("`(                               )'");
        System.out.println(":.                           ,;");
        System.out.println("`.`--.___           ___.--','");
        System.out.println("`.       ``-------''     ,'");
        System.out.println("   ' - --.               ,-");
        System.out.println("         `-._______.-'");
        //this art is supposed to be a bowl
    }
}

class Recipe {
    private String name;
    private List<String> ingredients;
    private int cookingTime;
    private String description;
    // Want to add allergies

    public Recipe(String name, List<String> ingredients, int cookingTime, String description) {
        this.name = name;
        this.ingredients = ingredients;
        this.cookingTime = cookingTime;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public String getDescription() {
        return description;
    }
}