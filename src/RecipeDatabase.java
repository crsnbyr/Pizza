import java.util.ArrayList;
import java.util.List;

/**
 * Database for recipes.
 */
public class RecipeDatabase {
    private List<Recipe> recipes;

    public RecipeDatabase() {
        recipes = new ArrayList<>();

        // Breakfast Recipes:
        recipes.add(new Recipe("Tropical Smoothie Bowl",
                List.of("frozen banana", "frozen mango", "frozen pineapple", "coconut milk", "spinach", "toppings: sliced kiwi, shredded coconut, granola, chia seeds"),
                20,
                "A refreshing and nutritious smoothie bowl packed with tropical flavors.",
                "International",
                MealType.BREAKFAST,"1. In a blender, combine frozen banana, frozen mango, frozen pineapple, coconut milk, and spinach.\n" +
                "2. Blend until smooth and creamy.\n" +
                "3. Pour the smoothie into a bowl.\n" +
                "4. Top with sliced kiwi, shredded coconut, granola, and chia seeds.\n" +
                "5. Enjoy!"));
        recipes.add(new Recipe("Kahvaltı",
                List.of("assorted cheeses (feta, kashkaval)", "olives", "tomatoes", "cucumbers", "boiled eggs", "honey", "jams", "bread (simit or crusty bread)", "Turkish tea"),
                20,
                "A traditional Turkish breakfast spread featuring a variety of cheeses, olives, fresh vegetables, eggs, jams, and bread served with Turkish tea.",
                "Turkish",
                MealType.BREAKFAST,
                "1. Arrange assorted cheeses, olives, tomatoes, cucumbers, and boiled eggs on a platter.\n" +
                        "2. Serve honey, jams, and bread (simit or crusty bread) on the side.\n" +
                        "3. Enjoy with Turkish tea."));
        recipes.add(new Recipe("Chilaquiles",
                List.of("tortilla chips", "salsa verde or roja", "shredded chicken or fried eggs", "queso fresco or cotija cheese", "sour cream", "avocado slices", "chopped cilantro", "sliced radishes"),
                30,
                "Chilaquiles are a classic Mexican breakfast dish made with fried tortilla chips simmered in salsa and topped with various ingredients like shredded chicken or fried eggs, cheese, sour cream, avocado, and cilantro.",
                "Mexican",
                MealType.BREAKFAST,
                "1. In a skillet, heat salsa verde or roja until simmering.\n" +
                        "2. Add tortilla chips to the skillet and toss until evenly coated.\n" +
                        "3. Top the chips with shredded chicken or fried eggs and queso fresco or cotija cheese.\n" +
                        "4. Cook until the cheese is melted and the chicken or eggs are heated through.\n" +
                        "5. Serve hot with sour cream, avocado slices, chopped cilantro, and sliced radishes.\n" +
                        "6. Enjoy!"));
        recipes.add(new Recipe("Bougatsa",
                List.of("phyllo dough", "semolina custard filling (made with milk, semolina flour, sugar, eggs, vanilla extract)", "powdered sugar", "cinnamon"),
                45,
                "Bougatsa is a traditional Greek breakfast pastry made with layers of crispy phyllo dough filled with a creamy semolina custard filling. It's typically dusted with powdered sugar and cinnamon before serving.",
                "Greek",
                MealType.BREAKFAST,
                "1. Preheat the oven to 350°F (175°C).\n" +
                        "2. Prepare the semolina custard filling by heating milk in a saucepan until hot but not boiling.\n" +
                        "3. In a bowl, whisk together semolina flour, sugar, eggs, and vanilla extract until smooth.\n" +
                        "4. Slowly pour the hot milk into the semolina mixture, whisking constantly.\n" +
                        "5. Return the mixture to the saucepan and cook over medium heat, stirring constantly, until thickened.\n" +
                        "6. Remove from heat and let cool slightly.\n" +
                        "7. Layer sheets of phyllo dough in a greased baking dish, brushing each sheet with melted butter.\n" +
                        "8. Spread the semolina custard filling over the phyllo dough.\n" +
                        "9. Top with more layers of phyllo dough, brushing each sheet with melted butter.\n" +
                        "10. Bake in the preheated oven for 45 minutes or until golden brown and crispy.\n" +
                        "11. Remove from the oven and let cool slightly.\n" +
                        "12. Dust with powdered sugar and cinnamon.\n" +
                        "13. Slice and serve warm.\n" +
                        "14. Enjoy!"));
        recipes.add(new Recipe("Roti Canai",
                List.of("roti canai dough (made with flour, water, salt, and ghee)", "ghee or butter for frying", "curry sauce or dhal curry for dipping"),
                60,
                "Roti Canai is a popular Malaysian breakfast dish consisting of flaky, crispy flatbread served with a side of flavorful curry sauce or dhal curry for dipping.",
                "Malaysian",
                MealType.BREAKFAST,
                "1. Divide the roti canai dough into small balls.\n" +
                        "2. Flatten each ball into a thin circle on a lightly oiled surface.\n" +
                        "3. Fold the edges of the circle towards the center to form a square.\n" +
                        "4. Heat ghee or butter in a skillet over medium heat.\n" +
                        "5. Cook the roti canai until golden brown and crispy on both sides.\n" +
                        "6. Serve hot with curry sauce or dhal curry for dipping.\n" +
                        "7. Enjoy!"));
        recipes.add(new Recipe("Banitsa with Cabbage (Zelnik)",
                List.of("phyllo dough", "cabbage filling (made with shredded cabbage, onions, garlic, paprika, salt, pepper)", "yogurt"), 40,
                "Banitsa with cabbage, also known as Zelnik, is a Bulgarian breakfast pastry made with layers of phyllo dough filled with a savory cabbage filling. It's typically served with yogurt on the side.",
                "Bulgarian",
                MealType.BREAKFAST,
                "1. Preheat the oven to 350°F (175°C).\n" +
                        "2. Prepare the cabbage filling by sautéing shredded cabbage, onions, and garlic in a skillet until softened.\n" +
                        "3. Season with paprika, salt, and pepper to taste.\n" +
                        "4. Layer sheets of phyllo dough in a greased baking dish, brushing each sheet with melted butter.\n" +
                        "5. Spread the cabbage filling over the phyllo dough.\n" +
                        "6. Repeat layers of phyllo dough and cabbage filling, brushing each sheet with melted butter.\n" +
                        "7. Bake in the preheated oven for 40 minutes or until golden brown and crispy.\n" +
                        "8. Remove from the oven and let cool slightly.\n" +
                        "9. Serve warm with yogurt on the side.\n" +
                        "10. Enjoy!"));
        recipes.add(new Recipe("Komplet Lepinja",
                List.of("lepinja bread", "scrambled eggs", "sujuk (spicy sausage)", "kajmak (clotted cream)", "ajvar (roasted red pepper and eggplant spread)", "fresh vegetables"),
                30,
                "Komplet lepinja is a Bosnian breakfast dish featuring lepinja bread topped with scrambled eggs, sujuk sausage, kajmak, ajvar, and fresh vegetables.",
                "Bosnian",
                MealType.BREAKFAST,
                "1. Heat the lepinja bread in a skillet or oven until warm.\n" +
                        "2. Meanwhile, prepare scrambled eggs in a separate skillet.\n" +
                        "3. Cook sujuk sausage until browned and cooked through.\n" +
                        "4. Spread kajmak on the warm lepinja bread.\n" +
                        "5. Top with scrambled eggs, cooked sujuk sausage, and ajvar.\n" +
                        "6. Serve hot with fresh vegetables on the side.\n" +
                        "7. Enjoy!"));
        recipes.add(new Recipe("Jianbing",
                List.of("mung bean flour batter", "eggs", "scallions", "cilantro", "hoisin sauce", "chili sauce", "crispy fried wonton or cracker", "sesame seeds"),
                20,
                "Jianbing is a popular Chinese street food breakfast made with a thin crepe-like pancake spread with a savory sauce, eggs, herbs, and crispy fried wonton or cracker. It's folded and served as a handheld breakfast wrap.",
                "Chinese",
                MealType.BREAKFAST,
                "1. Heat a non-stick skillet over medium heat.\n" +
                        "2. Pour a ladleful of mung bean flour batter onto the skillet and spread it into a thin circle.\n" +
                        "3. Crack an egg onto the batter and spread it evenly.\n" +
                        "4. Sprinkle chopped scallions and cilantro over the egg.\n" +
                        "5. Cook until the bottom is golden brown and crispy.\n" +
                        "6. Flip the jianbing and cook for another minute.\n" +
                        "7. Spread hoisin sauce and chili sauce over the jianbing.\n" +
                        "8. Place a crispy fried wonton or cracker in the center.\n" +
                        "9. Fold the jianbing into a handheld wrap and sprinkle with sesame seeds.\n" +
                        "10. Enjoy!"));
        recipes.add(new Recipe("Vegan American-Style Pancakes",
                List.of("flour", "baking powder", "sugar", "salt", "non-dairy milk (such as almond milk or soy milk)", "vinegar or lemon juice (for buttermilk substitute)", "oil (such as coconut oil)", "vanilla extract"),
                20,
                "Vegan American-style pancakes are fluffy and delicious pancakes made without eggs or dairy. They're perfect for a vegan-friendly breakfast, topped with maple syrup, fresh fruit, or vegan whipped cream.",
                "American",
                MealType.BREAKFAST,
                "1. In a mixing bowl, whisk together flour, baking powder, sugar, and salt.\n" +
                        "2. In another bowl, mix non-dairy milk with vinegar or lemon juice and let it sit for a few minutes to curdle, creating a buttermilk substitute.\n" +
                        "3. Add the oil and vanilla extract to the milk mixture.\n" +
                        "4. Pour the wet ingredients into the dry ingredients and mix until just combined.\n" +
                        "5. Heat a non-stick skillet or griddle over medium heat and lightly oil it.\n" +
                        "6. Pour about 1/4 cup of batter onto the skillet for each pancake.\n" +
                        "7. Cook until bubbles form on the surface, then flip and cook until golden brown on the other side.\n" +
                        "8. Serve hot with your favorite toppings such as maple syrup, fresh fruit, or vegan whipped cream.\n" +
                        "9. Enjoy!"));
        recipes.add(new Recipe("Vegan Masala Dosa",
                List.of("dosa batter (made with rice and urad dal)", "potato masala filling (made with boiled potatoes, onions, green chilies, mustard seeds, curry leaves, turmeric, salt)", "coconut chutney", "sambar"),
                45,
                "Vegan masala dosa is a South Indian breakfast dish consisting of a thin, crispy crepe made from fermented rice and lentil batter, filled with a spiced potato masala filling. It's served with coconut chutney and sambar for dipping.","Indian",
                MealType.BREAKFAST,
                "1. Heat a non-stick skillet or dosa pan over medium heat.\n" +
                        "2. Pour a ladleful of dosa batter onto the center of the pan and spread it into a thin circle using a circular motion.\n" +
                        "3. Drizzle oil around the edges of the dosa and cook until the bottom is golden brown and crispy.\n" +
                        "4. Spoon a portion of the potato masala filling onto one half of the dosa.\n" +
                        "5. Fold the other half of the dosa over the filling to form a semi-circle.\n" +
                        "6. Cook for another minute, then remove from the pan.\n" +
                        "7. Serve hot with coconut chutney and sambar for dipping.\n" +
                        "8. Enjoy!"));

        // Lunch Recipes:
        recipes.add(new Recipe("Sushi Rolls",
                List.of("sushi rice", "nori sheets", "assorted fillings: cucumber, avocado, crab stick, smoked salmon, etc.", "soy sauce", "wasabi", "pickled ginger"),
                30,
                "Sushi rolls are a popular Japanese dish made with sushi rice and various fillings rolled in nori seaweed. They are served with soy sauce, wasabi, and pickled ginger.",
                "Japanese",
                MealType.LUNCH,
                "1. Cook sushi rice according to package instructions and let it cool to room temperature.\n" +
                        "2. Place a nori sheet on a bamboo sushi mat.\n" +
                        "3. Spread a thin layer of sushi rice over the nori sheet, leaving about 1 inch of space at the top.\n" +
                        "4. Arrange your choice of fillings (cucumber, avocado, crab stick, smoked salmon, etc.) in a line across the center of the rice.\n" +
                        "5. Using the bamboo mat, roll the nori sheet tightly around the fillings, applying gentle pressure to shape the roll.\n" +
                        "6. Use a sharp knife to slice the sushi roll into bite-sized pieces.\n" +
                        "7. Serve with soy sauce, wasabi, and pickled ginger on the side.\n" +
                        "8. Enjoy!"));
        recipes.add(new Recipe("Pasta Carbonara",
                List.of("spaghetti or fettuccine pasta", "bacon or pancetta", "eggs", "grated Parmesan cheese", "garlic", "black pepper", "olive oil"),
                20,
                "Pasta carbonara is an Italian pasta dish made with eggs, cheese, bacon or pancetta, and black pepper. It's creamy, savory, and delicious.",
                "Italian",
                MealType.LUNCH,
                "1. Cook the pasta in a large pot of salted boiling water according to package instructions until al dente.\n" +
                        "2. While the pasta is cooking, heat olive oil in a large skillet over medium heat.\n" +
                        "3. Add minced garlic and chopped bacon or pancetta to the skillet, and cook until the bacon is crispy and golden brown.\n" +
                        "4. In a separate bowl, whisk together eggs, grated Parmesan cheese, and black pepper.\n" +
                        "5. Drain the cooked pasta and add it to the skillet with the bacon and garlic, tossing to coat.\n" +
                        "6. Remove the skillet from the heat and quickly pour the egg and cheese mixture over the hot pasta, tossing continuously to coat the pasta evenly.\n" +
                        "7. The heat from the pasta will cook the eggs and melt the cheese, creating a creamy sauce.\n" +
                        "8. Serve immediately, garnished with additional grated Parmesan cheese and black pepper if desired.\n" +
                        "9. Enjoy!"));
        recipes.add(new Recipe("Japanese Bento Box",
                List.of("Cooked rice", "Grilled salmon or chicken teriyaki", "Pickled vegetables (such as cucumber, radish, or ginger)", "Tamagoyaki (Japanese rolled omelette)", "Nori (seaweed) sheets", "Soy sauce for dipping"),
                30,
                "A traditional Japanese lunchbox featuring a balanced assortment of rice, protein, pickled vegetables, and side dishes, meticulously arranged for visual appeal and nutritional balance.",
                "Japan",
                MealType.LUNCH,
                "1. Cook rice according to package instructions and let it cool to room temperature.\n" +
                        "2. Grill salmon or prepare chicken teriyaki according to your preference and slice into bite-sized pieces.\n" +
                        "3. Prepare pickled vegetables by slicing cucumber, radish, or ginger and marinating them in vinegar.\n" +
                        "4. Make tamagoyaki (Japanese rolled omelette) by whisking eggs with a little soy sauce and sugar, then cooking them in a rectangular pan and rolling them up.\n" +
                        "5. Cut nori sheets into strips or shapes for decoration.\n" +
                        "6. Assemble the bento box by arranging rice, grilled salmon or chicken, pickled vegetables, tamagoyaki, and nori sheets in separate compartments.\n" +
                        "7. Serve with soy sauce for dipping and enjoy your meticulously prepared Japanese lunchbox!"));
        recipes.add(new Recipe("Greek Salad",
                List.of("Ripe tomatoes, sliced", "Cucumber, sliced", "Red onion, thinly sliced", "Kalamata olives", "Feta cheese, crumbled", "Extra virgin olive oil", "Red wine vinegar", "Fresh oregano", "Salt and pepper to taste"),
                15,
                "A refreshing and vibrant salad showcasing the flavors of Greece, with ripe tomatoes, crisp cucumbers, briny olives, and tangy feta cheese, tossed in a simple dressing of olive oil, vinegar, and herbs.",
                "Greece",
                MealType.LUNCH,
                "1. Slice ripe tomatoes, cucumber, and red onion, and place them in a large salad bowl.\n" +
                        "2. Add Kalamata olives and crumbled feta cheese to the bowl.\n" +
                        "3. In a small bowl, whisk together extra virgin olive oil, red wine vinegar, chopped fresh oregano, salt, and pepper to taste to make the dressing.\n" +
                        "4. Drizzle the dressing over the salad and toss gently to combine.\n" +
                        "5. Serve immediately as a refreshing side dish or light lunch.\n" +
                        "6. Enjoy the vibrant flavors of Greece in every bite of this delicious salad!"));
        recipes.add(new Recipe("Portuguese Grilled Sardines",
                List.of("Fresh sardines, cleaned and scaled", "Olive oil", "Lemon juice", "Garlic, minced", "Fresh parsley, chopped", "Salt and pepper to taste"),
                20,
                "A quintessential Portuguese dish featuring fresh sardines marinated in olive oil, lemon, garlic, and parsley, then grilled to perfection until crispy on the outside and tender on the inside.",
                "Portugal",
                MealType.LUNCH,
                "1. Preheat a grill to medium-high heat.\n" +
                        "2. In a bowl, combine olive oil, lemon juice, minced garlic, chopped parsley, salt, and pepper to make the marinade.\n" +
                        "3. Place the cleaned and scaled sardines in a shallow dish and pour the marinade over them, ensuring they are well coated.\n" +
                        "4. Marinate the sardines for about 10-15 minutes to allow the flavors to infuse.\n" +
                        "5. Once marinated, place the sardines on the preheated grill and cook for about 3-4 minutes on each side, or until they are cooked through and crispy on the outside.\n" +
                        "6. Remove the grilled sardines from the heat and serve hot, garnished with additional chopped parsley and lemon wedges.\n" +
                        "7. Enjoy!"));
        recipes.add(new Recipe("Chinese Mapo Tofu",
                List.of("Firm tofu, cubed", "Ground pork (optional)", "Doubanjiang (fermented bean paste)", "Garlic, minced", "Ginger, minced", "Sichuan peppercorns", "Green onions, chopped", "Soy sauce", "Chili oil"),
                25,
                "A spicy and flavorful Sichuan dish featuring silken tofu simmered in a fiery sauce made with doubanjiang, garlic, ginger, and Sichuan peppercorns, topped with aromatic green onions.",
                "China",
                MealType.LUNCH,
                "1. Heat a wok or large skillet over medium heat.\n" +
                        "2. Add minced garlic, minced ginger, and ground pork (if using) to the wok and cook until the pork is browned and cooked through.\n" +
                        "3. Stir in doubanjiang (fermented bean paste) and Sichuan peppercorns, and cook for another minute to release their flavors.\n" +
                        "4. Add cubed firm tofu to the wok along with soy sauce and chili oil.\n" +
                        "5. Gently stir to coat the tofu with the sauce, taking care not to break the tofu cubes.\n" +
                        "6. Simmer the tofu in the sauce for 5-7 minutes, allowing it to absorb the flavors.\n" +
                        "7. If the sauce is too thick, you can add a little water to adjust the consistency.\n" +
                        "8. Once the tofu is heated through and the sauce has thickened slightly, remove the wok from the heat.\n" +
                        "9. Serve the mapo tofu hot, garnished with chopped green onions.\n" +
                        "10. Enjoy!"));
        recipes.add(new Recipe("Mexican Tacos al Pastor",
                List.of("Pork shoulder, thinly sliced", "Pineapple, sliced", "Corn tortillas", "White onion, finely chopped", "Fresh cilantro, chopped", "Lime wedges", "Salsa verde or roja"),
                40,
                "A tantalizing Mexican street food favorite featuring marinated pork cooked on a vertical rotisserie, thinly sliced, and served in warm corn tortillas with grilled pineapple, onions, cilantro, and a squeeze of lime.",
                "Mexico",
                MealType.LUNCH,
                "1. Marinate thinly sliced pork shoulder with a blend of spices, including achiote paste, pineapple juice, garlic, and citrus juices, for at least 2 hours or overnight.\n" +
                        "2. Preheat a grill or broiler to high heat.\n" +
                        "3. Skewer the marinated pork slices and pineapple slices alternately onto a vertical rotisserie or onto skewers.\n" +
                        "4. Cook the pork and pineapple under the grill or broiler, rotating occasionally, until the pork is cooked through and slightly charred on the edges.\n" +
                        "5. While the pork is cooking, warm the corn tortillas on the grill or in a skillet until soft and pliable.\n" +
                        "6. Assemble the tacos by placing a few slices of the grilled pork onto each tortilla, topping with grilled pineapple, chopped onion, cilantro, and a squeeze of lime juice.\n" +
                        "7. Serve the tacos al pastor with salsa verde or roja on the side.\n" +
                        "8. Enjoy!"));
        recipes.add(new Recipe("Spanish Paella",
                List.of("Bomba or Arborio rice", "Chicken thighs or rabbit, cut into pieces", "Spanish chorizo, sliced", "Prawns or other seafood (optional)", "Saffron threads", "Onion, diced", "Red bell pepper, diced", "Garlic, minced", "Tomatoes, diced", "Peas", "Spanish paprika", "Olive oil", "Lemon wedges for serving"),
                45,
                "A vibrant and aromatic rice dish cooked with a medley of meats, seafood, and vegetables, infused with the flavors of saffron, paprika, and tomatoes, creating a rich and savory one-pan meal.",
                "Spain",
                MealType.LUNCH,
                "1. Heat olive oil in a large paella pan or skillet over medium heat.\n" +
                        "2. Add diced onion, diced red bell pepper, and minced garlic to the pan, and sauté until softened.\n" +
                        "3. Add sliced Spanish chorizo to the pan and cook until it releases its oils.\n" +
                        "4. Stir in bomba or Arborio rice, coating it in the oil and spices, and cook for a few minutes until lightly toasted.\n" +
                        "5. Dissolve saffron threads in warm water and add the saffron-infused water to the pan.\n" +
                        "6. Pour in chicken broth or water, diced tomatoes, peas, and Spanish paprika, stirring to combine.\n" +
                        "7. Arrange chicken thighs or rabbit pieces on top of the rice mixture, pushing them down slightly into the liquid.\n" +
                        "8. Reduce the heat to low and let the paella simmer gently, without stirring, until the rice is cooked and the liquid is absorbed, about 20-25 minutes.\n" +
                        "9. If using seafood, add prawns or other seafood to the paella during the last 5-10 minutes of cooking, covering the pan with a lid to steam the seafood.\n" +
                        "10. Once the rice is cooked and the chicken (and seafood) is cooked through, remove the paella from the heat and let it rest for a few minutes.\n" +
                        "11. Serve the paella hot, garnished with lemon wedges for squeezing over the top.\n" +
                        "12. Enjoy!"));
        recipes.add(new Recipe("Vegan Buddha Bowl",
                List.of("Cooked quinoa or brown rice", "Roasted vegetables (such as sweet potatoes, broccoli, and cauliflower)", "Chickpeas, roasted with spices", "Avocado slices", "Fresh spinach or kale", "Hummus or tahini dressing", "Lemon wedges"),
                30,
                "A nourishing and colorful bowl filled with a variety of nutrient-rich ingredients, including whole grains, roasted vegetables, protein-packed chickpeas, creamy avocado, and a drizzle of tahini or hummus dressing.",
                "International",
                MealType.LUNCH,
                "1. Preheat your oven to 400°F (200°C).\n" +
                        "2. Cook quinoa or brown rice according to package instructions and set aside.\n" +
                        "3. Toss chopped sweet potatoes, broccoli, and cauliflower with olive oil, salt, and pepper on a baking sheet.\n" +
                        "4. Roast the vegetables in the preheated oven for about 20-25 minutes, or until tender and golden brown.\n" +
                        "5. Meanwhile, rinse and drain canned chickpeas, then toss them with olive oil and spices of your choice (such as paprika, cumin, garlic powder, and chili powder).\n" +
                        "6. Spread the seasoned chickpeas on a separate baking sheet and roast them in the oven for 15-20 minutes, or until crispy.\n" +
                        "7. Assemble your Buddha bowls by dividing cooked quinoa or brown rice among serving bowls.\n" +
                        "8. Top with roasted vegetables, crispy chickpeas, avocado slices, fresh spinach or kale, and a dollop of hummus or drizzle of tahini dressing.\n" +
                        "9. Serve with lemon wedges on the side for squeezing over the bowls before eating.\n" +
                        "10. Enjoy your vibrant and nutrient-packed Buddha bowls!"));
        recipes.add(new Recipe("Vegan Lentil Soup",
                List.of("Green or brown lentils", "Onion, diced", "Carrots, diced", "Celery, diced", "Garlic, minced", "Crushed tomatoes", "Vegetable broth", "Bay leaves", "Dried thyme", "Salt and pepper to taste"),
                40,
                "A hearty and comforting soup made with tender lentils, aromatic vegetables, and flavorful herbs, simmered together to create a satisfying and wholesome meal, perfect for chilly days.",
                "International",
                MealType.LUNCH,
                "1. Rinse the lentils under cold water and drain them. Set aside.\n" +
                        "2. Heat olive oil in a large pot over medium heat. Add diced onion, carrots, and celery, and cook until softened, about 5-7 minutes.\n" +
                        "3. Add minced garlic to the pot and cook for an additional minute, until fragrant.\n" +
                        "4. Stir in crushed tomatoes, vegetable broth, bay leaves, dried thyme, salt, and pepper.\n" +
                        "5. Bring the soup to a boil, then reduce the heat to low and let it simmer, covered, for about 20-25 minutes, or until the lentils and vegetables are tender.\n" +
                        "6. Taste and adjust seasoning as needed.\n" +
                        "7. Remove the bay leaves before serving.\n" +
                        "8. Ladle the hot soup into bowls and serve.\n" +
                        "9. Enjoy your comforting and nutritious vegan lentil soup!"));

        // Brunch Recipes:
        recipes.add(new Recipe("French Toast",
                List.of("Bread slices", "Eggs", "Milk", "Cinnamon", "Vanilla extract", "Butter"),
                10,
                "Bread slices dipped in a mixture of eggs, milk, cinnamon, and vanilla extract, then cooked until golden brown. Served with maple syrup and fresh fruits.",
                "USA",
                MealType.BRUNCH,
                "1. In a shallow dish, whisk together eggs, milk, cinnamon, and vanilla extract.\n" +
                        "2. Heat butter in a skillet over medium heat.\n" +
                        "3. Dip each bread slice into the egg mixture, making sure to coat both sides evenly.\n" +
                        "4. Place the dipped bread slices in the skillet and cook until golden brown on both sides, about 2-3 minutes per side.\n" +
                        "5. Serve the French toast warm with maple syrup and fresh fruits on the side.\n" +
                        "6. Enjoy!"));
        recipes.add(new Recipe("English Breakfast",
                List.of("Eggs", "Bacon or vegetarian sausages", "Baked beans", "Grilled tomatoes", "Mushrooms", "Toast"),
                20,
                "A hearty meal featuring eggs cooked in various styles alongside bacon or vegetarian sausages, baked beans, grilled tomatoes, mushrooms, and toast.",
                "UK",
                MealType.BRUNCH,
                "1. Heat a skillet over medium heat and cook bacon or vegetarian sausages until crispy.\n" +
                        "2. In the same skillet, cook eggs according to your preference (fried, scrambled, poached).\n" +
                        "3. In another skillet, heat baked beans until warmed through.\n" +
                        "4. Grill tomatoes and mushrooms until tender.\n" +
                        "5. Toast slices of bread until golden brown.\n" +
                        "6. Arrange all cooked components on a plate.\n" +
                        "7. Serve hot with your choice of condiments.\n" +
                        "8. Enjoy!"));
        recipes.add(new Recipe("Shakshuka",
                List.of("Tomatoes", "Bell peppers", "Onions", "Garlic", "Eggs", "Cumin", "Paprika", "Chili flakes", "Parsley"),
                25,
                "A savory dish of eggs poached in a spicy tomato and bell pepper sauce, flavored with cumin, paprika, and chili flakes. Served with crusty bread.",
                "Middle East/North Africa",
                MealType.BRUNCH,
                "1. Heat olive oil in a skillet over medium heat.\n" +
                        "2. Add chopped onions, bell peppers, and minced garlic to the skillet. Cook until softened.\n" +
                        "3. Add chopped tomatoes, cumin, paprika, chili flakes, salt, and pepper to the skillet. Simmer until the sauce thickens.\n" +
                        "4. Make wells in the sauce and crack eggs into each well.\n" +
                        "5. Cover the skillet and cook until the eggs are set to your desired consistency.\n" +
                        "6. Garnish with chopped parsley.\n" +
                        "7. Serve hot with crusty bread for dipping.\n" +
                        "8. Enjoy!"));
        recipes.add(new Recipe("Chiles en Nogada",
                List.of("Poblano peppers", "Ground meat (beef or pork)", "Fruits (such as apple, pear, and peach)", "Nuts (such as almonds and walnuts)", "Spices (cinnamon, cloves)", "Onion", "Garlic", "Tomato", "Plantains", "Pomegranate seeds", "Parsley", "Walnuts", "Milk", "Cheese"),
                45,
                "Roasted poblano peppers stuffed with a flavorful mixture of ground meat, fruits, and nuts, topped with a creamy walnut sauce and garnished with pomegranate seeds and parsley.",
                "Mexico",
                MealType.BRUNCH,
                "1. Roast poblano peppers directly over an open flame or under a broiler until the skins are charred and blistered. Place them in a bowl, cover with plastic wrap, and let them steam for 10 minutes. Peel off the skins, make a small slit along one side, and remove the seeds.\n" +
                        "2. In a skillet, cook ground meat with onions, garlic, diced tomatoes, chopped fruits, nuts, and spices until the meat is browned and the mixture is fragrant.\n" +
                        "3. Stuff the roasted poblano peppers with the meat mixture and place them in a baking dish.\n" +
                        "4. To make the walnut sauce, blend soaked walnuts, milk, cheese, and spices until smooth. Pour the sauce over the stuffed peppers.\n" +
                        "5. Bake the stuffed peppers in a preheated oven until heated through and the sauce is bubbly.\n" +
                        "6. Garnish with pomegranate seeds and chopped parsley before serving.\n" +
                        "7. Enjoy!"));
        recipes.add(new Recipe("Ratatouille",
                List.of("Eggplant", "Zucchini", "Bell peppers", "Tomatoes", "Onions", "Garlic", "Olive oil", "Herbs (such as thyme, basil)", "Salt", "Pepper"),
                30,
                "A vegetable stew made with sautéed eggplant, zucchini, bell peppers, tomatoes, onions, and garlic, seasoned with herbs like thyme and basil.",
                "France",
                MealType.BRUNCH,
                "1. Heat olive oil in a large skillet or Dutch oven over medium heat.\n" +
                        "2. Add chopped onions and minced garlic to the skillet and cook until softened and fragrant.\n" +
                        "3. Add diced eggplant, zucchini, and bell peppers to the skillet, and cook until slightly browned and tender.\n" +
                        "4. Stir in diced tomatoes, thyme, basil, salt, and pepper. Cook until the vegetables are tender and the flavors are well combined.\n" +
                        "5. Adjust seasoning to taste and serve hot or at room temperature.\n" +
                        "6. Enjoy!"));
        recipes.add(new Recipe("Feijoada",
                List.of("Black beans", "Smoked tofu or tempeh (for vegan version)", "Onions", "Garlic", "Bell peppers", "Tomatoes", "Orange slices", "Rice", "Collard greens"),
                60,
                "A rich and hearty stew of black beans cooked with smoked tofu or tempeh, onions, garlic, and bell peppers, traditionally served with rice, orange slices, and sautéed collard greens.",
                "Brazil",
                MealType.BRUNCH,
                "1. Rinse the black beans and soak them in water overnight. Drain and rinse before cooking.\n" +
                        "2. In a large pot, sauté chopped onions and minced garlic until translucent.\n" +
                        "3. Add the soaked black beans, diced tomatoes, chopped bell peppers, and smoked tofu or tempeh to the pot.\n" +
                        "4. Cover with water or vegetable broth and bring to a boil. Reduce heat and simmer until the beans are tender and the flavors have melded, about 1-2 hours.\n" +
                        "5. Season with salt and pepper to taste.\n" +
                        "6. Serve the feijoada hot with steamed rice, orange slices, and sautéed collard greens.\n" +
                        "7. Enjoy!"));
        recipes.add(new Recipe("Dim Sum",
                List.of("Various dumplings (pork, shrimp, vegetable)", "Steamed buns", "Spring rolls", "Tea"),
                30,
                "Assorted steamed dumplings, buns, and spring rolls served with dipping sauces like soy sauce, chili oil, and vinegar, accompanied by Chinese tea.",
                "China",
                MealType.BRUNCH,
                "1. Prepare the various fillings for the dumplings, such as pork, shrimp, and vegetables.\n" +
                        "2. Fill the dumpling wrappers with the desired fillings, shaping them into dumplings.\n" +
                        "3. Steam the dumplings in a bamboo steamer until cooked through.\n" +
                        "4. Steam the buns until fluffy and heated through.\n" +
                        "5. Fry the spring rolls until golden and crispy.\n" +
                        "6. Prepare dipping sauces like soy sauce, chili oil, and vinegar.\n" +
                        "7. Arrange the steamed dumplings, buns, and spring rolls on serving platters.\n" +
                        "8. Serve Dim Sum with the dipping sauces and Chinese tea.\n" +
                        "9. Enjoy!"));
        recipes.add(new Recipe("Frittata",
                List.of("Eggs", "Milk", "Cheese", "Vegetables (spinach, bell peppers, onions)", "Herbs (basil, parsley)", "Olive oil"),
                35,
                "An egg-based dish similar to a crustless quiche, made with sautéed vegetables such as spinach, bell peppers, and onions, mixed with eggs and cheese, then baked until set.",
                "Italy",
                MealType.BRUNCH,
                "1. Preheat the oven to 350°F (175°C).\n" +
                        "2. In a large oven-safe skillet, heat olive oil over medium heat.\n" +
                        "3. Add chopped vegetables such as spinach, bell peppers, and onions to the skillet, and sauté until softened.\n" +
                        "4. In a bowl, whisk together eggs, milk, chopped herbs (basil, parsley), and grated cheese.\n" +
                        "5. Pour the egg mixture over the sautéed vegetables in the skillet.\n" +
                        "6. Cook on the stovetop without stirring until the edges start to set.\n" +
                        "7. Transfer the skillet to the preheated oven and bake for about 15-20 minutes, or until the frittata is set in the center and lightly golden on top.\n" +
                        "8. Remove from the oven and let it cool slightly before slicing.\n" +
                        "9. Serve the frittata warm or at room temperature.\n" +
                        "10. Enjoy!"));
        recipes.add(new Recipe("Vegan Pancakes",
                List.of("Flour", "Almond milk", "Baking powder", "Apple cider vinegar", "Vanilla extract", "Maple syrup"),
                15,
                "Fluffy pancakes made with a batter of flour, almond milk, baking powder, and other ingredients, cooked until golden brown and served with maple syrup.",
                "International",
                MealType.BRUNCH,
                "1. In a large mixing bowl, whisk together the flour, almond milk, baking powder, apple cider vinegar, vanilla extract, and a pinch of salt until smooth.\n" +
                        "2. Heat a non-stick skillet or griddle over medium heat and lightly grease with oil or cooking spray.\n" +
                        "3. Pour a small amount of pancake batter onto the skillet, using about 1/4 cup of batter for each pancake.\n" +
                        "4. Cook until bubbles form on the surface of the pancake and the edges look set, then flip and cook for another 1-2 minutes until golden brown on both sides.\n" +
                        "5. Repeat with the remaining batter, adding more oil to the skillet as needed.\n" +
                        "6. Serve the pancakes hot, drizzled with maple syrup and any other desired toppings.\n" +
                        "7. Enjoy!"));
        recipes.add(new Recipe("Vegan Tofu Scramble",
                List.of("Firm tofu", "Turmeric", "Nutritional yeast", "Bell peppers", "Onions", "Spinach", "Garlic", "Olive oil"),
                20,
                "Crumble tofu and sauté with turmeric and nutritional yeast until golden. Add diced bell peppers, onions, spinach, and garlic. Cook until vegetables are tender. Serve hot.",
                "International",
                MealType.BRUNCH,
                "1. Heat olive oil in a large skillet over medium heat.\n" +
                        "2. Crumble the firm tofu into the skillet, breaking it apart with a spatula.\n" +
                        "3. Sprinkle turmeric and nutritional yeast over the tofu, and stir to coat evenly. Cook for 5-7 minutes, stirring occasionally, until the tofu is golden and slightly crispy.\n" +
                        "4. Add diced bell peppers, onions, and minced garlic to the skillet. Cook for an additional 3-5 minutes, until the vegetables are tender.\n" +
                        "5. Stir in fresh spinach leaves and cook for another 1-2 minutes, until wilted.\n" +
                        "6. Season with salt and pepper to taste.\n" +
                        "7. Serve the vegan tofu scramble hot, optionally garnished with chopped fresh herbs or a sprinkle of nutritional yeast.\n" +
                        "8. Enjoy!"));

        // Dinner Recipes:
        recipes.add(new Recipe("Tacos Gobernador",
                List.of("Large shrimp", "Flour tortillas", "Bell peppers", "Onions", "Tomatoes", "Cheese", "Chipotle peppers in adobo sauce", "Garlic", "Lime juice", "Salt", "Pepper", "Avocado", "Cilantro"),
                30,
                "Sauté chopped onions and bell peppers until softened. Add chopped shrimp and cook until pink. Stir in diced tomatoes, minced chipotle peppers, garlic, lime juice, salt, and pepper. Cook until flavors meld. Warm tortillas and fill with the shrimp mixture. Top with cheese, diced avocado, and chopped cilantro. Serve hot.",
                "Mexican",
                MealType.DINNER,
                "1. Heat a skillet over medium heat.\n" +
                        "2. Add chopped onions and bell peppers to the skillet and sauté until softened.\n" +
                        "3. Add chopped shrimp to the skillet and cook until they turn pink and are cooked through.\n" +
                        "4. Stir in diced tomatoes, minced chipotle peppers, minced garlic, lime juice, salt, and pepper. Cook until the flavors meld together.\n" +
                        "5. Warm the flour tortillas.\n" +
                        "6. Fill each tortilla with the shrimp mixture.\n" +
                        "7. Top with cheese, diced avocado, and chopped cilantro.\n" +
                        "8. Serve hot and enjoy!"));
        recipes.add(new Recipe("Oma's Apfelkuchen (Grandma's Apple Cake)",
                List.of("Apples", "All-purpose flour", "Sugar", "Eggs", "Baking powder", "Cinnamon", "Vanilla extract", "Lemon zest", "Butter", "Milk"),
                20,
                "Preheat oven to 350°F (175°C). Peel, core, and slice apples. In a bowl, mix together flour, sugar, baking powder, cinnamon, and lemon zest. In another bowl, beat eggs with vanilla extract, then gradually mix in melted butter and milk. Combine wet and dry ingredients. Pour half of the batter into a greased baking dish, layer with sliced apples, then pour remaining batter over apples. Bake for 40-45 minutes or until golden brown. Serve warm or cold.",
                "Germany",
                MealType.DINNER,
                "1. Preheat the oven to 350°F (175°C) and grease a baking dish.\n" +
                        "2. Peel, core, and slice the apples.\n" +
                        "3. In a bowl, mix together flour, sugar, baking powder, cinnamon, and lemon zest.\n" +
                        "4. In another bowl, beat eggs with vanilla extract.\n" +
                        "5. Gradually mix in melted butter and milk into the egg mixture.\n" +
                        "6. Combine the wet and dry ingredients.\n" +
                        "7. Pour half of the batter into the greased baking dish.\n" +
                        "8. Layer the sliced apples over the batter.\n" +
                        "9. Pour the remaining batter over the apples.\n" +
                        "10. Bake for 40-45 minutes or until golden brown.\n" +
                        "11. Serve warm or cold. Enjoy Grandma's Apple Cake!"));
        recipes.add(new Recipe("Thai Pad Thai",
                List.of("Rice noodles", "Shrimp or tofu", "Bean sprouts", "Chopped peanuts", "Green onions", "Garlic", "Eggs", "Tamarind paste", "Fish sauce (or soy sauce for vegan)", "Lime juice", "Sugar", "Chili flakes"),
                25,
                "Soak rice noodles in warm water until softened. In a wok, heat oil and sauté garlic. Add shrimp or tofu and cook until done. Push to one side, crack eggs into the wok, scramble, then mix with shrimp/tofu. Add drained noodles, tamarind paste, fish sauce (or soy sauce), lime juice, sugar, and chili flakes. Stir-fry until heated through. Serve with bean sprouts, chopped peanuts, and green onions on top.",
                "Thai",
                MealType.DINNER,
                "1. Soak rice noodles in warm water until softened.\n" +
                        "2. In a wok, heat oil and sauté garlic.\n" +
                        "3. Add shrimp or tofu and cook until done.\n" +
                        "4. Push the shrimp or tofu to one side of the wok.\n" +
                        "5. Crack eggs into the wok, scramble, then mix with shrimp/tofu.\n" +
                        "6. Add drained noodles, tamarind paste, fish sauce (or soy sauce), lime juice, sugar, and chili flakes.\n" +
                        "7. Stir-fry until heated through.\n" +
                        "8. Serve with bean sprouts, chopped peanuts, and green onions on top.\n" +
                        "9. Enjoy your delicious Thai Pad Thai!"));
        recipes.add(new Recipe("Indian Chicken Tikka Masala",
                List.of("Chicken breast", "Yogurt", "Ginger-garlic paste", "Garam masala", "Cumin", "Coriander", "Turmeric", "Tomato sauce", "Heavy cream", "Butter", "Salt", "Cilantro"),
                40,
                "Marinate chicken in yogurt, ginger-garlic paste, and spices for at least 30 minutes. Grill or pan-fry until cooked. In a separate pan, simmer tomato sauce with cream, butter, and salt. Add cooked chicken to the sauce and simmer until heated through. Garnish with chopped cilantro and serve with rice or naan.",
                "Indian",
                MealType.DINNER,
                "1. In a bowl, combine yogurt, ginger-garlic paste, garam masala, cumin, coriander, turmeric, and salt.\n" +
                        "2. Add chicken breast pieces to the marinade, ensuring they are well coated. Cover and refrigerate for at least 30 minutes, or up to overnight.\n" +
                        "3. Heat a grill or skillet over medium-high heat. Cook the marinated chicken until fully cooked and slightly charred on the edges.\n" +
                        "4. In a separate pan, melt butter over medium heat. Add tomato sauce and heavy cream, stirring until well combined.\n" +
                        "5. Once the sauce begins to simmer, add the cooked chicken pieces and stir to coat them in the sauce.\n" +
                        "6. Allow the chicken to simmer in the sauce for a few minutes until heated through.\n" +
                        "7. Garnish with chopped cilantro before serving.\n" +
                        "8. Serve hot with rice or naan.\n" +
                        "9. Enjoy!"));
        recipes.add(new Recipe("Chinese Beef and Broccoli Stir-Fry",
                List.of("Beef sirloin", "Broccoli florets", "Garlic", "Soy sauce", "Oyster sauce", "Sesame oil", "Cornstarch", "Brown sugar", "Ginger", "Green onions"),
                30,
                "Slice beef thinly and marinate in soy sauce, sesame oil, cornstarch, brown sugar, and ginger. Stir-fry marinated beef in a hot pan until browned, then set aside. In the same pan, stir-fry broccoli and garlic until tender-crisp. Add beef back to the pan, along with oyster sauce and a splash of water. Stir until heated through. Serve hot with steamed rice.",
                "Chinese",
                MealType.DINNER,
                "1. In a bowl, combine thinly sliced beef with soy sauce, sesame oil, cornstarch, brown sugar, and minced ginger. Allow to marinate for 15-30 minutes.\n" +
                        "2. Heat a wok or large skillet over high heat. Add a small amount of oil and swirl to coat the pan.\n" +
                        "3. Add the marinated beef to the hot pan, spreading it out into a single layer. Let it sear without stirring for 1-2 minutes to develop a brown crust.\n" +
                        "4. Stir-fry the beef until cooked through, then transfer it to a plate and set aside.\n" +
                        "5. In the same pan, add a bit more oil if needed, then stir-fry broccoli florets and minced garlic until they are tender-crisp.\n" +
                        "6. Return the cooked beef to the pan, then add oyster sauce and a splash of water to create a sauce. Stir everything together until heated through.\n" +
                        "7. Garnish with sliced green onions and serve hot with steamed rice.\n" +
                        "8. Enjoy!"));
        recipes.add(new Recipe("Greek Spanakopita",
                List.of("Phyllo dough", "Spinach", "Feta cheese", "Onions", "Garlic", "Olive oil", "Eggs", "Dill", "Nutmeg", "Salt", "Pepper"),
                45,
                "Sauté onions and garlic in olive oil until softened. Add chopped spinach and cook until wilted. Remove from heat, let cool, then mix in crumbled feta, beaten eggs, chopped dill, nutmeg, salt, and pepper. Layer phyllo sheets in a baking dish, brushing each layer with olive oil. Spread spinach mixture over the phyllo layers. Top with more phyllo, brushing with oil. Bake at 375°F (190°C) for 45-50 minutes, or until golden brown.",
                "Greek",
                MealType.DINNER,
                "1. Preheat the oven to 375°F (190°C).\n" +
                        "2. In a large skillet, heat olive oil over medium heat. Add diced onions and minced garlic, sautéing until softened.\n" +
                        "3. Add chopped spinach to the skillet and cook until wilted. Remove from heat and let cool.\n" +
                        "4. In a mixing bowl, combine the cooled spinach mixture with crumbled feta, beaten eggs, chopped dill, nutmeg, salt, and pepper. Mix well.\n" +
                        "5. Brush a baking dish with olive oil. Layer phyllo sheets in the dish, brushing each layer with olive oil.\n" +
                        "6. Spread the spinach and feta mixture evenly over the phyllo layers.\n" +
                        "7. Top with more phyllo sheets, brushing each layer with olive oil.\n" +
                        "8. Bake in the preheated oven for 45-50 minutes, or until the top is golden brown and crispy.\n" +
                        "9. Allow to cool slightly before slicing and serving.\n" +
                        "10. Enjoy!"));
        recipes.add(new Recipe("Japanese Chicken Teriyaki",
                List.of("Chicken thighs", "Soy sauce", "Mirin", "Sake", "Sugar", "Garlic", "Ginger", "Sesame seeds", "Green onions"),
                35,
                "In a saucepan, combine soy sauce, mirin, sake, sugar, minced garlic, and grated ginger. Simmer until slightly thickened. Pan-fry chicken thighs until golden brown. Pour the teriyaki sauce over the chicken and cook until the sauce caramelizes and coats the chicken. Garnish with sesame seeds and chopped green onions. Serve with rice and steamed vegetables.",
                "Japanese",
                MealType.DINNER,
                "1. In a saucepan, combine soy sauce, mirin, sake, sugar, minced garlic, and grated ginger.\n" +
                        "2. Simmer the mixture over medium heat until slightly thickened, stirring occasionally.\n" +
                        "3. While the sauce is simmering, heat a skillet over medium-high heat.\n" +
                        "4. Add chicken thighs to the skillet and cook until golden brown on both sides, about 5-6 minutes per side.\n" +
                        "5. Once the chicken is cooked, pour the teriyaki sauce over the chicken in the skillet.\n" +
                        "6. Cook for an additional 2-3 minutes, allowing the sauce to caramelize and coat the chicken.\n" +
                        "7. Garnish the chicken with sesame seeds and chopped green onions.\n" +
                        "8. Serve the teriyaki chicken hot with rice and steamed vegetables.\n" +
                        "9. Enjoy!"));
        recipes.add(new Recipe("Moroccan Lamb Tagine",
                List.of("Lamb shoulder", "Onions", "Garlic", "Ginger", "Cinnamon", "Cumin", "Coriander", "Paprika", "Saffron", "Tomatoes", "Dried apricots", "Almonds", "Olive oil", "Parsley"),
                20,
                "Brown lamb in olive oil in a tagine or heavy-bottomed pot. Remove lamb and sauté onions, garlic, and ginger until softened. Add spices and cook until fragrant. Return lamb to the pot, add chopped tomatoes, dried apricots, and enough water to cover. Simmer gently for 1-2 hours, until lamb is tender. Garnish with toasted almonds and chopped parsley before serving.",
                "Moroccan",
                MealType.DINNER,
                "1. Heat olive oil in a tagine or heavy-bottomed pot over medium-high heat.\n" +
                        "2. Add lamb shoulder pieces and brown them on all sides, then remove them from the pot and set aside.\n" +
                        "3. In the same pot, add chopped onions, minced garlic, and grated ginger. Sauté until softened.\n" +
                        "4. Add ground cinnamon, cumin, coriander, paprika, and saffron to the pot. Cook until fragrant.\n" +
                        "5. Return the browned lamb to the pot. Add chopped tomatoes and dried apricots.\n" +
                        "6. Pour enough water into the pot to just cover the ingredients.\n" +
                        "7. Reduce the heat to low, cover the pot, and simmer gently for 1-2 hours, until the lamb is tender.\n" +
                        "8. Before serving, garnish the tagine with toasted almonds and chopped parsley.\n" +
                        "9. Serve the Moroccan lamb tagine hot with couscous or bread.\n" +
                        "10. Enjoy!"));
        recipes.add(new Recipe("Vegan Thai Green Curry",
                List.of("Green curry paste", "Coconut milk", "Tofu", "Mixed vegetables (like bell peppers, broccoli, and carrots)", "Thai basil leaves", "Soy sauce", "Lime juice", "Brown sugar"),
                30,
                "In a pan, heat green curry paste until fragrant. Stir in coconut milk, tofu, and vegetables. Simmer until vegetables are tender. Season with soy sauce, lime juice, and brown sugar to taste. Garnish with Thai basil leaves. Serve hot with rice.",
                "Thai",
                MealType.DINNER,
                "1. Heat a pan over medium heat and add green curry paste. Stir until fragrant.\n" +
                        "2. Pour in coconut milk and stir to combine with the curry paste.\n" +
                        "3. Add cubed tofu and mixed vegetables (like bell peppers, broccoli, and carrots) to the pan.\n" +
                        "4. Simmer the curry until the vegetables are tender and the tofu is heated through.\n" +
                        "5. Season the curry with soy sauce, lime juice, and brown sugar to taste.\n" +
                        "6. Garnish the curry with fresh Thai basil leaves.\n" +
                        "7. Serve the vegan Thai green curry hot with steamed rice.\n" +
                        "8. Enjoy!"));
        recipes.add(new Recipe("Vegan Mexican Quinoa Salad",
                List.of("Cooked quinoa", "Black beans", "Corn kernels", "Diced tomatoes", "Diced avocado", "Chopped cilantro", "Lime juice", "Olive oil", "Cumin", "Chili powder", "Salt", "Pepper"),
                15,
                "A refreshing and nutritious salad packed with Mexican flavors, featuring quinoa, black beans, corn, tomatoes, avocado, and cilantro, tossed in a zesty lime dressing.",
                "Mexican",
                MealType.DINNER,
                "1. In a large bowl, combine cooked quinoa, black beans, corn kernels, diced tomatoes, diced avocado, and chopped cilantro.\n" +
                        "2. In a small bowl, whisk together lime juice, olive oil, cumin, chili powder, salt, and pepper to make the dressing.\n" +
                        "3. Pour the dressing over the quinoa mixture.\n" +
                        "4. Toss the salad gently to combine, ensuring the dressing coats all the ingredients evenly.\n" +
                        "5. Adjust seasoning with additional salt and pepper if needed.\n" +
                        "6. Serve chilled.\n" +
                        "7. Enjoy!"));
    }
    /**
     *
     * @param mealType type of meal: Breakfast, lunch, brunch, or dinner
     * @param culture culture or cuisine of the recipes
     * @return a lsits of recipes matching the user preferences
     */
    public List<Recipe> getRecipes(MealType mealType, String culture) {
        // List to store filtered recipes
        List<Recipe> filteredRecipes = new ArrayList<>();
        for (Recipe recipe : recipes) {
            // Check if the recipe matches the specified meal type and culture
            if (recipe.getMealType() == mealType && recipe.getCulture().equalsIgnoreCase(culture)) {
                // Add the matching recipe to the filtered list
                filteredRecipes.add(recipe);
            }
        }
        // Returns a filtered list of recipes
        return filteredRecipes;
    }
}
