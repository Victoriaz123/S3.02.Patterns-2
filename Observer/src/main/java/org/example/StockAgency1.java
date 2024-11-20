package org.example;

public class StockAgency1 implements StockAgency {

    private String name;

    public StockAgency1(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockState) {
        System.out.println(name + " informed that the market is '" + stockState + "'.");
    }
}