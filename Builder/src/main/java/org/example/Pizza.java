package org.example;

import java.util.List;

public class Pizza {
    private String size;
    private String dough;
    private List<String> toppings;

    private Pizza(String size, String dough, List<String> toppings) {
        this.size = size;
        this.dough = dough;
        this.toppings = toppings;
    }

    public String getSize() {
        return size;
    }

    public String getDough() {
        return dough;
    }

    public List<String> getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", dough='" + dough + '\'' +
                ", toppings=" + toppings +
                '}';
    }

    public static class Builder implements PizzaBuilder {

        private String size;
        private String dough;
        private List<String> toppings;

        @Override
        public Builder setSize(String size) {
            this.size = size;
            return this;
        }

        @Override
        public Builder setDough(String dough) {
            this.dough = dough;
            return this;
        }

        @Override
        public Builder setToppings(List<String> toppings) {
            this.toppings = toppings;
            return this;
        }

        public Pizza build() {
            return new Pizza(size, dough, toppings);
        }
    }
}