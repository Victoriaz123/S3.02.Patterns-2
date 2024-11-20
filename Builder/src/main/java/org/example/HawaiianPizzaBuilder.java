package org.example;

import java.util.Arrays;

public class HawaiianPizzaBuilder extends Pizza.Builder {
    public HawaiianPizzaBuilder() {
        setSize("Large")
                .setDough("Classic")
                .setToppings(Arrays.asList("Tomato", "Pineapple", "Cheese","Ham"));
    }
}
