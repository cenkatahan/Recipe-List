package com.example.recipeslist;

import java.io.Serializable;

public class Recipe implements Serializable {
    private String name;
    private String ingredients;
    private String preparation;

    public Recipe(String name, String ingredients, String preparation) {
        this.name = name;
        this.ingredients = ingredients;
        this.preparation = preparation;
    }

    public static final Recipe[] recipes = {
            new Recipe("Tomato soup","2 red peppers\n" +
                    "2 banana shallots, halved and trimmed\n" +
                    "500g/1lb 2oz plum tomatoes\n" +
                    "4 garlic cloves\n" +
                    "2 tbsp olive oil\n" +
                    "25g/1oz butter\n" +
                    "450ml/16fl oz chicken or vegetable stock, hot",
                    "Preheat the oven to 200C/180C Fan/Gas 6.\n" +
                            "\n" +
                            "Place the peppers over an open gas flame until black all over. Place in a bowl, cover with cling film and leave to stand for 1–2 minutes.\n" +
                            "\n" +
                            "Remove the peppers from the bowl and peel off the black skin, rinse underneath a running tap to get the remainder of the skin off. Remove the seeds and set the pepper aside.\n" +
                            "\n" +
                            "Place the shallot halves (cut-side down) along with the plum tomatoes and garlic cloves onto a baking tray and drizzle with the olive oil. Bake at the top of the oven for 30 minutes, or until the shallots are cooked\n" +
                            "\n" +
                            "Melt the butter in a large pan over a medium heat and add the roasted shallots, peppers and garlic.\n" +
                            "\n" +
                            "Add the hot stock and cook for 5 minutes.\n" +
                            "\n" +
                            "Blend with a stick blender until smooth and place back in the pan to warm through.\n" +
                            "\n" +
                            "For the ciabatta toast, mix in the roasted peppers and chives into the butter. Form into a long log shape and roll in cling film.\n" +
                            "\n" +
                            "Heat a large griddle pan and drizzle a little olive oil over the cut ciabatta, and toast either side for 1–2 minutes or until bar marks appear.\n" +
                            "\n" +
                            "To serve, ladle the soup into serving bowls and serve the toasted ciabatta topped with the pepper and chive butter on the top."),
            new Recipe("Lasagne","2 tbsp olive oil\n" +
                    "900g/2lb beef mince\n" +
                    "2 onions, roughly chopped\n" +
                    "4 sticks celery, diced (optional)\n" +
                    "2 garlic cloves, crushed\n" +
                    "2 level tbsp plain flour\n" +
                    "150ml/¼ pint beef stock\n" +
                    "1 tbsp redcurrant jelly (optional) or 1 tsp caster sugar\n" +
                    "3 tbsp tomato purée\n" +
                    "1 tbsp chopped thyme\n" +
                    "2 x 400g cans chopped tomatoes", "Preheat the oven to160C/325F/Gas 3.\n" +
                    "\n" +
                    "For the ragu, heat a large frying pan until hot and add the oil. Cook the mince until browned all over. Remove from the heat and transfer to a plate. Add the onion, celery (if using) and garlic to the pan and cook until softened. Return the meat to the pan and stir in the flour. Add the stock and bring to the boil. Add the redcurrant jelly (or sugar), tomato purée and thyme, then stir well.\n" +
                    "\n" +
                    "Stir in the canned tomatoes. Bring to the boil again, cover and simmer in the oven for 1-½ hours, or until the beef is tender.\n" +
                    "\n" +
                    "For the white sauce, melt the butter in a saucepan. Add the flour and cook over the heat for one minute. Gradually whisk in the hot milk, whisking until thickened. Add the Dijon mustard and parmesan cheese and season well with salt and pepper.\n" +
                    "\n" +
                    "For the lasagne, put one third of the meat sauce in the base of a 2.3 litre/4 pint shallow ovenproof dish. Spoon one third of the white sauce on top. Arrange one layer of lasagne sheets on top. Season. Spoon half of the remaining meat sauce on top and then half of the white sauce. Put another layer of lasagne sheets on top, then the remaining meat sauce and remaining white sauce. Sprinkle over the cheddar cheese.\n" +
                    "\n" +
                    "Leave for six hours before cooking so that the pasta can start to soften.\n" +
                    "\n" +
                    "Preheat the oven temperature to 200C/400F/Gas 6.\n" +
                    "\n" +
                    "Cook in the middle of the oven for about 45 minutes- or until golden brown on top, bubbling around the edges and the pasta is soft."),
            new Recipe("Tarte Tatin","1 sheet puff pastry, thawed\n" +
                    "1.5 kg apple (1.5 kg), preferably Honeycrisp or Granny Smith\n" +
                    "3 tablespoons water\n" +
                    "½ cup sugar (100 g)\n" +
                    "3 tablespoons unsalted butter\n" +
                    "vanilla ice cream, for serving","Using a 9-inch (23 cm) flat-sided cake pan as a template, cut a circle out from the puff pastry. Using a fork, poke holes all over to provide ventilation. Set aside.\n" +
                    "Peel and quarter the apples, using a spoon or melon baller to remove the cores.\n" +
                    "Preheat oven to 375°F (190°C).\n" +
                    "In a large saucepan over medium heat, distribute the water and sugar evenly and cook until light amber in color, stirring to help melt any lumps, 5-7 minutes. Add the butter, stirring constantly until the color is a creamy light brown. Add the apples, stirring until they are coated in a thick layer of caramel.\n" +
                    "Cook for about 15-20 minutes, turning the apples constantly so that they bathe in the caramel. Remove from the heat when the caramel has reduced and little remains in the bottom of the pan. Be careful not to burn the caramel, tasting it from time to time to ensure it does not taste bitter.\n" +
                    "Arrange the apple slices in concentric circles on the bottom of the cake pan. Press the apples tightly against each other, then pour the remaining caramel over the top.\n" +
                    "Lay the circle of puff pastry on top. Tuck the puff pastry down the sides of the pan.\n" +
                    "Bake for 45-50 minutes, until the pastry is golden brown and firm. Cool for about 1 hour, then invert onto a plate.\n" +
                    "Slice and serve with vanilla ice cream.\n" +
                    "Enjoy!")
};

    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getPreparation() {
        return preparation;
    }
}
