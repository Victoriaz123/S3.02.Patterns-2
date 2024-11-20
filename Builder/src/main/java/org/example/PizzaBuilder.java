package org.example;
import java.util.List;
public interface PizzaBuilder {

    PizzaBuilder setSize(String size);
    PizzaBuilder setDough(String dough);
    PizzaBuilder setToppings(List<String> toppings);
    Pizza build();

}
