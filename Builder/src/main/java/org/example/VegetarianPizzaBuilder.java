package org.example;

import java.util.Arrays;

public class VegetarianPizzaBuilder extends Pizza.Builder{
    public VegetarianPizzaBuilder() {
        setSize("Medium")
                .setDough("Thin")
                .setToppings(Arrays.asList("Tomato", "Olives", "Onions", "Cheese"));
    }
}
