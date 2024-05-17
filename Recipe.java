import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum MealType {
    BREAKFAST, BRUNCH, LUNCH, DINNER
}

/**
 * Recipe with details such as name, ingredients, cooking time, description, culture, and meal type.
 */
public class Recipe {
    private String name;
    private List<String> ingredients;
    private int cookingTime;
    private String description;
    private String culture;
    private MealType mealType;
    private String instructions;

    /**
     *
     * @param name - Name of the recipe
     * @param ingredients - The list of ingredients
     * @param cookingTime- The cooking time in minutes
     * @param description - The description of the recipe
     * @param culture - The culture or cuisine of the recipe
     * @param mealType -The meal type (BREAKFAST, BRUNCH, LUNCH, or DINNER)
     */
    public Recipe(String name, List<String> ingredients, int cookingTime, String description, String culture, MealType mealType, String instructions) {
        this.name = name;
        this.ingredients = ingredients;
        this.cookingTime = cookingTime;
        this.description = description;
        this.culture = culture;
        this.mealType = mealType;
        this.instructions = instructions;
    }

    /**
     *Retrieves the name of the recipe
     * @return the name of the recipe
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the list of ingredients.
     *
     * @return the list of ingredients
     */
    public List<String> getIngredients() {
        return ingredients;
    }

    /**
     * Retrieves the cooking time in minutes.
     *
     * @return the cooking time in minutes
     */
    public int getCookingTime() {
        return cookingTime;
    }

    /**
     * Retrieves the description of the recipe.
     *
     * @return the description of the recipe
     */
    public String getDescription() {
        return description;
    }

    /**
     * Retrieves the culture or cuisine of the recipe.
     *
     * @return the culture or cuisine of the recipe
     */
    public String getCulture() {
        return culture;
    }

    /**
     * Retrieves the meal type (BREAKFAST, BRUNCH, LUNCH, or DINNER).
     *
     * @return the meal type
     */
    public MealType getMealType() {
        return mealType;
    }

    public String getInstructions() {
        return instructions;
    }
}