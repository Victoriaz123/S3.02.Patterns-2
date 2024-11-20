package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {



        PizzaBuilder vegetarianBuilder = new VegetarianPizzaBuilder();
        MestrePizzer mestreVegetarian = new MestrePizzer(vegetarianBuilder);
        Pizza vegetarianPizza = mestreVegetarian.makePizza();
        System.out.println("Vegetarian Pizza: " + vegetarianPizza);


        PizzaBuilder hawaiianBuilder = new HawaiianPizzaBuilder();
        MestrePizzer mestreHawaiian = new MestrePizzer(hawaiianBuilder);
        Pizza hawaiianPizza = mestreHawaiian.makePizza();
        System.out.println("Hawaiian Pizza: " + hawaiianPizza);



        Pizza customPizza = new Pizza.Builder()
                .setSize("Small")
                .setDough("Vegan")
                .setToppings(Arrays.asList("Tomatoes", "Mushrooms", "Cheese"))
                .build();
        System.out.println("Custom Pizza: " + customPizza);
    }
}